package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whorkingwithtextfields 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>textfields=driver.findElements(By.xpath("//input[@type='text']"));
System.out.println(textfields.size());
for(int i=0;i<textfields.size();i++)
{
	System.out.println(textfields.get(i).getAttribute("name"));
	
}
	}

}
