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
import fr.labsticc.framework.settings.model.settings.Category;
import fr.openpeople.rdal.model.core.Actor;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal.model.core.ContractReferencedModelElements;
import fr.openpeople.rdal.model.core.ContractualElement;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.Rationale;
import fr.openpeople.rdal.model.core.ReferencedModelElements;
import fr.openpeople.rdal.model.core.StakeHolder;
import fr.openpeople.rdal.model.core.Uncertainty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getChangeUncertainty <em>Change Uncertainty</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getOriginDate <em>Origin Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getScheduleDate <em>Schedule Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getEvolvedTo <em>Evolved To</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getTracedTo <em>Traced To</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#isDropped <em>Dropped</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getDroppingReason <em>Dropping Reason</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getRationales <em>Rationales</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getTimeCriticality <em>Time Criticality</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContractualElementImpl extends IdentifiedElementImpl implements ContractualElement {
	/**
	 * The cached value of the '{@link #getChangeUncertainty() <em>Change Uncertainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUncertainty()
	 * @generated
	 * @ordered
	 */
	protected Uncertainty changeUncertainty;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sources;

	/**
	 * The default value of the '{@link #getOriginDate() <em>Origin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORIGIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginDate() <em>Origin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginDate()
	 * @generated
	 * @ordered
	 */
	protected Date originDate = ORIGIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected Date scheduleDate = SCHEDULE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolder> stakeholders;

	/**
	 * The cached value of the '{@link #getEvolvedTo() <em>Evolved To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractualElement> evolvedTo;

	/**
	 * The cached value of the '{@link #getTracedTo() <em>Traced To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> tracedTo;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencedModelElements> satisfiedBy;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> derivedFrom;

	/**
	 * The default value of the '{@link #isDropped() <em>Dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DROPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDropped() <em>Dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropped()
	 * @generated
	 * @ordered
	 */
	protected boolean dropped = DROPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDroppingReason() <em>Dropping Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppingReason()
	 * @generated
	 * @ordered
	 */
	protected static final String DROPPING_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDroppingReason() <em>Dropping Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppingReason()
	 * @generated
	 * @ordered
	 */
	protected String droppingReason = DROPPING_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Float SATISFACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected Float satisfactionLevel = SATISFACTION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRationales() <em>Rationales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationales()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> rationales;

	/**
	 * The default value of the '{@link #getTimeCriticality() <em>Time Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Float TIME_CRITICALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeCriticality() <em>Time Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCriticality()
	 * @generated
	 * @ordered
	 */
	protected Float timeCriticality = TIME_CRITICALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> contactInformation;

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
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONTRACTUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSatisfactionLevel() {
		return satisfactionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionLevel(Float newSatisfactionLevel) {
		Float oldSatisfactionLevel = satisfactionLevel;
		satisfactionLevel = newSatisfactionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getRationales() {
		if (rationales == null) {
			rationales = new EObjectContainmentWithInverseEList<Rationale>(Rationale.class, this, CorePackage.CONTRACTUAL_ELEMENT__RATIONALES, CorePackage.RATIONALE__CONTRACT);
		}
		return rationales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getTimeCriticality() {
		return timeCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCriticality(Float newTimeCriticality) {
		Float oldTimeCriticality = timeCriticality;
		timeCriticality = newTimeCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY, oldTimeCriticality, timeCriticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty getChangeUncertainty() {
		return changeUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeUncertainty(Uncertainty newChangeUncertainty, NotificationChain msgs) {
		Uncertainty oldChangeUncertainty = changeUncertainty;
		changeUncertainty = newChangeUncertainty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, oldChangeUncertainty, newChangeUncertainty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeUncertainty(Uncertainty newChangeUncertainty) {
		if (newChangeUncertainty != changeUncertainty) {
			NotificationChain msgs = null;
			if (changeUncertainty != null)
				msgs = ((InternalEObject)changeUncertainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
			if (newChangeUncertainty != null)
				msgs = ((InternalEObject)newChangeUncertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
			msgs = basicSetChangeUncertainty(newChangeUncertainty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, newChangeUncertainty, newChangeUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getContactInformation() {
		if (contactInformation == null) {
			contactInformation = new EObjectResolvingEList<Actor>(Actor.class, this, CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION);
		}
		return contactInformation;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONTRACTUAL_ELEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getModes() {
		if (modes == null) {
			modes = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.CONTRACTUAL_ELEMENT__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOriginDate() {
		return originDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginDate(Date newOriginDate) {
		Date oldOriginDate = originDate;
		originDate = newOriginDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE, oldOriginDate, originDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScheduleDate() {
		return scheduleDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDate(Date newScheduleDate) {
		Date oldScheduleDate = scheduleDate;
		scheduleDate = newScheduleDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE, oldScheduleDate, scheduleDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StakeHolder> getStakeholders() {
		if (stakeholders == null) {
			stakeholders = new EObjectWithInverseResolvingEList.ManyInverse<StakeHolder>(StakeHolder.class, this, CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS, CorePackage.STAKE_HOLDER__CONTRACTUAL_ELEMENTS);
		}
		return stakeholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSources() {
		if (sources == null) {
			sources = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CONTRACTUAL_ELEMENT__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencedModelElements> getSatisfiedBy() {
		if (satisfiedBy == null) {
			satisfiedBy = new EObjectContainmentEList<ReferencedModelElements>(ReferencedModelElements.class, this, CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY);
		}
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAgents() {
		// TODO: implement this method to return the 'Agents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.CONTRACTUAL_ELEMENT__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractualElement> getEvolvedTo() {
		if (evolvedTo == null) {
			evolvedTo = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO);
		}
		return evolvedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public ContractualElement basicGetEvolvedTo() {
//		return evolvedTo;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public void setEvolvedTo(ContractualElement newEvolvedTo) {
//		ContractualElement oldEvolvedTo = evolvedTo;
//		evolvedTo = newEvolvedTo;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO, oldEvolvedTo, evolvedTo));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDropped() {
		return dropped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropped(boolean newDropped) {
		boolean oldDropped = dropped;
		dropped = newDropped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__DROPPED, oldDropped, dropped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDroppingReason() {
		return droppingReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroppingReason(String newDroppingReason) {
		String oldDroppingReason = droppingReason;
		droppingReason = newDroppingReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON, oldDroppingReason, droppingReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTracedTo() {
		if (tracedTo == null) {
			tracedTo = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.CONTRACTUAL_ELEMENT__TRACED_TO);
		}
		return tracedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
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
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholders()).basicAdd(otherEnd, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRationales()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return basicSetChangeUncertainty(null, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
				return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				return ((InternalEList<?>)getRationales()).basicRemove(otherEnd, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				return basicSetCondition(null, msgs);
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
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return getChangeUncertainty();
			case CorePackage.CONTRACTUAL_ELEMENT__SOURCES:
				return getSources();
			case CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				return getOriginDate();
			case CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				return getScheduleDate();
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return getStakeholders();
			case CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO:
				return getEvolvedTo();
			case CorePackage.CONTRACTUAL_ELEMENT__TRACED_TO:
				return getTracedTo();
			case CorePackage.CONTRACTUAL_ELEMENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
				return getSatisfiedBy();
			case CorePackage.CONTRACTUAL_ELEMENT__AGENTS:
				return getAgents();
			case CorePackage.CONTRACTUAL_ELEMENT__DERIVED_FROM:
				return getDerivedFrom();
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPED:
				return isDropped();
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON:
				return getDroppingReason();
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				return getRationales();
			case CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY:
				return getTimeCriticality();
			case CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				return getContactInformation();
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
				return getExpression();
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				return getCondition();
			case CorePackage.CONTRACTUAL_ELEMENT__MODES:
				return getModes();
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
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				setChangeUncertainty((Uncertainty)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				setOriginDate((Date)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				setScheduleDate((Date)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends StakeHolder>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO:
				getEvolvedTo().clear();
				getEvolvedTo().addAll((Collection<? extends ContractualElement>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__TRACED_TO:
				getTracedTo().clear();
				getTracedTo().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends ReferencedModelElements>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends EObject>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPED:
				setDropped((Boolean)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON:
				setDroppingReason((String)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				getRationales().clear();
				getRationales().addAll((Collection<? extends Rationale>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY:
				setTimeCriticality((Float)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				getContactInformation().clear();
				getContactInformation().addAll((Collection<? extends Actor>)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends EObject>)newValue);
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
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				setChangeUncertainty((Uncertainty)null);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SOURCES:
				getSources().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				setOriginDate(ORIGIN_DATE_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				setScheduleDate(SCHEDULE_DATE_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO:
				getEvolvedTo().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__TRACED_TO:
				getTracedTo().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CATEGORY:
				setCategory((Category)null);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__AGENTS:
				getAgents().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPED:
				setDropped(DROPPED_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON:
				setDroppingReason(DROPPING_REASON_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				getRationales().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY:
				setTimeCriticality(TIME_CRITICALITY_EDEFAULT);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				getContactInformation().clear();
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__MODES:
				getModes().clear();
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
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return changeUncertainty != null;
			case CorePackage.CONTRACTUAL_ELEMENT__SOURCES:
				return sources != null && !sources.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				return ORIGIN_DATE_EDEFAULT == null ? originDate != null : !ORIGIN_DATE_EDEFAULT.equals(originDate);
			case CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				return SCHEDULE_DATE_EDEFAULT == null ? scheduleDate != null : !SCHEDULE_DATE_EDEFAULT.equals(scheduleDate);
			case CorePackage.CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return stakeholders != null && !stakeholders.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__EVOLVED_TO:
				return evolvedTo != null && !evolvedTo.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__TRACED_TO:
				return tracedTo != null && !tracedTo.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__CATEGORY:
				return category != null;
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
				return satisfiedBy != null && !satisfiedBy.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__AGENTS:
				return !getAgents().isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPED:
				return dropped != DROPPED_EDEFAULT;
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON:
				return DROPPING_REASON_EDEFAULT == null ? droppingReason != null : !DROPPING_REASON_EDEFAULT.equals(droppingReason);
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
				return rationales != null && !rationales.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY:
				return TIME_CRITICALITY_EDEFAULT == null ? timeCriticality != null : !TIME_CRITICALITY_EDEFAULT.equals(timeCriticality);
			case CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				return contactInformation != null && !contactInformation.isEmpty();
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
				return expression != null;
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				return condition != null;
			case CorePackage.CONTRACTUAL_ELEMENT__MODES:
				return modes != null && !modes.isEmpty();
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
		result.append(" (sources: ");
		result.append(sources);
		result.append(", originDate: ");
		result.append(originDate);
		result.append(", scheduleDate: ");
		result.append(scheduleDate);
		result.append(", dropped: ");
		result.append(dropped);
		result.append(", droppingReason: ");
		result.append(droppingReason);
		result.append(", satisfactionLevel: ");
		result.append(satisfactionLevel);
		result.append(", timeCriticality: ");
		result.append(timeCriticality);
		result.append(')');
		return result.toString();
	}

} //ContractualElementImpl
