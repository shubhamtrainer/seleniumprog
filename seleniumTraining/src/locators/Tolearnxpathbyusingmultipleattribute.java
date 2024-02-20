package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbyusingmultipleattribute {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@type='text' and @value='Search store']")).sendKeys("testing");
		
		driver.findElement(By.xpath("//input[@type='text' or @value='Search stor']")).sendKeys("qspiders");
		
		driver.findElement(By.xpath("//a[text()='Register' or @value='Search stor']")).click();
		
		
		
		
		
	}

}
