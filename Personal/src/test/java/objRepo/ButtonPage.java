package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ButtonPage {
	
	WebDriver driver;	
	public ButtonPage(WebDriver driver){
		this.driver = driver;
	}
	
		@FindBy(xpath = "//a[@href='/']")
		private WebElement backButton;
		
		public WebElement back() {
			return backButton;
		}
		
		
		@FindBy(xpath = "//button")
		private WebElement GreenButton; 
		
		public WebElement button() {
			return GreenButton;
		}
		
		

		
}
