package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_page {
	public Facebook_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname_text;
	
	public WebElement getfname_text()
	{
		return fname_text;
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lname_text;
	public WebElement getlname_text()
	{
		return lname_text;
	}
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mob_text;
	
	public WebElement getmob_text()
	{
		return mob_text;
	}
	
	
	@FindBy(id="password_step_input")
	private WebElement newpwd_text;
	
	public WebElement getnewpwd_text()
	{
		return newpwd_text;
	}
	
	@FindBy(id="day")
	private WebElement day_dropdown;
	
	public WebElement getday_dropdown()
	{
		return day_dropdown;
	}
	
	
	@FindBy(id="month")
	private WebElement month_dropdown;
	
	public WebElement getmonth_dropdown()
	{
		return month_dropdown;
	}
	
	@FindBy(id="year")
	private WebElement year_dropdown;
	public WebElement getyear_dropdown()
	{
		return year_dropdown;
	}
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female_radio;
	public WebElement getfemale_radio()
	{
		return female_radio;
	}
	
	
	

}
