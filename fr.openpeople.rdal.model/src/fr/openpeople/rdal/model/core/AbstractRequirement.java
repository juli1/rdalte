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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getContainedRequirements <em>Contained Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getRisk <em>Risk</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getAssignedVariable <em>Assigned Variable</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.AbstractRequirement#getConditionVariables <em>Condition Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirement extends VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Contained Requirements</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.AbstractRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Requirements</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_ContainedRequirements()
	 * @model
	 * @generated
	 */
	EList<AbstractRequirement> getContainedRequirements();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.RequirementsGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(RequirementsGroup)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_Group()
	 * @see fr.openpeople.rdal.model.core.RequirementsGroup#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	RequirementsGroup getGroup();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(RequirementsGroup value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute.
	 * The default value is <code>"Medium"</code>.
	 * The literals are from the enumeration {@link fr.openpeople.rdal.model.core.RiskKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.RiskKind
	 * @see #setRisk(RiskKind)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_Risk()
	 * @model default="Medium"
	 * @generated
	 */
	RiskKind getRisk();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getRisk <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.RiskKind
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(RiskKind value);

	/**
	 * Returns the value of the '<em><b>Assigned Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Variable</em>' reference.
	 * @see #setAssignedVariable(Variable)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_AssignedVariable()
	 * @model
	 * @generated
	 */
	Variable getAssignedVariable();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getAssignedVariable <em>Assigned Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Variable</em>' reference.
	 * @see #getAssignedVariable()
	 * @generated
	 */
	void setAssignedVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Condition Variables</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Variables</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_ConditionVariables()
	 * @model
	 * @generated
	 */
	EList<Variable> getConditionVariables();

	/**
	 * Returns the value of the '<em><b>Verified By</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.VerificationActivity}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.VerificationActivity#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified By</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getAbstractRequirement_VerifiedBy()
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	EList<VerificationActivity> getVerifiedBy();

} // AbstractRequirement
