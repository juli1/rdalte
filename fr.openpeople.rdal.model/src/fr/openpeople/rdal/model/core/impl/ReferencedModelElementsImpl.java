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

import fr.openpeople.rdal.model.core.AgregationType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal.model.core.ModelElementReference;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.ReferencedModelElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Model Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl#getModelElementReferences <em>Model Element References</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl#getAgregationType <em>Agregation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReferencedModelElementsImpl extends IdentifiedElementImpl implements ReferencedModelElements {
	/**
	 * The cached value of the '{@link #getModelElementReferences() <em>Model Element References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElementReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElementReference> modelElementReferences;

	/**
	 * The default value of the '{@link #getAgregationType() <em>Agregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AgregationType AGREGATION_TYPE_EDEFAULT = AgregationType.COMPOSITION;
	/**
	 * The cached value of the '{@link #getAgregationType() <em>Agregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregationType()
	 * @generated
	 * @ordered
	 */
	protected AgregationType agregationType = AGREGATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedModelElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REFERENCED_MODEL_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElementReference> getModelElementReferences() {
		if (modelElementReferences == null) {
			modelElementReferences = new EObjectContainmentWithInverseEList<ModelElementReference>(ModelElementReference.class, this, CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES, CorePackage.MODEL_ELEMENT_REFERENCE__PARENT);
		}
		return modelElementReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationType getAgregationType() {
		return agregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgregationType(AgregationType newAgregationType) {
		AgregationType oldAgregationType = agregationType;
		agregationType = newAgregationType == null ? AGREGATION_TYPE_EDEFAULT : newAgregationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE, oldAgregationType, agregationType));
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelElementReferences()).basicAdd(otherEnd, msgs);
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				return ((InternalEList<?>)getModelElementReferences()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				return getModelElementReferences();
			case CorePackage.REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE:
				return getAgregationType();
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				getModelElementReferences().clear();
				getModelElementReferences().addAll((Collection<? extends ModelElementReference>)newValue);
				return;
			case CorePackage.REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE:
				setAgregationType((AgregationType)newValue);
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				getModelElementReferences().clear();
				return;
			case CorePackage.REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE:
				setAgregationType(AGREGATION_TYPE_EDEFAULT);
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
			case CorePackage.REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES:
				return modelElementReferences != null && !modelElementReferences.isEmpty();
			case CorePackage.REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE:
				return agregationType != AGREGATION_TYPE_EDEFAULT;
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
		result.append(" (agregationType: ");
		result.append(agregationType);
		result.append(')');
		return result.toString();
	}

} //ReferencedModelElementsImpl
