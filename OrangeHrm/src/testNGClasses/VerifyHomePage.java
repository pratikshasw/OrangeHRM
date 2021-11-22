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

public class VerifyHomePage {

	private WebDriver driver;
	private LoginPagePom loginpage;
	private HomePage homepage;
	@BeforeClass
	public void lanchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com");	
	}
	@BeforeMethod
	public void loginToPage() throws InterruptedException {
		loginpage = new LoginPagePom(driver);
		loginpage.loginpageFun();
		Thread.sleep(2000);
	}
	@Test
	public void verifyAdmin() {
		homepage = new HomePage(driver);
		homepage.clickOnAdmin();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String text = driver.getTitle();
		System.out.println(text);
		driver.navigate().back();
	}
	
	@Test (priority = 1)
	public void verifyPMI() {
		homepage = new HomePage(driver);
		homepage.clickOnPMI();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String text = driver.getTitle();
		System.out.println(text);
		driver.navigate().back();
	}
	@Test (priority = 2)
	public void verifyMyProfile() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.clickOnMyInfo();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String text = driver.getTitle();
		System.out.println(text);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void logoutThePgae() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.clickOnWelcome();
		Thread.sleep(1000);
		homepage.clickOnLogOut();
		
	//	homepage.clickOnClose();
		Thread.sleep(2000);
		
		
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
		
	
}
