import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcasefive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");

       try {
			Thread.sleep(600000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
       try 
       { 
           driver.switchTo().alert(); 
           System.out.println("Server Error Appear");
       }  
       catch (NoAlertPresentException e) 
       { 
           System.out.println("No Error");
       
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
       uname.sendKeys("Pdfv");
       
       WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
       pass.sendKeys("pae@v");
       
       WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
       Login.click();
       
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
       
       
      Alert all = driver.switchTo().alert();
      all.accept();
      

	}

}
}
