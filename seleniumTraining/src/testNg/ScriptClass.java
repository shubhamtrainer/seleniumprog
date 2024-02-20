package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ScriptClass extends Baseclass{
	
	@Test
	public void addTocart()
	{
		Reporter.log("product added to cart",true);
	}
	

}
