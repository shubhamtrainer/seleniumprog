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

public class TotakessAmazon {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		LocalDateTime time = LocalDateTime.now();
		String acttime = time.toString().replace(":", "-");
		System.out.println(acttime);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Fresh']")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File ("./screenshot/image1-"+acttime+".png");
		FileHandler.copy(temp, des);
		
		
	}
	

}
