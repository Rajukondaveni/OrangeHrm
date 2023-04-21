package com.orange.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By usernameTextBox = By.name("username");
	public By passwordTextBox = By.name("password");
	public By loginButton = By.xpath("//button[@type='submit']");
	public By labelErrorMessage = By.xpath("//div[@class='orangehrm-login-error']//p");
	
	public void loginIntoHrm(String username, String password) {
		 driver.findElement(usernameTextBox).sendKeys(username);
		 driver.findElement(passwordTextBox).sendKeys(password);
		 driver.findElement(loginButton).click();
	}
	
	public String getLoginErrorMessage() {
		return driver.findElement(labelErrorMessage).getText();
	}
	
}
