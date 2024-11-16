package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewCustomerPage;
import com.haritha.utility.Utility;


public class AddNewCustomerPageTest extends Base {
  @Test
public void verifyUserCanAddNewCustomers() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  
	  AddNewCustomerPage addNewCustomersPage = PageFactory.initElements(driver, AddNewCustomerPage.class);
	  
	  addNewCustomersPage.clickOnCustomerOptions();
	  addNewCustomersPage.clickOnCustomerIcon();
	  addNewCustomersPage.clickOnAddNewButton();
	  addNewCustomersPage.fillEmail("harithasree8620@gmail.com");
	  addNewCustomersPage.fillPassword("urcnop19#");
	  addNewCustomersPage.fillFirstName("Haritha");
	  addNewCustomersPage.fillLastName("Shree");
	  addNewCustomersPage.clickOnGender();
	  addNewCustomersPage.fillDateOfBirth("23-03-1996");
	  addNewCustomersPage.fillCompanyName("abc");
	  addNewCustomersPage.isTaxExempt();

	  //addNewCustomersPage.clickOnNewsLetter();
	  
	  //addNewCustomersPage.clickOnCustomerRoles();
	  
	  addNewCustomersPage.clickOnManagerOfVendor();
	  addNewCustomersPage.active();
	  addNewCustomersPage.fillAdminComment("Have a nice Day");
	  addNewCustomersPage.clickOnSaveButton();  
	  Assert.assertTrue(addNewCustomersPage.isCustomersAdded(), "Customers should be added successfully!!");
	    }
}
