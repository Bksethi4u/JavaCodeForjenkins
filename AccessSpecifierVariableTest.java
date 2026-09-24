package pratice_23rd_june2026;

public class AccessSpecifierVariableTest {

	public static int a = 100; // Public Variable
	protected static int b = 50; // Protected Variable
	static int c = 25; // static Variable
	private static int d = 12; // Private variable

	public static void add() {
		System.out.println("Addition");
	}

	protected static void sub() {
		System.out.println("Sutraction");
	}

	static void mul() {
		System.out.println("Multiplication");
	}

	private static void div() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
