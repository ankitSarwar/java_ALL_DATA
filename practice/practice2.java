package practice;

import java.util.*;
public class practice2 {
	
public static boolean prime(int n){
	for(int i=2;i<=(n/2)+1;i++) {
    	if(n%i==0)
    		return false;
    }
	return true;
}
	
	public static void main(String[] args) {

//       vehical bmw=new vehical();
//		
//		bmw.carName="BMW";
//		bmw.name="Ankit Sarwar";
//		bmw.amount=8546868.76;
//		bmw.seatCap=4;
//		bmw.speed=250;
//		bmw.Avgspeed=180;
//		bmw.deposit=55875;
       
     
//       vehical bmw=new vehical("Ankit Sarwar","lamborgini", 40000,300);
       
//       System.out.println();
       
//		System.out.println(bmw.carName);
//		System.out.println(bmw.name);
//		System.out.println(bmw.amount);
//		System.out.println(bmw.seatCap);
//		System.out.println(bmw.name);
//		
		
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
      if( prime(n)) {
    	  System.out.println("Yes");
      }
      else
    	  System.out.println("No");
//      
		
		
		char i='z';
        while(i>='a'){
            if(i%2==0){
                System.out.print(i+" ");
            }
            else {
                System.out.print((char)(i-32)+" ");
            }
            i--;
        }
		
		
		
		
//		 Scanner sc=new Scanner(System.in);
//	        int n=sc.nextInt();
//	        for(int i=1;i<n;i++){
//	           int m=sc.nextInt();
//	        
//	             if(m%2!=0 && m%3==0){
//	                    System.out.println("Odd Divisible by 3");
//	                }
//	          else  if(m%2==0 && m%3==0){
//	                    System.out.println("Even Divisible by 3");
//	                }
//	            else if(m%2!=0 && m%3!=0){
//	                    System.out.println("Odd Not Divisible by 3");
//	                }
//	            
//	                else if(m%2==0 && m%3!=0){
//	                    System.out.println("Even Not Divisible by 3");
//	                }
//	 }
		
		
//		Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=(n/2)+1;
//        int x=n;
//        for(int i=0;i<=x;i++){
//           if(i==m) continue;
//            for(int j=0;j<x;j++)
//                System.out.print(j>=Math.min(i,x-i)&& j<Math.max(i,x-1)?"*\t" :"\t");
//            
//            System.out.println();
//        }
		
		
//		Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=(n/2)+1;
//        for(int i=0;i<=m;i++){
//            for(int j=n-i;j>0;i--){
                //if(i<=j||j==m){
//                    System.out.print("*\t");
                }
              //  else{
//                    System.out.print("\t");
//                }
            
//            System.out.println();
//            
//        }
		
       
	       
	}
//}



