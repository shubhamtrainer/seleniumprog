package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbycontains {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("testing");
//	driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();	
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		
		
	}

}
