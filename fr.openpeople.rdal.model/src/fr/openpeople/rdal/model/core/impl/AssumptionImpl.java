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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.openpeople.rdal.model.core.Assumption;
import fr.openpeople.rdal.model.core.AssumptionType;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.EnumAssumptionType;
import fr.openpeople.rdal.model.core.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AssumptionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AssumptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.AssumptionImpl#getImageRequirement <em>Image Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssumptionImpl extends AbstractRequirementImpl implements Assumption {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirements;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AssumptionType TYPE_EDEFAULT = AssumptionType.TECHNICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AssumptionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageRequirement() <em>Image Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement imageRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ASSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRequirements() {
		if (requirements != null && requirements.eIsProxy()) {
			InternalEObject oldRequirements = (InternalEObject)requirements;
			requirements = (Requirement)eResolveProxy(oldRequirements);
			if (requirements != oldRequirements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ASSUMPTION__REQUIREMENTS, oldRequirements, requirements));
			}
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(Requirement newRequirements, NotificationChain msgs) {
		Requirement oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ASSUMPTION__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(Requirement newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, CorePackage.REQUIREMENT__ASSUMPTIONS, Requirement.class, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, CorePackage.REQUIREMENT__ASSUMPTIONS, Requirement.class, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASSUMPTION__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssumptionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AssumptionType newType) {
		AssumptionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASSUMPTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getImageRequirement() {
		if (imageRequirement != null && imageRequirement.eIsProxy()) {
			InternalEObject oldImageRequirement = (InternalEObject)imageRequirement;
			imageRequirement = (Requirement)eResolveProxy(oldImageRequirement);
			if (imageRequirement != oldImageRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, oldImageRequirement, imageRequirement));
			}
		}
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetImageRequirement() {
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageRequirement(Requirement newImageRequirement, NotificationChain msgs) {
		Requirement oldImageRequirement = imageRequirement;
		imageRequirement = newImageRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, oldImageRequirement, newImageRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageRequirement(Requirement newImageRequirement) {
		if (newImageRequirement != imageRequirement) {
			NotificationChain msgs = null;
			if (imageRequirement != null)
				msgs = ((InternalEObject)imageRequirement).eInverseRemove(this, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, Requirement.class, msgs);
			if (newImageRequirement != null)
				msgs = ((InternalEObject)newImageRequirement).eInverseAdd(this, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, Requirement.class, msgs);
			msgs = basicSetImageRequirement(newImageRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, newImageRequirement, newImageRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				if (requirements != null)
					msgs = ((InternalEObject)requirements).eInverseRemove(this, CorePackage.REQUIREMENT__ASSUMPTIONS, Requirement.class, msgs);
				return basicSetRequirements((Requirement)otherEnd, msgs);
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				if (imageRequirement != null)
					msgs = ((InternalEObject)imageRequirement).eInverseRemove(this, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, Requirement.class, msgs);
				return basicSetImageRequirement((Requirement)otherEnd, msgs);
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
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				return basicSetImageRequirement(null, msgs);
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
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case CorePackage.ASSUMPTION__TYPE:
				return getType();
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				if (resolve) return getImageRequirement();
				return basicGetImageRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				setRequirements((Requirement)newValue);
				return;
			case CorePackage.ASSUMPTION__TYPE:
				setType((AssumptionType)newValue);
				return;
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				setImageRequirement((Requirement)newValue);
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
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				setRequirements((Requirement)null);
				return;
			case CorePackage.ASSUMPTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				setImageRequirement((Requirement)null);
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
			case CorePackage.ASSUMPTION__REQUIREMENTS:
				return requirements != null;
			case CorePackage.ASSUMPTION__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.ASSUMPTION__IMAGE_REQUIREMENT:
				return imageRequirement != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AssumptionImpl
