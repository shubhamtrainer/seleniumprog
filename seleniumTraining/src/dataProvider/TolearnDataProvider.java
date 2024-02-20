package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TolearnDataProvider {
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data= {{"skg11@gmail.com","testing"},{"testing@gmail.com","test@123"}};
		return data;
		
		
		
	}
	
	
	
	
	@Test(dataProvider = "dataSender")
	public void Login(String[] cred)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(cred[0]);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	
	
	
	
	}

}
