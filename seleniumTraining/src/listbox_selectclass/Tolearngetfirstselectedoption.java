package listbox_selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tolearngetfirstselectedoption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement box = driver.findElement(By.xpath("//select[@id='cars']"));
		Select list=new Select(box);
		list.selectByIndex(2);
		list.selectByValue("99");
		list.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
		
		String text = list.getFirstSelectedOption().getText();
		System.out.println(text);
		System.out.println("****************");
		List<WebElement> all = list.getAllSelectedOptions();
		for (WebElement w:all)
		{
			System.out.println(w.getText());
		}
	}

}
