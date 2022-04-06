package org.robust.springCucumber.cucumber.steps;

import io.cucumber.java.en.Given;
import org.robust.springCucumber.cucumber.datasets.RunConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class DummySteps {

    @Autowired
    RunConfiguration runConfiguration;

@Given("User tries to enter value in calculator and it works")
    public void testThisAndCheckItWorks(){

        System.out.println("Starting in >>> "+ runConfiguration.getTestType());
        System.out.println("Test Running in >>> "+ runConfiguration.getBrowser());
        System.out.println("This is working Correctly");
    }
}
