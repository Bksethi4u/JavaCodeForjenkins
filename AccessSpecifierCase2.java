package pratice_23rd_june2026;
//Here we are trying to access the another class methods

public class AccessSpecifierCase2 {

	public static void main(String[] args) {
		AccessSpecifierForMethods AM = new AccessSpecifierForMethods(); //Creating object of different class from which we are accessing the methods
		AM.add();
		AM.sub();
		AM.mul();
		//AM.div() is not visible here becuase its private

	}

}
