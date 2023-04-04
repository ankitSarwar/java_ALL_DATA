package practice;

class TryCatchExample{
    public static void main(String args[]){
        div(4,2);
    }
    public static void div(int a,int b){
        try{   // javac TryCatchExample.java
            // java TryCatchExample
            int x=(a/b);
            System.out.println(x);
        }
        catch(ArithmeticException ex){
            System.out.println("Catch-2");
        }
//        catch(Exception e){
//            System.out.println("Catch-1");
//        }
//        catch(ArithmeticException ex){
//            System.out.println("Catch-2");
//        }

        finally {
            System.out.println("this is finally block");
        }

    }
} 
