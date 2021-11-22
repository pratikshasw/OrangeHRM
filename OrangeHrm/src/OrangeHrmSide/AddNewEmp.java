package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewEmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin ");
		Thread.sleep(5000);
		//input[@type='password']
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		Thread.sleep(5000);
		//input[@id='btnLogin']
		WebElement loginbutton =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbutton.click();
		Thread.sleep(5000);
		//b[text()='PIM']
		WebElement PIM = driver.findElement(By.xpath("//b[text()='PIM']"));
		PIM.click();
		Thread.sleep(5000);
		
		//a[@id='menu_pim_addEmployee']
		WebElement AddEployee = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		AddEployee.click();
		Thread.sleep(5000);
		
		//input[@id='firstName']
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Pratiksha");
		Thread.sleep(5000);
		
		//input[@id='middleName']
		WebElement middleName = driver.findElement(By.xpath("//input[@id='middleName']"));
		middleName.sendKeys("DadaSaheb");
		Thread.sleep(5000);
		
		//input[@id='lastName']
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Patil");
		Thread.sleep(5000);
		
		//input[@name='chkLogin']
		WebElement checklogin = driver.findElement(By.xpath("//input[@name='chkLogin']"));
		checklogin.click();
		Thread.sleep(5000);
		
		//input[@id='user_name']
		WebElement userName = driver.findElement(By.xpath("//input[@id='user_name']"));
		userName.sendKeys("Pratiksha321");
		Thread.sleep(5000);
		
		//input[@id='user_password']
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("GauRi$0369");
		Thread.sleep(5000);
		
		//input[@id='re_password']
		WebElement confirmpass = driver.findElement(By.xpath("//input[@id='re_password']"));
		confirmpass.sendKeys("GauRi$0369");
		Thread.sleep(5000);
		
		//select[@id='status']
		WebElement status = driver.findElement(By.xpath("//select[@id='status']"));
		Select statusselect = new Select(status);
		statusselect.selectByValue("Enabled");
		Thread.sleep(5000);
		
		//input[@id='btnSave']
		WebElement btnSave = driver.findElement(By.xpath("//input[@id='btnSave']"));
		btnSave.click();
		Thread.sleep(5000);
		
		//a[text()='Employee List']
		WebElement EmpList = driver.findElement(By.xpath("//a[text()='Employee List']"));
		EmpList.click();
		Thread.sleep(5000);
		
		//input[contains(@id,'empName')]
		WebElement empname = driver.findElement(By.xpath("//input[contains(@id,'empName')]"));
		empname.sendKeys("Pratiksha Patil");
		Thread.sleep(5000);
		
		//input[@id='searchBtn']
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		searchBtn.click();

	}

}
