package org.cucumber.cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SRIRAM\\eclipse-workspace\\cucumber\\feature", glue= {"org.cucumber.cucumber"}
, plugin={"html:target"}, tags={"@simple","@check"})
public class TestRunner {

}
