package sunlifePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HealthInsurancePOM {

public WebDriver driver;
	
	@FindBy (xpath = "html/body/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/p[1]/a")
    WebElement CriticalillnessinsuranceCalculatorlink;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div[2]/p[2]/a")
	WebElement Preparinghealthinsurancesolutionslink;
	
	@FindBy (xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/p[3]/a")
	WebElement DoYouHaveEnoughHealthInsuranceLink;
	
}
