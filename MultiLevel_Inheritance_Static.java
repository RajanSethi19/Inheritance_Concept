package Inheritance_Programs;

class Banglore {
	static void company1() {

		System.out.println("I ma in company 1");
	}

}

class Pune extends Banglore {
	static void company2() {

		System.out.println("I ma in company 2");
	}

}

class Delhi extends Pune {
	static void company3() {

		System.out.println("I ma in company 3");
	}

}

public class MultiLevel_Inheritance_Static extends Delhi {

	static void company4() {

		System.out.println("I ma in company 4");
	}

	public static void main(String[] args) {

		company1();
		company2();
		company3();
		company4();

	}

}
