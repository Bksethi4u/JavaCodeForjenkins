class K3
{
        K3(int a)
        {
                this();
                System.out.println("6");

        }
        K3()
        {
                System.out.println("5");
        }
}
class K2 extends K3
{
        K2(char a)
        {
                super(100);
                System.out.println("4");
        }
        K2()
        {
                this('D');
                System.out.println("3");
        }
}
public class ThisCallingSuperCallingStat extends K2

{
	ThisCallingSuperCallingStat(String a)
     {
             this();//Non Parametrized This calling statemnet
             System.out.println("2");
     } 
	ThisCallingSuperCallingStat()
     {
             super();
             System.out.println("1");
     }        

	public static void main(String[] args) {
		ThisCallingSuperCallingStat K= new ThisCallingSuperCallingStat("Automation");
		

	}

}
