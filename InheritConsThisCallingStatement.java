package pratice_22th_june2026;

public class InheritConsThisCallingStatement {
	
	
		InheritConsThisCallingStatement(int a,char b)
	      {
	              System.out.println("1");
	      }
		InheritConsThisCallingStatement(String a,char b)
	      {
			this(100,'B'); 
	              System.out.println("2");

	      }
		InheritConsThisCallingStatement(String a,String b)
	      {
	        this("Test",'A');      
			System.out.println("3");

	      }
		InheritConsThisCallingStatement(int a,int b)
	      {
	        this("Ram","Laxman");      
			System.out.println("4");

	      }
	      public static void main(String[] args) 
	      {
	    	 /* InheritConsThisCallingStatement c1=new InheritConsThisCallingStatement(100,'S');
	    	  InheritConsThisCallingStatement c2=new InheritConsThisCallingStatement("Hello",'S');
	    	  InheritConsThisCallingStatement c3=new InheritConsThisCallingStatement("UN","PWD");
	    	  InheritConsThisCallingStatement c4=new InheritConsThisCallingStatement(100,200);
	    	 */
  	     
	           /*  new ConstructorsMethods(100,'S');
	              new ConstructorsMethods("Hello",'S');
	              new ConstructorsMethods("UN","PWD");
	              new ConstructorsMethods(100,200);
	              */

	    	   new InheritConsThisCallingStatement(100,200);
	      
		}

}
