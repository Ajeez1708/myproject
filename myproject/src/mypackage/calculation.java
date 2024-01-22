package mypackage;
class demo
{
	void m2(int x,int y)
	{
	System.out.println(x+y);
	}	
void m2(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	void m2(double x,double y)
	{
		System.out.println(x+y);
	}
	void m2(double x,double y,double z)
	{
		System.out.println(x+y+z);
	}
}
public class calculation 
{
	public static void main(String[] args)
	{
		demo obj= new demo();
		
		obj.m2(10,20);
		obj.m2(10,20,30);
		obj.m2(1,2);
		obj.m2(1,2,3);
	}
}


	


