/*
 * generated by Xtext 2.35.0
 */
package de.htwdd.sf.beleg.s83765s83768.ui;

import com.google.inject.Injector;
import de.htwdd.sf.beleg.s83765s83768.ui.internal.S83765s83768Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(S83765s83768Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		S83765s83768Activator activator = S83765s83768Activator.getInstance();
		return activator != null ? activator.getInjector(S83765s83768Activator.DE_HTWDD_SF_BELEG_S83765S83768_DSL) : null;
	}

}