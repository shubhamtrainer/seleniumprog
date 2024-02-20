package list;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListListenerImplementation.class) //suite

public class ListTestScript extends ListBaseClass{
	@Test
	public void login() {
		Reporter.log("enter url",true);
		driver.get("https://demowebshop.tricentis.com/");
	
		
		Reporter.log("click on login link",true);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Reporter.log("enter proper credential",true);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("skg11@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testig");
		
		Reporter.log("click on login button",true);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Reporter.log("click on logout button",true);
		Assert.fail();
	}
}
