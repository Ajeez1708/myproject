package newpackage;

class demo
{
	void m1(int x,int y)
	{
	System.out.println(x+y);
	}	
    void m1(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	void m1(double x,double y)
	{
		System.out.println(x+y);
	}
	void m1(double x,double y,double z)
	{
		System.out.println(x+y+z);
	}
}
public class calculation 
{
	public static void main(String[] args)
	{
		demo obj= new demo();
		
		obj.m1(10,20);
		obj.m1(10,20,30);
		obj.m1(1,2);
		obj.m1(1,2,3);
	}
}


	


