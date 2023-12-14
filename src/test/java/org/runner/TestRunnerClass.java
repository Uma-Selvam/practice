package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\CucumberwithRestAssured\\src\\test\\resources\\Sample1.feature",glue="org.step")
public class TestRunnerClass {

}
