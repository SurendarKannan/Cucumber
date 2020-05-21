package test.Cucumber.Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^Launching the facebook URL")
	public void Launching_the_facebook_URL() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@When("^Entering the valid credentials")
	public void Entering_the_valid_credentials() {

	WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("surenjack1@gmail.com");
		WebElement b = driver.findElement(By.id("pass"));
		b.sendKeys("Surenjack@12345");		
	}
	
	@And("^Clicking the login button")
	public void Clicking_the_login_button() {

		 WebElement c = driver.findElement(By.id("loginbutton"));
		c.click();
	//	System.out.println(driver.getTitle());
		
	}
	
	@Then("^Verifying the homepage")
	public void Verifying_the_homepage() {

		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		
		
	}

}