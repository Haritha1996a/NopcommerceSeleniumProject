package com.haritha.pom;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.haritha.helper.Base;


public class AdminDashBoardPage extends Base {
	@FindBy(xpath = "//p[text()=' Dashboard']")
	WebElement dashBoardTitle;
	
	

	public WebElement getDashBoardTitle() {

		return dashBoardTitle;
		
			/*@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
			WebElement DbTitle;

			public WebElement getDbTitle() {
				return DbTitle;*/
			}
			
	}
