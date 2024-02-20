package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IBM {
	@Test(groups = "sanity")
	public void ibm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ibm.com/in-en");
		Reporter.log("IBM executes.....",true);
	}

}
