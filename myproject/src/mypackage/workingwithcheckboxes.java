package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcheckboxes 
{
public static void main(String[] args) throws InterruptedException 
{
	//System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://designsystem.digital.gov/components/checkbox/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<checkboxes.size();i++)
	{
System.out.println(checkboxes.get(i).getAttribute("name")+"     "+checkboxes.get(i).getAttribute("checked"));
	}	
	}
}
