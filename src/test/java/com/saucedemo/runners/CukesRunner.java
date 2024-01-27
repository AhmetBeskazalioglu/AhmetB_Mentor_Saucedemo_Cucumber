package com.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // this line makes our class runner class
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features", // path to features
        glue = "com/saucedemo/step_definitions", // path to step definitions
        dryRun = false, // if set to true, will run over the feature steps and identify the missing implementation
        // if set to false, will run the actual test
        tags = "@regression" // this line will run only the scenarios that have @wip tag
        // if we want to run multiple tags, we use {"@wip", "@smoke"}
        // if we want to ignore a tag, we use "~@wip"
)
public class CukesRunner {
}
