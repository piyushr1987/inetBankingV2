package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAccountPage {
	WebDriver ldriver;

	public AddAccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='New Account']")
	@CacheLookup
	WebElement lnkNewaccount;

	@FindBy(xpath = "//input[@name='cusid']")
	@CacheLookup
	WebElement txtCustmorId;

	@FindBy(xpath = "//select[@name='selaccount']")
	@CacheLookup
	WebElement txtaccountType;

	@FindBy(xpath = "//input[@name='inideposit']")
	@CacheLookup
	WebElement txtdeposit;

	@FindBy(xpath = "//input[@name='button2']")
	@CacheLookup
	WebElement submitButton;

	public void clickOnNewAccount() {
		lnkNewaccount.click();
	}

	public void custId(String cid) {
		txtCustmorId.sendKeys(cid);
	}

	public void custaccount(String caccount) {

		Select sel = new Select(txtaccountType);
		sel.selectByVisibleText(caccount);
	}

	public void custIntialDeposit(String cdeposit) {
		txtdeposit.sendKeys(cdeposit);
	}

	public void clickOnSubmit() {
		submitButton.click();

	}

}
