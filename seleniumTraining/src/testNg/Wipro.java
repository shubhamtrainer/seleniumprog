package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Wipro {

	@Test(groups = "smoke")
	public void wipro()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("Wipro executes....",true);
	}
	
}
