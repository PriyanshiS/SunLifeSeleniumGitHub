package sunlifePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsurancePOM {
public WebDriver driver;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/p[1]/a")
    WebElement LifeinsuranceCalculatorlink;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/p[2]/a")
	WebElement WhatisUnderwritinglink;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/p[3]/a")
	WebElement HowTochooseLink;
	
}



