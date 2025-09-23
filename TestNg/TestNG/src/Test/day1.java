package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {

	@AfterTest
	public void lastexecution()
	{
		System.out.println("i will execute last");
		
	}
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void Demo(String urlname, String Key)
	{
		System.out.println("Hello");
		System.out.println(urlname);
		System.out.println(Key);
	}
	@AfterSuite
	public void afsuite()
	{
	System.out.println("I am at the last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
		Assert.assertTrue(false);
	}

}
