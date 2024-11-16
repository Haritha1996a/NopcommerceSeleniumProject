package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewDiscountsPage;
import com.haritha.utility.Utility;

public class AddNewDiscountPageTest extends Base {
  @Test
  public void verifyUserCanAbleToAddNewDiscountsTest() throws InterruptedException {

	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  
	  AddNewDiscountsPage addNewCustomersPage = PageFactory.initElements(driver, AddNewDiscountsPage.class);

	  addNewCustomersPage.clickOnPromotionsOption();
	  addNewCustomersPage.clickOnDiscountsIcon();
	  addNewCustomersPage.clickOnAddNewButton();	 
	  addNewCustomersPage.clickOnIsActiveBox();
	  addNewCustomersPage.fillDiscountName ("Laptop");
	  addNewCustomersPage.selectDiscountType();
      addNewCustomersPage.clickOnUsePercentageBox();
      addNewCustomersPage.fillDiscountAmount ("600");
      addNewCustomersPage.clickOnRequiresCouponCodeBox();
      addNewCustomersPage.clickOnSaveButton();

	  Assert.assertTrue(addNewCustomersPage.isDiscountssAdded(), "Customers should be added successfully!!");

  }
  }