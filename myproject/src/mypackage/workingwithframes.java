package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithframes 
{
ChromeDriver driver;
@BeforeTest
public void open() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.angelfire.com/super/badwebs/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void operation()
{
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
		
	}
}


