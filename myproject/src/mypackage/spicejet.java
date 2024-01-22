package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("WebDriver.chrome.driver","D://chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://spicejet.com");
driver.manage().window().maximize();
Thread.sleep(3000);
List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println(radiobuttons.size());

}
}