package mypackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithtestng 
{
@BeforeTest
public void open()
{
	System.out.println("open a browser");
	}
@Test(priority=1)
public void navigate()
{
	System.out.println("navigate to application");
}
@Test(priority=2)
public void Register()
{
	System.out.println("Register for new account");
}
@Test(priority=3,enabled=true)
public void login()
{
	System.out.println("login into application");
}
@Test(priority=4)
public void dailyreports()
{
	System.out.println("prepare dailu reports and send to team leader");
}
@Test(priority=5)
public void logout()
{
	System.out.println("logout from the application");
}
@AfterTest
public void close()
{
	System.out.println("close the browser");
}
}

