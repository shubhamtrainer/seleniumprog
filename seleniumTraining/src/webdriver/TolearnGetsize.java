package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetsize {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size.height);
		System.out.println(size.width);
		
		
		driver.manage().window().setSize(new Dimension(500,500));
	}

}
