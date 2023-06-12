package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustmorPage {

	WebDriver ldriver;

	public AddCustmorPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='New Customer']")
	@CacheLookup
	WebElement lnkNewcustmor;

	@FindBy(xpath = "//input[@type='text' and @name='name']")
	@CacheLookup
	WebElement txtcustmorName;

	@FindBy(xpath = "//input[@name='rad1']")
	@CacheLookup
	WebElement rdGender;

	@FindBy(xpath = "//input[@id='dob']")
	@CacheLookup
	WebElement txtdob;

	@FindBy(xpath = "//textarea[@name='addr']")
	@CacheLookup
	WebElement txtaddress;

	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement txtcity;

	@FindBy(xpath = "//input[@name='state']")
	@CacheLookup
	WebElement txtstate;

	@FindBy(xpath = "//input[@name='pinno']")
	@CacheLookup
	WebElement txtpin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	@CacheLookup
	WebElement txtphoneno;

	@FindBy(xpath = "//input[@name='emailid']")
	@CacheLookup
	WebElement txtemail;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath = "//input[@name='sub']")
	@CacheLookup
	WebElement btnsubmit;

	public void clickOnCustmor() {
		lnkNewcustmor.click();
	}

	public void custName(String cname) {
		txtcustmorName.sendKeys(cname);
	}

	public void custGender(String cgender) {
		rdGender.click();
	}

	public void custdob(String cdob) {
		txtdob.sendKeys(cdob);

	}

	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custCity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custState(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custPin(String cpin) {
		txtpin.sendKeys(String.valueOf(cpin));
	}

	public void custMobileNumber(String cmobilenumber) {
		txtphoneno.sendKeys(cmobilenumber);
	}

	public void custEmail(String cemail) {
		txtemail.sendKeys(cemail);
	}

	public void custPassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void clickOnSubmit() {
		btnsubmit.click();
	}

}
