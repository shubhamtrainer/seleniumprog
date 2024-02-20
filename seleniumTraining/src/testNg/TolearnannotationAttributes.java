package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnannotationAttributes {
	
	@Test(priority = -1)
	public void college()
	{
		Reporter.log("college executes()", true);
	}
	
	
	@Test(priority=-2)
	public void students()
	{
		Reporter.log("students executes()", true);
	}
	
//	@Test(priority = 10)
//	public void mango()
//	{
//		Reporter.log("mango executes()",true);
//	}
	
	

}
