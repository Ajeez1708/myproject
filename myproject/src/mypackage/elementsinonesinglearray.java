package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsinonesinglearray 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//no.of links
	List<WebElement>Element=driver.findElements(By.tagName("a"));
System.out.println("no.of links are:"  +Element.size());
    //no.of dropdowns
Element=driver.findElements(By.tagName("select"));
System.out.println("no.of dropdowns are:"  +Element.size());
     //no.of images
Element=driver.findElements(By.tagName("img"));
System.out.println("no.of images are:"  +Element.size());
    //no.of radiobuttons
    Element=driver.findElements(By.xpath("//input[@type='radio']"));
    System.out.println("no.of radiobuttons are:"  +Element.size());
    //no.of checkboxes
    Element=driver.findElements(By.xpath("//input[@type='checkbox']"));
    System.out.println("no.of checkboxes are:"  +Element.size());
    //no.of textfields
    Element=driver.findElements(By.xpath("//input[@type='text']"));
    System.out.println("no.of textfields are:"  +Element.size());
	}

}
