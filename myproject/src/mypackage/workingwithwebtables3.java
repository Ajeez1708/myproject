package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithwebtables3
{
ChromeDriver driver;   
@BeforeTest
public void open() throws InterruptedException
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	 WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.timeanddate.com/worldclock/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void data()
{
String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";String part2= "]/td[1]/a";
for(int i=1;i<=36;i++)
{
	String text=driver.findElement(By.xpath(part1+i+part2)).getText();
	System.out.println(text);
}
}
@AfterTest
public void close()
{
	driver.close();
}
}


