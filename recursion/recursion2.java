package recursion;

public class recursion2 {
	public static void main(String[] args) {
		
//		int x=2,n=10;
//		System.out.println(powerlog(x,n));
		
//		postprint(new int[] {1,2,3,4,5,6,7,8,9,0},9);
	
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
//		int n=9;
//		postprint(arr,n);
		
		int n=0;
		preprint(arr,n);
		
	}
	public static int powerlog(int x,int n) {
		if(n==0) return 1;
		
		int faith=powerlog(x,n/2);
		
		int exp=faith*faith;
		
		return n % 2 == 0 ? exp: exp * 2;
		//TC -> O(log n)
	}
	
	public static void postprint(int arr[],int n) {
		if(n==-1) return;
		postprint(arr,n-1);
		System.out.println(arr[n]);
	}
	
	public static void preprint(int arr[],int n) {
		if(n==arr.length) return;
		System.out.println(arr[n]);
		preprint(arr,n+1);
		
	}
	
}

