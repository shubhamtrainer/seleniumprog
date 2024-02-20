package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TCS {

	
	@Test(groups = "regression")
	public void tCS()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tcs.com/");
		Reporter.log("TCS executes.....",true);
	}
	
}
