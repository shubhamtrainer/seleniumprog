package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetwindowshandles {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/4");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		Set<String> allids=driver.getWindowHandles();
		for(String id:allids)
		{
			System.out.println(id);
		}
	}

}
