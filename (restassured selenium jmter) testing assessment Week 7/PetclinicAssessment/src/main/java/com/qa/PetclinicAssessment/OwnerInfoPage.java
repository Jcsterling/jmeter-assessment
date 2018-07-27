package com.qa.PetclinicAssessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnerInfoPage {
	
	@FindBy(xpath = "/html/body/app-root/app-owner-detail/div/div/button[2]")
    private WebElement clickEditbutton;
	
	@FindBy(xpath = "//*[@id=\"telephone\"]")
    private WebElement editnumber;
	
	@FindBy(xpath = "/html/body/app-root/app-owner-edit/div/div/form/div[7]/div/button[2]")
    private WebElement updateDetails;
	
	
	public void clickedit() {
		clickEditbutton.click();
		
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys(Keys.BACK_SPACE);
		editnumber.sendKeys("09010707123");
		
		
		updateDetails.click();
		
	}

}
