package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnpartiallinktext {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.partialLinkText("viewed")).click();
		
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
	}
	

}
