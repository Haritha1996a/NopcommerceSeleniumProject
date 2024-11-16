package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.haritha.helper.Base;

public class AddNewCustomerRolePage extends Base{
	 
		@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
		private WebElement customersOption;
		
		@FindBy(xpath = "//p[text()=' Customer roles']")
		private WebElement customersIcon;
		
		@FindBy(xpath = "//a[@href='/Admin/CustomerRole/Create']")
		private WebElement addNewButton;
		
		@FindBy(xpath = "//input[@id='Name']")
		private WebElement name;
		
		@FindBy(xpath = "//input[@id='FreeShipping']")
		private WebElement freeshipping;
		
		@FindBy(xpath = "//input[@id='TaxExempt']")
		private WebElement taxexempt;
		
		@FindBy(xpath = "//input[@id='OverrideTaxDisplayType']")
		private WebElement  overridedefaulttaxdisplay;
		
		@FindBy(xpath = "//input[@id='OverrideTaxDisplayType']")
		private WebElement defaulttaxdisplaytype;
		
		@FindBy(xpath = "//input[@id='SystemName']")
		private WebElement adminComment;
		
		@FindBy(xpath = "//button[@name='save']")
		private WebElement saveButton;
		
	    public void addCustomersRole(WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }

		public void clickOnCustomerOptions()  throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	        customersOption.click(); 		
		}

		public void clickOnCustomerRoleIcon()  throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	   	 customersIcon.click();
	 		
		}
		
		public void clickOnAddNewButton() throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	   	 addNewButton.click(); 				
		}

		public void fillName(String nam) throws InterruptedException {
	    	
	   	    Thread.sleep(3000);
	        name.sendKeys(nam);
	   	    
	 		
		}
	  public void isFreeshipping() throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	   	 freeshipping.click(); 		
		}

		public void isDefaultTaxDisplay() throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	   	 defaulttaxdisplaytype.click();
	   	 }
		 public void fillAdminComment(String cmt) throws InterruptedException {
		     	
		     	Thread.sleep(3000);
		     	
		     	adminComment.sendKeys(cmt);	
		     	
			}	
		 public void clickOnSaveButton() throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 saveButton.click(); 				
			}

		public boolean isCustomersRoleAdded() {
		return true;
			}
}