/*
 * generated by Xtext 2.34.0
 */
package de.htwdd.sf.beleg.s83765s83768;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	public static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
