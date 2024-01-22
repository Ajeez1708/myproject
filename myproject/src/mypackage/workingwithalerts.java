package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithalerts 
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void operation()
	{
		driver.findElement(By.id("searchBtn")).click();
		String
		value=driver.switchTo().alert().getText();
		System.out.println(value);
	}

}
