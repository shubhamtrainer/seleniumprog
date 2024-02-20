package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tolearngetsize_location_rect
{
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		Dimension size = driver.findElement(By.xpath("//input[@value='Register']")).getSize();
		System.out.println("heignt :" +size.height);
		System.out.println("width is :"+size.width);
		
		Point location = driver.findElement(By.xpath("//input[@value='Register']")).getLocation();
		System.out.println("x is " +location.getX());
		System.out.println("y is "+location.getY());
		
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Register']")).getRect();
		System.out.println("height is "+rect.height);
		System.out.println("width is "+rect.width);
		System.out.println("x is "+rect.getX());
		System.out.println("ys is "+rect.getY());
		
		
		
		
		
		
		
		
	}

}
