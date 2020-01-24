package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalidlogin {
	WebDriver driver;
	@Given("^open chrome$")
	public void open_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	}

	@When("^I enter invalid username and password$")
	public void I_enter_invalid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rekhab7@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
	}

	@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}



}
