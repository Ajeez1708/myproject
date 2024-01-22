package encapsulation;

public class Car {
	private String carName;
	private String carColour;
	public void setcarName(String carName)
	{
		this.carName=carName;
	}
	public String getCarName()
	{
		return carName;
	}
	public void setcarColour(String carColour)
	{
		this.carColour=carColour;
	}
	public String getcarColour()
	{
		return carColour;
	}

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.getCarName());
		System.out.println(c.getcarColour());

	}
}