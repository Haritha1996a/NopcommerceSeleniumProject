package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewForumPage;
import com.haritha.pom.AddNewPollsPage;
import com.haritha.utility.Utility;

public class AddNewPollsPageTest extends Base {
  @Test
  public void VerifyAbleToAddNewPollsPage() throws InterruptedException {
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  AddNewPollsPage addNewPollsPage = PageFactory.initElements(driver, AddNewPollsPage.class);
	  addNewPollsPage.clickOnContentManagementOptions();
	  addNewPollsPage.clickOnPollsIcon();
	  addNewPollsPage.clickOnAddNewButton();
	  addNewPollsPage.fillName("Do you like nopCommerce Website?");
	  addNewPollsPage.clickOnAllowGuestToVote();
	 // addNewPollsPage.fillStartDate();
//	  addNewPollsPage.fillEndDate("22-07-20240000:00");
	  Assert.assertTrue(addNewPollsPage.isPollsAdded(), "Customers should be added successfully!!");
}
}
