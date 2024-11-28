package StepDefinitations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

	WebDriver driver;

	@Given("brower is open")
	public void brower_is_open() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@And("User is on the login page")
	public void user_is_on_the_login_page() {
		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("User enters username and password")
	public void user_enters_valid_credentials() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}

	@Then("User is redirected to the products page")
	public void user_is_redirected_to_the_products_page() {
		boolean result = driver.getPageSource().contains("Swag Labs");
		// System.out.println(result);
		driver.close();
		driver.quit();
	}

}
