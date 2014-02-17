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
package fr.labsticc.framework.constraints.service;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.core.exception.ResourceAccessException;

public interface IConstraintPersistenceAS {

		EObject persistEntity( 	final String p_entityId, 
								final EObject p_constraint )
		throws ResourceAccessException;

		EObject readEntity( final String p_entityId ) 
		throws ResourceAccessException;
}
