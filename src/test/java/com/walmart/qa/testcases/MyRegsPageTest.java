package com.walmart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;

import com.walmart.qa.pages.MyRegistriesPage;

public class MyRegsPageTest extends TestBase{
		LoginPage loginPage;
		MyAccountPage myaccountpage;
		MyRegistriesPage myregistriespage;
		
		public MyRegsPageTest () {
			super();
}
		@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginPage = new LoginPage ();
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
			Thread.sleep(3000);
			driver.get("https://www.walmart.ca/en/registry/welcome");
			 myregistriespage = new MyRegistriesPage ();
		}
			 @Test
			   public void RegistriesPageTest()  {
				 myregistriespage.Registries() ;   
			 }
					@Test
					   public void weddingandbabyregistry()  {
						myregistriespage.myregistrieslink();
					}
						@AfterMethod
						public void tearDown() {
							driver.quit();
						}  
			
			
			
			
			
			


		 {

		 }}
		
