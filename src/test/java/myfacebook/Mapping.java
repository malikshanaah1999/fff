package myfacebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



// Is used for mapping...

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases",glue = "myfacebook", plugin= {"html:target/cucumber.html"})
public class Mapping {

}
