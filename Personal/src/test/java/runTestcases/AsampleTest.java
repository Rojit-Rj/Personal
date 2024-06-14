package runTestcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AsampleTest {
	
	public static void main(String[] args) throws InterruptedException{

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://web-locators-static-site-qa.vercel.app/");
	Thread.sleep(2000);
	}
	
}
