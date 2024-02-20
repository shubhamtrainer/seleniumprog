package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toposition_and_size_flipkart {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains("amazon")) {
				break;
			}
		}
		
		
		Dimension size = driver.manage().window().getSize();
		Point position = driver.manage().window().getPosition();
		System.out.println(size.height);
		System.out.println(size.width);
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		
		
	}

}
