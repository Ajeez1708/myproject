package newpackage;
interface example
{
	void m1();
}
class paper implements example
{
	public void m1()
	{
		System.out.println("Hello");
	}
}
public class workingwithinterface 
{
public static void main(String[] args) 
{
paper obj=new paper();
obj.m1();
	}
}
