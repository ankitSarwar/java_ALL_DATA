package opps;

public class BankCustomer{
    // private String name;
    // private String fathersName;
    // private int aadhar;
    // private int accBalance;
    // private int mobNo;
    // private int ifsc;

     String name;
     String fathersName;
     int aadhar;
     int accBalance;
     int mobNo;
     int ifsc;

    public BankCustomer(String setName, String fathersName, int aadhar, int mobNo) {
        this.name = setName;
        this.fathersName = fathersName;
        this.aadhar = aadhar;
        this.accBalance = 0;
        this.mobNo = mobNo;
        this.ifsc = 45678;
    }

    public String getName() {
        return this.name;
    }

    public String getFathersName() {
        return this.fathersName;
    }
    
    public void setName(String name) {
        if(this.name == null || name == null || name.length() < 2) {
            System.out.println("Enter a valid name");
            return;
        }
        this.name = name;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void deposit(int money) {
        System.out.println("Prev Bal " + accBalance);
        accBalance += money;
        System.out.println("New Bal " + accBalance);
    }

    public void withdraw(int money) {
        if(money < 0) {
            System.out.println("Don't be clever!!");
            return;
        }

        if(money >  accBalance) {
            System.out.println("Insufficient Balance!!");
            return;
        }

        System.out.println("Prev Bal " + accBalance);
        accBalance -= money;
        System.out.println("New Bal " + accBalance);
    }
    
    public static void main(String[] args) {
   	BankCustomer bmw = new BankCustomer("Ganesh Gaitonde", "Bhagwan", 123457, 34567876);
  		
 		 bmw.setName("Ankit"); 
 	     System.out.println(bmw.getName());
         System.out.println(bmw.getName());
        // bmw.run(bmw.speed);	
  		
    	
    	// oops1 t1=new oops1(5,6);
		// oops1 t2=new oops1(5,7);  // for static of y only one value save so y=7
		
		// System.out.println("t1.x ->"+t1.x+" t1.y ->"+t1.y);
		// System.out.println("t2.x ->"+t2.x+" t2.y ->"+t2.y);
		// t1.x++;
		// t1.y++;
		// t2.x++;
		// t2.y++;
		// oops1.y++;
		// System.out.println("t1.x ->"+t1.x+" t1.y ->"+t1.y);
		// System.out.println("t2.x ->"+t2.x+" t2.y ->"+t2.y);
    	
     }
    
    
}

