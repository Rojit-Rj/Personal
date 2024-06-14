package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {

	
	
	
	WebDriver driver;
	
	EditPage(WebDriver driver){
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	
//	locators  + actions like click, sendkeys
	
	@FindBy(xpath = "//input[@placeholder='Click here to enter your name here']")
	private WebElement nameField;
	
	@FindBy(xpath = "//input[@placeholder='White']")
	private WebElement colorField;
	
	@FindBy(xpath = "//input[@placeholder='Type your nationality']")
	private WebElement nationalityField;
	
	@FindBy(xpath = "//input[@placeholder='54.5']")
	private WebElement currentWeightField;
	
	@FindBy(xpath = "//input[@placeholder='55']")
	private WebElement pastWeightField;
	
	@FindBy(xpath = "//a[@href='/']")
	private WebElement backButton;
	
	
	
	public WebElement back() {
		return backButton;
	}
	
	public WebElement name() {
		return nameField;
	}
	
	public WebElement color() {
		return colorField;
	}
	
	public WebElement nationality() {
		return nationalityField;
	}

	public WebElement currentWeight() {
		return currentWeightField;
	}
	
	public WebElement pastWeight() {
		return pastWeightField;
	}
}
