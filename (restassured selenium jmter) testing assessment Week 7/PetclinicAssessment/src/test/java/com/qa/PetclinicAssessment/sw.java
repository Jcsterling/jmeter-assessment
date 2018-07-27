package com.qa.PetclinicAssessment;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sw {
	
	 WebDriver driver;
	    ExtentReports reports;
	    ExtentTest test;
	    Actions action = null;
	    
	    

	    @Before
	    public void setup(){

	        System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Admin\\Desktop\\Development\\web_driver\\chromedriver.exe");

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reports\\petreport.html", true);
	        test = reports.startTest("Pet clinic Test");


	        action = new Actions(driver);
	    }
	
	@Given("^the home page$")
	public void the_home_page() {
		
		driver.get("http://10.0.10.10:4200/petclinic/welcome");
        test.log(LogStatus.INFO, "accessed web page");

	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click owners$")
	public void i_click_owners()  {
		
		HomePage Page = PageFactory.initElements(driver, HomePage.class);
        Page.clickOwners();
        test.log(LogStatus.INFO, "moved to owner page");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^I click on a specific owner$")
	public void i_click_on_a_specific_owner()  {
		
		OwnerPage Page = PageFactory.initElements(driver, OwnerPage.class);
		WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[1]/td[1]/a")));
        Page.clickUser();
        test.log(LogStatus.INFO, "owner selected");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I edit the owners details$")
	public void i_edit_the_owners_details() {
		OwnerInfoPage Page = PageFactory.initElements(driver, OwnerInfoPage.class);
		Page.clickedit();
		 test.log(LogStatus.INFO, "owner details updated");
		
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("^I can view the owner I have just updated$")
	public void i_can_view_the_owner_I_have_just_updated()  {
		OwnerInfoPage Page = PageFactory.initElements(driver, OwnerInfoPage.class);
		 assertEquals("George Franklin", driver.findElement(By.xpath("/html/body/app-root/app-owner-detail/div/div/table[1]/tbody/tr[1]/td/b")).getText());

	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@After
    public void teardown(){


        reports.endTest(test);
        reports.flush();

	}
	
	  
}
