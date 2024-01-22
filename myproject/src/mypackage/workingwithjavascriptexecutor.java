package mypackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class workingwithjavascriptexecutor 
{
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
}
	@Test
	public void opertion()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='123456789'");
		js.executeScript("document.getElementById('pass').value='123456'");
		
		}
}
