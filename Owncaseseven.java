// Reload page no data should present
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Owncaseseven {

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
     
		
		WebElement uname = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[1]/div/input"));
     uname.sendKeys("vjhv");
     
     WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
     pass.sendKeys("pflf");
     
     WebElement Login = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/button"));
     Login.click();
     
     try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
     
    Alert all = driver.switchTo().alert();
    all.accept();
    
    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
                                                   
    WebElement edit = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[1]/div/div/button"));
    edit.click();  
    String na ="Fullname";
    WebElement fname =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/input"));
    fname.sendKeys(na);
    WebElement save = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div/div/button[1]"));
    save.click();
    driver.navigate().refresh();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    WebElement verr = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/input"));
    String verss = verr.getAttribute("value");
    if(verss.isEmpty()) {
    	System.out.println("Box was Empty after Reloaded");
    }
    else {
    	System.out.println("Page has the value after Reloaded");
    }
	}

}
