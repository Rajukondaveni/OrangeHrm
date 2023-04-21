package com.orange.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public By labelHeader = By.xpath("//div[@class='oxd-topbar-header']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isDashBoardDispayed() {
		return driver.findElement(labelHeader).isDisplayed();
	}
}
