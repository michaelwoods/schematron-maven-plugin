package com.highlyrefined.xml.schematron;

import java.io.File;

public abstract class AbstractDataFile {

	private final File file;

	public AbstractDataFile(File file) {
		super();
		this.file = file;
	}

	public File getFile() {
		return file;
	}

}
