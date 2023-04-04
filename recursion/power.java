package recursion;

public class power {
	public static void main(String[] args) {
		
	System.out.println(powershell(2,5));
}
	
	public static int powershell(int x, int n) {
        if(n == 0) return 1;
        int faith = powershell(x, n - 1);
        return faith * x;
    }
	
}