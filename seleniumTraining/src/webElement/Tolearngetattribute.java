package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearngetattribute {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("https://demowebshop.tricentis.com/");
		String att = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getAttribute("type");
		
		System.out.println(att);
		
		
	}
	
	

}
