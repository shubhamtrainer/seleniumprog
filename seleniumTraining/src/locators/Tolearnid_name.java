package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnid_name
{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/login");
//		driver.findElement(By.id("Email")).sendKeys("testing");
		
		
//		driver.findElement(By.name("Email")).sendKeys("testing");
//		driver.findElement(By.id("Password")).sendKeys("123456");
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abcdef");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		
	}
}
