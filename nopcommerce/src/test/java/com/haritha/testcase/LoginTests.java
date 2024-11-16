package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.AdminDashBoardPage;
import com.haritha.utility.Utility;

public class LoginTests extends Base{
		public String sheetname = "sheetname";
		  @Test
		  /*public void verifyAdminIsLoginWithValidCredintials() throws IOException, InterruptedException {
			  Utility util = new Utility();
			  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
			  AdminDashBoardPage adp = PageFactory.initElements(driver, AdminDashBoardPage.class);
			  boolean actual = adp.getDashBoardTitle().isDisplayed();
			  Assert.assertTrue(actual);
		  }*/
		  public void verifyUserCanLoginWithValidCred() throws InterruptedException {
			  Utility utility = new Utility();
			  utility.adminLogin("admin@yourstore.com", "admin");
			  AdminDashBoardPage adminDashboardPage = PageFactory.initElements(driver, AdminDashBoardPage.class);
			  //Assert.assertTrue(adminDashboardPage.getDashBoardTitle().isDisplayed());
			  Assert.assertTrue(adminDashboardPage.getDashBoardTitle().isDisplayed());
		  }

  }