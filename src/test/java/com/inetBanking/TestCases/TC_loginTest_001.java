package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws Exception {
		Logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered username");

		lp.setPassword(password);
		Logger.info("Entered password");

		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			Logger.info("Login test failed");
		}

	}

}
