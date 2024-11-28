package StepDefinitations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addTocartstep {
	

	WebDriver driver ;
	
	@When("User adds items to the cart")
	public void user_adds_items_to_the_cart(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
	    
	}

	@And("User views the shopping cart")
	public void user_views_the_shopping_cart() {
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	    
	}

	@Then("User should see the added items in the cart")
	public void user_should_see_the_added_items_in_the_cart() {
	   
	}




}
