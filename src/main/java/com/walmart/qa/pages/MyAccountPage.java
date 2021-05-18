package com.walmart.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.walmart.qa.base.TestBase;
public class MyAccountPage extends TestBase{
	public MyAccountPage() {
		PageFactory.initElements(driver,this);
	}
	public void cartaccess() {

		driver.findElement(By.xpath("//*[local-name()='svg'][\"css-1wjacxm ekai0sg1\"]")).click();
	     driver.get("https://www.walmart.ca/cart");
		}
	public void orderhistoryaccess()  {
		
		driver.findElement(By.xpath("//*[@id='accounts-home-page']")).click();
		driver.get("https://www.walmart.ca/my-account/order-history");
		 
		
	}
}