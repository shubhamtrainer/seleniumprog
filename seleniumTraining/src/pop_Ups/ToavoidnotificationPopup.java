package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToavoidnotificationPopup {

	
	public static void main(String[] args) {
		
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--incognito");
//		setting.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		
		
		
		
	}
}
