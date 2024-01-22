package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearn 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://kareclouds.com/site/login");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("superadmin@gmail.com");
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.sendKeys("Admin@123");
	WebElement signBtn=driver.findElement(By.className("btn"));
	signBtn.click();

	}

}
