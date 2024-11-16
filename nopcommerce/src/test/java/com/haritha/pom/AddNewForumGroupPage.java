package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.haritha.helper.Base;

public class AddNewForumGroupPage extends Base {

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Content management')]")
	private WebElement contentmanagementOption;
	
	@FindBy(xpath = "//a[@href='/Admin/Forum/List']")
	private WebElement forumsIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Forum/CreateForumGroup']")
	private WebElement addNewForumGroup;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;
	
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
  public void clickOnAddNewForumGroup() throws InterruptedException {
	  Thread.sleep(3000);
	  addNewForumGroup.click();
  }
  public void fillName(String nme) throws InterruptedException {
	  Thread.sleep(3000);
	  name.sendKeys(nme);
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
    
    public boolean isForumGroupAdded() {
        
        return true;
    }

}
