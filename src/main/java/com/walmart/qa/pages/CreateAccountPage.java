package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class CreateAccountPage extends TestBase {
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="email")
	WebElement Emailaddress;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/form/div/div[9]/div/div/label")
	WebElement checkbox;

	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/form/div/div[10]/button")
	WebElement createaccountbtn;
	
	
	public CreateAccountPage() {
		PageFactory.initElements(driver,this);
	}
		public LoginPage login1 (String fname,String lname,String email,String pword) {
			FirstName.sendKeys(fname);
			LastName.sendKeys(lname);
			Emailaddress.sendKeys(email);
			password.sendKeys(pword);
			checkbox.click();
			 
            createaccountbtn.click();
			
			return new LoginPage();

}
		public String validateMyaccountPage() {
			return driver.getTitle();
		}
	
}
