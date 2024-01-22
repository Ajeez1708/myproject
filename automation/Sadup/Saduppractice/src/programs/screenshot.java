package programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\hp\\eclipse\\java-2023-06\\eclipse\\eclipse.exe\\src1\\image.PNG"));
	}
}