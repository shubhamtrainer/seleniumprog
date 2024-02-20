package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearndraganddrop {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		WebElement photo1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement photo2 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement photo3 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement photo4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		WebElement gallery = driver.findElement(By.xpath("//ul[@id='gallery']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(photo1, trash).perform();
		act.dragAndDrop(photo2, trash).perform();		
		act.dragAndDrop(photo3, trash).perform();
		act.dragAndDrop(photo4, trash).perform();
		act.dragAndDrop(photo1, gallery).perform();
		act.dragAndDrop(photo2, gallery).perform();
		act.dragAndDrop(photo3, gallery).perform();
		act.dragAndDrop(photo4, gallery).perform();
		
		act.moveToElement(photo1).release(trash).perform();
		//or
//		act.moveToElement(photo1).clickAndHold(trash).release().perform();
		
		
	}

}
