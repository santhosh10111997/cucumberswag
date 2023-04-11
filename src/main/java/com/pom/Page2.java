package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Page2 extends BaseClass {
	
	public Page2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement selectproduct;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocard;
	
	
	public WebElement getSelectproduct() {
		return selectproduct;
	}
	public WebElement getAddtocard() {
		return addtocard;
	}
	
	
}
