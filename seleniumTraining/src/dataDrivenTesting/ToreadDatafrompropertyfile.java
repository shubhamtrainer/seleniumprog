package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadDatafrompropertyfile {
	public static void main(String[] args) throws IOException {
		
		
		//step1: create an instance of FIS/FR
		
		FileInputStream fis=new FileInputStream("./Testdata/commondata.properties");
		
		//step 2: create respective file type object
		Properties prop=new Properties();
		
		//call read method
		
		prop.load(fis);
		String URL = prop.getProperty("url2");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		
	}

}
