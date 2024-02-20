package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnsubmit {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://demo.vtiger.com/vtigercrm/");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		
	}

}
