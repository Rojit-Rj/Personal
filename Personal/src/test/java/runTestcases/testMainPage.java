package runTestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objRepo.Mainpage;


public class testMainPage extends baseClass{

	@Test
	public void homepage() throws InterruptedException {
		
		Mainpage editbutton = new Mainpage(driver) ;
		Thread.sleep(2000);
		editbutton.edit().click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}
}
///p[@class='cardHeading'][text='Edit']