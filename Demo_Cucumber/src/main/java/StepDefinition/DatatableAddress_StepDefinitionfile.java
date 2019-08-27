package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatatableAddress_StepDefinitionfile {

	WebDriver driver;
	
	@Given("^: users is on Login  page$")
	public void user_is_on_Login_page() {
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	}

	@When("^: Titles of Login page is amazon$")
	public void title_of_Login_page_is_amazon()  {
	   

		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Online Shopping"), "Title validation fail");
	  
	}

	@Then("^: Users enter username and password$")
	public void user_enter_username_and_password(DataTable credentails) {
	   
		      List<List<String>> value = credentails.raw();
		
driver.findElement(By.xpath("//a[@class='nav-a nav-a-2'][@data-nav-ref='nav_ya_signin']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(value.get(0).get(0));
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(value.get(0).get(1));
	  
		
		
	}

	@Then("^: users click on login button$")
	public void user_click_on_login_button()  {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		   
	}

	@Then("^: users lands on home page$")
	public void user_lands_on_home_page()  {
	    
		
		String value=	driver.findElement(By.xpath("//a/span[@class='nav-line-1']")).getText();
		Assert.assertTrue(value.contains("Hello"),"incorrect user name");	
	    
	}

	@Then("^: users navigate to my account page$")
	public void user_navigate_to_my_account_page()  {
	 
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate']")).click();
	    
	}

	@Then("^: users navigate to my address page and click on add address$")
	public void user_navigate_to_my_address_page_and_click_on_add_address()  {
	   
	driver.findElement(By.xpath("//a[@class='ya-card__whole-card-link']/div[@data-card-identifier='AddressesAnd1Click']")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id='ya-myab-address-add-link']")).click();
	}

	@Then("^: Users select country and enter fullname and mobileno and pincode and StreetAdd and colony$")
	public void user_select_country_and_enter_fullname_and_mobileno_and_pincode_and_StreetAdd_and_colony(DataTable credentails1) throws Throwable {

		     List<List<String>> value2 = credentails1.raw();
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressFullName']")).sendKeys(value2.get(0).get(0));
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys(value2.get(0).get(1));
		
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPostalCode']")).sendKeys(value2.get(0).get(2));
		
		

		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine1']")).sendKeys(value2.get(0).get(3));
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine2']")).sendKeys(value2.get(0).get(4));
		
		
	}

	@Then("^: Users enter Landmark and city and select state$")
	public void user_enter_Landmark_and_city_and_select_state(DataTable credentails2) throws Throwable {
	    
		
		List<List<String>> value3 =credentails2.raw();
		
		  driver.findElement(By.xpath("//input[@name='address-ui-widgets-landmark']")).sendKeys(value3.get(0).get(0));
			
			driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressCity']")).sendKeys(value3.get(0).get(1));
			
			
			//Click on state dropdown
		List<WebElement> value =	driver.findElements(By.xpath("//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-prompt']"));
			
			int value2 =value.size();
			
			for(int i=0;i<value2;i++)
			{
				
				String value5 =value.get(i).getText();
				
				if(value5.contains("Select state"))
				{
					
					value.get(i).click();
					break;
				}
				
				
			}
			
		List<WebElement> state=	 driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']/li/a"));
			
		for(int m=0;m<state.size();m++)
		{
			String state1 =value.get(m).getText();
			
			if(state1.contains("ANDHRA PRADESH"))
			{
				
				value.get(m).click();
				break;
			}
			
		}
				

	}

	@Then("^: Users select Address type and click on add address$")
	public void user_select_Address_type_and_click_on_add_address() throws Throwable {
		
		JavascriptExecutor  Js = ((JavascriptExecutor)driver);
	       Js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressCity']")));
	       
		
		
		
		
	List<WebElement> value =	driver.findElements(By.xpath("//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-prompt']"));
		
		int value2 =value.size();
		
		for(int i=0;i<value2;i++)
		{
			
			String value3 =value.get(i).getText();
			
			if(value3.contains("Select an Address Type"))
			{
				
				value.get(i).click();
				break;
			}
	   
	}
		
		
		List<WebElement> state=	 driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']/li/a"));
		
		for(int m=0;m<state.size();m++)
		{
			String state1 =value.get(m).getText();
			
			if(state1.contains("Home (7am to 9pm delivery)"))
			{
				
				state.get(m).click();
				break;
			}
			
		}
				
		
		
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	
	    
	}

	@Then("^: Users validate the address is saved$")
	public void user_validate_the_address_is_saved()  {
		
		String value3=driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText();
		   Assert.assertTrue(value3.contains("Address saved"), "Address not save please try again ");
		    
	   
	}

	@Then("^: users close the browser$")
	public void user_close_the_browser()  {
	
		
		driver.quit();
	
	
	
	}


}
