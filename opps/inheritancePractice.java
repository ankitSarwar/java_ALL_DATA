package opps;

// import java.util.*;

class React { // parent class
    int length;
    int breadth;
    int x = 5;
    React() {
        System.out.println("Rect class, non param constructor");
    }

    React(int length, int breadth) {
        System.out.println("Rect class, param constructor");
        this.length = length;
        this.breadth = breadth;
    }

    int area() {  //behaviour
        return this.length * this.breadth;
    }
}

class Cuboidd extends React {  //child class
    int height;
    int x = 7;
    Cuboidd() {
        System.out.println("Cuboid class, non param constructor");
    }  
    
    Cuboidd(int length, int breadth, int height) {
//         System.out.println("Cuboid class, param constructor");
//        super(length, breadth);
        Rect rect = new Rect(1, 2);
         this.length = length;
         this.breadth = breadth;
        this.height = height;
//        System.out.println("Cuboid class, param constructor");
    }

    int volume() {
        return this.area() * this.height;
    }

    void print() {
        System.out.println(this.x); // => same class variable
        System.out.println(super.x);// => parent class variable
    }
}

public class inheritancePractice {

	public static void main(String[] args) {
		 React r = new React(10, 20);
//		 React a = new React();
         System.out.println(r.area());

        Cuboidd c = new Cuboidd(10, 20, 30);
        System.out.println(c.volume());

		
		
		
	}

}
