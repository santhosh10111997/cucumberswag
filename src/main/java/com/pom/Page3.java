package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Page3 extends BaseClass {
	public Page3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout")
    private WebElement checkout;
	@FindBy(id="first-name")
	private WebElement firstname;
	@FindBy(id="last-name")
	private WebElement lastname;
	@FindBy(id="postal-code")
	private WebElement postalcode;
	@FindBy(id="continue")
	private WebElement clickcontinue;
	@FindBy(id="finish")
	private WebElement finish;
	
	public WebElement getFinish() {
		return finish;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	
	
	
}
