package actions_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnrightclick {

	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		act.contextClick().perform();
		
		
		
		
		
		
		
		
	}
	
	
	
}
