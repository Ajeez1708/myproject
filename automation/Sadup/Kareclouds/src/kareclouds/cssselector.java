package kareclouds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	
	List<WebElement>ele=driver.findElements(By.cssSelector("input"));
		System.out.println(ele.size());
		
	driver.findElement(By.cssSelector("input#email")).sendKeys("abcde");
	
	driver.findElement(By.cssSelector("input._9npi")).sendKeys("xyz");
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}

	
	