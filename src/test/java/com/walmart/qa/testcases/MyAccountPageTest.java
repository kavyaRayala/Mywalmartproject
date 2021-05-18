package com.walmart.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.LoginPage;
import com.walmart.qa.pages.MyAccountPage;
public class MyAccountPageTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	public MyAccountPageTest() {
		super();
	}
	@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginPage = new LoginPage ();
			myaccountpage=loginPage.login(prop.getProperty("Emailaddress1"), prop.getProperty("Password1"));
			Thread.sleep(3000);
		}
       @Test
   public void cartaccessTest() throws InterruptedException  {
			   myaccountpage.cartaccess();
}
		@Test
		   public void orderHistoryTest() throws InterruptedException  {
			   myaccountpage.orderhistoryaccess();
}
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
