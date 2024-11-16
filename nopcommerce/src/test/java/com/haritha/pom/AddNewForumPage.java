package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class AddNewForumPage extends Base {

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Content management')]")
	private WebElement contentmanagementOption;
	
	@FindBy(xpath = "//a[@href='/Admin/Forum/List']")
	private WebElement forumsIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Forum/CreateForum']")
	private WebElement addNewForum;
	
	@FindBy(xpath = "//select[@id='ForumGroupId']")
	private WebElement forumGroup;
	
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement name;
	
	@FindBy(xpath = "//textarea[@id='Description']")
	private WebElement description;
	
	@FindBy(xpath = "//input[@id='DisplayOrder']")
	private WebElement displayOrder;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton ;
	
	  public void addNewForumPage (WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }
	  
	  public void clickOnContentManagementOptions() throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	        contentmanagementOption.click();
	    }
	  public void clickOnForumIcon() throws InterruptedException {
		  Thread.sleep(3000);
		  forumsIcon.click();
	  }
	  public void clickOnAddNewForum() throws InterruptedException {
		  Thread.sleep(3000);
		  addNewForum.click();
	  }
	  public void clickOnForumGroup() throws InterruptedException {
		  Thread.sleep(3000);
		  Select s1 = new Select(forumGroup);
		    s1.selectByVisibleText("General");
		    
		    forumGroup.click();
	  }
	  public void fillName(String nme) throws InterruptedException {
		  Thread.sleep(3000);
		  name.sendKeys(nme);
	  }
	  public void fillDescription(String desc) throws InterruptedException  {
		  Thread.sleep(3000);
		  description.sendKeys(desc);
	  }
	  public void clickOnDispayOrder(String  count) throws InterruptedException {
		  Thread.sleep(3000);
		  displayOrder.clear();
		  displayOrder.sendKeys(count);
	  }
	  public void clickOnSaveButton() throws InterruptedException {
	    	
	   	    Thread.sleep(3000);

	        saveButton.click();
	    }
	    
	    public boolean isForumAdded() {
	        
	        return true;
	    }
}

