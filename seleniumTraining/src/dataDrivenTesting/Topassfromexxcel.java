package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topassfromexxcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream("./Testdata/TestScriptdata.xlsx");
		
		
		Workbook wkbook = WorkbookFactory.create(fis);
		
		String URL = wkbook.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		double number = wkbook.getSheet("Sheet1").getRow(4).getCell(3).getNumericCellValue();
		System.out.println(number);
		
		boolean bool = wkbook.getSheet("Sheet1").getRow(4).getCell(4).getBooleanCellValue();
		System.out.println(bool);
		
		LocalDateTime date = wkbook.getSheet("Sheet1").getRow(4).getCell(5).getLocalDateTimeCellValue();
		
		System.out.println(date);
		Month month = date.getMonth();
		System.out.println(month);
		System.out.println(date.getDayOfYear());
		System.out.println(date.getHour());
		System.out.println(date.getYear());
		WebDriver driver=new ChromeDriver();
		driver.get(URL);		
		
	}

}
