package com.walmart.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class PersonalSettingsPage extends TestBase {
	public PersonalSettingsPage() {
		PageFactory.initElements(driver,this);
	}
	public void validatePersonalsettingsPage() {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/ul[1]/li[6]/div[1]/a[1]")).click();
        
}
public void languageChange()  {
	    driver.get("https://www.walmart.ca/my-account/personal-settings");
		driver.findElement(By.xpath("//*[@id='skip-to-main']")).click();
		WebElement English = driver.findElement(By.xpath("//*[@id=\"English\"]"));
		if(English.isDisplayed())
		{
			System.out.println("English button is displayed");
			}
		else 
		{
			System.out.println("English button is not displayed");
		}
		if(English.isEnabled())
		{
			System.out.println("English button is enabled");
			}
		else 
		{
			System.out.println("English button is not enabled");
		}
		if(English.isSelected())
		{
			System.out.println("English button is selected");
			}
		else 
		{
			System.out.println("English button is not selected");
		}
					
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
	}

}