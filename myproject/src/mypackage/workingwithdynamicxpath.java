package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithdynamicxpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("Webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://rediffmail.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("CreateAccount")).click();
	driver.findElement(By.xpath("//input[contains@name,'name')]")).sendKeys("QA");
}

}
