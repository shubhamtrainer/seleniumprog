package webdriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnsetposition {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		driver.manage().window().setPosition(new Point(500,300) );
		
		
	}
}
