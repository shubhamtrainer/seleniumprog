package Practise_batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TCSp {

	@Test(groups = "smoke")
	public void tCS()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tcs.com/");
		Reporter.log("TCS executes.....",true);
	}
}
