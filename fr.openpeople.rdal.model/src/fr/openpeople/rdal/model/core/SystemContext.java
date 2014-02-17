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
 * A representation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.SystemContext#getGlobalSystem <em>Global System</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.SystemContext#getActors <em>Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.SystemContext#getSystemBoundary <em>System Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.SystemContext#getSystemModes <em>System Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getSystemContext()
 * @model
 * @generated
 */
public interface SystemContext extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Global System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global System</em>' reference.
	 * @see #setGlobalSystem(EObject)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getSystemContext_GlobalSystem()
	 * @model required="true"
	 * @generated
	 */
	EObject getGlobalSystem();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.SystemContext#getGlobalSystem <em>Global System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global System</em>' reference.
	 * @see #getGlobalSystem()
	 * @generated
	 */
	void setGlobalSystem(EObject value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getSystemContext_Actors()
	 * @model
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>System Boundary</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Boundary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Boundary</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getSystemContext_SystemBoundary()
	 * @model required="true"
	 * @generated
	 */
	EList<Variable> getSystemBoundary();

	/**
	 * Returns the value of the '<em><b>System Modes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Modes</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getSystemContext_SystemModes()
	 * @model
	 * @generated
	 */
	EList<EObject> getSystemModes();

} // SystemContext
