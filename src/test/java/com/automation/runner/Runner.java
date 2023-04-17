package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:FeatureFiles/JobsSiteMap.feature"}, 
glue = { "classpath:com.automation.stepdef"}, 
   monochrome = true,
   publish = true,
		   plugin = { "pretty", 
		   		"html:target_cucumber_html_report",
		   		"json:target_cucumber.json",
		   		"junit:target_cucumber.xml" })
public class Runner{
	
}

		   		// tags=("@Resume"))
