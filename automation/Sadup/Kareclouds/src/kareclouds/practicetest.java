package kareclouds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicetest {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for=\"username\"]/following-sibling::input")).sendKeys("student");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

}
