package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetposition {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Point position = driver.manage().window().getPosition();
		
		System.out.println(position.getX());
		System.out.println(position.getY());
	}

}
