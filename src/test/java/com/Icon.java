





//Icon Page//
package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Icon {
	
	public  WebDriver driver;

	 By put_uname = By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[1]/img[2]");
	
	
	 
		public Icon() {
			}

		public Icon(WebDriver driver) {
			this.driver = driver;
		}

		public void click_on_icon() {
			driver.findElement(put_uname).click();
		}
		
}

