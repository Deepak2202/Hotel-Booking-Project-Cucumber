package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(id="errorMessage")
	private WebElement errorMsgText;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

    public WebElement getTxtEmail() {
		return txtPass;
	}

    public WebElement getBtnLogin() {
		return btnLogin;
	}

    public void login(String emailId,String password) throws InterruptedException {
    	sleepSec(3000);
    	elementSendKeys(txtUser, emailId);
    	elementSendKeys(txtPass, password);
		elementClick(btnLogin);
		
	}
    public void loginEnterKey(String emailId,String password) throws AWTException {
		elementSendKeys(txtUser, emailId);
		elementSendKeys(txtPass, password);
		pressEnterKey();

	}
    
    public String loginErrorMsgText() {
		String elementGetText = elementGetText(errorMsgText);
		return elementGetText;
	}
	
	
}
