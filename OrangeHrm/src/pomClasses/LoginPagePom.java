package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePom {
	
	private WebDriver driver;
	private WebDriverWait wait;
	@FindBy (xpath = "//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='txtPassword']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='btnLogin']")
	private WebElement loginbut;
	
	public LoginPagePom(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,20);
		PageFactory.initElements(driver, this);
		
	}
	public void loginpageFun() {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Admin");	
		password.sendKeys("admin123");
		loginbut.click();
		
	}
	
	
	

}
