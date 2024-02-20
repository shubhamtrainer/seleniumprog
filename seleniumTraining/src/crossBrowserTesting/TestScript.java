package crossBrowserTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	
	
	@Test
	public void addtocart()
	{
		Reporter.log("product added to cart",true);
	}
}
