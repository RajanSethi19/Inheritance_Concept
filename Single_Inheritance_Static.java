package Inheritance_Programs;

class India {

	static void chandigarh() {

		System.out.println("I am in chandigarh");
	}
}

public class Single_Inheritance_Static extends India {

	static void shimla() {

		System.out.println("I am in Shimla");
	}

	public static void main(String[] args) {
		shimla();
		chandigarh();

	}

}
