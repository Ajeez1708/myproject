package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kareclouds1
{

	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
}
