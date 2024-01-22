package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kareclouds4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// System.setProperty("webdriver.chrome.driver","c:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hms.kareclouds.com/site/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement table = driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/thead/tr/th[1])"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
		List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < columns.size(); j++) {
		System.out.println(columns.get(j).getText() + " ");
			}
		}

	}
}