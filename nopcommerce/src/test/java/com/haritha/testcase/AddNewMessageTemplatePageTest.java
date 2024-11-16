package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AddNewMessageTemplatesPage;
import com.haritha.utility.Utility;

public class AddNewMessageTemplatePageTest extends Base{
  @Test
  public void verifyUserCanAddNewMessageTemplates() throws InterruptedException {

		 Utility utility = new Utility();
		  utility.adminLogin("admin@yourstore.com", "admin");

		  AddNewMessageTemplatesPage addNewMessageTemplatesPage = PageFactory.initElements(driver, AddNewMessageTemplatesPage.class);
  
		addNewMessageTemplatesPage.clickOncontentManagementOption();
		addNewMessageTemplatesPage.clickOnMessageTemplateIcon();
		addNewMessageTemplatesPage.clickOnTitel();
		addNewMessageTemplatesPage.fillSubject("pens");
		addNewMessageTemplatesPage.clickOntemplate();
		addNewMessageTemplatesPage.fillEmail("haritha@gmail.com");
		addNewMessageTemplatesPage.fillStoreName("abcdefg");
		addNewMessageTemplatesPage.clickOnBack();
		addNewMessageTemplatesPage.clickOnSaveButton();

	  Assert.assertTrue(addNewMessageTemplatesPage.isMessageTemplateAdded(), "Customers should be added successfully!!");
	}

}

