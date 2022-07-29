import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseeight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");

		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");     
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
     uname.sendKeys("mkpo");
     
     WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
     pass.sendKeys("nji@u");
     
     WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
     Login.click();

     try 
     { 
         driver.switchTo().alert(); 
         System.out.println("Alert Present");
     }  
     catch (NoAlertPresentException e) 
     { 
         System.out.println("No Alert Present");
     }  
  
	}

}
