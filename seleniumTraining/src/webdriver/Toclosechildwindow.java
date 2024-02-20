package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toclosechildwindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allids = driver.getWindowHandles();
		
		for (String s:allids)
		{
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				driver.close();
				break;
			}
			if (driver.getCurrentUrl().contains("amazon"))
			{
				driver.close();
				break;
			}
			if (driver.getCurrentUrl().contains("ebay"))
			{
				driver.close();
				break;
			}
			
		}
		
	}

}
