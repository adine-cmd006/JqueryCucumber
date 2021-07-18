package com.jquery.CucumberOptions;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"com/jquery"},
        plugin = {"pretty","html:target/cucumber/report.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        tags = ("")
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
