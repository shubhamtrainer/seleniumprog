package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript {
	
	
	@Test
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","not ready to navigate");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page is not displayed");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("skg11@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","not able to click");
		
		
		
		
	}
	
	
	
	

}
