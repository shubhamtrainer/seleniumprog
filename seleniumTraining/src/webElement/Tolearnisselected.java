package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnisselected {
	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement option = driver.findElement(By.xpath("//option[@value='99']"));
		
		System.out.println(option.isSelected());
		
		option.click();
		System.out.println(option.isSelected());
		
		
		
		
		
		
		
		
	}
	

}
