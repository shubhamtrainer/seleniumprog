package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathbyattribute {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	}

}
