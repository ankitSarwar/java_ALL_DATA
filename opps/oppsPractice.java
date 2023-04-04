package opps;

public class oppsPractice {
		
		// #Properties
		int price;
		int wheel;
		String name;
		
		// # Behaviour
		public void run(int speed) {
			System.out.println("car speed is "+speed);
		}

		public void stop() {
			System.out.println("stoped");
		}
		
		public void st(String name) {
			System.out.println(this.name);
		}
		
		// #Getters
		public String getname() {
			return this.name;
		}
		
		// # Setters
		public void Setname(String name) {
			if(name==null || name.length()<2) {
				System.out.println("Enter valid name");
				return;
			}
			this.name=name;
		}
		
		public static void main(String[] args) {
			
			// # object
			oppsPractice car=new oppsPractice();

			car.price=2542354;
			car.wheel=4;
			car.name="mercedies";
//			
//			car.run(60);
//			car.stop();
//			car.st("Ankit");
//			
			System.out.println(car.getname());// getters for only read or get function
			car.getname();
			
			car.Setname("audi"); // setters for only for set or update values
			
			System.out.println(car.getname());
		}

	}
