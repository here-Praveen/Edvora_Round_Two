//Test case for Verify That the Cancel Button Works Fine.
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwncaseFour {

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
     uname.sendKeys("ajvv");
     
     WebElement pass = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div/input"));
     pass.sendKeys("pfnf");
     
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
    WebElement cancel = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[1]/div[1]/div/div/button[1]"));
    cancel.click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    WebElement logout= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[3]/div[1]/div/div/button"));
    logout.click();

	}

}
