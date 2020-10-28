package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage {
	WebDriver driver;
	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(xpath = "//*[@id='loginBox']/div[2]/div[1]/div")
	WebElement signin;

	public PasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void Password(String pwd) {
		password.sendKeys(pwd);
	}

	public void FinalLogin() {
	//	WebDriverWait wait = new WebDriverWait(driver,10);
	//	wait.until(ExpectedConditions.visibilityOf(signin));
		signin.click();
	}
}
