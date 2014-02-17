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

import fr.openpeople.rdal.model.core.Actor;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.SystemContext;

import fr.openpeople.rdal.model.core.Variable;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl#getGlobalSystem <em>Global System</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl#getSystemBoundary <em>System Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl#getSystemModes <em>System Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemContextImpl extends IdentifiedElementImpl implements SystemContext {
	/**
	 * The cached value of the '{@link #getGlobalSystem() <em>Global System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalSystem()
	 * @generated
	 * @ordered
	 */
	protected EObject globalSystem;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;
	/**
	 * The cached value of the '{@link #getSystemBoundary() <em>System Boundary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBoundary()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> systemBoundary;
	/**
	 * The cached value of the '{@link #getSystemModes() <em>System Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> systemModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SYSTEM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGlobalSystem() {
		if (globalSystem != null && globalSystem.eIsProxy()) {
			InternalEObject oldGlobalSystem = (InternalEObject)globalSystem;
			globalSystem = eResolveProxy(oldGlobalSystem);
			if (globalSystem != oldGlobalSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM, oldGlobalSystem, globalSystem));
			}
		}
		return globalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetGlobalSystem() {
		return globalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalSystem(EObject newGlobalSystem) {
		EObject oldGlobalSystem = globalSystem;
		globalSystem = newGlobalSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM, oldGlobalSystem, globalSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectResolvingEList<Actor>(Actor.class, this, CorePackage.SYSTEM_CONTEXT__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSystemBoundary() {
		if (systemBoundary == null) {
			systemBoundary = new EObjectResolvingEList<Variable>(Variable.class, this, CorePackage.SYSTEM_CONTEXT__SYSTEM_BOUNDARY);
		}
		return systemBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSystemModes() {
		if (systemModes == null) {
			systemModes = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.SYSTEM_CONTEXT__SYSTEM_MODES);
		}
		return systemModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM:
				if (resolve) return getGlobalSystem();
				return basicGetGlobalSystem();
			case CorePackage.SYSTEM_CONTEXT__ACTORS:
				return getActors();
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_BOUNDARY:
				return getSystemBoundary();
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_MODES:
				return getSystemModes();
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
			case CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM:
				setGlobalSystem((EObject)newValue);
				return;
			case CorePackage.SYSTEM_CONTEXT__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_BOUNDARY:
				getSystemBoundary().clear();
				getSystemBoundary().addAll((Collection<? extends Variable>)newValue);
				return;
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_MODES:
				getSystemModes().clear();
				getSystemModes().addAll((Collection<? extends EObject>)newValue);
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
			case CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM:
				setGlobalSystem((EObject)null);
				return;
			case CorePackage.SYSTEM_CONTEXT__ACTORS:
				getActors().clear();
				return;
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_BOUNDARY:
				getSystemBoundary().clear();
				return;
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_MODES:
				getSystemModes().clear();
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
			case CorePackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM:
				return globalSystem != null;
			case CorePackage.SYSTEM_CONTEXT__ACTORS:
				return actors != null && !actors.isEmpty();
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_BOUNDARY:
				return systemBoundary != null && !systemBoundary.isEmpty();
			case CorePackage.SYSTEM_CONTEXT__SYSTEM_MODES:
				return systemModes != null && !systemModes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemContextImpl
