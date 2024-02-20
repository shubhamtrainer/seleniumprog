package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngettext {
public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	String text = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
	System.out.println(text);
	
	
		
		
		
		
}
	
	
	
	
	
	

}
