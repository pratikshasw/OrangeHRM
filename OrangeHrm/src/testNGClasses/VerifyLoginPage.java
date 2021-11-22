package testNGClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.HomePage;
import pomClasses.LoginPagePom;

public class VerifyLoginPage {
	
	private WebDriver driver;
	private LoginPagePom loginpage;
	private HomePage homepage;

	@BeforeClass
	public void launchThebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	@BeforeMethod
	public void openTheApp() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");	
	}
	@Test
	public void verifyLoginPage() throws InterruptedException {
		loginpage = new LoginPagePom(driver);
		loginpage.loginpageFun();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void logoutThePage() {
		homepage = new HomePage(driver);
		homepage.clickOnWelcome();
		homepage.clickOnLogOut();
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
}
