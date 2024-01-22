package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithactions2
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(3000);
		WebElement value=driver.findElement(By.name("btnk"));
		Actions action=new Actions(driver);
		action.doubleClick(value).build().perform();
	
	}
}