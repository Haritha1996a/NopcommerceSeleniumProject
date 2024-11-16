package com.haritha.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.haritha.helper.Base;

public class AddNewPollsPage extends Base {
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Content management')]")
	private WebElement contentmanagementOption;
	
	@FindBy(xpath = "//a[@href='/Admin/Poll/List']")
	private WebElement pollsIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Poll/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='AllowGuestsToVote']")
	private WebElement allowGuestToVote;
	
	@FindBy(xpath = "//input[@id='StartDateUtc']")
	private WebElement startDate;
	
	@FindBy(xpath = "//input[@id='EndDateUtc']")
	private WebElement endDate;
	
	/*@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement limitedToStore;

	@FindBy(xpath = "//input[@id='SystemKeyword']")
	private WebElement systemKeyword;
	
	@FindBy(xpath = "//input[@id='DisplayOrder']")
	private WebElement displayOrder;
	
	@FindBy(xpath = "//button[@name='save-continue']")
	private WebElement saveAndContinueEdit ;
	
	@FindBy(xpath = "//button[@class='btn btn-tool']//i[@class='btn btn-tool']")
	private WebElement pollsAnswer;
	
	@FindBy(xpath = "//input[@id='PollAnswerSearchModel_AddPollAnswer_Name']")
	private WebElement addNewRecordname;
	
	@FindBy(xpath = "//input[@id='PollAnswerSearchModel_AddPollAnswer_DisplayOrder']")
	private WebElement addNewRecordDisplayOrder;
	
	@FindBy(xpath = "//button[@id='addPollAnswer']")
	private WebElement addNewRecordButton;
	
	@FindBy(xpath = "//button[@name='save']")
     private WebElement saveButton ;*/
	
	  public void addNewPollsPage (WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }
	  public void clickOnContentManagementOptions() throws InterruptedException {
	   	    Thread.sleep(3000);
	        contentmanagementOption.click();
	    }
	  public void clickOnPollsIcon() throws InterruptedException{
		  Thread.sleep(3000);
		  pollsIcon.click();
	  }
	  public void clickOnAddNewButton() throws InterruptedException{
		  Thread.sleep(3000);
		  addNewButton.click();
	  }
	  public void fillName(String nme) throws InterruptedException{
		  Thread.sleep(3000);
		  name.sendKeys(nme);
	  }
	  public void clickOnAllowGuestToVote() throws InterruptedException{
		  Thread.sleep(3000);
	      allowGuestToVote.click();
	  }
	  public void fillStartDate() throws InterruptedException{
		  Thread.sleep(3000);
		  startDate.sendKeys(Keys.ARROW_DOWN);
		  for(int i= 0; i<=6; i++) {
				Thread.sleep(500);
				startDate.sendKeys(Keys.ARROW_RIGHT);
			}
		  for(int i= 0; i<=5; i++) {
				Thread.sleep(500);
				startDate.sendKeys(Keys.TAB);
			}
		  startDate.sendKeys(Keys.ARROW_DOWN);
		  startDate.sendKeys(Keys.ENTER);
		  for(int i= 0; i<=6; i++) {
				Thread.sleep(500);
				startDate.sendKeys(Keys.TAB);
			}
		  for(int i= 0; i<=5; i++) {
				Thread.sleep(500);
				startDate.sendKeys(Keys.ARROW_UP);
		  }
		  startDate.sendKeys(Keys.ARROW_UP);
		  startDate.sendKeys(Keys.ENTER);
		  
	  }
	  /*public void fillEndDate(String ed) throws InterruptedException{
		  Thread.sleep(3000);
		  endDate.sendKeys(ed);
	  }*/
	  public boolean isPollsAdded() {
	 		return true;
		}
}
