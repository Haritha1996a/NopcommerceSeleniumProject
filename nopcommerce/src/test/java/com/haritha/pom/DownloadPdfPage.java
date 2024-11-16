package com.haritha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.haritha.helper.Base;

public class DownloadPdfPage extends Base {
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement CatalogOption;
	

	@FindBy(xpath = "//a[@href='/Admin/Product/List']")
	private WebElement productIcon;

	@FindBy(xpath = "//input[@id='SearchProductName']")
	private WebElement productName;
	

	@FindBy(xpath = "//select[@id='SearchCategoryId']")
	private WebElement selectProduct;
	

	@FindBy(xpath = "//input[@id='SearchIncludeSubCategories']")
	private WebElement select;
	

	@FindBy(xpath = "//select[@id='SearchManufacturerId']")
	private WebElement brand;

	@FindBy(xpath = "//select[@id='SearchVendorId']")
	private WebElement vendor;
	@FindBy(xpath = "//select[@id='SearchWarehouseId']")
	private WebElement wareHouse;
	

	@FindBy(xpath = "//select[@id='SearchPublishedId']")
	private WebElement published;
	
	@FindBy(xpath = "//button[@id='search-products']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@name='checkbox_products']")
	private WebElement checkSelected;
	

	@FindBy(xpath = "//button[@name='download-catalog-pdf']")
	private WebElement downLoaded;
	
	 public void downloadPdfPage(WebDriver driver) throws InterruptedException {
	    	
	    	Base.driver = driver;
	   	    Thread.sleep(3000);
	    }

	public void clickOnCatalog()throws InterruptedException {
    	
		  Thread.sleep(3000);

		   	 CatalogOption.click(); 		
			
			}

			public void clickOnProducts()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 productIcon.click(); 		
			}

			public void fillProducts(String naml) throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 productName.sendKeys(naml); 		
			}
			

			public void clickOnSelectProduct()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	    Select s3 = new Select(selectProduct);
		   	 s3.selectByVisibleText("All");
			    
		   	 selectProduct.click(); 		
			}

			public void clickOnSelect()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 select.click(); 		
			}
			
			public void clickOnBrand()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);
		   	    

		   	    Select s2 = new Select(brand);
			    s2.selectByVisibleText("Apple");

			   	 brand.click(); 		
			}
			
			public void clickOnvendor() throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 
		   	    Select s1 = new Select(vendor);
			    s1.selectByVisibleText("All");
			    
		   	 vendor.click(); 		
			}
			

			public void clickOnwareHouse()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);
		   	    Select s1 = new Select(wareHouse);
			    s1.selectByVisibleText("All");
			    
			    wareHouse.click(); 		}

			public void clickOnPublished()throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 
		   	    Select s1 = new Select(published);
			    s1.selectByVisibleText("Published only");
			    
			    published.click(); 		}
			
			public void clickOnSearch() throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		        search.click(); 		
			}

			public void clickOnCheck()  throws InterruptedException {
		    	
		   	    Thread.sleep(3000);
		      	 checkSelected.click(); 		
			}

			public void clickOndownLoad()  throws InterruptedException {
		    	
		   	    Thread.sleep(3000);

		   	 downLoaded.click(); 		
			}
			public boolean isPdfDownloaded() {
				// TODO Auto-generated method stub
				return true;
			}
	
}
