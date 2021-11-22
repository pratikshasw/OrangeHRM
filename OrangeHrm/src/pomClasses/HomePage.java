package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	Actions act;
	@FindBy(xpath = "//a[@id='welcome'] 	")
	private WebElement welcome;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	@FindBy(xpath = "//b[text()='Admin']")
	private WebElement admin;
	@FindBy(xpath = "//b[text()='PIM']")
	private WebElement pmi;
	@FindBy(xpath = "//b[text()='Recruitment']")
	private WebElement recruitment;
	@FindBy(xpath = "//b[text()='My Info']")
	private WebElement myInfo;
	@FindBy(xpath = "//a[@class='close']")
	private WebElement close;
	private WebDriverWait wait;
	
	
	//b[text()='Recruitment']
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		wait = new WebDriverWait(driver , 10);
	}
	public void clickOnAdmin() {
		
	wait.until(ExpectedConditions.visibilityOf(admin));
	
		admin.click();
	}
	public void clickOnPMI() {
		pmi.click();
	}
	public void clickOnRecruitment() {
		recruitment.click();
	}
	public void clickOnMyInfo() {
		myInfo.click();
	}
	public void clickOnWelcome() {
		welcome.click();
	}
	public void clickOnLogOut() {
		act.moveToElement(logout).click().build().perform();
	}
	public void clickOnClose() {
		act.moveToElement(close).click().build().perform();
	}
	

}
