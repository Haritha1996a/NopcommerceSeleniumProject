package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewForumPage;
import com.haritha.utility.Utility;

public class AddNewForumPageTest extends Base {
  @Test
  public void  VerifyAbleToAddNewForumPage() throws InterruptedException {
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  AddNewForumPage addNewForumPage = PageFactory.initElements(driver, AddNewForumPage.class);
	  addNewForumPage.clickOnContentManagementOptions();
	  addNewForumPage.clickOnForumIcon();
	  addNewForumPage.clickOnAddNewForum();
	  addNewForumPage.clickOnForumGroup();
	  addNewForumPage.fillName("Laptop Forum");
	  addNewForumPage.fillDescription("Discuss the new Laptop released in Market");
	  addNewForumPage.clickOnDispayOrder("5");
	  addNewForumPage.clickOnSaveButton();
	  Assert.assertTrue(addNewForumPage.isForumAdded(), "Customers should be added successfully!!");
  }
}
