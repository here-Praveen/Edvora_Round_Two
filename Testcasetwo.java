import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcasetwo {
	static WebDriver driver;

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
        
		String unam="gddc";
		String pas="nbbg";
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
        uname.sendKeys(unam);
        
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
        pass.sendKeys(pas);
        
       
        
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

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
       WebElement logout= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[3]/div[1]/div/div/button"));
       logout.click();
        
       int n=5;
       while(n>0) {
       WebElement unamet= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
       unamet.sendKeys(unam);
     WebElement passt =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
     passt.sendKeys(pas);
     WebElement li = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
     li.click();
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     logout.click();
     driver.switchTo().alert().accept();
     n--;
       }    
		
	}

}
