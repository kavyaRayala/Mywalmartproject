package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;

import com.walmart.qa.pages.OrderHistoryPage;

public class OrderTest extends TestBase{
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	OrderHistoryPage orderspage; 
	public OrderTest () {
		super();
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
		Thread.sleep(3000);
		driver.get("https://www.walmart.ca/my-account/order-history");
		orderspage = new OrderHistoryPage ();
	}
	 @Test(priority=1)
	   public void SelectYearTest()  {
		 orderspage.selectyear();  ;   
	 }
			@Test(priority=2)
			   public void RedirectlinkTest()   {
				String title =  orderspage.validateorderhistorypage();
				   Assert.assertEquals(title, "Shop Walmart.ca: Online Shopping & Everyday Low Prices");
				
			}
				@AfterMethod
				public void tearDown() {
					driver.quit();
				}  
	
}
