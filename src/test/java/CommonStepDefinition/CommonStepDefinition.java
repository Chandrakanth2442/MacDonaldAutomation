


// Common Step Definition//

package CommonStepDefinition;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Icon;
import com.Location;
import com.Search;

import Resources.DriverSetup;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition 
{
	WebDriver driver;
	   // -------------Location Step Definition-------------//
	   Location pom;
	   @Given("^The User is on MacD application$")
	   public void Setup() throws InterruptedException, IOException
	   {
	 	 
		   driver=DriverSetup.getWebDriver();
	   }
	   @When("^the user enters the \"(.*)\"$")
	   public void the_user_gives_the_address_in_Location_bar(String loc) throws InterruptedException, IOException, ParseException
	   {
	 	  pom=new Location(driver);
		pom.give_change();
		Thread.sleep(2000);
		pom.give_search(loc);
		Thread.sleep(2000);
		pom.select_cities();
	 	Thread.sleep(2000);
	   }
	   @Then("^the map should redirect to the given changed location.$")
	   public void the_map_should_redirect_to_the_given_changed_location() throws  InterruptedException, IOException {
	       // Write code here that turns the phrase above into concrete actions
	       System.out.println("Done");
	       driver.close();
	   }
	   //---------------Play Store Icon Step Definition------------------//
	   Icon object;
		 @Given("^the playstore icon in the home page$")
		    public void redirected_homepage() throws InterruptedException{
		   	 System.out.println("Play Store Icon is present in Homepage");
		         Thread.sleep(2000);
		 }
	     @When("^the user clicks on the playstore icon$")
	     public void click_on_icon()throws InterruptedException, IOException{
	    	 driver=DriverSetup.getWebDriver();
	    	 object=new Icon(driver);
	    	 object.click_on_icon();
	         Thread.sleep(1000);
	    
	     }
	     @Then("^the user will redirect to new page to install the app.$")
	     public void redirect() throws InterruptedException {
	    	 System.out.println("The page is redirecting to new page");
	        driver.close();
	     }
	     //-----------------Search Step Definition---------------//
	     Search ser;

	     @Given("^The McDonald's User can search desired food item on search bar$")
	     public void user_homepage() throws InterruptedException, IOException{
	    	/* System.setProperty("webdriver.chrome.driver","C:\\Users\\16pa1\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	 wd = new ChromeDriver();
	         wd.manage().window().maximize();
	    	 wd.get("https://www.mcdelivery.co.in/home/");*/
	    	 System.out.println("McDonald's Home page");
	    	 driver=DriverSetup.getWebDriver();
	          Thread.sleep(1000);
	     }
	     
	   
	     @When("^The user enters the \"(.*)\"$")
	public void user_search(String fooditem) throws InterruptedException {
	    	 ser=new Search(driver);
	    	 ser.give_Search(fooditem);
	    	// wd.findElement(By.xpath("//input[@id='menu-search']")).sendKeys(fooditem,Keys.ENTER);
		System.out.println("searched food");
		 Thread.sleep(2000);
	}

	  @Then("^The page should generate food items related to that search$")
	public void searched_item() {
		System.out.println("display based on order of relevance");
		driver.close();
		
	}
	//------------------Cart Step Definition-------------//
	  @Given("^The McDelivery homepage$")
	  public void user_homepage1() throws InterruptedException, IOException {
	     
	  	System.out.println("McDonald's Home page");
	  	driver=DriverSetup.getWebDriver();
	      
	       Thread.sleep(1000);
	  }

	  @When("^user click on the Add button to keep the item in cart$")
	public void add_item() throws InterruptedException {
		  driver.findElement(By.xpath("/html/body/app-root/div/div/app-home-page/div/div[4]/app-menu-popup/div/div/div/div[2]/app-menu-items/div/app-menu-item[1]/div/div/div/app-price-section/div/div/button")).click();
	 
	  Thread.sleep(2000);
	}



	@Then("^user should be able to choose the customizations$")
	public void customizations() throws InterruptedException{
	 System.out.println("display based on order of relevance");
	 driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/p[1]")).click();
	 driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/label")).click();
	 Thread.sleep(2000);
	}
	@And("^click on Add to cart$")
	public void add_to_cart() throws InterruptedException{
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]")).click();
		 Thread.sleep(2000);
		 
	}

	/*@Given("^the order summary on the home page$")
	public void order_summary() throws InterruptedException{
		 wd.findElement(By.xpath("//*[@id=\"home-page-wrapper\"]/div[5]/app-cart-card/div/div[1]/div[1]/h2"));
		 Thread.sleep(2000);
	}*/

	@When("^user click on the view cart button$")
	public void view_cart() throws InterruptedException{
		driver.findElement(By.xpath("//button[contains(text(),'View Cart')]")).click();
		 System.out.println("Your cart is displaying.");
		 Thread.sleep(2000);
	}

	@Then("^user should view the order details.$")
	public void order_details() throws InterruptedException{
		driver.findElement(By.xpath("//div[contains(text(),'Your Order Details')]"));
		 Thread.sleep(4000);
		 driver.findElement(By.className("clear-all")).click();
		 Thread.sleep(4000);
		 System.out.println("Test Done successfully");
		 driver.close();
	}

}
