package com.haritha.pom;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.haritha.helper.Base;

public class DeleteActivityLogPage extends Base {
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "//p[normalize-space()='System']")
	private WebElement systemOption;
	
	@FindBy(xpath = "//p[text()=' Log']")
	private WebElement logIcon;
	
	@FindBy(xpath = "//input[@name='CreatedOnFrom']")
	private WebElement createdOnFrom;

	@FindBy(xpath = "//input[@name='CreatedOnTo']")
	private WebElement createdOnTo;
	
	@FindBy(xpath = "//select[@id='LogLevelId']")
	private WebElement logLevelId;
	
	@FindBy(xpath = "//button[@id='search-log']")
	private WebElement searchButton;	

	@FindBy(xpath = "//a[@class='btn btn-default']")
	private WebElement view;
	
	@FindBy(xpath = "//span[@id='log-delete']")
	private WebElement deleteButton;

	 public  DeleteActivityLogPage(WebDriver driver)  {
	    	
		    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    PageFactory.initElements(driver, this); 
	}

	public void clickOnSystemIcon() {
	      wait.until (ExpectedConditions.elementToBeClickable(systemOption)).click();
	}

	public void clickOnLog() {
	      wait.until (ExpectedConditions.elementToBeClickable(logIcon)).click();
	}

	public void fillCreated(String string) {
	      wait.until (ExpectedConditions.elementToBeClickable(createdOnFrom)).click();
}

	public void clickOnLevel() {
   	    Select s1 = new Select(logLevelId);
	    s1.selectByVisibleText("Error");
	      wait.until (ExpectedConditions.elementToBeClickable( logLevelId)).click();
	}
	
	public void clickOnSearch() {
	      wait.until (ExpectedConditions.elementToBeClickable( searchButton)).click();	
	}

	public void clickOnView() {
	      wait.until (ExpectedConditions.elementToBeClickable(view)).click();
	}
	
	public void clickOnDelete() {
	      wait.until (ExpectedConditions.elementToBeClickable(deleteButton)).click();	
	}

	public boolean isdetailsDeleted() {
		return true;
	}

}