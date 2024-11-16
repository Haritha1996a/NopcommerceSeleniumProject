package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class EditNewAffiliatesPage extends Base  {
	@FindBy (xpath = "//p[normalize-space()='Promotions']")
	 private WebElement promotionsOption;
	 

	@FindBy (xpath = "//p[text()=' Affiliates']")
	 private WebElement affiliatesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Affiliate/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@data-val-required='The Active field is required.']")
	private WebElement isActive;
	
	@FindBy(xpath = "//input[@name='Address.FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='Address.LastName']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='Address_Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Address_Company']")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement country;
	
	@FindBy(xpath = "//select[@id='Address_StateProvinceId']")
	private WebElement state;

	@FindBy(xpath = "//input[@id='Address_County']")
	private WebElement countryName;

	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement city;

	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='Address_Address2']")
	private WebElement addressnumber;
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement postalCode;

	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	private WebElement adminComment;

	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;
	
	  public void addNewAffiliates(WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }

	public void clickOnPromotion() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 promotionsOption.click();
	}

	public void clickOnAffiliatesIcon() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	 affiliatesIcon.click();
    
	}

	public void clickOnAddNewButton()throws InterruptedException {
    	
   	    Thread.sleep(3000);

    	addNewButton.click();;
    }
	
	public void clickOnActive()throws InterruptedException {
    	
   	    Thread.sleep(3000);

    	isActive.click();;
    }
	public void fillFirstName(String name) throws InterruptedException {
		
   	    Thread.sleep(3000);

	    firstName.sendKeys(name);;
    }

	public void fillLastName(String lname)throws InterruptedException {
	
   	    Thread.sleep(3000);

	    lastName.sendKeys(lname);;

     }

	public void fillEmail(String mail) throws InterruptedException {
	
   	    Thread.sleep(3000);

	    email.sendKeys(mail);;

     }
	
public void fillCompany(String comp)throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	company.sendKeys(comp);
    }

	public void clickOnCountry() throws InterruptedException {
	
		 Thread.sleep(3000);

	   	    Select s1 = new Select(country);
		    s1.selectByVisibleText("India");
		    
		    country.click();
	    
     }
	
	public void clickOnState()throws InterruptedException {
		
		 Thread.sleep(3000);

	   	    Select s1 = new Select(state);
		    s1.selectByVisibleText("Other");
		    
		    state.click();
	    
  }
public void fillRegion(String tam) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	countryName.sendKeys(tam);
    }

	public void fillCity(String cty)throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	city.sendKeys(cty);
    	
    }

public void fillAddress(String add) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	address.sendKeys(add);
    	
    }
	
	public void fillAddressNum(String addnum)  throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	addressnumber.sendKeys(addnum);
    	
    }
	public void fillPostalCode(String post)throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	postalCode.sendKeys(post);
    	
    }
	public void fillComments(String cmt) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	adminComment.sendKeys(cmt);
    }
	public void clickOnSave() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	saveButton.click( );
    }

	public boolean isAffiliatesAdded() {
		// TODO Auto-generated method stub
		return true;
	}

	


}
