package LinkedList;

class Node{
    int data ;
    Node next;
    
    Node(int data){
        this.data = data;
    }
    Node(int data,Node next){
    	this.data=data;
    	this.next=next;
    }
}

public class customLinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public void addLast(int data) {
		Node tba=new Node(data);
		if(head==null) {
			head=tba;
			tail=tba;
		}else {
			tail.next=tba;
			tail=tba;
		}
		size+=1;
	}
	public void addFirst(int data) {
		Node tba=new Node(data);
		if(head==null) {
			head=tba;
			tail=tba;
		}else {
			tba.next=head;
	        head=tba;
		}
		size+=1;
	}
	public void addAt(int data,int idx) {
		if(idx==0) addFirst(data);
		else if(idx==this.size) addLast(data);
		else {
			Node curr=head;
			for(int i=0;i<idx-1;i++) {
				curr=curr.next;
			}
			Node tba=new Node(data,curr.next);
			curr.next=tba;
			size++;
		}
		
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		Node curr=head;
		if(this.size==0) return "empty";
		while(curr!=null) {
			sb.append(curr.data).append("->");
			curr=curr.next;
		}
		sb.delete(sb.length()-2,sb.length());
		return sb.toString();
	}
	
	
	 public static void main(String[] args) {
		 customLinkedList list=new customLinkedList();
		 for(int i=0;i<10;i++) {
			 list.addFirst(i);
		 }
		 System.out.println(list);
		 
		 for(int i=0;i<10;i++) {
			 list.addLast(i);
		 }
		 System.out.println(list);
		 
		 list.addAt(0,2);
		 list.addAt(0,3);
		 System.out.println(list);
	 }
}

