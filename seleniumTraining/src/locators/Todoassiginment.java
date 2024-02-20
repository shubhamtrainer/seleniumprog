package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todoassiginment {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.name("Gender")).click();
	driver.findElement(By.name("Gender")).click();
	driver.findElement(By.id("FirstName")).sendKeys("testing");
	driver.findElement(By.id("LastName")).sendKeys("qspiders123");
	driver.findElement(By.id("Email")).sendKeys("k_umargup@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("skg123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("skg123");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	
	
}
}
