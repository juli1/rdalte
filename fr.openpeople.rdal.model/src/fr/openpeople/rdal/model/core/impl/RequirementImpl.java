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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.settings.model.settings.Category;
import fr.openpeople.rdal.model.core.Assumption;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.Requirement;
import fr.openpeople.rdal.model.core.RequirementsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.RequirementImpl#getRefinedBY <em>Refined BY</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.RequirementImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.RequirementImpl#getImageAssumption <em>Image Assumption</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.RequirementImpl#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.RequirementImpl#getSubRequirements <em>Sub Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends AbstractRequirementImpl implements Requirement {
	/**
	 * The cached value of the '{@link #getRefinedBY() <em>Refined BY</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBY()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> refinedBY;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getImageAssumption() <em>Image Assumption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAssumption()
	 * @generated
	 * @ordered
	 */
	protected Assumption imageAssumption;

	/**
	 * The cached value of the '{@link #getDerivations() <em>Derivations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> derivations;

	/**
	 * The cached value of the '{@link #getSubRequirements() <em>Sub Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRequirements()
	 * @generated
	 * @ordered
	 */
	protected RequirementsContainer subRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRefinedBY() {
		if (refinedBY == null) {
			refinedBY = new EObjectResolvingEList<Requirement>(Requirement.class, this, CorePackage.REQUIREMENT__REFINED_BY);
		}
		return refinedBY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean getVerified() {
		return getSatisfactionLevel() == null ? null : getSatisfactionLevel() == 1.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectWithInverseResolvingEList<Assumption>(Assumption.class, this, CorePackage.REQUIREMENT__ASSUMPTIONS, CorePackage.ASSUMPTION__REQUIREMENTS);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption getImageAssumption() {
		if (imageAssumption != null && imageAssumption.eIsProxy()) {
			InternalEObject oldImageAssumption = (InternalEObject)imageAssumption;
			imageAssumption = (Assumption)eResolveProxy(oldImageAssumption);
			if (imageAssumption != oldImageAssumption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, oldImageAssumption, imageAssumption));
			}
		}
		return imageAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption basicGetImageAssumption() {
		return imageAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageAssumption(Assumption newImageAssumption, NotificationChain msgs) {
		Assumption oldImageAssumption = imageAssumption;
		imageAssumption = newImageAssumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, oldImageAssumption, newImageAssumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageAssumption(Assumption newImageAssumption) {
		if (newImageAssumption != imageAssumption) {
			NotificationChain msgs = null;
			if (imageAssumption != null)
				msgs = ((InternalEObject)imageAssumption).eInverseRemove(this, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, Assumption.class, msgs);
			if (newImageAssumption != null)
				msgs = ((InternalEObject)newImageAssumption).eInverseAdd(this, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, Assumption.class, msgs);
			msgs = basicSetImageAssumption(newImageAssumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REQUIREMENT__IMAGE_ASSUMPTION, newImageAssumption, newImageAssumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDerivations() {
		if (derivations == null) {
			derivations = new EObjectResolvingEList<Requirement>(Requirement.class, this, CorePackage.REQUIREMENT__DERIVATIONS);
		}
		return derivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsContainer getSubRequirements() {
		return subRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubRequirements(RequirementsContainer newSubRequirements, NotificationChain msgs) {
		RequirementsContainer oldSubRequirements = subRequirements;
		subRequirements = newSubRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REQUIREMENT__SUB_REQUIREMENTS, oldSubRequirements, newSubRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubRequirements(RequirementsContainer newSubRequirements) {
		if (newSubRequirements != subRequirements) {
			NotificationChain msgs = null;
			if (subRequirements != null)
				msgs = ((InternalEObject)subRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.REQUIREMENT__SUB_REQUIREMENTS, null, msgs);
			if (newSubRequirements != null)
				msgs = ((InternalEObject)newSubRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.REQUIREMENT__SUB_REQUIREMENTS, null, msgs);
			msgs = basicSetSubRequirements(newSubRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REQUIREMENT__SUB_REQUIREMENTS, newSubRequirements, newSubRequirements));
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
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssumptions()).basicAdd(otherEnd, msgs);
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				if (imageAssumption != null)
					msgs = ((InternalEObject)imageAssumption).eInverseRemove(this, CorePackage.ASSUMPTION__IMAGE_REQUIREMENT, Assumption.class, msgs);
				return basicSetImageAssumption((Assumption)otherEnd, msgs);
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
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				return basicSetImageAssumption(null, msgs);
			case CorePackage.REQUIREMENT__SUB_REQUIREMENTS:
				return basicSetSubRequirements(null, msgs);
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
			case CorePackage.REQUIREMENT__REFINED_BY:
				return getRefinedBY();
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				return getAssumptions();
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				if (resolve) return getImageAssumption();
				return basicGetImageAssumption();
			case CorePackage.REQUIREMENT__DERIVATIONS:
				return getDerivations();
			case CorePackage.REQUIREMENT__SUB_REQUIREMENTS:
				return getSubRequirements();
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
			case CorePackage.REQUIREMENT__REFINED_BY:
				getRefinedBY().clear();
				getRefinedBY().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				setImageAssumption((Assumption)newValue);
				return;
			case CorePackage.REQUIREMENT__DERIVATIONS:
				getDerivations().clear();
				getDerivations().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CorePackage.REQUIREMENT__SUB_REQUIREMENTS:
				setSubRequirements((RequirementsContainer)newValue);
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
			case CorePackage.REQUIREMENT__REFINED_BY:
				getRefinedBY().clear();
				return;
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				setImageAssumption((Assumption)null);
				return;
			case CorePackage.REQUIREMENT__DERIVATIONS:
				getDerivations().clear();
				return;
			case CorePackage.REQUIREMENT__SUB_REQUIREMENTS:
				setSubRequirements((RequirementsContainer)null);
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
			case CorePackage.REQUIREMENT__REFINED_BY:
				return refinedBY != null && !refinedBY.isEmpty();
			case CorePackage.REQUIREMENT__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case CorePackage.REQUIREMENT__IMAGE_ASSUMPTION:
				return imageAssumption != null;
			case CorePackage.REQUIREMENT__DERIVATIONS:
				return derivations != null && !derivations.isEmpty();
			case CorePackage.REQUIREMENT__SUB_REQUIREMENTS:
				return subRequirements != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementImpl
