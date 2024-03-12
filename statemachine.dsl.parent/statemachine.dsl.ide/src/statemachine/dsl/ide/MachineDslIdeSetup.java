/*
 * generated by Xtext 2.31.0
 */
package statemachine.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import statemachine.dsl.MachineDslRuntimeModule;
import statemachine.dsl.MachineDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MachineDslIdeSetup extends MachineDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MachineDslRuntimeModule(), new MachineDslIdeModule()));
	}
	
}