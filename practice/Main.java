package practice;

class shape{
	   
    int l;
    int w;
    shape(int l,int w){
        this.l=l;
        this.w=w;
    }
    public void calculateArea(){
        System.out.println("Parent class Shape"+" "+l*w);
      
    }
}
class child extends shape{
		
     child(int x,int y){
//         this.x=x;
//         this.y=y;
    	 super(x,y);
     }
	
	
    @Override
    public void calculateArea(){
        System.out.println("child class"+" "+l*w);
    }
}



public class Main {
	public static void main(String args[]) {
		shape a=new shape(2,4);
        a.calculateArea();
        
//        child ans=new child();
        child ans2=new child(5,4);
        ans2.calculateArea();
//        ans.calculateArea();
	}
}
