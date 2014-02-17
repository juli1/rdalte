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

import fr.labsticc.framework.settings.model.settings.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.Requirement#getRefinedBY <em>Refined BY</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Requirement#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Requirement#getImageAssumption <em>Image Assumption</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Requirement#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Requirement#getSubRequirements <em>Sub Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends AbstractRequirement {
	/**
	 * Returns the value of the '<em><b>Refined BY</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined BY</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined BY</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement_RefinedBY()
	 * @model
	 * @generated
	 */
	EList<Requirement> getRefinedBY();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Assumption}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.Assumption#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement_Assumptions()
	 * @see fr.openpeople.rdal.model.core.Assumption#getRequirements
	 * @model opposite="requirements"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Image Assumption</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.Assumption#getImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Assumption</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Assumption</em>' reference.
	 * @see #setImageAssumption(Assumption)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement_ImageAssumption()
	 * @see fr.openpeople.rdal.model.core.Assumption#getImageRequirement
	 * @model opposite="imageRequirement"
	 * @generated
	 */
	Assumption getImageAssumption();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Requirement#getImageAssumption <em>Image Assumption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Assumption</em>' reference.
	 * @see #getImageAssumption()
	 * @generated
	 */
	void setImageAssumption(Assumption value);

	/**
	 * Returns the value of the '<em><b>Derivations</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivations</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement_Derivations()
	 * @model
	 * @generated
	 */
	EList<Requirement> getDerivations();

	/**
	 * Returns the value of the '<em><b>Sub Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Requirements</em>' containment reference.
	 * @see #setSubRequirements(RequirementsContainer)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirement_SubRequirements()
	 * @model containment="true"
	 * @generated
	 */
	RequirementsContainer getSubRequirements();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Requirement#getSubRequirements <em>Sub Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Requirements</em>' containment reference.
	 * @see #getSubRequirements()
	 * @generated
	 */
	void setSubRequirements(RequirementsContainer value);

} // Requirement
