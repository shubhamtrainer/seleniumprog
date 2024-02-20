package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	
	
	WebDriver driver;
	@BeforeSuite
	public void configReport()
	{
		Reporter.log("report configuration",true);
	}
	
	@BeforeClass
	public void browserSetup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void Login()
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("skg11@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup()
	{
		Reporter.log("report backup",true);
	}
	
	
}
