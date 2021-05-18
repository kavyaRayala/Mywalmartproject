package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id="username")
	WebElement Emailaddressorphonenumber;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div[7]/button")
	WebElement Signinbtn;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div[8]/a")
	WebElement createanaccountbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
		public MyAccountPage login(String un,String pwd) {
			Emailaddressorphonenumber.sendKeys(un);
			Password.sendKeys(pwd);
			Signinbtn.click();
			
			return new MyAccountPage();
		}
		
		}
	
	 
	
	


