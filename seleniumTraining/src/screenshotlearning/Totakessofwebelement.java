package screenshotlearning;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Totakessofwebelement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		LocalDateTime time = LocalDateTime.now();
		String acttime = time.toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/");
		
		File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		
		File des=new File("./screenshot/element- "+acttime+".png");
		FileHandler.copy(temp, des);
	}

}
