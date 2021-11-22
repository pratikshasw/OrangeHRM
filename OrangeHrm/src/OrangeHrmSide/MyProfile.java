package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
		//input[@id='txtUsername']
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin ");
		//input[@type='password']
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		//input[@id='btnLogin']
		WebElement loginbutton =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbutton.click();
		Thread.sleep(3000);
		//input[@id='btnSave'] Edit form
		WebElement edit = driver.findElement(By.xpath("//input[@id='btnSave']"));
		edit.click();
		Thread.sleep(2000);
		
		//input[@name='personal[txtEmpFirstName]']
		WebElement firstname= driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']"));
		firstname.sendKeys("Gauri");
		Thread.sleep(3000);
		//input[contains(@name,'MiddleName]')]
		WebElement middlename = driver.findElement(By.xpath("//input[contains(@name,'MiddleName]')]"));
		middlename.sendKeys("Sanket");
		Thread.sleep(3000);
	//	//input[@name='personal[txtEmpLastName]']
		WebElement lastname = driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']"));
		lastname.sendKeys("Rananavare")	;
		//input[@id='personal_txtEmployeeId']
		WebElement empId = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		empId.sendKeys("5");
		
		Thread.sleep(3000);
		
		//input[@id='personal_txtNICNo']
		WebElement ssn = driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
		ssn.sendKeys("54897");
		Thread.sleep(3000);
		
		//select[@id='personal_cmbNation']
		WebElement nation = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
		Select nationality = new Select(nation);
		nationality.selectByVisibleText("Indian");
		Thread.sleep(5000);
		
		//select[@name='personal[cmbMarital]']
		WebElement marital = driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
		Select status = new Select(marital);
		status.selectByValue("Single");
	  
		//input[@id='personal_optGender_2']
		WebElement gender = driver.findElement(By.xpath("//input[@id='personal_optGender_2']"));
		gender.click();
		Thread.sleep(3000);
		
		//input[@id='btnEditCustom']
		WebElement edit1 = driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
		edit1.click();
		Thread.sleep(3000);
		//select[@name='custom1']
		WebElement BloodType = driver.findElement(By.xpath("//select[@name='custom1']"));
		Select bloodtype= new Select(BloodType);
		bloodtype.selectByIndex(4);
		Thread.sleep(3000);
		
		bloodtype.selectByVisibleText("A-");
		Thread.sleep(3000);
		//input[@id='personal_chkSmokeFlag']
		WebElement smoker = driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']"));
		smoker.click();
		Thread.sleep(3000);
		//input[contains(@id,'NickName')]
		WebElement nickname = driver.findElement(By.xpath("//input[contains(@id,'NickName')]"));
		nickname.sendKeys("Sanku");
		Thread.sleep(3000);
		
		//input[contains(@id,'txtMilitarySer')]
		WebElement military = driver.findElement(By.xpath("//input[contains(@id,'txtMilitarySer')]"));
		military.sendKeys("5");
		Thread.sleep(3000);
	
		//input[contains(@id,'OtherID')]
		WebElement otherId = driver.findElement(By.xpath("//input[contains(@id,'OtherID')]"));
		otherId.sendKeys("0369");
		Thread.sleep(3000);
		
		//input[contains(@name,'[txtLicenNo]')]
		WebElement Driverlic = driver.findElement(By.xpath("//input[contains(@name,'[txtLicenNo]')]"));
		Driverlic.sendKeys("5896321");
		Thread.sleep(3000);
		
		//input[contains(@name,'[txtSINNo]')]
		WebElement SIN = driver.findElement(By.xpath("//input[contains(@name,'[txtSINNo]')]"));
		SIN.sendKeys("8796245");


	}

}
