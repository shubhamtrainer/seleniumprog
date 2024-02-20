package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration_Annotation {
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("beforeSuite executes()",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("beforeTest executes()",true);
	}

	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("beforeClass executes()",true);
	}
	
	@Test
	public void test()
	{
		Reporter.log("test executes()",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("beforeMethod executes()",true);
	}
		
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("afterMethod executes()",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("afterClass executes()",true);
	}
	
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("afterTest executes()",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("afterSuite executes()",true);
	}
	
	
	}

