//Which page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwncaseEight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver.exe");

		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		 if ( driver.getPageSource().contains("Login in your account")){
	         System.out.println("We are in Login Page");
	      }
		 else {
			 System.out.println("We are in Registraction Page");
		 }

	}

}
