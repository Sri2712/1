package org.cucumber.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SimpleForm {
     static WebDriver driver;

@Given("User inistialize the selenium easy page")
public void user_inistialize_the_selenium_easy_page() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\exp\\dri\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://www.seleniumeasy.com/test/");
}

@Given("user navigate to the input form")
public void user_navigate_to_the_input_form() {
	 driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
   
}

@When("User click simple form")
public void user_click_simple_form() {
	driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[1]")).click();
}

@When("Insert a message & add value")
public void insert_a_message_add_value() {
  driver.findElement(By.id("user-message")).sendKeys("hello");
  driver.findElement(By.xpath("//button[text()='Show Message']")).click();
  driver.findElement(By.id("sum1")).sendKeys("90");
  driver.findElement(By.id("sum2")).sendKeys("30");
  driver.findElement(By.xpath("//button[text()='Get Total']")).click();
}

@Then("User verfies the given msg values")
public void user_verfies_the_given_msg_values() {
Assert.assertEquals("hello",driver.findElement(By.id("display")).getText());
Assert.assertEquals("120", driver.findElement(By.id("displayvalue")).getText());

}
}
