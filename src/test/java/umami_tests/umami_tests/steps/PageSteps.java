package umami_tests.umami_tests.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import umami_tests.umami_tests.utils.UmamiWebDriverManager;

public class PageSteps {
	
	@Given("I am on {string}")
	public void i_am_on(String string) {
	    UmamiWebDriverManager.driver.get(string); 
	}
	
	@Then("an element with text {string}")
	public void an_element_with_text(String text) {
		UmamiWebDriverManager.driver.findElement(By.xpath("//*[contains(text(), '"+ text +"')]"));		
	}
	
	@Then("an element with link {string}")
	public void an_element_with_link(String link) {
		UmamiWebDriverManager.driver.findElement(By.xpath("//*[@href='"+ link +"']"));	
	}
	
	@Then("I see a banner element")
	public void i_see_a_banner_element() {
		UmamiWebDriverManager.driver.findElement(By.xpath("//div[@class='layout-banner-top']"));	
	}

	@Then("the background image is {string}")
	public void the_background_image_is(String urlImage) {
	    // Write code here that turns the phrase above into concrete actions
		UmamiWebDriverManager.driver.findElement(By.xpath("//div[@style='background-image: url(" + urlImage + ")']"));
	}
	
	@Given("a list with {int} elements {string}")
	public void a_list_with_elements(Integer amount, String xpath) {
		List<WebElement> elements = UmamiWebDriverManager.driver.findElements(By.xpath(xpath));
	    Assert.assertEquals(amount.intValue(), elements.size());
	}
	
	@Then("I click on element with xpath {string}")
	public void i_click_on_element_with_xpath(String xpath) {
		UmamiWebDriverManager.driver.findElement(By.xpath(xpath)).click();
	}
  
	@Then("I am on the page with URL {string}")
	public void i_am_on_the_page_with_url(String url) {
		Assert.assertEquals(UmamiWebDriverManager.driver.getCurrentUrl(), url);
	}
	
	@Then("I see an element with text {string}")
	public void i_see_an_element_with_text(String text) {
		an_element_with_text(text);
	}

}
