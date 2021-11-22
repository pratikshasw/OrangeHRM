package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Directory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
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
		
		//b[text()='Directory']
		WebElement directory= driver.findElement(By.xpath("//b[text()='Directory']"));
		directory.click();
		Thread.sleep(3000);
		
		//input[contains(@id,'name_empName')]
		WebElement empName = driver.findElement(By.xpath("//input[contains(@id,'name_empName')]"));
		empName.sendKeys("Odis Adalwin");
		Thread.sleep(3000);
		
		//select[contains(@id,'job_title')]
		WebElement jobtitle = driver.findElement(By.xpath("//select[contains(@id,'job_title')]"));
		Select Title = new Select(jobtitle);
		Title.selectByIndex(4);
		Thread.sleep(3000);
		//select[@id='searchDirectory_location']
		WebElement searchlocation = driver.findElement(By.xpath("//select[@id='searchDirectory_location']"));
		Select location = new Select(searchlocation);
		location.selectByValue("1");
		Thread.sleep(3000);
		
		//input[@id='searchBtn']
		WebElement search = driver.findElement(By.xpath("//input[@id='searchBtn']"));
		search.click();
		Thread.sleep(3000);
		//input[@id='resetBtn']
		WebElement reset = driver.findElement(By.xpath("//input[@id='resetBtn']"));
		reset.click();

	}

}
