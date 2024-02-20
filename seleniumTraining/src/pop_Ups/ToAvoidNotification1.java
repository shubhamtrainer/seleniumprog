package pop_Ups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotification1 {

	public static void main(String[] args) {
		ChromeOptions ses = new ChromeOptions();
		//ses.addArguments("--disable-notifications");
		ses.addArguments("--incognito");
		ChromeDriver d = new ChromeDriver(ses);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("https://www.redbus.in/");
	}

}
