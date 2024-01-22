package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithkareclouds 
{

	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
