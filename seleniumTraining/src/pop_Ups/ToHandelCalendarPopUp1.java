package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelCalendarPopUp1 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	d.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	d.findElement(By.xpath("//input[@id = 'first_date_picker']")).click();
	while(true) {
		try {
			d.findElement(By.xpath("//span[text()='October']/../../..//a[text()='18']")).click();
			break;
		} catch (Exception e) {
			d.findElement(By.xpath("//span[text()='Prev']")).click();
		}
	}
	
	
	
	}

}
