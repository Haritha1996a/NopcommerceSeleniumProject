package com.haritha.pom;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.haritha.helper.Base;


public class AdminLoginPage extends Base{

	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailBtn;
	
	@FindBy(xpath = "//input[@value='admin']")
	WebElement passwordBtn;
	
	@FindBy(id="RememberMe")
    WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	public WebElement getEmailBtn() {
		return emailBtn;
	}
	
	public WebElement getPasswordBtn() {
		return passwordBtn;
	}
	
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
/*@FindBy(id = "Email")
			WebElement emailIdTxtBx;
			
			@FindBy(name="Password")
			WebElement pwdTxtBx;
			
			@FindBy(xpath = "//button[@type='submit']")
			WebElement loginBtn;
			
			@FindBy(xpath="//input[@type='checkbox']")
			WebElement remembermeChBx;
			
			public WebElement getEmailIdTxtBx() {
				return emailIdTxtBx;
			}

			public WebElement getPwdTxtBx() {
				return pwdTxtBx;
			}

			public WebElement getLoginBtn() {
				return loginBtn;
			}
			public WebElement getRemembermeChBx() {
				return remembermeChBx;
			}*/
						
			
		}
