package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.MyRecommendationPage;
import com.walmart.qa.pages.MylistsPage;

public class MyrecomPageTest extends TestBase{
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	MylistsPage mylistspage;
	MyRecommendationPage myrecompage;
	
	public MyrecomPageTest() {
		super();
	}
	@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginPage = new LoginPage ();
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
			Thread.sleep(3000);
			driver.get("https://www.walmart.ca/my-account/recommendations");
			myrecompage = new MyRecommendationPage();
		}
	 @Test
	   public void RecommendationPageTest()  {
		 myrecompage.RecommendationPage(); ;   
	 }
			@Test
			   public void addtocartTest() throws InterruptedException  {
				myrecompage.addtocart();
			}
				@AfterMethod
				public void tearDown() {
					driver.quit();
				}  
	
	
	
	
	
	


 {

 }}
