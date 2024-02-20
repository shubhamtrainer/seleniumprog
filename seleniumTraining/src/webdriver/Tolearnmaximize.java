package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnmaximize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
//		driver.manage().window().fullscreen();
		
		driver.manage().window().minimize();
		
		
		
		
	}
}
