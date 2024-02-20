package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Toscript01 {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/signup");
		
		
		Facebook_page fb=new Facebook_page(driver);
		
		fb.getfname_text().sendKeys("shubham");
		fb.getlname_text().sendKeys("gupta");
		
		
		
		Actions act=new Actions(driver);
		act.sendKeys(fb.getmob_text(),"222345567").perform();
		
		Select opt=new Select(fb.getday_dropdown());
		opt.selectByIndex(2);
		
		Select opt1=new Select(fb.getmonth_dropdown());
		opt1.selectByValue("11");
		
		
		Select opt2=new Select(fb.getyear_dropdown());
		opt2.selectByVisibleText("2019");
		
		
		fb.getfemale_radio().click();
		
		
	}

}
