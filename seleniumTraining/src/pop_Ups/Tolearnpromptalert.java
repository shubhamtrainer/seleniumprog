package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnpromptalert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement tryFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(tryFrame);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptPop = driver.switchTo().alert();
		promptPop.sendKeys("shubham");
		promptPop.accept();
		
		String text = driver.findElement(By.xpath("//p[text()='Hello shubham! How are you today?']")).getText();
		
		System.out.println(text);
		
		
		
	}

}
