package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class ShoppingCartPage extends TestBase {
	
		public ShoppingCartPage () {
			PageFactory.initElements(driver,this);
		}

public void addtocartfromcartpage()  {
	driver.get("https://www.walmart.ca/cart");
	driver.findElement(By.xpath("//*[@id=\"206734\"]/div[2]/div[1]/div/div[2]/button[2]")).click();

}
public void removefromcart() {
	driver.get("https://www.walmart.ca/cart");
	driver.findElement(By.xpath("//*[@id=\"6000191270491\"]/div[2]/div[3]/button/span")).click();
}
public void removeallfromcart() {
	driver.get("https://www.walmart.ca/cart");
	driver.findElement(By.xpath("//*[@id=\"10296872\"]/div[2]/div[3]/button/span")).click();
	driver.findElement(By.xpath("//*[@id=\"10161715\"]/div[2]/div[3]/button/span")).click();
	
}







}