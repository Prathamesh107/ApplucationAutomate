package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.pages.PasswordPage;

import BaseClass.Library;
import SeleniumUtility.SeleniumReusable;

public class PasswordTestCase extends Library {

	@BeforeTest
	public void startUp() {
		browserSetUp();
		logger.info("*******Browser Launched*********");
	}

	@Test()
	public void login() {
		PasswordPage ppage = new PasswordPage(driver);
		ppage.Password("Rathod123!");
		logger.info("*******Enter password*********");
		ppage.FinalLogin();
	}


	@AfterTest
	public void close() throws IOException {
		SeleniumReusable util = new SeleniumReusable(driver);
		util.to_take_screenshot("src/test/resources/Screenshots/Password.png");
		logger.info("*******Screenshot Captured*********");
		tearDown();
	}

}
