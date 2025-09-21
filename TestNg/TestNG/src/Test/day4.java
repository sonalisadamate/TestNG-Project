package Test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		//selenium
		System.out.println("WebLoginHome");
	}

	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//appium
		System.out.println("MobileLoginHome");
	}
@Test
public void LoginAPIHomeLoan()
{
	//Rest API Automation
	System.out.println("LoginAPIHome");
}
}
