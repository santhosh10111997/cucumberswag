package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources"
,glue="com.stepdefinition",dryRun=false)
//
//,monochrome=true
//,plugin= {"pretty","html:src\\test\\resources\\Reports\\htmlreports",
//		"json:src\\test\\resources\\Reports\\jsonreports\\jsonreports.json",
//		"junit:src\\test\\resources\\Reports\\junitreport\\report.xml",
//		"rerun:src\\test\\resources\\FaildScenarios\\faildscenario.txt"}
//)

public class Runner {
//
//	@AfterClass
//	public static void report() {
//		JvmReport.GeneratejvmReport("src\\test\\resources\\Reports\\jsonreports\\jsonreports.json");
//System.out.println("done");
//	}
}
