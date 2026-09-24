package pratice_22th_june2026;

public class AccessSpecifierTest {

	public static void add()
    {
            System.out.println("Addition");
    }
    protected static void sub()
    {
            System.out.println("Sutraction");
    }
    static void mul()
    {
            System.out.println("Multiplication");
    }
    private static void div()
    {
            System.out.println("Division");
    }
    
    public static void main(String[] args) 
    {
                    add();
                    sub();
                    mul();
                    div();
    }


}
