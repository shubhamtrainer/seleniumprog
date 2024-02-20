package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tohandlealertpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert popAlerts = driver.switchTo().alert();
		
		System.out.println(popAlerts.getText());
		Thread.sleep(2000);
		popAlerts.accept();
	}

}
