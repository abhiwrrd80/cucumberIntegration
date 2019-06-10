package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/exercise1.feature", glue="cucumberProject" , plugin="json:C:\\Users\\training_c2a.05.01\\Desktop\\JAVA\\Day 3\\cucumberProject\\jsonreports.json"
                                                )
public class Runner {

	
	
}
