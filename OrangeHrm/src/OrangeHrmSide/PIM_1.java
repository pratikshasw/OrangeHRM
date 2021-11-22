package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PIM_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin ");
		Thread.sleep(2000);
		//input[@type='password']
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		Thread.sleep(2000);
		//input[@id='btnLogin']
		WebElement loginbutton =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbutton.click();
		Thread.sleep(5000);
		
		//b[text()='PIM']
		WebElement PIM = driver.findElement(By.xpath("//b[text()='PIM']"));
		PIM.click();
		//input[contains(@id,'empName')]
		WebElement empname = driver.findElement(By.xpath("//input[contains(@id,'empName')]"));
		empname.sendKeys("Paul Collings");
		Thread.sleep(2000);
		
		//input[@id='empsearch_id']
		WebElement id = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
		id.sendKeys("0024");
		Thread.sleep(2000);
		
		//select[contains(@id,'employee_status')]
		WebElement EmpStatus = driver.findElement(By.xpath("//select[contains(@id,'employee_status')]"));
		Select status = new Select(EmpStatus);
		status.selectByValue("3");
		Thread.sleep(2000);
		
		//select[contains(@id,'termination')]
		WebElement includes = driver.findElement(By.xpath("//select[contains(@id,'termination')]"));
		Select inclu = new Select(includes);
		inclu.selectByVisibleText("Current Employees Only");
		Thread.sleep(2000);
		
		//input[contains(@id,'supervisor_name')]
		WebElement supname = driver.findElement(By.xpath("//input[contains(@id,'supervisor_name')]"));
		supname.sendKeys("John Smith");
		Thread.sleep(2000);
		
		//select[contains(@id,'job_title')]
		WebElement title = driver.findElement(By.xpath("//select[contains(@id,'job_title')]"));
		Select jobtit = new Select(title);
		jobtit.selectByVisibleText("HR Manager");
		Thread.sleep(2000);
		
		//select[contains(@id,'unit')]
		WebElement subunit = driver.findElement(By.xpath("//select[contains(@id,'unit')]"));
		Select unit = new Select(subunit);
		unit.selectByValue("13");
		Thread.sleep(10000);
		
		//input[@id='searchBtn']
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		searchbutton.click();
		Thread.sleep(3000);
		
		//a[text()='Paul']
		WebElement profile = driver.findElement(By.xpath("//a[text()='Paul']"));
		profile.click();
		Thread.sleep(3000);
		
		//(//input[@value='Edit'])[1]
		WebElement edit = driver.findElement(By.xpath("(//input[@value='Edit'])[1]"));
		edit.click();
		Thread.sleep(3000);
		
		//input[contains(@name,'MiddleName]')]
		WebElement midlename = driver.findElement(By.xpath("//input[contains(@name,'MiddleName]')]"));
		midlename.sendKeys("Wankhade");
		Thread.sleep(3000);
		
		//input[contains(@name,'txtLicenNo]')]
		WebElement LicenNo = driver.findElement(By.xpath("//input[contains(@name,'txtLicenNo]')]"));
		LicenNo.sendKeys("123456");
		Thread.sleep(3000);
		
		//input[contains(@name,'txtOtherID]')]
		WebElement OtherId = driver.findElement(By.xpath("//input[contains(@name,'txtOtherID]')]"));
		OtherId.sendKeys("55");
		Thread.sleep(3000);
		
		//input[contains(@name,'txtNICNo]')]
		WebElement ssnNumber = driver.findElement(By.xpath("//input[contains(@name,'txtNICNo]')]"));
		ssnNumber.sendKeys("036912");
		Thread.sleep(3000);
		
		//input[contains(@name,'txtSINNo]')]
		WebElement SINNumber = driver.findElement(By.xpath("//input[contains(@name,'txtSINNo]')]"));
		SINNumber.sendKeys("12369");
		Thread.sleep(3000);
		
		//input[contains(@name,'NickName]')]
		WebElement nickname = driver.findElement(By.xpath("//input[contains(@name,'NickName]')]"));
		nickname.sendKeys("Sanku");
		Thread.sleep(3000);
		
		//input[contains(@name,'MilitarySer')]
		WebElement MilitarySer = driver.findElement(By.xpath("//input[contains(@name,'MilitarySer')]"));
		MilitarySer.sendKeys("3");
		Thread.sleep(5000);
		
		//input[@id='btnSave']
		WebElement Save = driver.findElement(By.xpath("//input[@id='btnSave']"));
		Save.click();
		Thread.sleep(3000);
		
		//input[@id='btnEditCustom']
		WebElement edit2 = driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
		edit2.click();
		Thread.sleep(3000);
		
		//select[@name='custom1']
		WebElement custom1 = driver.findElement(By.xpath("//select[@name='custom1']"));
		Select BloodType = new Select(custom1);
		BloodType.selectByIndex(2);
		
		//input[@id='btnEditCustom']
		WebElement save2 = driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
		save2.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.quit();


	}

}
