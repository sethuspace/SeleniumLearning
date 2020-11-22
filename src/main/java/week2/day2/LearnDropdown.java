package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

		WebElement sourceDropDown = driver.findElementByName("dataSourceId");
		// Creating an object for Select class
		Select srcDD = new Select(sourceDropDown);

		// Selecting a value based on the display text
		srcDD.selectByVisibleText("Direct Mail");

		// Selecting a value based on the index - index starts with 0
		srcDD.selectByIndex(2);

		// Selecting by value attribute
		srcDD.selectByValue("LEAD_PARTNER");

		// To get all options in dropdown
		List<WebElement> options = srcDD.getOptions();
		for (WebElement eachElement : options) {
			String text = eachElement.getText();
			System.out.println(text);
		}

		// Select last but one
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mktCampgnDD = new Select(marketingCampaign);
		// strategy - visibleText, value, number
		List<WebElement> options1 = mktCampgnDD.getOptions();
		int dropDownOptionsCount = options1.size();
		mktCampgnDD.selectByIndex(dropDownOptionsCount - 2);

	}

}
