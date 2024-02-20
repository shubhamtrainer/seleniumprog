package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGet {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}
