package com.highlyrefined.xml.schematron.mojo;

import java.util.Set;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.highlyrefined.xml.schematron.Rule;

/**
 * 
 * @author mike
 * @goal generate
 */
public class SchematronMojo extends AbstractMojo {

	/**
	 * @parameter
	 * 
	 */
	private final Set<Rule> schematronRules;

	public SchematronMojo(Set<Rule> schematronRules) {
		super();
		this.schematronRules = schematronRules;
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		for (Rule r : schematronRules) {
			r.generateRule();
			r.report();
			r.validate();
		}
	}

}
