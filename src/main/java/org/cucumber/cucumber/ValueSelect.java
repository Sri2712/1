package org.cucumber.cucumber;

import cucumber.api.java.en.When;
import org.cucumber.cucumber.SimpleForm;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class ValueSelect {
	@When("User selecting single value")
	public void user_selecting_single_value() {
		SimpleForm.driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[1]")).click();
		Select s=new Select(SimpleForm.driver.findElement(By.id("select-demo")));
		s.selectByValue("Monday");
	  
	}

	@When("User selecting multiple values")
	public void user_selecting_multiple_values() {
	  Select s=new Select(SimpleForm.driver.findElement(By.id("multi-select")));
	  s.selectByValue("New York");
	  s.selectByValue("Washington");
	  s.selectByValue("Florida");
	  SimpleForm.driver.findElement(By.id("printAll")).click();
	  //s.getFirstSelectedOption();
	  SimpleForm.driver.findElement(By.id("printMe")).click();
	}

}
