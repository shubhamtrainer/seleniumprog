package listbox_selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tolearngetoption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement box = driver.findElement(By.xpath("//select[@id='cars']"));
		Select list=new Select(box);
		
	
		
	
	List<WebElement> options = list.getOptions();
	System.out.println(options.size());;
	for (WebElement w:options)
	{
		System.out.println(w.getText());
	}
	}
	
	

}
