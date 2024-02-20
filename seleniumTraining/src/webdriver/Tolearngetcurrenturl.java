package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetcurrenturl {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
				}

}
