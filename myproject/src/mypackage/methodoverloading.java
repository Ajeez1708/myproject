package mypackage;
class demo1
{
	void m1()
	{
		System.out.println("Automation Testing");
		}
	void m1(int a)
	{
		System.out.println(a);
	}
	void m1(int a,int b)
	{
		System.out.println(a+b);
	}
	void m1(String x)
	{
		System.out.println(x);
	}
}
public class methodoverloading 
{
	public static void main(String[] args)
	{
	
		demo1 obj= new demo1();
		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
		obj.m1("Testing");
	}
}


	


