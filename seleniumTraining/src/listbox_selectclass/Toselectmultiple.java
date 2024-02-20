package listbox_selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toselectmultiple {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement box = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select price=new Select(box);
		
		price.selectByIndex(1);
		price.selectByValue("299");
		price.selectByVisibleText("INR 300 - INR 399 ( 1 )");
	}

}
