package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





//@RunWith(Cucumber.class)
//@CucumberOptions(plugin={"pretty","html:/target/fg.html"},tags = "@invalid")



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature\\Gmail.feature", glue="Stepdefinitions",plugin= {"pretty","html:cucumber_result/login.html"})




public class runn {

}
