package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithlinks {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(int i=0;i<links.size();i++)
    {
    	System.out.println(links.get(i).getText());
    	
    }

	}

}
