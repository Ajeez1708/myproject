package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithimages 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>Images=driver.findElements(By.tagName("img"));
	System.out.println(Images.size());
	for(int i=0;i<Images.size();i++)
	{
		System.out.println(Images.get(i).getAttribute("src"));
	}
	}

}
