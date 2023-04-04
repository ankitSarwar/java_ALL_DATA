package opps;

class TV {
    void ON () {
        System.out.println("Switched ON Old TV : 10secs");
    }

    void OFF() {
        System.out.println("Switched OFF Old TV: 5secs");
    }

    void CC() {
        System.out.println("Doordarshan OP");
    }
}

class ShmartTV extends TV{
    @Override
    void ON () {
        System.out.println("Switched ON new TV : 1secs");
    }

    @Override
    void OFF() {
        System.out.println("Switched OFF new TV: 0.5secs");
    }

    @Override
    void CC() {
        System.out.println("Discovery OP");
    }

    void netflix() {
        System.out.println("Dhu dhum");
    }
}

public class Eshmart {
    public static void main(String[] args) {
        // TV box = new ShmartTV();
        // box.OFF();
        // box.ON();
        // box.CC();
    // //   box.netflix();
        
//    	ShmartTV box = new TV();  //we can not write like this
//	      box.OFF();
//	      box.ON();
//	      box.CC();
    	
        
//    	ShmartTV box = new ShmartTV();
//    	box.OFF();
//        box.ON();
//        box.CC();
//        box.netflix();
	      
    // }
//}
//    	    Car scorpio = new Car("Mahindra", "Scorpio", "Black", 7); // 
//         Car alto = new Car();
//         Car i10 = new Car("Hyundai", "i10", "Gray", '9');
//         System.out.println(scorpio);
//         System.out.println(i10);
//         System.out.println(alto);
//         BankCustomer cust = new BankCustomer("Ganesh Gaitonde", "Bhagwan", 1234567, 34567876);
//         cust.deposit(5000); 
//         cust.withdraw(1234);

        // Temp t1 = new Temp(5, 6);
        // Temp t2 = new Temp(5, 7);
        // System.out.println("t1 -> " + t1.x + ", " + t1.y);
        // System.out.println("t2 -> " + t2.x + ", " + t2.y);
        
        // t1.x ++;
        // t1.y ++;
        // t2.x ++;
        // t2.y ++;
        // Temp.y ++;
    
        // System.out.println("t1 -> " + t1.x + ", " + t1.y);
        // System.out.println("t2 -> " + t2.x + ", " + t2.y);

        CustomArrayList arr = new CustomArrayList();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove();
        arr.remove(0);
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.get(5));

       CustomStack apnaStack = new CustomStack();
       apnaStack.push(5);
       apnaStack.push(6);
       System.out.println(apnaStack);
       System.out.println(apnaStack.pop());
       System.out.println(apnaStack.peek());
       System.out.println(apnaStack.pop());
       System.out.println(apnaStack.pop());
       System.out.println(apnaStack.isEmpty());
       System.out.println(apnaStack.size());
       System.out.println(apnaStack);
    }
}

//class Temp {
//    int x;
//    static int y = 10;
//
//    Temp(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}