package mypackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithscreenshots 
{
public static void main(String[] args) throws InterruptedException, IOException 
	{
//	System.setProperty("WebDriver.chrome.driver","D:\\chromedriver.exe"); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\hp\\Desktop\\capture123.PNG"));
driver.findElement(By.linkText("Gmail")).click();
File srcfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile1,new File("C:\\Users\\hp\\Desktop\\capture345.PNG"));
	}

}
