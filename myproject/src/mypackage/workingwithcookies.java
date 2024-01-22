package mypackage;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithcookies
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.mirror.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void operation() throws InterruptedException
	{
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		driver.manage().deleteAllCookies();
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
	}
}