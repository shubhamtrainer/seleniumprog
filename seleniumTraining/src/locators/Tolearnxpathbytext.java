package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbytext {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//span[text()='Meta']")).click();
		
		driver.findElement(By.xpath("//span[text()='About']")).click();
		
		
		
		
	}
}
