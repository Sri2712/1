package org.cucumber.cucumber;
import org.cucumber.cucumber.SimpleForm;
import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadioBtn {
	@When("User clicks single and group Radio Buttons")
	public void user_clicks_single_and_group_Radio_Buttons() {
 SimpleForm.driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[1]")).click();
 SimpleForm.driver.findElement(By.name("optradio")).click();
 SimpleForm.driver.findElement(By.name("gender")).click();
 SimpleForm.driver.findElement(By.name("ageGroup")).click();

}
	@Then("User checking value after clicking")
	public void user_checking_value_after_clicking() {
	SimpleForm.driver.findElement(By.id("buttoncheck")).click();
	Assert.assertEquals("Radio button 'Male' is checked", SimpleForm.driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
	}

	}
