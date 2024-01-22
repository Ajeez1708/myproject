package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kareclouds5
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String
	    text=driver.findElement(By.xpath("//*[@id=\'DataTables_Table_0\']/thead/tr/th[1]")).getText();
	    System.out.println(text);
		
	}
		}