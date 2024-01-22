package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithactions1
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void data() throws InterruptedException
	{
		WebElement value=driver.findElement(By.linkText("Customer Login"));
		Actions action=new Actions(driver);
		action.moveToElement(value).build().perform();
		driver.findElement(By.linkText("Register")).click();
	}
}