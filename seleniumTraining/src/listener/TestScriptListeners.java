package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(Listenersimplementationclass.class)

public class TestScriptListeners extends ListenerBaseClass {
	
	
	@Test
	public void login()
	{
		
		Reporter.log("enter url",true);
		driver.get("https://demowebshop.tricentis.com/");
	
		
		Reporter.log("click on login link",true);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Reporter.log("enter proper credential",true);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("skg11@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testing");
		
		Reporter.log("click on login button",true);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Reporter.log("click on logout button",true);
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page is not displayed");
		
		
	}

}
