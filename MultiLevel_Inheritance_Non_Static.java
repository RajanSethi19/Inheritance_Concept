package Inheritance_Programs;

class English {

	void marks1() {

		System.out.println("English(marks1) =70");
	}
}

class Maths extends English {

	void marks2() {
		super.marks1();
		System.out.println("Maths(marks2) =60");
	}

}

class Science extends Maths {
	void marks3() {
		super.marks2();
		System.out.println("Science(marks3) =90");
	}

}

public class MultiLevel_Inheritance_Non_Static extends Science {

	void marks4() {
		super.marks3();
		System.out.println("(marks4) =100");
	}

	public static void main(String[] args) {

		MultiLevel_Inheritance_Non_Static m = new MultiLevel_Inheritance_Non_Static();
		m.marks4();
		/*
		 * m.marks1(); m.marks2(); m.marks3();
		 */

	}

}
