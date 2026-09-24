package pratice_22th_june2026;
//Inheritance non parametrize Constructor program with our superclass statement (note SCS is implicitly present)
class Grandparent
{
        Grandparent()
        {
                System.out.println("Grandparent Cons");
        }
}
class ParentClass1 extends Grandparent
{
        ParentClass1()
        {    
                System.out.println("Parent Cons");
        }
}

public class InheritanceConstructorChildClass1 extends ParentClass1{
	
	InheritanceConstructorChildClass1()
	{
		System.out.println("Child Cons");
	}
	public static void main(String[] args) {
		
		new InheritanceConstructorChildClass1();
		

	}

}
