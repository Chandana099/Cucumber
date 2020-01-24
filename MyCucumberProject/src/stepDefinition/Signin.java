package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\software required for testing batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	    
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("rekhab@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   driver.close();
	}



}
