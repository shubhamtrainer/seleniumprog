package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnEnabled {
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void login()
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Reporter.log("login executes()",true);
	}
	
	@Test(priority = -1,enabled = false)
	public void Register()
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Reporter.log("register executes()",true);
	}

}
