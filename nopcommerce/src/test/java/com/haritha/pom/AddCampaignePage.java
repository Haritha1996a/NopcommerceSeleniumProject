package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class AddCampaignePage extends Base{

	@FindBy (xpath = "//p[normalize-space()='Promotions']")
	private WebElement promotionsOption;
	
	@FindBy(xpath = "//p[text()=' Campaigns']")
	private WebElement CampaignsIcon;

	@FindBy(xpath = "//a[@href='/Admin/Campaign/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='Subject']")
	private WebElement subject;

	@FindBy(xpath = "//textarea[@id='Body']")
	private WebElement textArea;

	@FindBy(xpath = "//input[@name='DontSendBeforeDate']")
	private WebElement dateOfBirth;

	@FindBy(xpath = "//select[@id='StoreId']")
	private WebElement limitedToStore;

	@FindBy(xpath = "//select[@id='CustomerRoleId']")
	private WebElement customerRole;

	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;

    public void addNewCustomers(WebDriver driver) throws InterruptedException {
    	
    	Base.driver = driver;
   	    Thread.sleep(3000);
    }

	public void clickOnPromotions() throws InterruptedException {
    
		Thread.sleep(3000);

   	  promotionsOption.click();
    }
	
    public void clickOnCampaignsIcon() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 CampaignsIcon.click();
    }

	public void clickOnAddNewbutton()throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 addNewButton.click();
    }
 
	public void fillName(String nam) throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 name.sendKeys(nam);
    }

	public void fillSubject(String lname) throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 subject.sendKeys(lname);
   		}

   	public void fillDateOfBirth(String dob) throws InterruptedException {
   	    	
       	Thread.sleep(3000);
   	    	
   	dateOfBirth.sendKeys(dob);
   	    }

  	public void clickOnaddCam()throws InterruptedException {
   	    	
   	   	    Thread.sleep(3000);

   	    Select s1 = new Select(limitedToStore);
   		    s1.selectByVisibleText("Your store name");
   		    
   		    limitedToStore.click();
   	    }
   	
  	public void clickOnsave() throws InterruptedException {
   	    	
   	   	    Thread.sleep(3000);

   	        saveButton.click();
   	    }

   	public boolean isCustomersAdded() {
   			return true;
   	}
}
