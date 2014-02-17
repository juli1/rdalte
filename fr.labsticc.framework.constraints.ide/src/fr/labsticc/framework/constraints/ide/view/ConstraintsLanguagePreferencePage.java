/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.labsticc.framework.constraints.ide.view;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.slf4j.LoggerFactory;

import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.core.IResourceHandler;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.emf.core.resource.BundleEMFResourceHandler;
import fr.labsticc.framework.ide.log.DialogExceptionHandler;
import fr.labsticc.framework.ide.util.EditorUtil;

public class ConstraintsLanguagePreferencePage extends AbstractPreferencePage {
	
	private StringFieldEditor locationField;
	
	private final IResourceHandler resourceHandler;
	
	private final IExceptionHandler exceptionHandler;
	
	public ConstraintsLanguagePreferencePage() {
		setPreferenceStore( ConstraintsIDEPlugin.getDefault().getPreferenceStore() );
		locationField = null;
		resourceHandler = new BundleEMFResourceHandler();
		exceptionHandler = new DialogExceptionHandler( LoggerFactory.getLogger( getClass() ) );
	}

	@Override
	protected void addFields( final Composite p_parent ) {
		final Group group = new Group( p_parent, SWT.NONE );
		group.setText( "Constraint Languages Defaults" );
		group.setLayout( new GridLayout( 1, false ) );
		GridData gridData = new GridData( GridData.FILL_HORIZONTAL );
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData( gridData );
		
		locationField = new StringFieldEditor(	IConstraintsPreferenceConstants.DEFAULT_CONSTRAINTS_LANG_MODEL_LOCATION,
														"Model Location", 
														group ); 
		locationField.getTextControl( group ).setEditable( false );
//			@Override
//			protected String changePressed() {
//				final EMFResourceSelectionDialog dialog = new EMFResourceSelectionDialog( 	getShell(),
//																							"Select Constaints Languages Model",
//																							SWT.OPEN | SWT.SINGLE,
//																							null, 
//																							false,
//																							getStringValue() );
//				
//				if ( Window.OK == dialog.open() ) {
//					return dialog.getURIText();
//				}
//
//				return null;
//			}
//		};
		
		addField( locationField );
		
		final Button editButton = new Button( group, SWT.NULL );
		editButton.setText( "Open Model" );
		editButton.addSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected( final SelectionEvent p_evt ) {
				try {
					EditorUtil.openEditor( locationField.getStringValue(), resourceHandler );
					// TODO: Close automatically.
				}
				catch ( final Throwable p_th  ) {
					exceptionHandler.handleException( p_th, null );
				}
			}
			
			@Override
			public void widgetDefaultSelected( final SelectionEvent p_evt ) {
			}
		} );
	}

	public static void initDefaults( final IPreferenceStore p_store ) {
		p_store.setDefault( IConstraintsPreferenceConstants.DEFAULT_CONSTRAINTS_LANG_MODEL_LOCATION,
							ConstraintsIDEPlugin.getDefault().getDefaultConstraintLanguagesModelLocation() );
	}

	@Override
	protected void initHelp() {
		// TODO Auto-generated method stub
		
	}
}
