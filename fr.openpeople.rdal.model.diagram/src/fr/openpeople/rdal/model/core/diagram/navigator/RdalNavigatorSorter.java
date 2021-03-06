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
package fr.openpeople.rdal.model.core.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import fr.openpeople.rdal.model.core.diagram.part.RdalVisualIDRegistry;

/**
 * @generated
 */
public class RdalNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RdalNavigatorItem) {
			RdalNavigatorItem item = (RdalNavigatorItem) element;
			return RdalVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
