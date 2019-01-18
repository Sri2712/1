package org.cucumber.cucumber;

import cucumber.api.java.en.Then;
import org.cucumber.cucumber.SimpleForm;
import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class AjaxForm {
	@When("User fill the ajax form and send")
	public void user_fill_the_ajax_form_and_send() {
		SimpleForm.driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[1]")).click();
		SimpleForm.driver.findElement(By.id("title")).sendKeys("Sriram");
		SimpleForm.driver.findElement(By.id("description")).sendKeys("Nothing");
		SimpleForm.driver.findElement(By.id("btn-submit")).click();
	}

	@Then("User should see Form submited Successfully message")
	public void user_should_see_Form_submited_Successfully_message() {
	 Assert.assertEquals("Form submited Successfully!", SimpleForm.driver.findElement(By.id("submit-control")).getText());   
	}
}
