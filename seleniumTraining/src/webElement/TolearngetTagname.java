package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearngetTagname {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String tagname = driver.findElement(By.xpath("//input[@value='Search']")).getTagName();
		System.out.println(tagname);
		
		
		
		
		
		
	}

}
