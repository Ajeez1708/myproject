package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcssselector
{
public static void main(String[] args) throws InterruptedException 
{

ChromeDriver driver=new ChromeDriver();
	driver.get("https://rediffmail.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("CreateAccount")).click();
	driver.findElement(By.cssSelector("#newpassword")).sendKeys("123456");
	}
}
