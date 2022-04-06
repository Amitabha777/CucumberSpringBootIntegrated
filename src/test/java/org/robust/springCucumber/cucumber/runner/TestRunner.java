package org.robust.springCucumber.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",
                 glue = "classpath:org.robust.springCucumber.cucumber",
                    publish = true)                                        //publish is not used in realtime projects
public class TestRunner {
}
