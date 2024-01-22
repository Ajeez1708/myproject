package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {
ChromeDriver driver;
@BeforeTest
public void open()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}
@Test
public void operation()
{
	System.out.println("Google");
}
}

