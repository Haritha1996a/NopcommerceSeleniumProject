package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewForumGroupPage;
import com.haritha.utility.Utility;

public class AddNewForumGroupPageTest extends Base {
  @Test
  public void VerifyAbleToAddNewForumPage() throws InterruptedException {
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  AddNewForumGroupPage addNewForumGroupPage = PageFactory.initElements(driver, AddNewForumGroupPage.class);
	  addNewForumGroupPage.clickOnContentManagementOptions();
	  addNewForumGroupPage.clickOnForumIcon();
	  addNewForumGroupPage.clickOnAddNewForumGroup();
	  addNewForumGroupPage.fillName("Electronics");
	  addNewForumGroupPage.clickOnDispayOrder("15");
	  addNewForumGroupPage.clickOnSaveButton();
	  Assert.assertTrue(addNewForumGroupPage.isForumGroupAdded(), "Customers should be added successfully!!");
  }
  }
