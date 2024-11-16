package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.EditNewAffiliatesPage;
import com.haritha.utility.Utility;

public class EditNewAffiliatesTest extends Base {
  @Test
  public void verifyUserCanAddNewAffiliates() throws InterruptedException {


	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  
	  EditNewAffiliatesPage addNewAffiliatesPage = PageFactory.initElements(driver, EditNewAffiliatesPage.class);

	  addNewAffiliatesPage.clickOnPromotion();
	  addNewAffiliatesPage.clickOnAffiliatesIcon();
		  addNewAffiliatesPage.clickOnAddNewButton();
	  addNewAffiliatesPage.clickOnActive();
	  addNewAffiliatesPage.fillFirstName("Priya");
	  addNewAffiliatesPage.fillLastName("kavin");
	  addNewAffiliatesPage.fillEmail("priyakavin@gmail.com");
	  addNewAffiliatesPage.fillCompany("abc");
	  addNewAffiliatesPage.clickOnCountry();
	  addNewAffiliatesPage.clickOnState();
	  addNewAffiliatesPage.fillRegion("tamil");
	  addNewAffiliatesPage.fillCity("chennai");
	  addNewAffiliatesPage.fillAddress("S2");
	  addNewAffiliatesPage.fillAddressNum("Sp Homes");
	  addNewAffiliatesPage.fillPostalCode("001113");
	  
	  addNewAffiliatesPage.fillComments("nice");
	  addNewAffiliatesPage.clickOnSave();
	  
	  Assert.assertTrue(addNewAffiliatesPage.isAffiliatesAdded(), "Customers should be added successfully!!");
  }
}
