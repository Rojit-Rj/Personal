package objRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HyperlinkPage {

	WebDriver driver;
	public HyperlinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	@FindBy(xpath= "//a[text()='Crio.do']")
	private WebElement Clickable_CrioLink;
	
	@FindBy(xpath= "//p[text()=' Non - Clickable ']")
	private WebElement NonClickable_CrioLink;
	
	@FindBy(xpath= "//a[text()='Broken Link']")
	private WebElement BrokenLink;
	
	@FindBy(xpath= "//a[text()='Find out how many links are available']")
	private WebElement GoogleSearchLink;
	
	
	public WebElement ClickableLink() {
		return Clickable_CrioLink;
	}
	public WebElement NonClickableLink() {
		return NonClickable_CrioLink;
	}
	public WebElement BrokenLink() {
		return BrokenLink;
	}
	public WebElement SearchresultLink() {
		return GoogleSearchLink;
	}
}
