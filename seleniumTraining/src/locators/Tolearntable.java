package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearntable {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/table.html");
	String text = driver.findElement(By.xpath("//td[contains(text(),'KGF')]/preceding-sibling::td")).getText();
	
	System.out.println(text);
		
		
		
		
}

}
