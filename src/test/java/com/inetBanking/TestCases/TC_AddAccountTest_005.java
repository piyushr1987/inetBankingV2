package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddAccountPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddAccountTest_005 extends BaseClass {

	@Test
	public void addNewAccount() throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered username");

		lp.setPassword(password);
		Logger.info("Entered password");

		lp.clickSubmit();

		Thread.sleep(3000);

		AddAccountPage newaccount = new AddAccountPage(driver);
		newaccount.clickOnNewAccount();

		Logger.info("Add new account form");

		newaccount.custId("61186");
		newaccount.custaccount("Current");
		newaccount.custIntialDeposit("30000");
		newaccount.clickOnSubmit();

		Thread.sleep(3000);

		Logger.info("validation started....");

		boolean res = driver.getPageSource().contains("Account Generated Successfully!!!");

		if (res == true) {
			Assert.assertTrue(true);
			Logger.info("test case passed....");

		} else {
			Logger.info("test case failed....");
			captureScreen(driver, "addNewAccount");
			Assert.assertTrue(false);
		}

	}
}
