package package123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithApachepoiwebdriver
{
ChromeDriver driver;
@BeforeTest
public void open()throws InterruptedException 
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
			
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void data() throws IOException
{
	FileInputStream fis=new FileInputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	String data=driver.findElement(By.linkText("Gmail")).getText();
	r=wso.createRow(0);
	r.createCell(0).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	wbo.write(fos);

}
}
