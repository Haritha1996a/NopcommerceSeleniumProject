package com.haritha.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.haritha.helper.Base;
import com.haritha.pom.DownloadPdfPage;
import com.haritha.utility.Utility;

public class DownloadPdfPageTest extends Base {
  @Test
  public void verifyUserCanDownloadPdfPage() throws InterruptedException {
		
	  Utility utility = new Utility();
	  utility.adminLogin("admin@yourstore.com", "admin");
	  
	  DownloadPdfPage downloadPdfPage = PageFactory.initElements(driver, DownloadPdfPage.class);
	 
	  downloadPdfPage.clickOnCatalog();
	  downloadPdfPage.clickOnProducts();
	  downloadPdfPage.fillProducts("icam");
	  downloadPdfPage.clickOnSelectProduct();
	  downloadPdfPage.clickOnSelect();
	  downloadPdfPage.clickOnBrand();
	  downloadPdfPage.clickOnvendor();
	  downloadPdfPage.clickOnwareHouse();
	  downloadPdfPage.clickOnSearch();
	  downloadPdfPage.clickOnPublished();
	  downloadPdfPage.clickOnCheck();
      downloadPdfPage.clickOnSearch();
	  downloadPdfPage.clickOndownLoad();
	 
	  Assert.assertTrue(downloadPdfPage.isPdfDownloaded(), " Pdf is downloaded successfully!!");

	}
}

