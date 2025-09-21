package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginCarLoan()
	{
		//selenium
		System.out.println("WebLoginCar");
	}
	@BeforeMethod
	public void beforeeverytc()
	{
		System.out.println("i will execute before every tc from day 3 class");
	}
	@AfterMethod
	public void aftereeverytc()
	{
		System.out.println("i will execute after every tc from day 3 class");
	}

	@Test(timeOut=400)
	public void MobileLoginCarLoan()
	{
		//appium
		System.out.println("MobileLoginCar");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i will execute before class from day 3 class");
	}
	@Test(groups={"Smoke"})
	public void MobileSignIn()
	{
		//appium
		System.out.println("MobileLoginCar");
	}
	@Test(enabled=false)
	public void MobileSignOut()
	{
		//appium
		System.out.println("MobileLoginCar");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("i will execute after class from day 3 class");
	}
@Test(dependsOnMethods= {"WebLoginCarLoan"})
public void LoginAPICarLoan()
{
	//Rest API Automation
	System.out.println("LoginAPICar");
}
}
