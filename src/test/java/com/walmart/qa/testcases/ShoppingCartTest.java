package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;

import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.ShoppingCartPage;

public class ShoppingCartTest  extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	ShoppingCartPage shoppingcartpage;
	
	public ShoppingCartTest () {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
		Thread.sleep(3000);
		shoppingcartpage = new ShoppingCartPage ();
	}
	 
	 	@Test(priority=1)
			   public void addtocartfromcartpageTest()   {
				shoppingcartpage.addtocartfromcartpage();  
				}
			@Test(priority=2)
			   public void removefromcartTest()  {
				 shoppingcartpage.removefromcart();  
			 }
			@Test(priority=3)
			   public void removeallfromcartTest()  {
				 shoppingcartpage.removeallfromcart(); 
			}
			 @AfterMethod
				public void tearDown() {
					driver.quit();
				}
	
}


