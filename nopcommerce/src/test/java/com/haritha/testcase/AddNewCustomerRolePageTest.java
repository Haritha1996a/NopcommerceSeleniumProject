package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewCustomerRolePage;
import com.haritha.utility.Utility;

public class AddNewCustomerRolePageTest extends Base{
  @Test
  public void verifyUserCanAddCustomersRole() throws InterruptedException {
	    
		 Utility utility = new Utility();
		 utility.adminLogin("admin@yourstore.com", "admin");

		  
		  AddNewCustomerRolePage addCustomersRole = PageFactory.initElements(driver, AddNewCustomerRolePage.class);
		  
		  addCustomersRole.clickOnCustomerOptions();
		  addCustomersRole.clickOnCustomerRoleIcon();
		  addCustomersRole.clickOnAddNewButton();
		  addCustomersRole.fillName("Employee");
		  addCustomersRole.isFreeshipping();
		  addCustomersRole.isDefaultTaxDisplay();
		  addCustomersRole.fillAdminComment("good");
		  addCustomersRole.clickOnSaveButton();  
		  Assert.assertTrue(addCustomersRole.isCustomersRoleAdded(), "Customers should be added successfully!!");
}
}
