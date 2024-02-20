package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetsourcecode {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}

}
