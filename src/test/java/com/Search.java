

//Search Page//
package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search {
	
	public  WebDriver wd;

	 By put_Search = By.xpath("//input[@id='menu-search']");
	
	 
	 public Search() {
		}

		public Search(WebDriver wd) {
			this.wd = wd;
		}

		public void give_Search(String fooditem) {
			wd.findElement(put_Search).sendKeys(fooditem, Keys.ENTER);
		}
		
		
}
