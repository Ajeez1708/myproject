package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithxpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("Webdriver.chrome.driver","D://chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
