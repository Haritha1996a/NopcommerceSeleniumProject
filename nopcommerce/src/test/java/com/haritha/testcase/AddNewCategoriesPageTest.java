package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewCategoriesPage;
import com.haritha.utility.Utility;

public class AddNewCategoriesPageTest extends Base {
  @Test
  public void VerifyAbleToAddNewCategoriesPage() throws InterruptedException{
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  AddNewCategoriesPage addNewCategoriesPage = PageFactory.initElements(driver, AddNewCategoriesPage.class);
	  addNewCategoriesPage.clickOnCatalogOption();
	  addNewCategoriesPage.clickOnCategoriesIcon();
	  addNewCategoriesPage.clickOnAddNewButton();
	  addNewCategoriesPage.clickOnAdvanced();
	  addNewCategoriesPage.clickOnName("Hp");
	  addNewCategoriesPage.switchToDescriptionFrame();
	  addNewCategoriesPage.fillDescriptionBody("New Laptop");
	  addNewCategoriesPage.switchToDefault();
	  addNewCategoriesPage.clickOnParentCategory();
	  addNewCategoriesPage.uploadFile("C:\\Users\\DELL\\Downloads\\images.jpg");
	  Assert.assertTrue(addNewCategoriesPage.isNewCategoriesAdded(), "Customers should be added successfully!!");
  }
}
