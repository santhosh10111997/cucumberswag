package com.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}
public static void GeneratejvmReport(String json) {
	File loc =new File(System.getProperty("user.dir")+"\\src\\test\\resource\\reports\\jvmreport");

	Configuration con=new Configuration(loc, "swagLabs");
	con.addClassifications("browser name", "chrome");
	con.addClassifications("version", "107");
	con.addClassifications("os name ", "windows10");
	//report build
	List<String> jsf=new LinkedList<String>();
	jsf.add(json);
	ReportBuilder r= new ReportBuilder(jsf, con);
	r.generateReports();
	
}
}
