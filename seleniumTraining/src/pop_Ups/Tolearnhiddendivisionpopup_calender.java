package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnhiddendivisionpopup_calender {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		while(true)
		{
			try
			{
				driver.findElement(By.xpath("//span[text()='July']/../../..//a[text()='20']")).click();	
				break;
			}
			catch (Exception e) {
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			
		}
		
		
		
		
		
	}

}
