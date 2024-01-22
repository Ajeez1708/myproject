package mypackage;
class demo16
{
	static int a=10;//static variable
	int b=20; //non-static variable
	 static void m1()  //static method
	{
		System.out.println(a);
		}
	void m2()  //non-static variable
	{
		
		System.out.println(a);
		System.out.println(b);
	}
}

public class workingwithvariables
{

	public static void main(String[] args) 
	{
		demo16 obj=new demo16();
		obj.m1();
		obj.m2();
		}
}
