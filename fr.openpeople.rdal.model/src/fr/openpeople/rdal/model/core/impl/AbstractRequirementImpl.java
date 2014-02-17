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
package fr.openpeople.rdal.model.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.openpeople.rdal.model.core.AbstractRequirement;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.EnumRiskKind;
import fr.openpeople.rdal.model.core.RequirementsContainer;
import fr.openpeople.rdal.model.core.RequirementsGroup;
import fr.openpeople.rdal.model.core.RiskKind;
import fr.openpeople.rdal.model.core.Variable;
import fr.openpeople.rdal.model.core.VerificationActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getContainedRequirements <em>Contained Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getAssignedVariable <em>Assigned Variable</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl#getConditionVariables <em>Condition Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends VerifiableElementImpl implements AbstractRequirement {
	/**
	 * The cached value of the '{@link #getContainedRequirements() <em>Contained Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRequirement> containedRequirements;

	/**
	 * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationActivity> verifiedBy;

	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final RiskKind RISK_EDEFAULT = RiskKind.MEDIUM;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected RiskKind risk = RISK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedVariable() <em>Assigned Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable assignedVariable;

	/**
	 * The cached value of the '{@link #getConditionVariables() <em>Condition Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> conditionVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRequirement> getContainedRequirements() {
		if (containedRequirements == null) {
			containedRequirements = new EObjectResolvingEList<AbstractRequirement>(AbstractRequirement.class, this, CorePackage.ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS);
		}
		return containedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsGroup getGroup() {
		if (eContainerFeatureID() != CorePackage.ABSTRACT_REQUIREMENT__GROUP) return null;
		return (RequirementsGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(RequirementsGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, CorePackage.ABSTRACT_REQUIREMENT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(RequirementsGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != CorePackage.ABSTRACT_REQUIREMENT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, CorePackage.REQUIREMENTS_GROUP__REQUIREMENTS, RequirementsGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REQUIREMENT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskKind getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(RiskKind newRisk) {
		RiskKind oldRisk = risk;
		risk = newRisk == null ? RISK_EDEFAULT : newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REQUIREMENT__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getAssignedVariable() {
		if (assignedVariable != null && assignedVariable.eIsProxy()) {
			InternalEObject oldAssignedVariable = (InternalEObject)assignedVariable;
			assignedVariable = (Variable)eResolveProxy(oldAssignedVariable);
			if (assignedVariable != oldAssignedVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE, oldAssignedVariable, assignedVariable));
			}
		}
		return assignedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetAssignedVariable() {
		return assignedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedVariable(Variable newAssignedVariable) {
		Variable oldAssignedVariable = assignedVariable;
		assignedVariable = newAssignedVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE, oldAssignedVariable, assignedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getConditionVariables() {
		if (conditionVariables == null) {
			conditionVariables = new EObjectResolvingEList<Variable>(Variable.class, this, CorePackage.ABSTRACT_REQUIREMENT__CONDITION_VARIABLES);
		}
		return conditionVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationActivity> getVerifiedBy() {
		if (verifiedBy == null) {
			verifiedBy = new EObjectWithInverseResolvingEList<VerificationActivity>(VerificationActivity.class, this, CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY, CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT);
		}
		return verifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedBy()).basicAdd(otherEnd, msgs);
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((RequirementsGroup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				return basicSetGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				return eInternalContainer().eInverseRemove(this, CorePackage.REQUIREMENTS_GROUP__REQUIREMENTS, RequirementsGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS:
				return getContainedRequirements();
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return getVerifiedBy();
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				return getGroup();
			case CorePackage.ABSTRACT_REQUIREMENT__RISK:
				return getRisk();
			case CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE:
				if (resolve) return getAssignedVariable();
				return basicGetAssignedVariable();
			case CorePackage.ABSTRACT_REQUIREMENT__CONDITION_VARIABLES:
				return getConditionVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS:
				getContainedRequirements().clear();
				getContainedRequirements().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				getVerifiedBy().addAll((Collection<? extends VerificationActivity>)newValue);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				setGroup((RequirementsGroup)newValue);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__RISK:
				setRisk((RiskKind)newValue);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE:
				setAssignedVariable((Variable)newValue);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__CONDITION_VARIABLES:
				getConditionVariables().clear();
				getConditionVariables().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS:
				getContainedRequirements().clear();
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				getVerifiedBy().clear();
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				setGroup((RequirementsGroup)null);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE:
				setAssignedVariable((Variable)null);
				return;
			case CorePackage.ABSTRACT_REQUIREMENT__CONDITION_VARIABLES:
				getConditionVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS:
				return containedRequirements != null && !containedRequirements.isEmpty();
			case CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY:
				return verifiedBy != null && !verifiedBy.isEmpty();
			case CorePackage.ABSTRACT_REQUIREMENT__GROUP:
				return getGroup() != null;
			case CorePackage.ABSTRACT_REQUIREMENT__RISK:
				return risk != RISK_EDEFAULT;
			case CorePackage.ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE:
				return assignedVariable != null;
			case CorePackage.ABSTRACT_REQUIREMENT__CONDITION_VARIABLES:
				return conditionVariables != null && !conditionVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (risk: ");
		result.append(risk);
		result.append(')');
		return result.toString();
	}

} //AbstractRequirementImpl
