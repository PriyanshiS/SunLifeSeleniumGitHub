package insurancePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarAndHomeInsurancePOM {
	public WebDriver driver;
	
	@FindBy (linkText = "Get a quote")
    WebElement GetaQouteTab;
	
	@FindBy (linkText = "What is car insurance?")
	WebElement WhatisCarInsuranceTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div[1]/h2/a/span")
	WebElement HowCanIsaveMoneyonmyCarInsuranceTab;
	
	@FindBy (id = "accordion3")
	WebElement WhatdoeshomeinsuranceusuallycoverTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div/div[5]/div/div[1]/h2/a/span")
    WebElement IfIownahouseorcondominiumdoIhavetogethomeinsuranceTab;



public CarAndHomeInsurancePOM  (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void clickGetaQouteTab() {
	GetaQouteTab.click();
}

public void clickWhatisCarInsuranceTabTab() {
	WhatisCarInsuranceTab.click();
}

public void clickHowCanIsaveMoneyonmyCarInsuranceTabTab() {
	HowCanIsaveMoneyonmyCarInsuranceTab.click();
	
}	
	
public void clickWhatdoeshomeinsuranceusuallycoverTab() {
	WhatdoeshomeinsuranceusuallycoverTab.click();
	
}	

public void clickIfIownahouseorcondominiumdoIhavetogethomeinsuranceTab() {
	IfIownahouseorcondominiumdoIhavetogethomeinsuranceTab.click();
	
}
}

	
	