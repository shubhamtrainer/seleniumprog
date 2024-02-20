package screenshotlearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TotakessEntireWebPage {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File des= new File("./screenshot/image.png");
		FileHandler.copy(temp, des);
		
	}

}
