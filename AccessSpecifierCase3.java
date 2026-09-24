package pratice_23rd_june2026;
// here we are accessing the methods from different package (mentioned in 22ndjune package)

import pratice_22th_june2026.AccessSpecifierTest; //we have to import class which we are referring

public class AccessSpecifierCase3 extends AccessSpecifierTest
{

	public static void main(String[] args) {
	    add();
	    sub();
	   // mul() is not visible and not able to access? though its a static method because outsie the package we only
	    //able to access public and protected property.
	    

	}

}
