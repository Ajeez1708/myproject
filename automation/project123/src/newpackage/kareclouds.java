package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class kareclouds 
{

	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String Actual=driver.getTitle();//application
		String expected="kareclouds";//document
		if(expected.equals(Actual))
		{
			System.out.println("Title is matching");
		}
		else
		{
			System.out.println("Title is not matching");
		}
	}
}