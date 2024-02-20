package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetwindowshandle {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String ids= driver.getWindowHandle();
		System.out.println(ids);
	}

}
