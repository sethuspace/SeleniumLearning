package assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//1. Launch Leafground application - http://www.leafground.com/pages/Dropdown.html
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
//		2. In first dropdown select, Appium using index
		WebElement first = driver.findElementById("dropdown1");
		Select firstDD = new Select(first);
		firstDD.selectByIndex(2);
		
//		3. In second dropdown, print number of options.
		WebElement second = driver.findElementByName("dropdown2");
		Select secondDD = new Select(second);
		System.out.println("Number of options in second dropdown: "+ secondDD.getOptions().size());
		
//		4. In third dropdown, select Load runner using the value attribute
		WebElement third = driver.findElementById("dropdown3");
		Select thirdDD = new Select(third);
		thirdDD.selectByValue("4");		
		
//		5. In 4th drop down print all the options in the dropdown.
		WebElement fourth = driver.findElementByClassName("dropdown");
		System.out.println();
		Select fourthDD = new Select(fourth);
		List<WebElement> allOptions = fourthDD.getOptions();
		for (WebElement eachOptions : allOptions) {
			System.out.println("Option in the 4th Dropdown: "+eachOptions.getText());
		}
		
//		6. In 5th dropdown, select Selenium by text
		WebElement fifth = driver.findElementByXPath("(//div[@class='example'])[5]/select");
		Select fifthDD = new Select(fifth);
		fifthDD.selectByVisibleText("Selenium");
		
	}

}
