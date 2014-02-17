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
package fr.openpeople.rdal.ide;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;

import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.service.IConstraintInterpretationAS;
import fr.labsticc.framework.constraints.service.IConstraintPersistenceAS;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.ide.viewpart.IViewPageBusinessDelegate;
import fr.openpeople.rdal.ide.view.traceability.IDEReqTraceabilityBusinessDelegate;
import fr.openpeople.rdal.service.IRequirementBusinessDelegate;
import fr.openpeople.rdal.service.IRequirementsTraceabilityBusinessDelegate;

public class RadlBusinessDelegateFactory {

	private static final RadlBusinessDelegateFactory instance = new RadlBusinessDelegateFactory();
	
	private final Collection<IViewPageBusinessDelegate> businessDelegates;
	
	private RadlBusinessDelegateFactory() {
		businessDelegates = new ArrayList<IViewPageBusinessDelegate>();
	}
	
	public static RadlBusinessDelegateFactory getInstance() {
		return instance;
	}
	
	

	
	

}
