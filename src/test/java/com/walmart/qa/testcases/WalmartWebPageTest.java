package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.ShoppingCartPage;
import com.walmart.qa.pages.WalmartWebPage;

public class WalmartWebPageTest  extends TestBase{
	 
		LoginPage loginPage;
		MyAccountPage myaccountpage;
		WalmartWebPage walmartwebpage;
		public WalmartWebPageTest () {
			super();
		}
		@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginPage = new LoginPage ();
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
			Thread.sleep(3000);
			walmartwebpage = new WalmartWebPage ();
		}
		 
		 	@Test(priority=1)
				   public void filtrationTest()   {
		 		walmartwebpage.filtration();  
					}
		 	@Test(priority=2)
			   public void PaginationTest()   {
	 		walmartwebpage.Pagination();  
				}
		 	@Test(priority=3)
			   public void SortationTest()   {
	 		walmartwebpage.sortation();  
				}
		 	 @AfterMethod
				public void tearDown() {
					driver.quit();
				}
	
}
