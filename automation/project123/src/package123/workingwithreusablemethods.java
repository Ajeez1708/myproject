package package123;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithreusablemethods 
{
	ChromeDriver driver;//instance variable
	@BeforeTest
	public void open() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehramlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	@Test
	public void login(String username,String password)
	{
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		}
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
@AfterTest
public void close()
{
	driver.close();
	
	}

}
