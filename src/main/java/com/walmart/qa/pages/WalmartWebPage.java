package com.walmart.qa.pages;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.walmart.qa.base.TestBase;

public class WalmartWebPage extends TestBase {
	@FindBy(xpath="//input[@class='e1xoeh2i1 css-ymj5ct eesbt950']")
  	WebElement searchbar;
	
	@FindBy(xpath="//button[@class='css-1pgwcoa e1xoeh2i2']")
  	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[1]/div/div[2]/label/span[2]")
  	WebElement filteritem;
	
	@FindBy(xpath="//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[1]/div/div[2]/div[2]/button")
	WebElement sortitem;
	
	public  WalmartWebPage(){
		PageFactory.initElements(driver,this);
	}
	 public void filtration() {
   	  searchbar.sendKeys("Angelus red paint");
       searchbutton.click();
    	filteritem.click();
    	 }
	 public void Pagination() {
		List<WebElement> allLinkElements= driver.findElements(By.xpath("//*[@id]"));
		List<String> allId =new ArrayList<String>();
		for(WebElement x: allLinkElements) {
			allId.add(x.getAttribute("id"));
			}
		Set<String> store = new HashSet<>();
		for (String ids:allId) {
			if(store.add(ids) == false){
				System.out.println("Duplicate id is:"+ids);
			
			}else
			{
				System.out.println("No duplicates found");
			}
			}
		}
	 public void sortation() {
                searchbar.sendKeys("Angelus red paint");
		       searchbutton.click();
		       sortitem.click();
		      driver.findElement(By.xpath("//*[@id=\"browse-search-page\"]/div/div/div/div/div[6]/div[1]/div/div[2]/div[2]/button/div[1]")).click();
			
			}
	 
	
}
