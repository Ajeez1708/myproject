package mypackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class workingvissiblenotvissiblelinks 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.bing.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	for(int i=0;i<links.size();i++)
	{
		if(links.get(i).isDisplayed())
		{
			String name=links.get(i).getText();
			links.get(i).click();
			String url=driver.getCurrentUrl();
			System.out.println(name+"  "+url);
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
	}
	}
}
			
			
			
			
			
			
			
			
			
		
	
		
		

	


