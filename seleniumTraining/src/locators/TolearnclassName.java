package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnclassName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("button-1 login-button")).click();
		
		String s = driver.findElement(By.className("validation-summary-errors")).getText();
		System.out.println(s);
		
//		driver.findElement(By.className("button-1 newsletter-subscribe-button")).click();
//		
//	String text = driver.findElement(By.className("field-validation-valid")).getText();
//	System.out.println(text);
		
		
		
	}

}
