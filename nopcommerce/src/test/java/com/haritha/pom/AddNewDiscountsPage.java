package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class AddNewDiscountsPage extends Base {

	  @FindBy (xpath = "//p[normalize-space()='Promotions']")
	  private WebElement promotionsOption;
	 
	  @FindBy (xpath = "//p[text()=' Discounts']")
	  private WebElement discountsIcon;
	 
	  @FindBy(xpath = "//a[@href='/Admin/Discount/Create']")
	  private WebElement addNewButton;
	
      @FindBy (xpath = "//input[@id='IsActive']")
	  private WebElement isActive;

	  @FindBy (xpath ="//input[@data-val-required='Please provide a name.']")
	  private WebElement discountName;

	  @FindBy (xpath ="//select[@name='DiscountTypeId']")
      private WebElement discountType;

      @FindBy (xpath= "//input[@id='UsePercentage']")
	  private WebElement usePercentage;

	  @FindBy (xpath = "//input[@name='DiscountAmount']")
	  private WebElement discountAmount;
	 
	  @FindBy (xpath = "//input[@id='RequiresCouponCode']")
	  private WebElement requiresCouponCode;

      @FindBy (xpath = "//input[@name='StartDateUtc']")  
	  private WebElement startDate;

      @FindBy (xpath ="//input[@id='EndDateUtc']")
	  private WebElement endDate;
 
      @FindBy (xpath ="//input[@data-val-required='The Cumulative with other discounts field is required.']")
	  private WebElement cumulativeWithOtherDiscounts;

	  @FindBy (xpath ="//select[@id='DiscountLimitationId']")
      private WebElement discountLimitation;

	  @FindBy (xpath = "//textarea[@class=form-control']")
	  private WebElement adminComment;

	  @FindBy (xpath= "//button[@name='save']")
	  private WebElement saveButton;
	 
	  public void addNewDiscountPage(WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }
     public void clickOnPromotionsOption()throws InterruptedException {
     Thread.sleep(3000);
     promotionsOption.click(); 
	
     }
     public void clickOnDiscountsIcon() throws InterruptedException {
     Thread.sleep(3000);
     discountsIcon.click();
     }
     public void clickOnAddNewButton() throws InterruptedException {
     Thread.sleep(3000);
     addNewButton.click();
     }
	public void clickOnIsActiveBox() throws InterruptedException {
	Thread.sleep(3000);		 
	
	boolean check = isActive.isSelected();

	if (check==false) {
	 
	isActive.click();

	}else {

	System.out.println("It's already clicked!");

	}

	isActive.click();
	}

	public void fillDiscountName(String naml) throws InterruptedException {
		Thread.sleep(3000);		 
		discountName.sendKeys(naml);
		
	}
	public void selectDiscountType() throws InterruptedException {
	Thread.sleep(3000);
	Select s1 = new Select (discountType);
	s1.selectByVisibleText("Assigned to products");
	discountType.click();
	}
	public void clickOnUsePercentageBox() throws InterruptedException {
		Thread.sleep(3000);
		
		boolean check = usePercentage.isSelected();
		
		if (check==false) {

		usePercentage.click();

		}else {

		System.out.println("It's already clicked!");
		
		}
	
	    usePercentage.click();
		
	    }
 
		public void fillDiscountAmount (String amt) throws InterruptedException {
		Thread.sleep(3000);
		discountAmount.sendKeys(amt);
		}

		public void clickOnRequiresCouponCodeBox() throws InterruptedException {
		Thread.sleep(3000);
		
		boolean check = requiresCouponCode.isSelected();

		if (check==false) {

			requiresCouponCode.click();

		}else {

		System.out.println("It's already clicked!");

		}

		requiresCouponCode.click();

		}

   	public void clickOnSaveButton() throws InterruptedException {
				Thread.sleep(3000);
				saveButton.click();
				}
			
   	public boolean isDiscountssAdded() {
					return true;
				}

}