package com.qa.PetclinicAssessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	
		@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[1]/a")
	    private WebElement clicksearchall;
		
		@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
	    private WebElement clickownerbutton;
		
		public void clickOwners() {
			
			clickownerbutton.click();
			
			clicksearchall.click();
		}

	


}
