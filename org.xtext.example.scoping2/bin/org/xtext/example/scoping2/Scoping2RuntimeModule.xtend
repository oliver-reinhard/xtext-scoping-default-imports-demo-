/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.scoping2

import com.google.inject.Binder
import com.google.inject.name.Names
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.xtext.example.scoping2.scoping.BookImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class Scoping2RuntimeModule extends AbstractScoping2RuntimeModule {
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
		.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(BookImportedNamespaceAwareLocalScopeProvider);
	}
}
