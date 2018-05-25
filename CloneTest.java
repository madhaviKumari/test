
public class CloneTest {
public static void main(String [] args)
{
	Customer c1=new Customer("ABC",101);
	Customer c=(Customer)c1.clone();
	Customer c2=new Customer("ABC",101);
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
	
}
}
