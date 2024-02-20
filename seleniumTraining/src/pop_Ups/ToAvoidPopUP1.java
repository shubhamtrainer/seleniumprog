package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import webElement.Tolearnsendkey;

public class ToAvoidPopUP1 {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		d.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\QSP\\Desktop\\10175585884106001.pdf");
		
	}

}
