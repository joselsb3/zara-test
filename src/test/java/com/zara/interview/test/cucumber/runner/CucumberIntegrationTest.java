package com.zara.interview.test.cucumber.runner;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/price.feature",
        glue = {
                "com.zara.interview.test.cucumber.config",
                "com.zara.interview.test.cucumber.steps"},
        publish = true)
public class CucumberIntegrationTest {

}
