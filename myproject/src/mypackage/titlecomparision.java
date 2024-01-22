package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;
public class titlecomparision {
	public static void main(String[] args) throws InterruptedException {
		{
//		System.setProperty("WebDriver.chrome.driver","D:\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String Actual=driver.getTitle();//application
		String expected="Google";//document
		if(expected.equals(Actual))
		{
			System.out.println("Title is mathcing");
		}
		else
		{
			System.out.println("Title is not mathcing");
		}
			
		}

	}

}
