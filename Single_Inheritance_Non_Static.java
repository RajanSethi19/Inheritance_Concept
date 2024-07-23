package Inheritance_Programs;

class Vehicle {
	 void car() {
		System.out.println("Maruti car");
	}

}

public class Single_Inheritance_Non_Static extends Vehicle {
	void bike() {
		//super.car();
		System.out.println("Honda Bike");
	}

	public static void main(String[] args) {
		Single_Inheritance_Non_Static c = new Single_Inheritance_Non_Static();
	    c.car();
		c.bike();

	}

}
