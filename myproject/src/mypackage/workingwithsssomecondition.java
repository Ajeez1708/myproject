package mypackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithsssomecondition 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.moneycontrol.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>links=driver.findElements(By.linkText("BKFS"));
	if(links.size()==0)
	{
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\hp\\Desktop\\captureproof.PNG"));
}
	else
	{
		links.get(0).click();
	}
	}

}
