package pratice_23rd_june2026;
//here we are accessing the methods from different package (mentioned in 22ndjune package)

import pratice_22th_june2026.AccessSpecifierTest; //we have to import class which we are referring
public class AccessSpecifierCase4 //extends AccessSpecifierTest
{

	
		public static void main(String[] args) {
		    //add(); // if we dont have access and we dont have sub class how to access.
		  //  sub(); // out side the package without sub class only we can access public 
		   
		   AccessSpecifierTest.add();

		}
}
