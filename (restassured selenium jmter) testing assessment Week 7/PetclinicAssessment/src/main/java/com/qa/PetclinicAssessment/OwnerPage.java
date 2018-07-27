package com.qa.PetclinicAssessment;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnerPage {
	
	@FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[1]/td[1]/a")
    private WebElement clickuserbutton;
	
	public void clickUser() {
		
		 clickuserbutton.click();
	}

}
