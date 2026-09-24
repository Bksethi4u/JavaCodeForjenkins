package pratice_22th_june2026;

class Grandparent12 {
	Grandparent12(String name, char initial) // Parameterized constructor
	{ 
		System.out.println("Grandparent Cons");
	}
}

class ParentClass12 extends Grandparent12 {
	ParentClass12() {
		super("ram", 'T'); //parameterized super calling statement
		System.out.println("Parent Cons");
	}
}

public class InheritParaConstructor extends ParentClass12 {
	InheritParaConstructor() {
		super();
		System.out.println("Child Cons");
	}

	public static void main(String[] args) {

		{
			new InheritParaConstructor();

		}

	}

}
