package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toreaddatafromexcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream("./Testdata/TestScriptdata.xlsx");
		
		
		Workbook workBook = WorkbookFactory.create(fis);
		
		
		String URL = workBook.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		
		
		System.out.println(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		String Email = workBook.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		
		System.out.println(Email);
		
		String pwd = workBook.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		System.out.println(pwd);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		
		
		
		
		
	}

}
