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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal.model.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.Goal#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Goal#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends ContractualElement {
	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Conflict}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.Conflict#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getGoal_Conflicts()
	 * @see fr.openpeople.rdal.model.core.Conflict#getGoals
	 * @model opposite="goals"
	 * @generated
	 */
	EList<Conflict> getConflicts();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Float)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getGoal_Priority()
	 * @model dataType="fr.openpeople.rdal.model.core.Ratio" required="true"
	 * @generated
	 */
	Float getPriority();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Goal#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Float value);

} // Goal
