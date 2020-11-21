package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestcase {

	public static void main(String[] args) {
//		1. Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//1a) Maximize the browser
		driver.manage().window().maximize();
//		2. Launch the URL/app
		driver.get("http://leaftaps.com/opentaps/control/main");
//		3. Enter the username
		 // WebElement userName = driver.findElementById("username");
		 // userName.sendKeys("Demosalesmanager"); 
		driver.findElementById("username").sendKeys("Demosalesmanager");
//		4. Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
//		5. Click the Login Button
		driver.findElementByClassName("decorativeSubmit").click();
	}

}
