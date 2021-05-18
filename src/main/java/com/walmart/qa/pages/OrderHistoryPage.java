package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.walmart.qa.base.TestBase;

public class OrderHistoryPage extends TestBase{
	
		public  OrderHistoryPage() {
			PageFactory.initElements(driver,this);
		}
		public void selectyear() {

			
			driver.findElement(By.xpath("//select[@id='view-orders-from-label']")).click();
			By Viewordersfrom = By.id("view-orders-from-label");
			
			Select select1 = new Select(driver.findElement(Viewordersfrom));
			select1.selectByVisibleText("2017");
         
		}
		public String validateorderhistorypage() {
			return driver.getTitle();
		}
			
			
		}
	



