package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toremovechild {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/3");

		Thread.sleep(20000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		Set<String> allids = driver.getWindowHandles();
		allids.remove(parentId);

		for (String s : allids) {
			driver.switchTo().window(s);
			driver.close();
		}
		driver.switchTo().window(parentId);// switchto parent
		String parenttitle = driver.getTitle();
		System.out.println(parenttitle);
	}

}
