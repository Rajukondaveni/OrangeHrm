package com.orange.hrm.qa.test.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class CommonSteps {
	protected WebDriver driver; 
	private ConfigReader config;
	String browserName = "chrome";
	
//	@BeforeSuite
//	public void initTestExecution() throws IOException {
//		config = new ConfigReader();
//	}
	
	@BeforeMethod
	public WebDriver launchBrowser() {
		
		//String browserName = config.getProperty("browser");
		
		switch(browserName.toLowerCase()) {
		case "chrome":
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("--start-maximized");
			cOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cOptions);
			 break;
		case "edge":
			EdgeOptions eOptions = new EdgeOptions();
			eOptions.addArguments("--start-maximized");
			eOptions.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(eOptions);
			break;
			
			default:
				throw new RuntimeException(browserName+" is not a supported browser");
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
