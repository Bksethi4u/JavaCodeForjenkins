package pratice_23rd_june2026;

public class AccessSpecifierForMethods2 {

	 public void add()
     {
             System.out.println("Addition");
     }
     protected  void sub()
     {
             System.out.println("Sutraction");
     }
      void mul()
     {
             System.out.println("Multiplication");
     }
     private  void div()
     {
             System.out.println("Division");
     }
     
     public static void main(String[] args) 
     {
    	 AccessSpecifierForMethods2 M = new AccessSpecifierForMethods2();
                    M. add();
                     M.sub();
                     M.mul();
                     M.div();
     }

}
