package listbox_selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tolearnismultiple {
	public static void main(String[] args) {
		
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapp.skillrary.com/");
	 
	 WebElement box = driver.findElement(By.xpath("//select[@id='cars']"));
	 
	 Select list=new Select(box);
	 
	 System.out.println(list.isMultiple());
	}

}
