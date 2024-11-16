package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class AddNewCategoriesPage extends Base {

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Catalog')]")
	private WebElement catalogOption;
	
	@FindBy(xpath = "//a[@href='/Admin/Category/List']")
	private WebElement categoriesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Category/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//label[@for='advanced-settings-mode']")
	private WebElement advanced;

	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name;
	
	@FindBy(xpath = "//iframe[@id='Description_ifr']")
	private WebElement descriptionFrame;
	
	@FindBy(xpath = "//body[@data-id='Description']")
	private WebElement descriptionBody;
	
	@FindBy(xpath = "//select[@id='ParentCategoryId']")
	private WebElement parentCategory;
	
	@FindBy(xpath = "//input[@name='qqfile']")
	private WebElement picture;
	
   public void addNewCategoriesPage(WebDriver driver) throws InterruptedException {
	    	
	    	this.driver = driver;
	   	    Thread.sleep(3000);
	    }	
   public void clickOnCatalogOption() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 catalogOption.click();
    }
   public void clickOnCategoriesIcon() throws InterruptedException {
	
	    Thread.sleep(3000);

	    categoriesIcon.click();
     }
   public void clickOnAddNewButton() throws InterruptedException {
	
    Thread.sleep(3000);

    addNewButton.click();
    }
   public void clickOnAdvanced() throws InterruptedException {
	Thread.sleep(3000);
	boolean adv =  advanced.isDisplayed();
	if(adv==false) {
		advanced.click();
	}else {
		System.out.println("Advanced is already Clicked");
	}
    }
    public void clickOnName(String nme) throws InterruptedException {
	
    Thread.sleep(3000);

    name.sendKeys(nme);
    }

    public void switchToDescriptionFrame() throws InterruptedException {
	this.driver.switchTo().frame(descriptionFrame);
    }
    public void fillDescriptionBody(String body) throws InterruptedException {
	
    Thread.sleep(3000);

    descriptionBody.sendKeys(body);
    }
    public void switchToDefault() {
	this.driver.switchTo().defaultContent();
    }
    public void clickOnParentCategory() throws InterruptedException{
    this.driver=driver;
    Thread.sleep(3000);
    Select s1 = new Select(parentCategory);
    s1.selectByVisibleText("Computers >> Notebooks");
    parentCategory.click();
    }
    public void uploadFile(String file)throws  InterruptedException{
    Thread.sleep(3000);
    picture.sendKeys(file);
}
    public boolean isNewCategoriesAdded() {
		return true;
			}
}