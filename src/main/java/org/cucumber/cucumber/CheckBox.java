package org.cucumber.cucumber;

import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.cucumber.cucumber.SimpleForm;
import org.junit.Assert;
public class CheckBox   {

	@When("User click Single Checkbox")
	public void user_click_Single_Checkbox() {
		 SimpleForm.driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[1]")).click();
	  SimpleForm.driver.findElement(By.id("isAgeSelected")).click(); 
	}

	@When("User also clicks all Multiple Checkboxs")
	public void user_also_clicks_all_Multiple_Checkboxs() {
	 SimpleForm.driver.findElement(By.xpath("//label[text()='Option 1']")).click();
	   SimpleForm.driver.findElement(By.xpath("//label[text()='Option 2']")).click();
	   SimpleForm.driver.findElement(By.xpath("//label[text()='Option 3']")).click();
	   SimpleForm.driver.findElement(By.xpath("//label[text()='Option 4']")).click();
	}

	@Then("User ensures everyrhing clicks")
	public void user_ensures_everyrhing_clicks() {
	Assert.assertEquals("Success - Check box is checked", SimpleForm.driver.findElement(By.id("txtAge")).getText());
	  
	}

}
