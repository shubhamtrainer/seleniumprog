package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearncssvalue {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String color=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
		System.out.println(color);
		
		String color1=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
		System.out.println(color1);
		
		
		
		
		
	}
	
	

}
