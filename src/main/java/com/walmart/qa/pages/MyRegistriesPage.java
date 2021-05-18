package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class MyRegistriesPage extends TestBase{
	public MyRegistriesPage () {
		PageFactory.initElements(driver,this);
	}
	public void Registries() {

		
		driver.get("https://www.myregistry.com/walmart-canada-migration.aspx");
		driver.getTitle();
	}
	public void myregistrieslink()  {
		driver.get("https://www.myregistry.com/walmart-canada-migration.aspx");
		
		driver.findElement(By.xpath("//a[@id='btnLogin']")).click();
		
		driver.get("https://www.myregistry.com/Members/");
	}
}


