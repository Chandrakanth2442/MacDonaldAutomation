


//Location Page//
package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Location {
	public  WebDriver driver;
	//app-header/div[1]/div[1]/div[1]/div[1]/div[3]/app-nudge[1]/div[1]/div[6]/button[1]
	 By click_change = By.xpath("//div[@class=\"actions d-flex\"]//button[@class=\"btn change-btn\" and text()=\"Change\"]");
	 By menu_search= By.xpath("//input[@id='menu-search']");
	 By cities_name=By.xpath("//div[@class='crossroads-store margn-bottom']");
	 By click_done=By.xpath("//button[contains(text(),'Done')]");
	 By click_continue=By.xpath("//button[contains(text(), 'Continue')]");
	 By click_close=By.xpath("//*[@id=\"headerComp\"]/div/div[1]/div[3]/app-nudge/div/div[6]/button[2]");
	 By get_text=By.xpath("//span[contains(text(),'We do not serve this location as of now.')]");
	 By get_text_close=By.xpath("//button[contains(text(),'Close')]");
	 By click_select_now=By.xpath("//div[@class=\"actions d-flex\"]//button[@class=\"btn primary-btn\" and text()=\"Select Now\"]");
	 public Location() {
		}

		public Location(WebDriver driver) {
			this.driver = driver;
		}

		public void give_change() {
				try
				   {
					driver.findElement(click_change).click();
					}
				catch(NoSuchElementException e)
			    {
				driver.findElement(click_select_now).click();
				}
		}
		
		public void give_search(String ms) 
		{
			 WebElement city=driver.findElement(menu_search);
		 	  city.clear();
		 	  city.sendKeys(ms);
		 	 System.out.println("give search"); 
		}
		public void select_cities() throws InterruptedException, ParseException
		{
				List<WebElement> ele=driver.findElements(cities_name);
			 	ele.get(1).click();
			 	Thread.sleep(2500);
				driver.findElement(click_done).click();
			    Thread.sleep(2000);
			    //driver.findElement(click_continue).click();
			    Thread.sleep(2000);
			   // driver.findElement(click_close).click();
		}
}


