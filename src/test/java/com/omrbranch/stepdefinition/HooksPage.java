package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksPage extends BaseClass{
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitwait();
		}
	
	@After
	public void afterScenrio(Scenario scenario) {
	    scenario.attach(screenshot(), "image/png", "Every Scenario Screenshot");
		browserQuit();
	}

}
