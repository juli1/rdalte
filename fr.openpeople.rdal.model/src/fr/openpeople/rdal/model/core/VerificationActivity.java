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

import fr.labsticc.framework.constraints.model.constraints.Expression;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.VerificationActivity#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.VerificationActivity#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.VerificationActivity#getExternalRef <em>External Ref</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.VerificationActivity#isPassed <em>Passed</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.VerificationActivity#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity()
 * @model
 * @generated
 */
public interface VerificationActivity extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(AbstractRequirement)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity_Requirement()
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getVerifiedBy
	 * @model opposite="verifiedBy"
	 * @generated
	 */
	AbstractRequirement getRequirement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.VerificationActivity#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(AbstractRequirement value);

	/**
	 * Returns the value of the '<em><b>Verification Method</b></em>' attribute.
	 * The default value is <code>"Test"</code>.
	 * The literals are from the enumeration {@link fr.openpeople.rdal.model.core.VerificationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Method</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.VerificationMethod
	 * @see #setVerificationMethod(VerificationMethod)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity_VerificationMethod()
	 * @model default="Test"
	 * @generated
	 */
	VerificationMethod getVerificationMethod();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.VerificationActivity#getVerificationMethod <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Method</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.VerificationMethod
	 * @see #getVerificationMethod()
	 * @generated
	 */
	void setVerificationMethod(VerificationMethod value);

	/**
	 * Returns the value of the '<em><b>External Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity_ExternalRef()
	 * @model
	 * @generated
	 */
	EList<EObject> getExternalRef();

	/**
	 * Returns the value of the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed</em>' attribute.
	 * @see #setPassed(boolean)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity_Passed()
	 * @model required="true"
	 * @generated
	 */
	boolean isPassed();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.VerificationActivity#isPassed <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passed</em>' attribute.
	 * @see #isPassed()
	 * @generated
	 */
	void setPassed(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVerificationActivity_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.VerificationActivity#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // VerificationActivity
