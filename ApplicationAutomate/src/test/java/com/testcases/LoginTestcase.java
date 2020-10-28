package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.pages.LoginPage;

import BaseClass.Library;
import SeleniumUtility.SeleniumReusable;

public class LoginTestcase extends Library {

	@BeforeTest
	public void startUp() {
		browserSetUp();
		logger.info("*******Browser Launched*********");
	}

	@Test
	public void login() {
		LoginPage lpage = new LoginPage(driver);
		lpage.Login("prathamesh.rathod@niiconsulting.com");

		logger.info("*******Enter username*********");

		lpage.Submit();
		logger.info("*******Clicked Submit*********");
	}
/*
	@Test // wrong username
	public void invalidUsername() {
		LoginPage lpage = new LoginPage(driver);
	
		lpage.Login("prathamesh.rathod");
        
        lpage.Submit();
		String actual_msg = driver.findElement(By.id("divLoginErrorBox")).getText();

		String expect = "Oh Snap! I couldn't recognise you.Please try again with valid Email Address. ";

		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		System.out.println(actual_msg);

	}
*/
	@AfterTest
	public void close() throws IOException {
		SeleniumReusable util = new SeleniumReusable(driver);
		util.to_take_screenshot("src/test/resources/Screenshots/FiresecLogin.png");
		logger.info("*******Screenshot Captured*********");
		tearDown();
	}
}
