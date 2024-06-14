package objRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {
	
	WebDriver driver;
	
	public Mainpage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(xpath = "//div/p[text()='Edit']")
	private WebElement Edit_Card; 
	
	@FindBy(xpath = "//div/p[text()='Button']")
	private WebElement Button_Card; 
	
	@FindBy(xpath = "//div/p[text()='Hyperlink']")
	private WebElement Hyperlink_Card; 
	
	@FindBy(xpath = "//div/p[text()='Image']")
	private WebElement Image_Card; 
	
	@FindBy(xpath = "//div/p[text()='Dropdown']")
	private WebElement Dropdown_Card; 
	
	@FindBy(xpath = "//div/p[text()='Radio']")
	private WebElement Radio_Card; 
	
	@FindBy(xpath = "//div/p[text()='Checkbox']")
	private WebElement Checkbox_Card; 
	
	@FindBy(xpath = "//div/p[text()='Calender']")
	private WebElement Calender_Card; 
	
	@FindBy(xpath = "//div/p[text()='Auto-complete']")
	private WebElement AutoComplete_Card; 
	
	@FindBy(xpath = "//div/p[text()='Upload']")
	private WebElement Upload_Card; 
	
	@FindBy(xpath = "//div/p[text()='Web Table']")
	private WebElement WebTable_Card; 
	
	@FindBy(xpath = "//div/p[text()='Alerts']")
	private WebElement Alerts_Card; 
	
	@FindBy(xpath = "//div/p[text()='Frames']")
	private WebElement Frames_Card; 
	
	@FindBy(xpath = "//div/p[text()='Windows']")
	private WebElement Windows_Card; 
	
	@FindBy(xpath = "//div/p[text()='Wait onTime']")
	private WebElement TimeWait_Card; 
	
	@FindBy(xpath = "//div/p[text()='Wait onClick']")
	private WebElement ClickWait_Card; 
	
	@FindBy(xpath = "//div/p[text()='Wait onScroll']")
	private WebElement ScrollWait_Card; 
	
	@FindBy(xpath = "//div/p[text()='Captcha']")
	private WebElement Captcha_Card; 
	
	@FindBy(xpath = "//div/p[text()='Mouse']")
	private WebElement Mouse_Card; 
	
	@FindBy(xpath = "//div/p[text()='Keyboard Operations']")
	private WebElement KeyboardOps_Card; 
	
	@FindBy(xpath = "//div/p[text()='Screenshot']")
	private WebElement Screenshot_Card; 
	

	
	
	public WebElement edit() {
		return Edit_Card;
	}
	
	public WebElement button() {
		return Button_Card;
	}
	
	public WebElement hyperlink() {
		return Hyperlink_Card;
	}
	
	public WebElement image() {
		return Image_Card;
	}
	
	public WebElement dropdown() {
		return Dropdown_Card;
	}
	
	public WebElement radio() {
		return Radio_Card;
	}
	
	public WebElement checkbox() {
		return Checkbox_Card;
	}
	
	public WebElement calender() {
		return Calender_Card;
	}
	
	public WebElement autocomplete() {
		return AutoComplete_Card;
	}
	
	public WebElement upload() {
		return Upload_Card;
	}
	
	public WebElement webtable() {
		return WebTable_Card;
	}
	
	public WebElement alerts() {
		return Alerts_Card;
	}
	
	public WebElement frames() {
		return Frames_Card;
	}
	
	public WebElement windows() {
		return Windows_Card;
	}
	
	public WebElement timewait() {
		return TimeWait_Card;
	}
	
	public WebElement clickwait() {
		return ClickWait_Card;
	}
	
	public WebElement scrollwait() {
		return ScrollWait_Card;
	}
	
	public WebElement captcha() {
		return Captcha_Card;
	}
	
	public WebElement mouse() {
		return Mouse_Card;
	}
	
	public WebElement keyboardoperations() {
		return KeyboardOps_Card;
	}
	
	public WebElement screenshot() {
		return Screenshot_Card;
	}
	
	
}
