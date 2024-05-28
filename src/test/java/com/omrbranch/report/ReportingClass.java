package com.omrbranch.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass extends BaseClass{

public static  void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		
		File file= new File(getProjectPath()+getPropertyFileValue("jvmPath"));
		
		Configuration config =new Configuration(file, "OMR Branch Hotel Booking");
		
        config.addClassifications("Browser", "Chrome");		
        config.addClassifications("Browser Version", "124.0.6367.158");
        config.addClassifications("OS", "WIN 11");
        
        
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonFile);
        
        
        ReportBuilder builder =new ReportBuilder(jsonFiles, config);
	    builder.generateReports();
	
	}
	
}
