package screenshotlearning;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tolearnssreplace {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		LocalDateTime datetime = LocalDateTime.now();
		
		String time = datetime.toString().replace(":", "-");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		
		
	TakesScreenshot ts=(TakesScreenshot) driver;
File screen = ts.getScreenshotAs(OutputType.FILE);

File des=new File("./screenshot/image -"+time+".png");
FileHandler.copy(screen, des);
	
	
		
		
	}

}
