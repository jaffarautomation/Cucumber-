package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddressStepDefinition {

	
	
	WebDriver driver ;
	
	
	@Given("^: user is on Login  page$")
	public void user_is_on_Login_page()  {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	}

	@When("^: Title of Login page is amazon$")
	public void title_of_Login_page_is_amazon()  {
		
		String title =driver.getTitle();
		Assert.assertTrue(title.contains("Online Shopping"), "Title validation fail");
	  
	}

	@Then("^: User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) {
		
		
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2'][@data-nav-ref='nav_ya_signin']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  
	}

	@Then("^: user click on login button$")
	public void user_click_on_login_button()  {
		
		  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	   
	}

	@Then("^: user lands on home page$")
	public void user_lands_on_home_page()  {
		
		String value=	driver.findElement(By.xpath("//a/span[@class='nav-line-1']")).getText();
		Assert.assertTrue(value.contains("Hello"),"incorrect user name");	
	    
	}

	@Then("^: user navigate to my account page$")
	public void user_navigate_to_my_account_page() {
		
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate']")).click();
	    
	}

	@Then("^: user navigate to my address page and click on add address$")
	public void user_navigate_to_my_address_page_and_click_on_add_address() throws Throwable {
	 
		
		driver.findElement(By.xpath("//a[@class='ya-card__whole-card-link']/div[@data-card-identifier='AddressesAnd1Click']")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id='ya-myab-address-add-link']")).click();
	}

	@Then("^: User select country and enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_select_country_and_enter_allvalues(String fullname, String mobile, String pincode, String street, String colony) {
		
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressFullName']")).sendKeys(fullname);
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys(mobile);
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys(mobile);
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPostalCode']")).sendKeys(pincode);
		
		

		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine1']")).sendKeys(street);
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine2']")).sendKeys(colony);
		
		
		
		
	
	}

	@Then("^: User enter \"([^\"]*)\" and \"([^\"]*)\" and select state$")
	public void user_enter_and_and_select_state(String landmark, String city) throws Throwable {
	   
        driver.findElement(By.xpath("//input[@name='address-ui-widgets-landmark']")).sendKeys(landmark);
		
		driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressCity']")).sendKeys(city);
		
		
		//Click on state dropdown
	List<WebElement> value =	driver.findElements(By.xpath("//span[@class='a-button-text a-declarative']/span[@class='a-dropdown-prompt']"));
		
		int value2 =value.size();
		
		for(int i=0;i<value2;i++)
		{
			
			String value3 =value.get(i).getText();
			
			if(value3.contains("Select state"))
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

	@Then("^: User select Address type and click on add address$")
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
		
	@Then("^: User validate the address is saved$")
	public void user_validate_the_address_is_saved()  {
		
		
		
		String value3=driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText();
	   Assert.assertTrue(value3.contains("Address saved"), "Address not save please try again ");
	    
	}

	@Then("^: user close the browser$")
	public void user_close_the_browser() throws Throwable {
	   
		
		driver.quit();
	}



}
