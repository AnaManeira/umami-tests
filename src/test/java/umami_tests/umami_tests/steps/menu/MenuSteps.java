package umami_tests.umami_tests.steps.menu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import umami_tests.umami_tests.utils.UmamiWebDriverManager;

public class MenuSteps {

	private static String MENU_XPATH = "//li[@class='menu-main__item']/a";
	
	@Then("I see a menu link with text {string}")
	public void i_see_a_menu_link_with_text(String menuText) throws Exception {
		
		// Represents whether menu was found or not.
		boolean control = false;
		List<WebElement> menus = UmamiWebDriverManager.driver.findElements(By.xpath(MENU_XPATH));
		
		if (menus.isEmpty()) {
			throw new Exception("Menus not found");
		}
		
		for (WebElement menu : menus) {
			if (menu.getText().equals(menuText)) {
				control = true;				
			}
		}
		
		Assert.assertTrue("Menu " + menuText +" was found", control);
	}
	
	@Then("the menu {string} will send to {string}")
	public void the_menu_will_send_to(String menuName, String menuLink) throws Exception {

		// Represents whether menu was found or not.
		boolean control = false;
		List<WebElement> menus = UmamiWebDriverManager.driver.findElements(By.xpath(MENU_XPATH));
		
		if (menus.isEmpty()) {
			throw new Exception("Menus not found");
		}
		
		for (WebElement menu : menus) {
			if (menu.getText().equals(menuName)) {
				String href = menu.getAttribute("href");
				if (menu.getAttribute("href").toString().equals(menuLink)) {
					//Assert.assertEquals("Menu "+ menuName +" redirects to "+ menuLink, menu.getAttribute("href"), menuLink);
					control = true;
				}
				
			}
		}
		
		Assert.assertTrue(control);
	}

}
