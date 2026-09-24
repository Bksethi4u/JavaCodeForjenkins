package pratice_22th_june2026;

//Inheritance non parametrize Constructor program with superclass statement
class Grandparent2
{
        Grandparent2()
        {
        	
                System.out.println("Grandparent Cons");
        }
}
class ParentClass2 extends Grandparent2
{
        ParentClass2()
        
        {    
        	super(); 
                System.out.println("Parent Cons");
        }
}

public class InheritanceConstructorChildClass2  extends ParentClass2{
	
	InheritanceConstructorChildClass2()
	{
		super();
		System.out.println("Child Cons");
	}
	public static void main(String[] args) {
		
		new InheritanceConstructorChildClass2();
		

	}


}
