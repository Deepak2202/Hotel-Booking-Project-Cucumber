package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.junit.Assert;
import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pages.LoginPage;
import com.omrbranch.pages.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();

	@Given("User is on the OMR Branch Hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
	    
	}
	@When("User login {string},{string}")
	public void user_login(String emailId,String password) throws InterruptedException {
		pom.getLoginPage().login(emailId, password);
	     
	}
	@When("User should verify success message agter login {string}")
	public void user_should_verify_success_message_agter_login(String expLoginSuccessTextMsg) {
		
		String actloginSuccessTextMsg = pom.getSearchHotelPage().loginSuccessTextMsg();
		//System.out.println(expLoginSuccessTextMsg+" "+actloginSuccessTextMsg);
		Assert.assertEquals("Verify the Login Success message", expLoginSuccessTextMsg, actloginSuccessTextMsg);
	}
	

	@When("User login {string},{string} with ENTER key")
	public void user_login_with_enter_key(String emailId,String password) throws AWTException {
		
		pom.getLoginPage().loginEnterKey(emailId, password);  
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrorMsgtext) {
	    String actLoginErrorMsgtext =pom.getLoginPage().loginErrorMsgText();
	    boolean errorMsgContains = actLoginErrorMsgtext.contains(expLoginErrorMsgtext);
	    Assert.assertTrue(errorMsgContains);
	}






}
