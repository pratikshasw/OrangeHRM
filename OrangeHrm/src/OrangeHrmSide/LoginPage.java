package OrangeHrmSide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		boolean result1 = username.isDisplayed();
		
		if(result1 == true)
		{
			System.out.println("Pass");
		}

		else
		{
			System.out.println("Fail");
		}
		
		//input[@id='txtPassword']
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
	   boolean  result2  = password.isEnabled();
	   
	   if(result2 ==true)
	   {
		   System.out.println("Pass");
	   }
	   else 
	   {
		   System.out.println("Fail");
	   }
	 //input[@id='btnLogin']
	   
	   WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
	   boolean result3 = login.isSelected();
	   if(result3 == true)
	   {
		   System.out.println("Selected");
	   }
	   else
	   {
		   System.out.println("Not selected");
	   }
	   
	 //input[@id='txtUsername']
//	   WebElement invaliusername = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//	   invaliusername.sendKeys("Admin1");  
//	   Thread.sleep(3000);
// Invalid Crediential
	   
	   username.sendKeys("Admin1");
	   Thread.sleep(3000);
	   
	   password.sendKeys("admin123");
	   Thread.sleep(3000);
	   
	   login.click();
	   Thread.sleep(5000);
	   driver.navigate().refresh();
	   Thread.sleep(5000);
	   
	   //Valid Credintial
	   
	   username.sendKeys("Admin");
	   Thread.sleep(3000);
	   
	   password.sendKeys("admin123");
	   Thread.sleep(3000);
	   
	   login.click();
	   Thread.sleep(3000);

	}

}
