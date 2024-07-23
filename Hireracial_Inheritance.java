package Inheritance_Programs;
class pen{
void add() {
	
	System.out.println("add");
}
	
}

class pencil extends pen{
	void sub() {
		super.add();
		System.out.println("sub");
		
	}
	
}


class eraser extends pen{
	void mul() {
		super.add();
		System.out.println("mul");
		
	}
	
}
public class Hireracial_Inheritance extends pen {
	void div() {
		super.add();
		
		System.out.println("division");
		
	}

	public static void main(String[] args) {
		
		Hireracial_Inheritance h= new Hireracial_Inheritance();
		eraser e= new eraser();
		
		h.div();
		e.mul();
		
		
	}

}
