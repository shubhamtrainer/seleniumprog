package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestYantra {
	
	@Test(groups = "smoke")
	public void test_yantra()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		Reporter.log("testyntra executes....",true);
	}

}
