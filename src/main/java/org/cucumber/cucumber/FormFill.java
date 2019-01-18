package org.cucumber.cucumber;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.Map;

import org.cucumber.cucumber.SimpleForm;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class FormFill {
	@When("User to fill the input form")
	public void user_to_fill_the_input_form(DataTable formfill) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   SimpleForm.driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[1]")).click();
	Map<String, String> inputform=formfill.asMap(String.class, String.class);
	SimpleForm.driver.findElement(By.name("first_name")).sendKeys(inputform.get("First Name"));
	SimpleForm.driver.findElement(By.name("last_name")).sendKeys(inputform.get("Last Name"));
	SimpleForm.driver.findElement(By.name("email")).sendKeys(inputform.get("E-Mail"));
	SimpleForm.driver.findElement(By.name("phone")).sendKeys(inputform.get("Phone"));
	SimpleForm.driver.findElement(By.name("address")).sendKeys(inputform.get("Address"));
	SimpleForm.driver.findElement(By.name("city")).sendKeys(inputform.get("City"));
	Select s=new Select(SimpleForm.driver.findElement(By.name("state")));
	s.selectByVisibleText("California");
	SimpleForm.driver.findElement(By.name("zip")).sendKeys(inputform.get("Zip Code"));
	SimpleForm.driver.findElement(By.name("website")).sendKeys(inputform.get("Website or domain name"));
	SimpleForm.driver.findElement(By.name("hosting")).click();
	SimpleForm.driver.findElement(By.name("comment")).sendKeys(inputform.get("Project Description"));
	}
	@When("User send the filled infomartion")
	public void user_send_the_filled_infomartion() {
	  SimpleForm.driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
