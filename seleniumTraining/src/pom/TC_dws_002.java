package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_dws_002 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wp=new WelcomePage(driver);
		
		wp.getregisterlink().click();
		
		
		Register_page rp=new Register_page(driver);
		rp.getradio_button().click();
		rp.getfname_text().sendKeys("shubham");
		rp.getlname_text().sendKeys("gupta");
		rp.getemail_text().sendKeys("skg01@gmail.com");
		rp.getpwd_text().sendKeys("testing");
		rp.getcpwd_text().sendKeys("testing");
		rp.getregister_button().click();
		
	}

}
