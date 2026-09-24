package pratice_25th_june2026;

import pratice_23rd_june2026.AccessSpecifierVariableTest;

public class AccessSpecifierVariableCase3 extends AccessSpecifierVariableTest {

	public static void main(String[] args) {
		AccessSpecifierVariableTest.add();
		AccessSpecifierVariableTest.sub();
		System.out.println(a);
		System.out.println(b);
		// System.out.println(c); // will get compile time error bcoz static and private variables we cant access
		// System.out.println(d);
	}
}
