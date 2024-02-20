package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnisDisplayed_enabled
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("qspiders1234");
		
		System.out.println("**********after passing data************");
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		
		
		
		
		
		
	}

}
