package test.java.stepDefs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestDeveloperApp {

	WebDriver driver;
	NgWebDriver ng;

	@Given("I open browser and launch Developer URL")
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		ng = new NgWebDriver((JavascriptExecutor) driver);
		driver.get("https://developer.here.com/documentation");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@And("I validate the initialization of Angular on page")
	public void testAngularInitialization() {
		
		ng.waitForAngularRequestsToFinish();
	}
	
	@Then("I check the Internal Links present on documentation page")
	public void validateInternalLinks() {
		List<WebElement> links = driver.findElements(By.xpath(
				"(//a[@href='/documentation']/following-sibling::div)[1]/div//a[contains(@href,'/documentation#')]"));
		System.out.print("Internal Links Present are :- ");

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText() + "\t");

			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			VerifyLinkActive.validateResponseCode(url);
		}
	}
	

	@Then("I validate whether all links are getting loaded or not")
	public void test() throws InterruptedException {
		Actions action = new Actions(driver);

		List<WebElement> links = driver.findElements(By.xpath(
				"(//a[@href='/documentation']/following-sibling::div)[1]/div//a[contains(@href,'/documentation#')]"));

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = driver.findElement(By.xpath("//span[contains(@data-title,'Documentation')]"));
			action.moveToElement(ele).build().perform();
			Thread.sleep(2000);

			WebElement ele1 = driver.findElement(By.xpath(
					"((//a[@href='/documentation']/following-sibling::div)[1]/div//a[contains(@href,'/documentation#')])["
							+ (i + 1) + "]"));

			ele1.click();

			driver.manage().timeouts().pageLoadTimeout(50L, TimeUnit.SECONDS);
			Assert.assertTrue(driver.getCurrentUrl().contains("developer.here.com"));
			testAngularInitialization();
		}

	}
	

	@Then("I quit the driver")
	public void tearDown() {
		driver.quit();
	}

}
