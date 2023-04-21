package com.orange.hrm.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.hrm.qa.test.utils.CommonSteps;

public class LoginTestCasesTwo extends CommonSteps{
	
	@Test(groups = {"smoke"})
	public void test4() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//enter user name
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("adminjjjjj");

		//click login button
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

		//validate home page displayed
		WebElement loginErrorMessage = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']//p"));
		System.out.println(loginErrorMessage.getText());

	}
}
