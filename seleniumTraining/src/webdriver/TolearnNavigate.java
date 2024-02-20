package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnNavigate {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://skillrary.com/");
		
		
//		driver.navigate().to("https://skillrary.com/");
		
		driver.navigate().to(new URL("https://skillrary.com/"));
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

}
