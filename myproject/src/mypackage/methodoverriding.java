package mypackage;
class parent
{
	void m1()
	{
		System.out.println("Automation Testing");
	}
}
class child extends parent
{
	void m1()
	{
		System.out.println("Selenium Testing");
	}
}

public class methodoverriding 
{
public static void main(String[] args) 
{
 child obj=new child();
 }
}
