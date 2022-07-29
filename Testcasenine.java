import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcasenine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");

		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/p[2]/button"));
		register.click();
		
       try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
       
		String u ="tngf";
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
       uname.sendKeys(u);
       
       WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
       pass.sendKeys("eazv");
       
       WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
       Login.click();
       
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
      
      driver.switchTo().alert().accept();
      
      
      try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
      String strurl = driver.getCurrentUrl();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
      WebElement logout= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[3]/div[1]/div/div/button"));
      logout.click();
      
      driver.get(strurl);
      
      WebElement val = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/input"));
      String vall = val.getAttribute("value");
      if(vall.equals(u)) {
    	  System.out.println("The User can able to navigate to the settings Page using URL");
      }
    	  else {
    		  System.out.println("The User was not able to navigate to the settings Page using URL");
    	  }
      }
      

	}


