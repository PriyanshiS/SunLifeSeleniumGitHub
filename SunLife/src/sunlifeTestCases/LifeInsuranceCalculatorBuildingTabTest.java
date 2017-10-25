package sunlifeTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import sunlifePOM.InsuranceOverviewPOM;

public class LifeInsuranceCalculatorBuildingTabTest {
	WebDriver driver;
	String baseURL;
	InsuranceOverviewPOM insuranceoverview1;
	Actions action;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA";
		insuranceoverview1 = new InsuranceOverviewPOM(driver);
	}

	@Test
	public void  LifeInsuranceCalculatorBuildingTabTest() throws InterruptedException {
		driver.get(baseURL);
		insuranceoverview1.clickLifeInsuranceCalculatorTab();
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		insuranceoverview1.clickBuildingTab();
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
