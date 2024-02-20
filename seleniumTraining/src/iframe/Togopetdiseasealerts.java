package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Togopetdiseasealerts {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		WebElement country = driver.findElement(By.xpath("//iframe[contains(@id,'map')]"));
		driver.switchTo().frame(country);
		driver.findElement(By.xpath("//*[name()='path' and @name='North Dakota']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		String text = driver.findElement(By.xpath("//h1[text()='Step 1: Sign Up for Customized Alerts']")).getText();
		System.out.println(text);
		
	}

}
