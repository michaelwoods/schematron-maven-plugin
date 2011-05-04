package com.highlyrefined.xml.schematron;

import java.io.File;

public class Validate extends AbstractDataFile {

	public Validate(File file) {
		super(file);
	}

	public void validate() throws RuleBrokenException {
		System.out.println("Yo dawg, I heard you like validation, so we put a validate() in your Validate.class");
	}
}
