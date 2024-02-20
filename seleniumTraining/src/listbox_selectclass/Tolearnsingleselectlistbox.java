package listbox_selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tolearnsingleselectlistbox {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement single = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select listbox=new Select(single);
//		listbox.selectByIndex(10);
//		listbox.selectByValue("4");
		listbox.selectByVisibleText("5");
	}

}
