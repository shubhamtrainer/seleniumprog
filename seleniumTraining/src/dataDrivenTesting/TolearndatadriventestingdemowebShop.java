package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearndatadriventestingdemowebShop {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

	
	FileInputStream fis=new FileInputStream("./Testdata/TestScriptdata.xlsx");
	
	
	Workbook wkbook = WorkbookFactory.create(fis);
	
	String URL = wkbook.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	
	String fname = wkbook.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	
	String lname = wkbook.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
	String email = wkbook.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
	String pwd = wkbook.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();
String cpwd = wkbook.getSheet("Sheet2").getRow(1).getCell(5).getStringCellValue();


driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fname);
driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lname);
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cpwd);

	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
	
	
	
	
	
	
	
	
}
}
