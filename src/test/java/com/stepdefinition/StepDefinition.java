package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import com.base.BaseClass;
import com.helper.FileReaderManager;
import com.pom.Page1;
import com.pom.Page2;
import com.pom.Page3;
import com.pom.PageObjectManager;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	public static PageObjectManager po;

@Given("user launch the url")
public void user_launch_the_url() throws IOException {
	String b = FileReaderManager.getInstance().getBrowser();
	BrowserLaunch(b);
	String u = FileReaderManager.getInstance().getUrl();
	urlLaunch(u);
	maximize();
	implicitlyWait(10);
}
	
@When("User fill the username")
public void user_fill_the_username() {
	
	 po=new PageObjectManager();
    sendKeys(po.GetinstancePage1().getUser(), "standard_user");
   
}

@When("The user fill password")
public void the_user_fill_password() {
    sendKeys(po.GetinstancePage1().getPass(), "secret_sauce");
}

@When("The user click the login button")
public void the_user_click_the_login_button() {
   Click(po.GetinstancePage1().getLogin());
}

@When("user handle the alert")
public void user_handle_the_alert() {
  // Alert alert = driver.switchTo().alert();
 //  alert.accept();
}

@When("User select the products to click the add to card button")
public void user_select_the_products_to_click_the_add_to_card_button() {
    
    Click(po.GetinstancePage2().getSelectproduct());
}

@When("user go to click the add card page")
public void user_go_to_click_the_add_card_page() {
   Click(po.GetinstancePage2().getAddtocard());
}

@When("user click the checkout button")
public void user_click_the_checkout_button() {
    
   Click(po.GetinstancePage3().getCheckout());
}

@When("user fill the first name")
public void user_fill_the_first_name() {
    sendKeys(po.GetinstancePage3().getFirstname(), "santhosh");
}

@When("user fill the last name")
public void user_fill_the_last_name() {
	sendKeys(po.GetinstancePage3().getLastname(), "tamba");
}

@When("user fill the postel code")
public void user_fill_the_postel_code() {
   sendKeys(po.GetinstancePage3().getPostalcode(), "602105");
}

@When("user click the continue button")
public void user_click_the_continue_button() {
   Click(po.GetinstancePage3().getClickcontinue());
}

@Then("user go to the description page and click the finish button")
public void user_go_to_the_description_page_and_click_the_finish_button() {
   Click(po.GetinstancePage3().getFinish());
 //  Assert.assertTrue(false);
	quit();
}

}
