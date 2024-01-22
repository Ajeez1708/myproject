package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithwebtables 
{
ChromeDriver driver;   //Global variable
@BeforeTest
public void open() throws InterruptedException
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.timeanddate.com/worldclock/");
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



