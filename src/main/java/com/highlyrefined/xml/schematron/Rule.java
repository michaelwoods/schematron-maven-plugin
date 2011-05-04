package com.highlyrefined.xml.schematron;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Rule {

	private File rule;
	private File generatedRule;
	private final Set<Report> reports = new HashSet<Report>();
	private final Set<Validate> validates = new HashSet<Validate>();

	@SuppressWarnings("unused")
	private Rule() {
	}

	public Rule(File rule) {
		this.rule = rule;
	}

	public void generateRule() {
		System.out.println("Generating rule...");
	}

	public void report() {
		try {
			for (Report r : reports) {
				r.report();
			}
		} catch (RuleBrokenException e) {
			System.err.println(e.getMessage());
		}
	}

	public void validate() {
		try {
			for (Validate v : validates) {
				v.validate();
			}
		} catch (RuleBrokenException e) {
			System.err.println(e.getMessage());
		}
	}
}
