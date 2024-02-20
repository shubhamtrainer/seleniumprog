package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_dws_001 {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginlink().click();
		
		Log_in_webpage lwp=new Log_in_webpage(driver);
		lwp.getId_text().sendKeys("kumargup@gmail.com");
		lwp.getpwd_text().sendKeys("shubham");
		lwp.getlogin_button().click();
		
		
	}

}
