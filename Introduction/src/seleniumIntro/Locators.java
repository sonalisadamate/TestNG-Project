package seleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Sonalee");
		driver.findElement(By.name("inputPassword")).sendKeys("Sadamate");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Maya");
		driver.findElement((By.cssSelector("input[placeholder='Email']"))).sendKeys("sonali@gmail.com");
		//driver.findElement((By.cssSelector("//input[@type='text'][2]"))).clear();
		//driver.findElement((By.cssSelector("input[placeholder='Email']"))).sendKeys("sona@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8329845609");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		
		
		
		
		
		//CSS selector-
		//className > tagname.classname 
		//ID > tagname#id
		 //and if classname and id is not there then 
		//tagname[attribute='value']
		//if multiple elements are present=
	    // tagname[attribute='value']:nth-child(index)
		//parenttagname childtagname
		
		//XPath 
		// //tagname[@attribute='value']
		//if multiple elements are present-
		// //tagname[@attribute='value'][index]
		//parenttagname/childtagname
		
		
		
	}

}
