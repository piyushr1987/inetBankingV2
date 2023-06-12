package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustmorPage {

	WebDriver ldriver;

	public EditCustmorPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='Edit Customer']")
	@CacheLookup
	WebElement lnkEditcustmor;

	@FindBy(name = "cusid")
	@CacheLookup
	WebElement txtCustmorId;

	@FindBy(name = "AccSubmit")
	@CacheLookup
	WebElement btnSubmit;

	@FindBy(name = "city")
	@CacheLookup
	WebElement txtCustmorCity;

	@FindBy(name = "state")
	@CacheLookup
	WebElement txtCustmorState;

	@FindBy(name = "pinno")
	@CacheLookup
	WebElement txtCustmorPinNo;

	@FindBy(name = "sub")
	@CacheLookup
	WebElement btnEditSubmit;

	public void clickOnEditCustmor() {
		lnkEditcustmor.click();
	}

	public void custId(String cid) {
		txtCustmorId.sendKeys(cid);
	}

	public void clickOnSubmit() {
		btnSubmit.click();
	}

	public void custCity(String ccity) {
		txtCustmorCity.clear();
		txtCustmorCity.sendKeys(ccity);
	}

	public void custState(String cstate) {
		txtCustmorState.clear();
		txtCustmorState.sendKeys(cstate);
	}

	public void custPinNo(String cpin) {
		txtCustmorPinNo.clear();
		txtCustmorPinNo.sendKeys(cpin);
	}

	public void clickOnEditSubmit() {
		btnEditSubmit.click();
	}

}
