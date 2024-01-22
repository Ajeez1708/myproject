package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithdropdowns 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("WebDriver.chrome.driver","D://chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://mercurytravels.co.in");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement dropdown=driver.findElement(By.id("themes"));
List<WebElement>values=dropdown.findElements(By.tagName("option"));
System.out.println(values.size());
for(int i=0;i<values.size();i++)
{
	String name=values.get(i).getText();
	values.get(i).click();
	if(values.get(i).isDisplayed())
	{
		System.out.println(name+"    "+"Active");
	}
	else 
	{
		System.out.println(name+"   "+"Inactive");
	}
	
	
}
}
}



