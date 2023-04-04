package recursion;

public class recursion1 {

    public static void main(String[] args) {
//        printIncreasing(100);
    	  func(4);
    	
//    	System.out.println(callFactorial(7));
//    	System.out.println(Factorial(7));
    }
    public static int callFactorial(int n) {
        if(n == 0|| n==1) return 1;
        
        int fact = callFactorial(n-1);
        int factorial=fact*n;
        
        return factorial;
    }
  ///OR
    public static int Factorial(int n) { 
       return n<=1 ?1:n*Factorial(n-1);//
    }
    
    
    
    public static void printDecreasing(int n) {
        if(n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if(n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void func(int n) { //n is passed equal to 5
        if(n <= 0) {
            System.out.println("Base: " + n);
            return;
        }
        System.out.println("Pre: " + n);//left
        func(n - 1);
        System.out.println("In: " + n);//valley
        func(n - 2);
        System.out.println("Post: " + n);//right
    }
}