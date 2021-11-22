package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TimeSheet {

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
		
		//b[text()='Time']
		WebElement Time = driver.findElement(By.xpath("//b[text()='Time']"));
		Time.click();
		Thread.sleep(5000);
		
		//input[@id='employee']
       WebElement EmpName = driver.findElement(By.xpath("//input[@id='employee']"));
       EmpName.clear();
       Thread.sleep(2000);
       
       EmpName.sendKeys("Pratiksha DadaSaheb Patil");
       Thread.sleep(5000);
       
     //input[@id='btnView']
       WebElement View = driver.findElement(By.xpath("//input[@id='btnView']"));
       View.click();
       Thread.sleep(10000);
       
     //input[@id='btnAddTimesheet']
       WebElement AddTimesheet = driver.findElement(By.xpath("//a[@id='btnAddTimesheet']"));
       AddTimesheet.click();
       Thread.sleep(20000);
       
     //input[@ id='btnEdit']
       WebElement EditSheet = driver.findElement(By.xpath("//input[@ id='btnEdit']"));
       EditSheet.click();
       Thread.sleep(5000);
       
     //input[@ id='initialRows_0_projectName'] 
       WebElement ProjectName = driver.findElement(By.xpath("//input[@ id='initialRows_0_projectName']"));
       ProjectName.sendKeys("s");
       Thread.sleep(10000);
       
     //select[contains(@ id,'ActivityName')]
       WebElement ActivitySelect = driver.findElement(By.xpath("//select[contains(@ id,'ActivityName')]"));
       Select activityname = new Select(ActivitySelect);
       activityname.selectByVisibleText("QA Testing");
       Thread.sleep(5000);
       
     //  (//input[@align='center'])[2]
       
      WebElement time1 = driver.findElement(By.xpath("(//input[@align='center'])[2]"));
      time1.sendKeys("6");
      Thread.sleep(5000);
      
     WebElement time2 = driver.findElement(By.xpath("(//input[@align='center'])[3]"));
     time2.sendKeys("4"); 
     Thread.sleep(5000);
     
     WebElement time3 = driver.findElement(By.xpath("(//input[@align='center'])[4]"));
     time3.sendKeys("3"); 
     Thread.sleep(5000);
     
     WebElement time4 = driver.findElement(By.xpath("(//input[@align='center'])[5]"));
     time4.sendKeys("5"); 
     Thread.sleep(5000);
     
     WebElement time5 = driver.findElement(By.xpath("(//input[@align='center'])[6]"));
     time5.sendKeys("0");
     Thread.sleep(5000);
     
     WebElement time6 = driver.findElement(By.xpath("(//input[@align='center'])[7]"));
     time6.sendKeys("6");
     Thread.sleep(5000);
     
     WebElement time7 = driver.findElement(By.xpath("(//input[@align='center'])[8]"));
     time7.sendKeys("4");
     Thread.sleep(5000);
    //input[@id='btnAddRow']
     
     WebElement AddRow = driver.findElement(By.xpath("//input[@id='btnAddRow']"));
     AddRow.click();

	}

}
