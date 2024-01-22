package mypackage;


public class launchingabrowser 
{
public static void main(String[] args) 
{
	
	//System.setProperty("WebDriver.chrome.driver","D:\\ChromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();

//WebDriverManager.chromedriver().setup();
driver.get("https://www.flipkart.com/");

}
}
