package com.orange.hrm.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.hrm.qa.pages.DashboardPage;
import com.orange.hrm.qa.pages.LoginPage;
import com.orange.hrm.qa.test.utils.CommonSteps;

public class LoginTestCases extends CommonSteps{
	
	
	@Test(groups = {"smoke"}, priority=1)
	public void test1() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoHrm("Admin", "admin123");		
		
		DashboardPage dashboard = new DashboardPage(driver);		
		Assert.assertTrue(dashboard.isDashBoardDispayed());
		
	}
	
	@Test(groups = {"regression", "module1"})
	public void test2() {	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoHrm("Admin", "adminsdsd");	

		String actualMessage = loginPage.getLoginErrorMessage();
		
		Assert.assertEquals(actualMessage, "Invalid credentials");

	}
	
	@Test(groups = {"regression"}, priority=-1)
	public void test3() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoHrm("dsfsdafgsdfg", "admin123");	

		String actualMessage = loginPage.getLoginErrorMessage();
		
		Assert.assertEquals(actualMessage, "Invalid credentials");

	}
	
	@Test(groups = {"regression"}, priority=-1)
	public void test4() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoHrm("dsfsdafgsdfg", "admin123");	

		String actualMessage = loginPage.getLoginErrorMessage();
		
		Assert.assertEquals(actualMessage, "Invalid credentials");

	}
}
