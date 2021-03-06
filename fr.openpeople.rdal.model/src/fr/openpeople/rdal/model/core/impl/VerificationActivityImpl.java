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

import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.openpeople.rdal.model.core.AbstractRequirement;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.EnumVerificationMethod;
import fr.openpeople.rdal.model.core.VerificationActivity;

import fr.openpeople.rdal.model.core.VerificationMethod;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl#getExternalRef <em>External Ref</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl#isPassed <em>Passed</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationActivityImpl extends IdentifiedElementImpl implements VerificationActivity {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected AbstractRequirement requirement;

	/**
	 * The default value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final VerificationMethod VERIFICATION_METHOD_EDEFAULT = VerificationMethod.TEST;

	/**
	 * The cached value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected VerificationMethod verificationMethod = VERIFICATION_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalRef() <em>External Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> externalRef;

	/**
	 * The default value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected boolean passed = PASSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VERIFICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (AbstractRequirement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(AbstractRequirement newRequirement, NotificationChain msgs) {
		AbstractRequirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(AbstractRequirement newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY, AbstractRequirement.class, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY, AbstractRequirement.class, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationMethod getVerificationMethod() {
		return verificationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationMethod(VerificationMethod newVerificationMethod) {
		VerificationMethod oldVerificationMethod = verificationMethod;
		verificationMethod = newVerificationMethod == null ? VERIFICATION_METHOD_EDEFAULT : newVerificationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__VERIFICATION_METHOD, oldVerificationMethod, verificationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getExternalRef() {
		if (externalRef == null) {
			externalRef = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.VERIFICATION_ACTIVITY__EXTERNAL_REF);
		}
		return externalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassed() {
		return passed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassed(boolean newPassed) {
		boolean oldPassed = passed;
		passed = newPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__PASSED, oldPassed, passed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERIFICATION_ACTIVITY__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VERIFICATION_ACTIVITY__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VERIFICATION_ACTIVITY__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				if (requirement != null)
					msgs = ((InternalEObject)requirement).eInverseRemove(this, CorePackage.ABSTRACT_REQUIREMENT__VERIFIED_BY, AbstractRequirement.class, msgs);
				return basicSetRequirement((AbstractRequirement)otherEnd, msgs);
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
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case CorePackage.VERIFICATION_ACTIVITY__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case CorePackage.VERIFICATION_ACTIVITY__VERIFICATION_METHOD:
				return getVerificationMethod();
			case CorePackage.VERIFICATION_ACTIVITY__EXTERNAL_REF:
				return getExternalRef();
			case CorePackage.VERIFICATION_ACTIVITY__PASSED:
				return isPassed();
			case CorePackage.VERIFICATION_ACTIVITY__EXPRESSION:
				return getExpression();
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
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				setRequirement((AbstractRequirement)newValue);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__VERIFICATION_METHOD:
				setVerificationMethod((VerificationMethod)newValue);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__EXTERNAL_REF:
				getExternalRef().clear();
				getExternalRef().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__PASSED:
				setPassed((Boolean)newValue);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__EXPRESSION:
				setExpression((Expression)newValue);
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
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				setRequirement((AbstractRequirement)null);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__VERIFICATION_METHOD:
				setVerificationMethod(VERIFICATION_METHOD_EDEFAULT);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__EXTERNAL_REF:
				getExternalRef().clear();
				return;
			case CorePackage.VERIFICATION_ACTIVITY__PASSED:
				setPassed(PASSED_EDEFAULT);
				return;
			case CorePackage.VERIFICATION_ACTIVITY__EXPRESSION:
				setExpression((Expression)null);
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
			case CorePackage.VERIFICATION_ACTIVITY__REQUIREMENT:
				return requirement != null;
			case CorePackage.VERIFICATION_ACTIVITY__VERIFICATION_METHOD:
				return verificationMethod != VERIFICATION_METHOD_EDEFAULT;
			case CorePackage.VERIFICATION_ACTIVITY__EXTERNAL_REF:
				return externalRef != null && !externalRef.isEmpty();
			case CorePackage.VERIFICATION_ACTIVITY__PASSED:
				return passed != PASSED_EDEFAULT;
			case CorePackage.VERIFICATION_ACTIVITY__EXPRESSION:
				return expression != null;
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
		result.append(" (verificationMethod: ");
		result.append(verificationMethod);
		result.append(", passed: ");
		result.append(passed);
		result.append(')');
		return result.toString();
	}

} //VerificationActivityImpl
