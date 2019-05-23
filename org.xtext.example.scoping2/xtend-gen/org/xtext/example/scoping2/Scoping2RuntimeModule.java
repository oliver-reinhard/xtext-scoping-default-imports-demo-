/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.scoping2;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.example.scoping2.AbstractScoping2RuntimeModule;
import org.xtext.example.scoping2.scoping.BookImportedNamespaceAwareLocalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class Scoping2RuntimeModule extends AbstractScoping2RuntimeModule {
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(BookImportedNamespaceAwareLocalScopeProvider.class);
  }
}
