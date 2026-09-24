package pratice_25th_june2026;

class B {
	void login() {
		System.out.println("Login using Email Id");
	}
}

public class MethodOverriding extends B {

	void login() {
		System.out.println("Login using Mobile Number");
	} // same method but different implementation i.e. method name is same but we are using for 2 different login type
	// if we try to call parent method i.e. class B it will never execute as it is overridden.

	public static void main(String[] args) {

		MethodOverriding MO = new MethodOverriding();
		
		MO.login();

	}

}
