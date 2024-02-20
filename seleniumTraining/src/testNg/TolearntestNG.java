package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.Register_page;

public class TolearntestNG {   //testNG class
	
	@Test
	public void demo()//testNG test case
	{
		Reporter.log("welcome to selenium",true);//test steps
	}
	
	@Test
	public void sample()
	{
		Reporter.log("sample executes()", true);
	}
	
	@Test
	public void college()
	{
		Reporter.log("college executes()", true);
	}
	
	@Test
	public void job()
	{
		Reporter.log("job executes()",true);
	}

}
