package kareclouds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		List<WebElement>WD= driver.findElements(By.tagName("input"));
		WD.size();
		System.out.println(WD.size());

	}

}
