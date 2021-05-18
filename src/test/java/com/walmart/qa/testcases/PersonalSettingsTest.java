package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
import com.walmart.qa.pages.PersonalSettingsPage;

public class PersonalSettingsTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	PersonalSettingsPage personalsettings;
	public PersonalSettingsTest () {
		super();
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage ();
		myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
		Thread.sleep(3000);
		driver.get("https://www.walmart.ca/my-account/order-history");
		personalsettings = new PersonalSettingsPage  ();
	}
	 @Test(priority=1)
	   public void languageChange() {
		 personalsettings.languageChange();  
	 }
		
	 @Test(priority=2)
	   public void PersonalSettingsTest()  {
		 personalsettings.validatePersonalsettingsPage();  
	 }
	
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
