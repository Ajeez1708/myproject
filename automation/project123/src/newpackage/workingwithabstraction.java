package newpackage;
abstract class Bike
{
	abstract void run();
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("honda bike is running");
	}
}
public class workingwithabstraction
{
	public static void main(String[] args)
	{
		Honda h=new Honda();
		h.run();
	}
}
