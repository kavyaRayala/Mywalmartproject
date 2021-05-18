package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.CreateAccountPage;
import com.walmart.qa.pages.LoginPage;


public class CreatePageTest extends TestBase {
	LoginPage loginPage;
	CreateAccountPage createaccountpage;
	public CreatePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		createaccountpage = new CreateAccountPage ();
	}
	@Test
	public void createaccount() {
		loginPage =createaccountpage.login1 (prop.getProperty("FirstName"), prop.getProperty("LastName"),prop.getProperty("Emailaddress"),prop.getProperty("password"));
}

	@Test
	public void MyaccounttitlepageTest() {
		String title =  createaccountpage.validateMyaccountPage();
	   Assert.assertEquals(title, "Walmart Canada");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}