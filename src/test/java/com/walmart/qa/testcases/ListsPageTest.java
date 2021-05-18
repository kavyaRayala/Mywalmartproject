package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.MylistsPage;

public class ListsPageTest  extends TestBase{
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	MylistsPage mylistspage;
	
	public ListsPageTest() {
		super();
	}
	@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginPage = new LoginPage ();
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
			Thread.sleep(3000);
			mylistspage = new MylistsPage();
		}
	 @Test
	   public void listspage()  {
		 mylistspage.listbutton();   
	 }
			@Test
			   public void searchfunctionTest()  {
				mylistspage.searchbarbutton();
			}
				@AfterMethod
				public void tearDown() {
					driver.quit();
				}  
	}
	
	
	
	
	


