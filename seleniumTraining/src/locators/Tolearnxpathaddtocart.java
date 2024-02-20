package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnxpathaddtocart {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input[@value='Add to cart']")).click();
		
		driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']")).click();
		
		
		
}

}
