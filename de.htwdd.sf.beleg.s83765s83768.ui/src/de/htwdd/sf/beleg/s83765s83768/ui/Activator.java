package de.htwdd.sf.beleg.s83765s83768.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import com.google.inject.Injector;

public class Activator extends AbstractUIPlugin {

    private static Activator INSTANCE;
    private Injector injector;

    public static Activator getDefault() {
        return INSTANCE;
    }

    public Injector getInjector() {
        return injector;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        INSTANCE = null;
        super.stop(context);
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }
}