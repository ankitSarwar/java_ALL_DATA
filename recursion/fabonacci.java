package recursion;

public class fabonacci {
	public static void main(String[] args) {
		int n=7;
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n){
//		if(n<=1) return n;
//		
//		int f1=fibo(n-1);
//		int f2=fibo(n-2);
//		int fibo=f1+f2;
//		
//		return fibo;
		
		//// OR
		return n<=1 ? n : fibo(n-1) + fibo(n-2);
	}
	
}
