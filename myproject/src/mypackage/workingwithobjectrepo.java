package mypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithobjectrepo 
{
	ChromeDriver driver;
	FileInputStream fis;
	Properties pr123;
	@BeforeTest
	public void open() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(option);
		driver=new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void login() throws InterruptedException, IOException
	{
		fis=new FileInputStream("D:\\workspace\\myproject\\orangehrm.properties");
		pr123=new Properties();
		pr123.load(fis);
		driver.findElement(By.name(pr123.getProperty("user"))).sendKeys("Admin");
		driver.findElement(By.name(pr123.getProperty("pwd"))).sendKeys("admin123");
		driver.findElement(By.xpath(pr123.getProperty("loginbutton"))).click();
		Thread.sleep(5000);
	}

@Test(priority=2)
public void logout() throws InterruptedException, IOException
{
	fis=new FileInputStream("D:\\workspace\\myproject\\orangehrm.properties");
	pr123=new Properties();
	pr123.load(fis);
	driver.findElement(By.xpath(pr123.getProperty("drop-down"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr123.getProperty("logoutbutton"))).click();
	Thread.sleep(5000);
}
}


