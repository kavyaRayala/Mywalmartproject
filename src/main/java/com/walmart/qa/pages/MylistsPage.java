package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class MylistsPage extends TestBase{

	@FindBy(xpath="//*[@id='accounts-home-page']")
	WebElement Lists;

      @FindBy(xpath="//body/div[@id='wrap']/div[@id='main-wrap']/div[@id='jalapeno-template']/div[3]/div[1]/form[1]/input[1]")
      WebElement searchbar;
      
      @FindBy(xpath="//button[contains(text(),'Search')]")
  	WebElement searchbutton;
      
      public MylistsPage() {
  		PageFactory.initElements(driver,this);
  	}
      
      public void listbutton() {
			Lists.click();
      }
      
      public void searchbarbutton() {
    	  driver.get("https://www.walmart.ca/en/shopping-list");
    	  searchbar.sendKeys("apple");
    	  searchbutton.click();
      }
}