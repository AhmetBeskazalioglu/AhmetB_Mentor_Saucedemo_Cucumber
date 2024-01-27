package com.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class will run only the failed tests from rerun.txt file
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html",
        },
        features = "@target/rerun.txt",
        glue = "com/saucedemo/step_definitions"
)
public class FailedTestRunner {
}
