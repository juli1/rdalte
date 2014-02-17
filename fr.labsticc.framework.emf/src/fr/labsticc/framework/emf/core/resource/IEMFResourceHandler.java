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
package fr.labsticc.framework.emf.core.resource;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.Resource;

import fr.labsticc.framework.core.exception.ResourceAccessException;

public interface IEMFResourceHandler {

	Resource loadResource( IResource p_resource ) 
	throws ResourceAccessException;
	
	boolean handlesResource( final IResource p_resource );
}