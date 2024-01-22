package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithwebtables2
{
ChromeDriver driver;   
@BeforeTest
public void open() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void data()
{
	String 
	text=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[3]/a")).getText();
	
	System.out.println(text);
}


@AfterTest
public void close()
{
	driver.close();
}
}


