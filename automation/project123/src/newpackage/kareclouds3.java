package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class kareclouds3 
{
ChromeDriver driver; //global variable
@BeforeTest
public void open() throws InterruptedException
{
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
}
@Test
public void data()
{
	List<WebElement>tables=driver.findElements(By.tagName("table"));
	System.out.println(tables.size());
}
@AfterTest
public void close()
{
	driver.close();

}
}
		
		
