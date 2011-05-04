package com.highlyrefined.xml.schematron;

import java.io.File;

public class Report extends AbstractDataFile {

	public Report(File file) {
		super(file);
	}

	public void report() throws RuleBrokenException {
		System.out.println("Reporting, sir!");
	}
}
