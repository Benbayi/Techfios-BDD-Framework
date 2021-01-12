package steps;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	@Given("^a valid user$")
	public void a_valid_user()  {
	    
	}

	@When("^user goes to Techfios site$")
	public void user_goes_to_Techfios_site() throws Throwable {
	    
	}

	@Then("^login page should be displayed$")
	public void login_page_should_be_displayed() {
	    String expectedTitle = "Login - TechFios Test Application - Billing";
	    Assert.assertEquals("Wrong page displayed!", expectedTitle, loginPage.getPageTitle());
	    
	}

	@When("^user logs with valid credentials$")
	public void user_logs_with_valid_credentials() {
		loginPage.login("techfiosdemo@gmail.com", "abc123");
	    
	}

	@Then("^dashboard page should display$")
	public void dashboard_page_should_display() {
		Assert.assertFalse("Invalid customer was able to login!", dashboardPage.isDashboardDisplayed());
	    throw new PendingException();
	}	
	
	@After
	public void afterRun() {
		driver.close();
			
	}
}
