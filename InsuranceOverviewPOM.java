package insurancePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InsuranceOverviewPOM {
	public WebDriver driver;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/p[2]/a")
    WebElement learnMoreAboutLifeInsuranceTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/p[2]/a")
	public WebElement learnMoreAboutHealthInsuranceTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/p[3]/a")
	WebElement lifeInsuranceCalculatorTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/p[3]/a[1]")
	WebElement buildingTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/p[3]/a[2]")
    WebElement preretirementTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[1]/h4/a")
	WebElement pHITab;
	
	@FindBy (xpath = "//div[@id=\"consumerPC\"]")
	WebElement postalTab;
	
	@FindBy (xpath = "html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/form/div[2]/input[2]")
	WebElement findAnAdvisorTab;
	
	@FindBy (xpath = "/html/body/div[2]/div[1]/div[6]/div/div[2]/div/div[1]/ul/li[1]/a")
	WebElement insuranceTab;
	
	public InsuranceOverviewPOM  (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLearnMoreAboutLifeInsuranceTab() {
		learnMoreAboutLifeInsuranceTab.click();
	}
	public void clickLearnMoreAboutHealthInsuranceTab() {
		learnMoreAboutHealthInsuranceTab.click();
	}
	// getters
	public WebElement getlifeInsuranceCalculator() {
		return this.lifeInsuranceCalculatorTab;
	}
	
	public void clickLifeInsuranceCalculatorTab() {
		lifeInsuranceCalculatorTab.click();
	}
	
	public WebElement getBuildingTab() {
		return this.buildingTab;
	}
	
	public void clickBuildingTab() {
		buildingTab.click();
	}
	
	public WebElement getPreretirementTab() {
		return this.preretirementTab;
	}
	
	public void clickPreretirementTab() {
		preretirementTab.click();
	}
	
	public WebElement getPHITab() {
		return this.pHITab;
	}
	
	public void clickPHITab() {
		pHITab.click();
	}
	
	public WebElement getPostalCodeTab() {
		return this.postalTab;
	}
	
	public void clickPostalcodeTab() {
		postalTab.click();
	}
	public void setPostalTab(String postalcode) {
		postalTab.sendKeys(postalcode);
	}
	
	public WebElement getFindAnAdvisor() {
		return this.findAnAdvisorTab;
	}

	public void clickFindAnAdvisorTab() {
		findAnAdvisorTab.click();
	}
	
	public WebElement getInsuranceTab() {
		return this.insuranceTab;
	}
	
}


