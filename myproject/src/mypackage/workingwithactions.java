package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithactions
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
		WebElement value=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		action.contextClick(value).build().perform();
	}
}