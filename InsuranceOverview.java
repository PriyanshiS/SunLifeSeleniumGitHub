package junitTestCases;

import insurancePOM.InsuranceOverviewPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class InsuranceOverview {
	WebDriver driver;
	String baseURL;
	InsuranceOverviewPOM insuranceoverview;
	Actions action;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Applications/Utilities/untitled folder/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.sunlife.ca/";
		insuranceoverview = new InsuranceOverviewPOM(driver);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
     	action = new Actions(driver);
     	action.moveToElement(insuranceoverview.getInsuranceTab()).perform();
     	Thread.sleep(3000);
     	driver.findElement(By.linkText("Insurance overview")).click();
     	Thread.sleep(3000);
     	insuranceoverview.clickLearnMoreAboutLifeInsuranceTab();
     	Thread.sleep(3000);
     	driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
     	insuranceoverview.clickLearnMoreAboutHealthInsuranceTab();
     	Thread.sleep(3000);
     	driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
     	Thread.sleep(3000);

        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,100)", "");
        action.moveToElement(insuranceoverview.getlifeInsuranceCalculator()).perform();
        insuranceoverview.clickLifeInsuranceCalculatorTab();
        Thread.sleep(3000);
	
        driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
        jse.executeScript("window.scrollBy(0,100)", "");
        action.moveToElement(insuranceoverview.getBuildingTab()).perform();
        insuranceoverview.clickBuildingTab();
        Thread.sleep(3000);
		
        driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
        jse.executeScript("window.scrollBy(0,100)", "");
        action.moveToElement(insuranceoverview.getPreretirementTab()).perform();
        insuranceoverview.clickPreretirementTab();
        Thread.sleep(4000);
		
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		//Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,150)", "");
		//Thread.sleep(3000);
		WebElement phitTab = insuranceoverview.getPHITab();
		//Actions moveToElement = action.moveToElement(phitTab);
		//moveToElement.perform();
		insuranceoverview.clickPHITab();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		jse.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(3000);
		action.moveToElement(insuranceoverview.getPostalCodeTab()).perform();
		insuranceoverview.clickPostalcodeTab();
		Thread.sleep(3000);
		insuranceoverview.setPostalTab("J4Y0E5");
		Thread.sleep(3000);
		
		insuranceoverview.clickFindAnAdvisorTab();
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}	

}
