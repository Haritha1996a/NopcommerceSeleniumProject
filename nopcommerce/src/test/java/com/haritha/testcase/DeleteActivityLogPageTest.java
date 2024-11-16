package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.DeleteActivityLogPage;
import com.haritha.utility.Utility;

public class DeleteActivityLogPageTest extends Base {
  @Test
  public void verifyUserCanDeleteActivityLog() throws InterruptedException {
		 
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  
	  DeleteActivityLogPage deleteActivityLogPage = PageFactory.initElements(driver, DeleteActivityLogPage.class);
	  deleteActivityLogPage.clickOnSystemIcon();
	  deleteActivityLogPage.clickOnLog();
	  deleteActivityLogPage.fillCreated("15.07.2024");
	  deleteActivityLogPage.clickOnLevel();
	  deleteActivityLogPage.clickOnSearch();
	  deleteActivityLogPage.clickOnView();
	  deleteActivityLogPage.clickOnDelete();
	  
	  Assert.assertTrue(deleteActivityLogPage.isdetailsDeleted(), "Customers should be added successfully!!");

}
}