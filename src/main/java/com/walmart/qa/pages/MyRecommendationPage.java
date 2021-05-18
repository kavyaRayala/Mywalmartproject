package com.walmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class MyRecommendationPage extends TestBase {
	public MyRecommendationPage() {
		PageFactory.initElements(driver,this);
	}
	public void RecommendationPage() {

		
		driver.get("https://www.walmart.ca/en/ip/echelon-connect-sport-indoor-spin-bike-with-30-day-free-echelon-united-membership/6000201499355?rrid=richrelevance");
		driver.getTitle();
	}
	public void addtocart()  {
		
		driver.findElement(By.xpath("//*[@id='my-account-content']")).click();
		
		driver.get("https://www.walmart.ca/en/ip/toddler-mum-mum-organic-strawberry-rice-biscuit/6000001847723?rrid=richrelevance");
	}
}


