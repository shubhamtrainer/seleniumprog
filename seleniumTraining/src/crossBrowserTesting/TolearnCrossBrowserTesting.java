package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TolearnCrossBrowserTesting {
	
	WebDriver driver;
	@Parameters("Browser")
	

	@Test
	public void demoWebShop(@Optional("chrome")   String browser)
	{
		
		
		
		if(browser.equals("chrome"))
		{
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		}
		else if(browser.equals("edge"))
		{
			 driver=new EdgeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
}
