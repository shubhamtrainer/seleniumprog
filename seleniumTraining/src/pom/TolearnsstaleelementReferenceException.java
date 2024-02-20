package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnsstaleelementReferenceException {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		
//		WebElement id = driver.findElement(By.xpath("//input[@id='Email']"));
//		id.sendKeys("testing");
//		driver.navigate().refresh();
//		id.sendKeys("java");
		
		
		
		Log_in_webpage lip=new Log_in_webpage(driver);
		lip.getId_text().sendKeys("testing");
		
	driver.navigate().refresh();
	lip.getId_text().sendKeys("selenium");
		
		
	}

}
