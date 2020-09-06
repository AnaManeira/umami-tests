package umami_tests.umami_tests.steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import umami_tests.umami_tests.utils.UmamiWebDriverManager;

public class SearchSteps {

	@Then("I search by {string}")
	public void i_search_by(String name) {
		UmamiWebDriverManager.driver.findElement(By.xpath("//*[@id='edit-keys']")).sendKeys(name);
		UmamiWebDriverManager.driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
	}

	@Then("I see Search Results")
	public void i_see_search_results() {
		UmamiWebDriverManager.driver.findElement(By.xpath("//ol[contains(@class,'node_search-results')]"));
	}
	
}

