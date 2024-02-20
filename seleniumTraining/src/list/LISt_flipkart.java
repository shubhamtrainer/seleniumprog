package list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LISt_flipkart {
	@Test
	public void list()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		
		
		List<WebElement> dep = driver.findElements(By.xpath("//span[text()=\"Electronics\"]/../..//span[@class=\"_27h2j1\"]"));
	
		Actions act=new Actions(driver);
		act.click();
	
	
	
	}

}
