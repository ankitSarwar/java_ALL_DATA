package opps;

class vehical{
	
    String name;
    String carName;
    int amount;
    int deposit;
    int seatCap;
    int speed;
    int Avgspeed;
   
   
   public vehical(String Setname, String carName, int deposit,int speed) {
       this.name=Setname;
       this.carName=carName;
       this.deposit=deposit;
       this.speed=3546;
       
       System.out.println();
   }
   
   public String getName() {
       return this.name;
   }
   
   public void Setname(String name) {
       this.name=name;
   }
   
   
   public void run(int speed) {
       System.out.println("previous speed= "+speed);
       speed+=Avgspeed;
       System.out.println("previous speed= "+speed);
   }
   
   
   public static void main(String[] args) {
     vehical bmw=new vehical("Sarwar","lamborgini_urus" ,400000,400);
       
        bmw.Setname("Ankit"); 
//	     System.out.println(bmw.getName());
       System.out.println(bmw.getName());
      bmw.run(bmw.speed);	
       
  }
   
}