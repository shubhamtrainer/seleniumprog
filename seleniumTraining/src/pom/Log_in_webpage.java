package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in_webpage {
	
	public Log_in_webpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email")
	private WebElement Id_text;
	
	@FindBy(id="Password")
	private WebElement pwd_text;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_button;
	
	public WebElement getpwd_text()
	{
		return pwd_text;
	}
	
	public WebElement getlogin_button()
	{
		return login_button;
	}
	
	
	
	public WebElement getId_text() {
		return Id_text;
	}
	
	
	

}
