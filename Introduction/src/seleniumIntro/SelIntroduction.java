package seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction  {

	public static void main(String[] args) {
		
		// Invoking Browsers
		//Chrome - ChromeDriver(class)> Methods
		//FireFox - FireFoxDriver 
		//Safari- SafariDriver
		// WebDriver close, findFlement(by ), get - defines all method names
		//WebDriver methods + class methods
		//Chromedriver.exe > Chromedriver
		//step tp invoke chrone driver
		//Selenium Managers
		
		//System.setProperty("webdriver.chrome.driver", "Users/Lenovo/Downloads/chromedriver-win64.zip/chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //it'll close the current page
		driver.quit(); //it'll close all associated windows opened by selenium
	}

}
