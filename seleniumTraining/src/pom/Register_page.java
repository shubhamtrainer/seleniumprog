package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
	public Register_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
		
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement radio_button;
	
	
	public WebElement getradio_button()
	{
		return radio_button;
	}
	
	@FindBy(id="FirstName")
	private WebElement fname_text;
	
	public WebElement getfname_text()
	{
		return fname_text;
	}
	
	@FindBy(id="LastName")
	private WebElement lname_text;
	
	public WebElement getlname_text()
	{
		return lname_text;
	}
	
	
	@FindBy(id="Email")
	private WebElement email_text;
	
	public WebElement getemail_text()
	{
		return email_text;
	}
	
	
	@FindBy(id="Password")
	private WebElement pwd_text;
	
	public WebElement getpwd_text()
	{
		return pwd_text;
	}
	
	
	@FindBy(id="ConfirmPassword")
	private WebElement cpwd_text;
	
	public WebElement getcpwd_text()
	{
		return cpwd_text;
	}

	
	@FindBy(id="register-button")
	private WebElement register_button;
	
	public WebElement getregister_button()
	{
		return register_button;
	}
	
	
	
}
