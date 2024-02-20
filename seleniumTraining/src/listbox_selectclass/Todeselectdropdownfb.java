package listbox_selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Todeselectdropdownfb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select list=new Select(day);
		list.selectByIndex(19);
		
		Thread.sleep(2000);
		
		list.deselectByValue("20");
		
	
		
		
		
	}
	
}
