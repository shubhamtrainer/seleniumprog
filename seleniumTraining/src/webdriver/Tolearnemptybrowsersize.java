package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnemptybrowsersize {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	Dimension size = driver.manage().window().getSize();
	
	System.out.println(size.height);
	System.out.println(size.width);
	
}
}
