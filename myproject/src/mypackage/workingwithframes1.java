package mypackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithframes1 
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
	List<WebElement>frames=driver.findElements(By.tagName("frame"));
	for(int i=0;i<frames.size();i++)
	{
	driver.switchTo().frame(i);
	try
	{
	driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	break;
	}
	catch(Exception x)
	{
		driver.switchTo().defaultContent();
		
	}
		
	}
}
}




