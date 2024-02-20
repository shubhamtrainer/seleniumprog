package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnmovebyoffsetyono {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
				Actions act=new Actions(driver);
				
//				act.moveByOffset(631,307).sendKeys("testing");
				driver.findElement(By.id("password")).sendKeys("asdfghdfg");
				
//				act.moveByOffset(637,304).click().sendKeys("testing").perform();
				act.moveByOffset(1210,304).clickAndHold().perform();
	
	}

}
