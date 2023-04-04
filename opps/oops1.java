package opps;
public class oops1 {

	int x;
	static int y=10;
	oops1(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		oops1 t1=new oops1(5,6);
		oops1 t2=new oops1(5,7);  // for static of y only one value save so y=7
		
		System.out.println("t1.x ->"+t1.x+" t1.y ->"+t1.y);
		System.out.println("t2.x ->"+t2.x+" t2.y ->"+t2.y);
		t1.x++;
		t1.y++;
		t2.x++;
		t2.y++;
		oops1.y++;
		System.out.println("t1.x ->"+t1.x+" t1.y ->"+t1.y);
		System.out.println("t2.x ->"+t2.x+" t2.y ->"+t2.y);
	}

}
