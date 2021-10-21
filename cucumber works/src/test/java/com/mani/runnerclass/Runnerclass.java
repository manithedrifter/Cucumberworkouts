package com.mani.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\workspace\\cucumber works\\Featurefiles\\InstagramLoginpageWitheEXAMPLEdatatabel.feature", glue= "com/mani/stepdefinition")
public class Runnerclass {

}
