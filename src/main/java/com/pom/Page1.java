package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Page1 extends BaseClass {
	
	public Page1() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="user-name")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login-button")
	private WebElement login;
	
	
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
		

}
