package com.haritha.utility;

import java.time.Duration;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.haritha.helper.Base;
import com.haritha.pom.AdminLoginPage;


public class Utility extends Base{

			
			public void adminLogin(String username, String pwd) throws InterruptedException {
				AdminLoginPage alp = PageFactory.initElements(driver, AdminLoginPage.class);
				alp.getEmailBtn().clear();
				alp.getEmailBtn().sendKeys(username);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				alp.getPasswordBtn().clear();
				alp.getPasswordBtn().sendKeys(pwd);
				alp.getLoginBtn().click();
			}
			@DataProvider(name = "userData")
			public Object[][] userData(){
				  
				
			   return new Object[][] {	  
					
				 new Object[] { "admin@yourstore.com" ,"admin"},
				 
				 }; 
			
			
			}
			
}
