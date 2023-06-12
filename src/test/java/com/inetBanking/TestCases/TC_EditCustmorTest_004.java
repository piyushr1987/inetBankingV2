package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditCustmorPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustmorTest_004 extends BaseClass {

	@Test
	public void editCustmor() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Logger.info("username is provided");
		lp.setUserName(username);
		Logger.info("password is provided");
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		EditCustmorPage editcustmor = new EditCustmorPage(driver);
		editcustmor.clickOnEditCustmor();
		editcustmor.custId("95988");
		editcustmor.clickOnSubmit();
		Logger.info("Custmor information is provided");
		editcustmor.custCity("Jaipur");
		editcustmor.custState("Rajasthan");
		editcustmor.custPinNo("456789");
		Thread.sleep(3000);
		editcustmor.clickOnEditSubmit();
		Thread.sleep(3000);

		Assert.assertTrue(true);
		driver.switchTo().alert().accept();

	}

}
