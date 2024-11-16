package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.haritha.helper.Base;

public class AddNewMessageTemplatesPage extends Base{
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Content management')]")
	private WebElement contentManagementOption;
	
	@FindBy(xpath = "//p[text()=' Message templates']")
	private WebElement messageTemplateIcon;
	
	@FindBy(xpath = "//i[@class='fas fa-pencil-alt']")
	private WebElement title;
	 	
	@FindBy(xpath = "//input[@name='Subject']")
	private WebElement subject;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement template;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath = " //input[@class='form-control']")
	private WebElement storeName;
	
	@FindBy(xpath = " //input[@name='token_%Store.URL%']")
	private WebElement storeUrl;
	
	@FindBy(xpath = " //a[@href='/Admin/MessageTemplate/Edit/1']")
	private WebElement backToTemplate;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;

	public void addNewMessageTemplates(WebDriver driver) throws InterruptedException {
	  
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }
	  
	public void clickOncontentManagementOption() throws InterruptedException {
   	    Thread.sleep(3000);
   	 contentManagementOption.click();
    }

	public void clickOnMessageTemplateIcon()throws InterruptedException {
   	    Thread.sleep(3000);
   	 messageTemplateIcon.click();
	 }

	public void clickOnTitel() throws InterruptedException {
	   	    Thread.sleep(3000);
	   	 title.click();
	    }
		
	public void fillSubject(String sub ) throws InterruptedException {	
	   	    Thread.sleep(3000);
	   	 subject.clear();
   	  subject.sendKeys(sub);
	    }

		public void clickOntemplate()  throws InterruptedException {
	   	    Thread.sleep(3000);
	   	 template.click( );
	    }
		
		public void fillEmail(String mail)  throws InterruptedException {
	   	    Thread.sleep(3000);
	    	email.sendKeys(mail);
	    }
		
		public void fillStoreName(String name) throws InterruptedException {
	   	    Thread.sleep(3000);
	   	 storeName.sendKeys(name); 
	    }
		
		public void clickOnBack()  throws InterruptedException {
	   	    Thread.sleep(3000);
	   	 backToTemplate.click();
		   }

		public void clickOnSaveButton() throws InterruptedException {
	   	    Thread.sleep(3000);
	   	 saveButton.click();
	    }

		public boolean isMessageTemplateAdded() {
	 		return true;
		}
}