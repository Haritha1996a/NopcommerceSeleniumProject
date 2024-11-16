package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddCampaignePage;
import com.haritha.utility.Utility;

public class AddCampaignsPageTest extends Base{
  @Test
  public void verifyUserCanAddCampaignsTest() throws InterruptedException {


		 Utility utility = new Utility();
		 utility.adminLogin("admin@yourstore.com", "admin");
		 

		  AddCampaignePage addCampaigns = PageFactory.initElements(driver, AddCampaignePage.class);

		  addCampaigns.clickOnPromotions();
		  addCampaigns.clickOnCampaignsIcon();
		  addCampaigns.clickOnAddNewbutton();
		  addCampaigns.fillName("Pen");
		  addCampaigns.fillSubject("Box");
		  addCampaigns.fillDateOfBirth("17.10.2002");	
		  addCampaigns.clickOnaddCam();
		  addCampaigns.clickOnsave();
		  
		  Assert.assertTrue(addCampaigns.isCustomersAdded(), "Customers should be added successfully!!");
	
	}
}
