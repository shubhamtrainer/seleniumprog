package screenshotlearning;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tolearnwebelemntsigin {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		LocalDateTime time = LocalDateTime.now();
	String acttime = time.toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		
		email.sendKeys("testingqsp");
		File temp=email.getScreenshotAs(OutputType.FILE);
		
		File des=new File ("./screenshot/element1-" +acttime+".png");
		
		FileHandler.copy(temp, des);
		
		
		
		
		
	}

}
