package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://practiceautomation.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("PRACTICE")).click();
	driver.findElement(By.linkText("COURSES")).click();
	driver.findElement(By.partialLinkText("Selenium WebDriver")).click();

	}

}
