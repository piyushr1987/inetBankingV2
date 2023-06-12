package com.inetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustmorPage;
import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_AddCustmorTest_003 extends BaseClass {
	@Test(dataProvider = "RegisterData")
	public void addNewCustmor(String cname, String cgender, String cdateofbirth, String caddress, String ccity,
			String cstate, String cpin, String cmobileno, String cemail, String cpassword) throws Exception {

		LoginPage lp = new LoginPage(driver);
		Logger.info("username is provided");
		lp.setUserName(username);
		Logger.info("password is provided");
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		AddCustmorPage addcust = new AddCustmorPage(driver);
		addcust.clickOnCustmor();
		Logger.info("Custmor information is provided");
		addcust.custName(cname);
		addcust.custGender(cgender);
		addcust.custdob(cdateofbirth);
		Thread.sleep(3000);
		addcust.custAddress(caddress);
		addcust.custCity(ccity);
		addcust.custState(cstate);
		addcust.custPin(cpin);
		addcust.custMobileNumber(cmobileno);

		// String email = randomString() + "@gmail.com";
		addcust.custEmail(cemail);

		addcust.custPassword(cpassword);
		addcust.clickOnSubmit();
		Thread.sleep(3000);

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (res == true) {
			Assert.assertTrue(true);
			Logger.info("Test case is passed...");
		} else {
			Logger.info("Test case is failed....");
			captureScreen(driver, "addNewCustmor");
			Assert.assertTrue(false);

		}

	}

	@DataProvider(name = "RegisterData")
	String[][] getData() throws Exception {
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetBanking/TestData/CommonData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet2");
		int colcount = XLUtils.getCellCount(path, "Sheet2", 1);
		String registerdata[][] = new String[rownum][colcount];
		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				registerdata[i - 1][j] = XLUtils.getCellData(path, "Sheet2", i, j);
			}
		}
		return registerdata;
	}

}
