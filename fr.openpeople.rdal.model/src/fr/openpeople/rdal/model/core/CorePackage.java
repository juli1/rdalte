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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal.model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///www.open-people.fr/rdal/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = fr.openpeople.rdal.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.IdentifiedElementImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.ContractualElementImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getContractualElement()
	 * @generated
	 */
	int CONTRACTUAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__SOURCES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__ORIGIN_DATE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__SCHEDULE_DATE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__STAKEHOLDERS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__EVOLVED_TO = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__TRACED_TO = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__CATEGORY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__SATISFIED_BY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__AGENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__DERIVED_FROM = IDENTIFIED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__DROPPED = IDENTIFIED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__DROPPING_REASON = IDENTIFIED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__RATIONALES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__TIME_CRITICALITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__CONTACT_INFORMATION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__EXPRESSION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__CONDITION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT__MODES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Contractual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACTUAL_ELEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.VerifiableElementImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerifiableElement()
	 * @generated
	 */
	int VERIFIABLE_ELEMENT = 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.SpecificationImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 13;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RequirementImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 14;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.AssumptionImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 15;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.VerificationActivityImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerificationActivity()
	 * @generated
	 */
	int VERIFICATION_ACTIVITY = 16;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.StakeHolderImpl <em>Stake Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.StakeHolderImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getStakeHolder()
	 * @generated
	 */
	int STAKE_HOLDER = 11;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsGroupImpl <em>Requirements Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RequirementsGroupImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsGroup()
	 * @generated
	 */
	int REQUIREMENTS_GROUP = 12;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.ActorImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 7;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl <em>Referenced Model Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getReferencedModelElements()
	 * @generated
	 */
	int REFERENCED_MODEL_ELEMENTS = 19;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RefExpressionCollectedModelElementsImpl <em>Ref Expression Collected Model Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RefExpressionCollectedModelElementsImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefExpressionCollectedModelElements()
	 * @generated
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS = 17;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RefUserSelectedModelElementsImpl <em>Ref User Selected Model Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RefUserSelectedModelElementsImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefUserSelectedModelElements()
	 * @generated
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS = 18;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.ModelElementReferenceImpl <em>Model Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.ModelElementReferenceImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getModelElementReference()
	 * @generated
	 */
	int MODEL_ELEMENT_REFERENCE = 20;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.TraceImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 21;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.TraceModelElementReferenceImpl <em>Trace Model Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.TraceModelElementReferenceImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getTraceModelElementReference()
	 * @generated
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE = 22;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsCoverageDataImpl <em>Requirements Coverage Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RequirementsCoverageDataImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsCoverageData()
	 * @generated
	 */
	int REQUIREMENTS_COVERAGE_DATA = 23;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.VariableImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 24;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RefDerivedModelElementsImpl <em>Ref Derived Model Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RefDerivedModelElementsImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefDerivedModelElements()
	 * @generated
	 */
	int REF_DERIVED_MODEL_ELEMENTS = 25;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RationaleImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 26;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsContainerImpl <em>Requirements Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.RequirementsContainerImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsContainer()
	 * @generated
	 */
	int REQUIREMENTS_CONTAINER = 27;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.GoalImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 9;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.UncertaintyImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getUncertainty()
	 * @generated
	 */
	int UNCERTAINTY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Volatility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__VOLATILITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Costs Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__COSTS_IMPACT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__SCHEDULE_IMPACT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__PRECEDENCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__RISK_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prop Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__PROP_RISK_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maturity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__MATURITY_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__ID = CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__NAME = CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__CHANGE_UNCERTAINTY = CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__SOURCES = CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__ORIGIN_DATE = CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__SCHEDULE_DATE = CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__STAKEHOLDERS = CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__EVOLVED_TO = CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__TRACED_TO = CONTRACTUAL_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__SATISFIED_BY = CONTRACTUAL_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__AGENTS = CONTRACTUAL_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__DERIVED_FROM = CONTRACTUAL_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__DROPPED = CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__DROPPING_REASON = CONTRACTUAL_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__SATISFACTION_LEVEL = CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__RATIONALES = CONTRACTUAL_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__TIME_CRITICALITY = CONTRACTUAL_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__CONTACT_INFORMATION = CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__EXPRESSION = CONTRACTUAL_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__CONDITION = CONTRACTUAL_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__MODES = CONTRACTUAL_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__VERIFIED = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ID = VERIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = VERIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESCRIPTION = VERIFIABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHANGE_UNCERTAINTY = VERIFIABLE_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SOURCES = VERIFIABLE_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ORIGIN_DATE = VERIFIABLE_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SCHEDULE_DATE = VERIFIABLE_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__STAKEHOLDERS = VERIFIABLE_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EVOLVED_TO = VERIFIABLE_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TRACED_TO = VERIFIABLE_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CATEGORY = VERIFIABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SATISFIED_BY = VERIFIABLE_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__AGENTS = VERIFIABLE_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DERIVED_FROM = VERIFIABLE_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DROPPED = VERIFIABLE_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DROPPING_REASON = VERIFIABLE_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SATISFACTION_LEVEL = VERIFIABLE_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__RATIONALES = VERIFIABLE_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__TIME_CRITICALITY = VERIFIABLE_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTACT_INFORMATION = VERIFIABLE_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EXPRESSION = VERIFIABLE_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONDITION = VERIFIABLE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MODES = VERIFIABLE_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERIFIED = VERIFIABLE_ELEMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ACTORS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Syst Overview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SYST_OVERVIEW = VERIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__REQUIREMENT_GROUPS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verification Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERIFICATION_ACTIVITIES = VERIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONFLICTS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint Languages Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONSTRAINT_LANGUAGES_SPECIFICATION = VERIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPECIFIES = VERIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Primary Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PRIMARY_ACTORS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERSION = VERIFIABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = VERIFIABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.SystemOverviewImpl <em>System Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.SystemOverviewImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSystemOverview()
	 * @generated
	 */
	int SYSTEM_OVERVIEW = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__ID = CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__NAME = CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CHANGE_UNCERTAINTY = CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SOURCES = CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__ORIGIN_DATE = CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SCHEDULE_DATE = CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__STAKEHOLDERS = CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__EVOLVED_TO = CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__TRACED_TO = CONTRACTUAL_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SATISFIED_BY = CONTRACTUAL_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__AGENTS = CONTRACTUAL_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DERIVED_FROM = CONTRACTUAL_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DROPPED = CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DROPPING_REASON = CONTRACTUAL_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SATISFACTION_LEVEL = CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__RATIONALES = CONTRACTUAL_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__TIME_CRITICALITY = CONTRACTUAL_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CONTACT_INFORMATION = CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__EXPRESSION = CONTRACTUAL_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CONDITION = CONTRACTUAL_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__MODES = CONTRACTUAL_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__GOALS = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System To Be</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SYSTEM_TO_BE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CONTEXTS = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Boundary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SYSTEM_BOUNDARY = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__PURPOSE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CAPABILITIES = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl <em>System Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.SystemContextImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSystemContext()
	 * @generated
	 */
	int SYSTEM_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Global System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__GLOBAL_SYSTEM = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ACTORS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Boundary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SYSTEM_BOUNDARY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SYSTEM_MODES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IMAGES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTERACTIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ADDRESS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EMAIL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PHONE_NUMBER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.InteractionImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENTITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DIRECTION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CHANGE_UNCERTAINTY = CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SOURCES = CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ORIGIN_DATE = CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SCHEDULE_DATE = CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STAKEHOLDERS = CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EVOLVED_TO = CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TRACED_TO = CONTRACTUAL_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SATISFIED_BY = CONTRACTUAL_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__AGENTS = CONTRACTUAL_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DERIVED_FROM = CONTRACTUAL_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DROPPED = CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DROPPING_REASON = CONTRACTUAL_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SATISFACTION_LEVEL = CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RATIONALES = CONTRACTUAL_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TIME_CRITICALITY = CONTRACTUAL_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTACT_INFORMATION = CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXPRESSION = CONTRACTUAL_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONDITION = CONTRACTUAL_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MODES = CONTRACTUAL_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFLICTS = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PRIORITY = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.impl.ConflictImpl
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__GOALS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__DEGREE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__ID = ACTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__DESCRIPTION = ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__IMAGES = ACTOR__IMAGES;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__INTERACTIONS = ACTOR__INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__ADDRESS = ACTOR__ADDRESS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__EMAIL = ACTOR__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__PHONE_NUMBER = ACTOR__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Contractual Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__CONTRACTUAL_ELEMENTS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER__RATIONALES = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stake Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__ID = VERIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__NAME = VERIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__DESCRIPTION = VERIFIABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CHANGE_UNCERTAINTY = VERIFIABLE_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SOURCES = VERIFIABLE_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__ORIGIN_DATE = VERIFIABLE_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SCHEDULE_DATE = VERIFIABLE_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__STAKEHOLDERS = VERIFIABLE_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__EVOLVED_TO = VERIFIABLE_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__TRACED_TO = VERIFIABLE_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CATEGORY = VERIFIABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SATISFIED_BY = VERIFIABLE_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__AGENTS = VERIFIABLE_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__DERIVED_FROM = VERIFIABLE_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__DROPPED = VERIFIABLE_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__DROPPING_REASON = VERIFIABLE_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SATISFACTION_LEVEL = VERIFIABLE_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__RATIONALES = VERIFIABLE_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__TIME_CRITICALITY = VERIFIABLE_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CONTACT_INFORMATION = VERIFIABLE_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__EXPRESSION = VERIFIABLE_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CONDITION = VERIFIABLE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__MODES = VERIFIABLE_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__VERIFIED = VERIFIABLE_ELEMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__REQUIREMENTS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SPECIFICATION = VERIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP_FEATURE_COUNT = VERIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ID = VERIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__NAME = VERIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DESCRIPTION = VERIFIABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY = VERIFIABLE_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SOURCES = VERIFIABLE_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ORIGIN_DATE = VERIFIABLE_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SCHEDULE_DATE = VERIFIABLE_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__STAKEHOLDERS = VERIFIABLE_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__EVOLVED_TO = VERIFIABLE_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TRACED_TO = VERIFIABLE_ELEMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CATEGORY = VERIFIABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SATISFIED_BY = VERIFIABLE_ELEMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__AGENTS = VERIFIABLE_ELEMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DERIVED_FROM = VERIFIABLE_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DROPPED = VERIFIABLE_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DROPPING_REASON = VERIFIABLE_ELEMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL = VERIFIABLE_ELEMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__RATIONALES = VERIFIABLE_ELEMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TIME_CRITICALITY = VERIFIABLE_ELEMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CONTACT_INFORMATION = VERIFIABLE_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__EXPRESSION = VERIFIABLE_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CONDITION = VERIFIABLE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__MODES = VERIFIABLE_ELEMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__VERIFIED = VERIFIABLE_ELEMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Contained Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS = VERIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__VERIFIED_BY = VERIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__GROUP = VERIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__RISK = VERIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigned Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE = VERIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Condition Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CONDITION_VARIABLES = VERIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = VERIFIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = ABSTRACT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHANGE_UNCERTAINTY = ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCES = ABSTRACT_REQUIREMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ORIGIN_DATE = ABSTRACT_REQUIREMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SCHEDULE_DATE = ABSTRACT_REQUIREMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STAKEHOLDERS = ABSTRACT_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EVOLVED_TO = ABSTRACT_REQUIREMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACED_TO = ABSTRACT_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = ABSTRACT_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = ABSTRACT_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__AGENTS = ABSTRACT_REQUIREMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = ABSTRACT_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DROPPED = ABSTRACT_REQUIREMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DROPPING_REASON = ABSTRACT_REQUIREMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION_LEVEL = ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RATIONALES = ABSTRACT_REQUIREMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TIME_CRITICALITY = ABSTRACT_REQUIREMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTACT_INFORMATION = ABSTRACT_REQUIREMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXPRESSION = ABSTRACT_REQUIREMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONDITION = ABSTRACT_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODES = ABSTRACT_REQUIREMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED = ABSTRACT_REQUIREMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Contained Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTAINED_REQUIREMENTS = ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED_BY = ABSTRACT_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GROUP = ABSTRACT_REQUIREMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RISK = ABSTRACT_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Assigned Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ASSIGNED_VARIABLE = ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Condition Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONDITION_VARIABLES = ABSTRACT_REQUIREMENT__CONDITION_VARIABLES;

	/**
	 * The feature id for the '<em><b>Refined BY</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFINED_BY = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ASSUMPTIONS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Assumption</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IMAGE_ASSUMPTION = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derivations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVATIONS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SUB_REQUIREMENTS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = ABSTRACT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CHANGE_UNCERTAINTY = ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SOURCES = ABSTRACT_REQUIREMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ORIGIN_DATE = ABSTRACT_REQUIREMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SCHEDULE_DATE = ABSTRACT_REQUIREMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__STAKEHOLDERS = ABSTRACT_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__EVOLVED_TO = ABSTRACT_REQUIREMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TRACED_TO = ABSTRACT_REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CATEGORY = ABSTRACT_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SATISFIED_BY = ABSTRACT_REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__AGENTS = ABSTRACT_REQUIREMENT__AGENTS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DERIVED_FROM = ABSTRACT_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DROPPED = ABSTRACT_REQUIREMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Dropping Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DROPPING_REASON = ABSTRACT_REQUIREMENT__DROPPING_REASON;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SATISFACTION_LEVEL = ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__RATIONALES = ABSTRACT_REQUIREMENT__RATIONALES;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TIME_CRITICALITY = ABSTRACT_REQUIREMENT__TIME_CRITICALITY;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTACT_INFORMATION = ABSTRACT_REQUIREMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__EXPRESSION = ABSTRACT_REQUIREMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONDITION = ABSTRACT_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__MODES = ABSTRACT_REQUIREMENT__MODES;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VERIFIED = ABSTRACT_REQUIREMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Contained Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTAINED_REQUIREMENTS = ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VERIFIED_BY = ABSTRACT_REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__GROUP = ABSTRACT_REQUIREMENT__GROUP;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__RISK = ABSTRACT_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Assigned Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ASSIGNED_VARIABLE = ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Condition Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONDITION_VARIABLES = ABSTRACT_REQUIREMENT__CONDITION_VARIABLES;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__REQUIREMENTS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TYPE = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IMAGE_REQUIREMENT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__REQUIREMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__VERIFICATION_METHOD = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__EXTERNAL_REF = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__PASSED = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__EXPRESSION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Verification Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referenced Model Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__ID = REFERENCED_MODEL_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__NAME = REFERENCED_MODEL_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__DESCRIPTION = REFERENCED_MODEL_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES = REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__AGREGATION_TYPE = REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__QUERY_EXPRESSION = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Expression Collected Model Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS_FEATURE_COUNT = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS__ID = REFERENCED_MODEL_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS__NAME = REFERENCED_MODEL_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS__DESCRIPTION = REFERENCED_MODEL_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES = REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS__AGREGATION_TYPE = REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The number of structural features of the '<em>Ref User Selected Model Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_USER_SELECTED_MODEL_ELEMENTS_FEATURE_COUNT = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__MODEL_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__PARENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__WEIGHT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__VERIFIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__SATISFACTION_LEVEL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE__REASON = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_REFERENCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ID = REFERENCED_MODEL_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = REFERENCED_MODEL_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DESCRIPTION = REFERENCED_MODEL_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__MODEL_ELEMENT_REFERENCES = REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__AGREGATION_TYPE = REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SPECIFICATIONS = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__ID = MODEL_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__NAME = MODEL_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__DESCRIPTION = MODEL_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__MODEL_ELEMENT = MODEL_ELEMENT_REFERENCE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__PARENT = MODEL_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__WEIGHT = MODEL_ELEMENT_REFERENCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Verifies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__VERIFIES = MODEL_ELEMENT_REFERENCE__VERIFIES;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__SATISFACTION_LEVEL = MODEL_ELEMENT_REFERENCE__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__REASON = MODEL_ELEMENT_REFERENCE__REASON;

	/**
	 * The feature id for the '<em><b>Nb Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__NB_REQUIREMENTS = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__VERIFICATION_LEVEL = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE__CONTAINER = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Model Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_ELEMENT_REFERENCE_FEATURE_COUNT = MODEL_ELEMENT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nb Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Coverage Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FEATURE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS__ID = REFERENCED_MODEL_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS__NAME = REFERENCED_MODEL_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS__DESCRIPTION = REFERENCED_MODEL_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Element References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES = REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS__AGREGATION_TYPE = REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The number of structural features of the '<em>Ref Derived Model Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DERIVED_MODEL_ELEMENTS_FEATURE_COUNT = REFERENCED_MODEL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__CONTRACT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__REQUIREMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__REQUIREMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.Direction
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 28;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.AssumptionType <em>Assumption Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.AssumptionType
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAssumptionType()
	 * @generated
	 */
	int ASSUMPTION_TYPE = 29;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.RiskKind <em>Risk Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.RiskKind
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRiskKind()
	 * @generated
	 */
	int RISK_KIND = 30;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.VerificationMethod <em>Verification Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.VerificationMethod
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerificationMethod()
	 * @generated
	 */
	int VERIFICATION_METHOD = 31;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.AgregationType <em>Agregation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.AgregationType
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAgregationType()
	 * @generated
	 */
	int AGREGATION_TYPE = 32;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.VariableType
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 33;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal.model.core.ContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal.model.core.ContainerType
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 34;

	/**
	 * The meta object id for the '<em>Ratio</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 35;

	/**
	 * The meta object id for the '<em>Positive Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getPositiveFactor()
	 * @generated
	 */
	int POSITIVE_FACTOR = 36;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 37;


	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see fr.openpeople.rdal.model.core.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.openpeople.rdal.model.core.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.openpeople.rdal.model.core.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.IdentifiedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.openpeople.rdal.model.core.IdentifiedElement#getDescription()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Description();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.ContractualElement <em>Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contractual Element</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement
	 * @generated
	 */
	EClass getContractualElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#getSatisfactionLevel <em>Satisfaction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Level</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getSatisfactionLevel()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_SatisfactionLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getRationales <em>Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rationales</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getRationales()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Rationales();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#getTimeCriticality <em>Time Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Criticality</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getTimeCriticality()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_TimeCriticality();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.ContractualElement#getChangeUncertainty <em>Change Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Uncertainty</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getChangeUncertainty()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_ChangeUncertainty();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Information</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getContactInformation()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_ContactInformation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.ContractualElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getExpression()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.ContractualElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getCondition()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Condition();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modes</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getModes()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Modes();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#getOriginDate <em>Origin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Date</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getOriginDate()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_OriginDate();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#getScheduleDate <em>Schedule Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Date</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getScheduleDate()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_ScheduleDate();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getStakeholders()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Stakeholders();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal.model.core.ContractualElement#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sources</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getSources()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfied By</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getSatisfiedBy()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_SatisfiedBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agents</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getAgents()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Agents();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getDerivedFrom()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_DerivedFrom();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getEvolvedTo <em>Evolved To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evolved To</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getEvolvedTo()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_EvolvedTo();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#isDropped <em>Dropped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#isDropped()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_Dropped();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ContractualElement#getDroppingReason <em>Dropping Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropping Reason</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getDroppingReason()
	 * @see #getContractualElement()
	 * @generated
	 */
	EAttribute getContractualElement_DroppingReason();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.ContractualElement#getTracedTo <em>Traced To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traced To</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getTracedTo()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_TracedTo();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.ContractualElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getCategory()
	 * @see #getContractualElement()
	 * @generated
	 */
	EReference getContractualElement_Category();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Specification#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifies</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getSpecifies()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Specifies();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Specification#getPrimaryActors <em>Primary Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Actors</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getPrimaryActors()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_PrimaryActors();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.Specification#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getActors()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.Specification#getVerificationActivities <em>Verification Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Activities</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getVerificationActivities()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_VerificationActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.Specification#getRequirementGroups <em>Requirement Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Groups</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getRequirementGroups()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_RequirementGroups();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Specification#getConstraintLanguagesSpecification <em>Constraint Languages Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint Languages Specification</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getConstraintLanguagesSpecification()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ConstraintLanguagesSpecification();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Specification#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getVersion()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Version();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.Specification#getSystOverview <em>Syst Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Syst Overview</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getSystOverview()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_SystOverview();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.Specification#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conflicts</em>'.
	 * @see fr.openpeople.rdal.model.core.Specification#getConflicts()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Conflicts();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getContainedRequirements <em>Contained Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getContainedRequirements()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_ContainedRequirements();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getGroup()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Group();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getRisk()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Risk();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getAssignedVariable <em>Assigned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Variable</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getAssignedVariable()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_AssignedVariable();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getConditionVariables <em>Condition Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Variables</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getConditionVariables()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_ConditionVariables();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.AbstractRequirement#getVerifiedBy <em>Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By</em>'.
	 * @see fr.openpeople.rdal.model.core.AbstractRequirement#getVerifiedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_VerifiedBy();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Requirement#getRefinedBY <em>Refined BY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined BY</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement#getRefinedBY()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RefinedBY();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Requirement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumptions</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement#getAssumptions()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Assumptions();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Requirement#getImageAssumption <em>Image Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Assumption</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement#getImageAssumption()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ImageAssumption();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see fr.openpeople.rdal.model.core.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Assumption#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.Assumption#getRequirements()
	 * @see #getAssumption()
	 * @generated
	 */
	EReference getAssumption_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Assumption#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.openpeople.rdal.model.core.Assumption#getType()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Assumption#getImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Requirement</em>'.
	 * @see fr.openpeople.rdal.model.core.Assumption#getImageRequirement()
	 * @see #getAssumption()
	 * @generated
	 */
	EReference getAssumption_ImageRequirement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.VerificationActivity <em>Verification Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Activity</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity
	 * @generated
	 */
	EClass getVerificationActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.VerificationActivity#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#getRequirement()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.VerificationActivity#getVerificationMethod <em>Verification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Method</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#getVerificationMethod()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EAttribute getVerificationActivity_VerificationMethod();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.VerificationActivity#getExternalRef <em>External Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Ref</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#getExternalRef()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_ExternalRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.VerificationActivity#isPassed <em>Passed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passed</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#isPassed()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EAttribute getVerificationActivity_Passed();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.VerificationActivity#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationActivity#getExpression()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_Expression();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Requirement#getDerivations <em>Derivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivations</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement#getDerivations()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Derivations();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.Requirement#getSubRequirements <em>Sub Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.Requirement#getSubRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SubRequirements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.StakeHolder <em>Stake Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stake Holder</em>'.
	 * @see fr.openpeople.rdal.model.core.StakeHolder
	 * @generated
	 */
	EClass getStakeHolder();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.StakeHolder#getContractualElements <em>Contractual Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractual Elements</em>'.
	 * @see fr.openpeople.rdal.model.core.StakeHolder#getContractualElements()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_ContractualElements();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.StakeHolder#getRationales <em>Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rationales</em>'.
	 * @see fr.openpeople.rdal.model.core.StakeHolder#getRationales()
	 * @see #getStakeHolder()
	 * @generated
	 */
	EReference getStakeHolder_Rationales();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RequirementsGroup <em>Requirements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Group</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsGroup
	 * @generated
	 */
	EClass getRequirementsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.RequirementsGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsGroup#getRequirements()
	 * @see #getRequirementsGroup()
	 * @generated
	 */
	EReference getRequirementsGroup_Requirements();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal.model.core.RequirementsGroup#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsGroup#getSpecification()
	 * @see #getRequirementsGroup()
	 * @generated
	 */
	EReference getRequirementsGroup_Specification();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RefExpressionCollectedModelElements <em>Ref Expression Collected Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Expression Collected Model Elements</em>'.
	 * @see fr.openpeople.rdal.model.core.RefExpressionCollectedModelElements
	 * @generated
	 */
	EClass getRefExpressionCollectedModelElements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal.model.core.RefExpressionCollectedModelElements#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression</em>'.
	 * @see fr.openpeople.rdal.model.core.RefExpressionCollectedModelElements#getQueryExpression()
	 * @see #getRefExpressionCollectedModelElements()
	 * @generated
	 */
	EReference getRefExpressionCollectedModelElements_QueryExpression();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RefUserSelectedModelElements <em>Ref User Selected Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref User Selected Model Elements</em>'.
	 * @see fr.openpeople.rdal.model.core.RefUserSelectedModelElements
	 * @generated
	 */
	EClass getRefUserSelectedModelElements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.ReferencedModelElements <em>Referenced Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Model Elements</em>'.
	 * @see fr.openpeople.rdal.model.core.ReferencedModelElements
	 * @generated
	 */
	EClass getReferencedModelElements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.ReferencedModelElements#getModelElementReferences <em>Model Element References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element References</em>'.
	 * @see fr.openpeople.rdal.model.core.ReferencedModelElements#getModelElementReferences()
	 * @see #getReferencedModelElements()
	 * @generated
	 */
	EReference getReferencedModelElements_ModelElementReferences();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ReferencedModelElements#getAgregationType <em>Agregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agregation Type</em>'.
	 * @see fr.openpeople.rdal.model.core.ReferencedModelElements#getAgregationType()
	 * @see #getReferencedModelElements()
	 * @generated
	 */
	EAttribute getReferencedModelElements_AgregationType();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.ModelElementReference <em>Model Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Reference</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference
	 * @generated
	 */
	EClass getModelElementReference();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.ModelElementReference#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getModelElement()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EReference getModelElementReference_ModelElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ModelElementReference#getVerifies <em>Verifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verifies</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getVerifies()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EAttribute getModelElementReference_Verifies();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ModelElementReference#getSatisfactionLevel <em>Satisfaction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Level</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getSatisfactionLevel()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EAttribute getModelElementReference_SatisfactionLevel();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ModelElementReference#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getReason()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EAttribute getModelElementReference_Reason();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal.model.core.ModelElementReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getParent()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EReference getModelElementReference_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.ModelElementReference#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.openpeople.rdal.model.core.ModelElementReference#getWeight()
	 * @see #getModelElementReference()
	 * @generated
	 */
	EAttribute getModelElementReference_Weight();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see fr.openpeople.rdal.model.core.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Trace#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see fr.openpeople.rdal.model.core.Trace#getSpecifications()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Specifications();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.TraceModelElementReference <em>Trace Model Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Model Element Reference</em>'.
	 * @see fr.openpeople.rdal.model.core.TraceModelElementReference
	 * @generated
	 */
	EClass getTraceModelElementReference();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.TraceModelElementReference#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see fr.openpeople.rdal.model.core.TraceModelElementReference#isContainer()
	 * @see #getTraceModelElementReference()
	 * @generated
	 */
	EAttribute getTraceModelElementReference_Container();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RequirementsCoverageData <em>Requirements Coverage Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Coverage Data</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsCoverageData
	 * @generated
	 */
	EClass getRequirementsCoverageData();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.RequirementsCoverageData#getNbRequirements <em>Nb Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsCoverageData#getNbRequirements()
	 * @see #getRequirementsCoverageData()
	 * @generated
	 */
	EAttribute getRequirementsCoverageData_NbRequirements();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.RequirementsCoverageData#getVerificationLevel <em>Verification Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Level</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsCoverageData#getVerificationLevel()
	 * @see #getRequirementsCoverageData()
	 * @generated
	 */
	EAttribute getRequirementsCoverageData_VerificationLevel();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.openpeople.rdal.model.core.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Variable#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.openpeople.rdal.model.core.Variable#getFeature()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Feature();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.openpeople.rdal.model.core.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RefDerivedModelElements <em>Ref Derived Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Derived Model Elements</em>'.
	 * @see fr.openpeople.rdal.model.core.RefDerivedModelElements
	 * @generated
	 */
	EClass getRefDerivedModelElements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see fr.openpeople.rdal.model.core.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal.model.core.Rationale#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contract</em>'.
	 * @see fr.openpeople.rdal.model.core.Rationale#getContract()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Contract();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.RequirementsContainer <em>Requirements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Container</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsContainer
	 * @generated
	 */
	EClass getRequirementsContainer();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.RequirementsContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsContainer#getType()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EAttribute getRequirementsContainer_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.RequirementsContainer#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsContainer#getRequirement()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_Requirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.RequirementsContainer#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see fr.openpeople.rdal.model.core.RequirementsContainer#getRequirements()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_Requirements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see fr.openpeople.rdal.model.core.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Goal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see fr.openpeople.rdal.model.core.Goal#getConflicts()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflicts();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Goal#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see fr.openpeople.rdal.model.core.Goal#getPriority()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Priority();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Element</em>'.
	 * @see fr.openpeople.rdal.model.core.VerifiableElement
	 * @generated
	 */
	EClass getVerifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.VerifiableElement#getVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see fr.openpeople.rdal.model.core.VerifiableElement#getVerified()
	 * @see #getVerifiableElement()
	 * @generated
	 */
	EAttribute getVerifiableElement_Verified();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty
	 * @generated
	 */
	EClass getUncertainty();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getVolatility <em>Volatility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatility</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getVolatility()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_Volatility();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getCostsImpact <em>Costs Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs Impact</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getCostsImpact()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_CostsImpact();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getScheduleImpact <em>Schedule Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Impact</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getScheduleImpact()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_ScheduleImpact();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precedence</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getPrecedence()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_Precedence();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getRiskIndex <em>Risk Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Index</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getRiskIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_RiskIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getPropRiskIndex <em>Prop Risk Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop Risk Index</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getPropRiskIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_PropRiskIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Uncertainty#getMaturityIndex <em>Maturity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Index</em>'.
	 * @see fr.openpeople.rdal.model.core.Uncertainty#getMaturityIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_MaturityIndex();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.SystemOverview <em>System Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Overview</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview
	 * @generated
	 */
	EClass getSystemOverview();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.SystemOverview#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getContexts()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.SystemOverview#getSystemBoundary <em>System Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Boundary</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getSystemBoundary()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_SystemBoundary();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.SystemOverview#getSystemToBe <em>System To Be</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System To Be</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getSystemToBe()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_SystemToBe();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.SystemOverview#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getPurpose()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EAttribute getSystemOverview_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.SystemOverview#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getGoals()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_Goals();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal.model.core.SystemOverview#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Capabilities</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemOverview#getCapabilities()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EAttribute getSystemOverview_Capabilities();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemContext
	 * @generated
	 */
	EClass getSystemContext();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.SystemContext#getGlobalSystem <em>Global System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global System</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemContext#getGlobalSystem()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_GlobalSystem();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.SystemContext#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemContext#getActors()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_Actors();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.SystemContext#getSystemBoundary <em>System Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Boundary</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemContext#getSystemBoundary()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_SystemBoundary();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.SystemContext#getSystemModes <em>System Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Modes</em>'.
	 * @see fr.openpeople.rdal.model.core.SystemContext#getSystemModes()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_SystemModes();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Actor#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Images</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor#getImages()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal.model.core.Actor#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor#getInteractions()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Interactions();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Actor#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor#getAddress()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Address();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Actor#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor#getEmail()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Email();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Actor#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see fr.openpeople.rdal.model.core.Actor#getPhoneNumber()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_PhoneNumber();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see fr.openpeople.rdal.model.core.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal.model.core.Interaction#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see fr.openpeople.rdal.model.core.Interaction#getEntity()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Entity();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Interaction#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fr.openpeople.rdal.model.core.Interaction#getDirection()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Direction();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal.model.core.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see fr.openpeople.rdal.model.core.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal.model.core.Conflict#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see fr.openpeople.rdal.model.core.Conflict#getDegree()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Degree();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal.model.core.Conflict#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see fr.openpeople.rdal.model.core.Conflict#getGoals()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_Goals();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see fr.openpeople.rdal.model.core.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.AssumptionType <em>Assumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assumption Type</em>'.
	 * @see fr.openpeople.rdal.model.core.AssumptionType
	 * @generated
	 */
	EEnum getAssumptionType();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.RiskKind <em>Risk Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Kind</em>'.
	 * @see fr.openpeople.rdal.model.core.RiskKind
	 * @generated
	 */
	EEnum getRiskKind();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.VerificationMethod <em>Verification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification Method</em>'.
	 * @see fr.openpeople.rdal.model.core.VerificationMethod
	 * @generated
	 */
	EEnum getVerificationMethod();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.AgregationType <em>Agregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agregation Type</em>'.
	 * @see fr.openpeople.rdal.model.core.AgregationType
	 * @generated
	 */
	EEnum getAgregationType();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see fr.openpeople.rdal.model.core.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal.model.core.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see fr.openpeople.rdal.model.core.ContainerType
	 * @generated
	 */
	EEnum getContainerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ratio</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rangeZeroOne'"
	 * @generated
	 */
	EDataType getRatio();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Positive Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Factor</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getPositiveFactor();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.IdentifiedElementImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__NAME = eINSTANCE.getIdentifiedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__DESCRIPTION = eINSTANCE.getIdentifiedElement_Description();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.ContractualElementImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getContractualElement()
		 * @generated
		 */
		EClass CONTRACTUAL_ELEMENT = eINSTANCE.getContractualElement();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL = eINSTANCE.getContractualElement_SatisfactionLevel();

		/**
		 * The meta object literal for the '<em><b>Rationales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__RATIONALES = eINSTANCE.getContractualElement_Rationales();

		/**
		 * The meta object literal for the '<em><b>Time Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__TIME_CRITICALITY = eINSTANCE.getContractualElement_TimeCriticality();

		/**
		 * The meta object literal for the '<em><b>Change Uncertainty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = eINSTANCE.getContractualElement_ChangeUncertainty();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__CONTACT_INFORMATION = eINSTANCE.getContractualElement_ContactInformation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__EXPRESSION = eINSTANCE.getContractualElement_Expression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__CONDITION = eINSTANCE.getContractualElement_Condition();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__MODES = eINSTANCE.getContractualElement_Modes();

		/**
		 * The meta object literal for the '<em><b>Origin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__ORIGIN_DATE = eINSTANCE.getContractualElement_OriginDate();

		/**
		 * The meta object literal for the '<em><b>Schedule Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__SCHEDULE_DATE = eINSTANCE.getContractualElement_ScheduleDate();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__STAKEHOLDERS = eINSTANCE.getContractualElement_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__SOURCES = eINSTANCE.getContractualElement_Sources();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__SATISFIED_BY = eINSTANCE.getContractualElement_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__AGENTS = eINSTANCE.getContractualElement_Agents();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__DERIVED_FROM = eINSTANCE.getContractualElement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Evolved To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__EVOLVED_TO = eINSTANCE.getContractualElement_EvolvedTo();

		/**
		 * The meta object literal for the '<em><b>Dropped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__DROPPED = eINSTANCE.getContractualElement_Dropped();

		/**
		 * The meta object literal for the '<em><b>Dropping Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACTUAL_ELEMENT__DROPPING_REASON = eINSTANCE.getContractualElement_DroppingReason();

		/**
		 * The meta object literal for the '<em><b>Traced To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__TRACED_TO = eINSTANCE.getContractualElement_TracedTo();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACTUAL_ELEMENT__CATEGORY = eINSTANCE.getContractualElement_Category();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.SpecificationImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPECIFIES = eINSTANCE.getSpecification_Specifies();

		/**
		 * The meta object literal for the '<em><b>Primary Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PRIMARY_ACTORS = eINSTANCE.getSpecification_PrimaryActors();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ACTORS = eINSTANCE.getSpecification_Actors();

		/**
		 * The meta object literal for the '<em><b>Verification Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__VERIFICATION_ACTIVITIES = eINSTANCE.getSpecification_VerificationActivities();

		/**
		 * The meta object literal for the '<em><b>Requirement Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__REQUIREMENT_GROUPS = eINSTANCE.getSpecification_RequirementGroups();

		/**
		 * The meta object literal for the '<em><b>Constraint Languages Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONSTRAINT_LANGUAGES_SPECIFICATION = eINSTANCE.getSpecification_ConstraintLanguagesSpecification();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__VERSION = eINSTANCE.getSpecification_Version();

		/**
		 * The meta object literal for the '<em><b>Syst Overview</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SYST_OVERVIEW = eINSTANCE.getSpecification_SystOverview();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONFLICTS = eINSTANCE.getSpecification_Conflicts();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.AbstractRequirementImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Contained Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS = eINSTANCE.getAbstractRequirement_ContainedRequirements();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__GROUP = eINSTANCE.getAbstractRequirement_Group();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__RISK = eINSTANCE.getAbstractRequirement_Risk();

		/**
		 * The meta object literal for the '<em><b>Assigned Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE = eINSTANCE.getAbstractRequirement_AssignedVariable();

		/**
		 * The meta object literal for the '<em><b>Condition Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__CONDITION_VARIABLES = eINSTANCE.getAbstractRequirement_ConditionVariables();

		/**
		 * The meta object literal for the '<em><b>Verified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__VERIFIED_BY = eINSTANCE.getAbstractRequirement_VerifiedBy();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RequirementImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Refined BY</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFINED_BY = eINSTANCE.getRequirement_RefinedBY();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ASSUMPTIONS = eINSTANCE.getRequirement_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Image Assumption</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__IMAGE_ASSUMPTION = eINSTANCE.getRequirement_ImageAssumption();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.AssumptionImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSUMPTION__REQUIREMENTS = eINSTANCE.getAssumption_Requirements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSUMPTION__TYPE = eINSTANCE.getAssumption_Type();

		/**
		 * The meta object literal for the '<em><b>Image Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSUMPTION__IMAGE_REQUIREMENT = eINSTANCE.getAssumption_ImageRequirement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.VerificationActivityImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerificationActivity()
		 * @generated
		 */
		EClass VERIFICATION_ACTIVITY = eINSTANCE.getVerificationActivity();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__REQUIREMENT = eINSTANCE.getVerificationActivity_Requirement();

		/**
		 * The meta object literal for the '<em><b>Verification Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_ACTIVITY__VERIFICATION_METHOD = eINSTANCE.getVerificationActivity_VerificationMethod();

		/**
		 * The meta object literal for the '<em><b>External Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__EXTERNAL_REF = eINSTANCE.getVerificationActivity_ExternalRef();

		/**
		 * The meta object literal for the '<em><b>Passed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_ACTIVITY__PASSED = eINSTANCE.getVerificationActivity_Passed();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__EXPRESSION = eINSTANCE.getVerificationActivity_Expression();

		/**
		 * The meta object literal for the '<em><b>Derivations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVATIONS = eINSTANCE.getRequirement_Derivations();

		/**
		 * The meta object literal for the '<em><b>Sub Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SUB_REQUIREMENTS = eINSTANCE.getRequirement_SubRequirements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.StakeHolderImpl <em>Stake Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.StakeHolderImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getStakeHolder()
		 * @generated
		 */
		EClass STAKE_HOLDER = eINSTANCE.getStakeHolder();

		/**
		 * The meta object literal for the '<em><b>Contractual Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__CONTRACTUAL_ELEMENTS = eINSTANCE.getStakeHolder_ContractualElements();

		/**
		 * The meta object literal for the '<em><b>Rationales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER__RATIONALES = eINSTANCE.getStakeHolder_Rationales();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsGroupImpl <em>Requirements Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RequirementsGroupImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsGroup()
		 * @generated
		 */
		EClass REQUIREMENTS_GROUP = eINSTANCE.getRequirementsGroup();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_GROUP__REQUIREMENTS = eINSTANCE.getRequirementsGroup_Requirements();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_GROUP__SPECIFICATION = eINSTANCE.getRequirementsGroup_Specification();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RefExpressionCollectedModelElementsImpl <em>Ref Expression Collected Model Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RefExpressionCollectedModelElementsImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefExpressionCollectedModelElements()
		 * @generated
		 */
		EClass REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS = eINSTANCE.getRefExpressionCollectedModelElements();

		/**
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__QUERY_EXPRESSION = eINSTANCE.getRefExpressionCollectedModelElements_QueryExpression();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RefUserSelectedModelElementsImpl <em>Ref User Selected Model Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RefUserSelectedModelElementsImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefUserSelectedModelElements()
		 * @generated
		 */
		EClass REF_USER_SELECTED_MODEL_ELEMENTS = eINSTANCE.getRefUserSelectedModelElements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl <em>Referenced Model Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.ReferencedModelElementsImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getReferencedModelElements()
		 * @generated
		 */
		EClass REFERENCED_MODEL_ELEMENTS = eINSTANCE.getReferencedModelElements();

		/**
		 * The meta object literal for the '<em><b>Model Element References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES = eINSTANCE.getReferencedModelElements_ModelElementReferences();

		/**
		 * The meta object literal for the '<em><b>Agregation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE = eINSTANCE.getReferencedModelElements_AgregationType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.ModelElementReferenceImpl <em>Model Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.ModelElementReferenceImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getModelElementReference()
		 * @generated
		 */
		EClass MODEL_ELEMENT_REFERENCE = eINSTANCE.getModelElementReference();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_REFERENCE__MODEL_ELEMENT = eINSTANCE.getModelElementReference_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Verifies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_REFERENCE__VERIFIES = eINSTANCE.getModelElementReference_Verifies();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_REFERENCE__SATISFACTION_LEVEL = eINSTANCE.getModelElementReference_SatisfactionLevel();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_REFERENCE__REASON = eINSTANCE.getModelElementReference_Reason();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_REFERENCE__PARENT = eINSTANCE.getModelElementReference_Parent();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_REFERENCE__WEIGHT = eINSTANCE.getModelElementReference_Weight();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.TraceImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SPECIFICATIONS = eINSTANCE.getTrace_Specifications();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.TraceModelElementReferenceImpl <em>Trace Model Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.TraceModelElementReferenceImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getTraceModelElementReference()
		 * @generated
		 */
		EClass TRACE_MODEL_ELEMENT_REFERENCE = eINSTANCE.getTraceModelElementReference();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_MODEL_ELEMENT_REFERENCE__CONTAINER = eINSTANCE.getTraceModelElementReference_Container();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsCoverageDataImpl <em>Requirements Coverage Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RequirementsCoverageDataImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsCoverageData()
		 * @generated
		 */
		EClass REQUIREMENTS_COVERAGE_DATA = eINSTANCE.getRequirementsCoverageData();

		/**
		 * The meta object literal for the '<em><b>Nb Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS = eINSTANCE.getRequirementsCoverageData_NbRequirements();

		/**
		 * The meta object literal for the '<em><b>Verification Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL = eINSTANCE.getRequirementsCoverageData_VerificationLevel();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.VariableImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__FEATURE = eINSTANCE.getVariable_Feature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RefDerivedModelElementsImpl <em>Ref Derived Model Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RefDerivedModelElementsImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRefDerivedModelElements()
		 * @generated
		 */
		EClass REF_DERIVED_MODEL_ELEMENTS = eINSTANCE.getRefDerivedModelElements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RationaleImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__CONTRACT = eINSTANCE.getRationale_Contract();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.RequirementsContainerImpl <em>Requirements Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.RequirementsContainerImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRequirementsContainer()
		 * @generated
		 */
		EClass REQUIREMENTS_CONTAINER = eINSTANCE.getRequirementsContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_CONTAINER__TYPE = eINSTANCE.getRequirementsContainer_Type();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__REQUIREMENT = eINSTANCE.getRequirementsContainer_Requirement();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__REQUIREMENTS = eINSTANCE.getRequirementsContainer_Requirements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.GoalImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONFLICTS = eINSTANCE.getGoal_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.VerifiableElementImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerifiableElement()
		 * @generated
		 */
		EClass VERIFIABLE_ELEMENT = eINSTANCE.getVerifiableElement();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIABLE_ELEMENT__VERIFIED = eINSTANCE.getVerifiableElement_Verified();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.UncertaintyImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getUncertainty()
		 * @generated
		 */
		EClass UNCERTAINTY = eINSTANCE.getUncertainty();

		/**
		 * The meta object literal for the '<em><b>Volatility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__VOLATILITY = eINSTANCE.getUncertainty_Volatility();

		/**
		 * The meta object literal for the '<em><b>Costs Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__COSTS_IMPACT = eINSTANCE.getUncertainty_CostsImpact();

		/**
		 * The meta object literal for the '<em><b>Schedule Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__SCHEDULE_IMPACT = eINSTANCE.getUncertainty_ScheduleImpact();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__PRECEDENCE = eINSTANCE.getUncertainty_Precedence();

		/**
		 * The meta object literal for the '<em><b>Risk Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__RISK_INDEX = eINSTANCE.getUncertainty_RiskIndex();

		/**
		 * The meta object literal for the '<em><b>Prop Risk Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__PROP_RISK_INDEX = eINSTANCE.getUncertainty_PropRiskIndex();

		/**
		 * The meta object literal for the '<em><b>Maturity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__MATURITY_INDEX = eINSTANCE.getUncertainty_MaturityIndex();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.SystemOverviewImpl <em>System Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.SystemOverviewImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSystemOverview()
		 * @generated
		 */
		EClass SYSTEM_OVERVIEW = eINSTANCE.getSystemOverview();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__CONTEXTS = eINSTANCE.getSystemOverview_Contexts();

		/**
		 * The meta object literal for the '<em><b>System Boundary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__SYSTEM_BOUNDARY = eINSTANCE.getSystemOverview_SystemBoundary();

		/**
		 * The meta object literal for the '<em><b>System To Be</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__SYSTEM_TO_BE = eINSTANCE.getSystemOverview_SystemToBe();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OVERVIEW__PURPOSE = eINSTANCE.getSystemOverview_Purpose();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__GOALS = eINSTANCE.getSystemOverview_Goals();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OVERVIEW__CAPABILITIES = eINSTANCE.getSystemOverview_Capabilities();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.SystemContextImpl <em>System Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.SystemContextImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getSystemContext()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT = eINSTANCE.getSystemContext();

		/**
		 * The meta object literal for the '<em><b>Global System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__GLOBAL_SYSTEM = eINSTANCE.getSystemContext_GlobalSystem();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__ACTORS = eINSTANCE.getSystemContext_Actors();

		/**
		 * The meta object literal for the '<em><b>System Boundary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__SYSTEM_BOUNDARY = eINSTANCE.getSystemContext_SystemBoundary();

		/**
		 * The meta object literal for the '<em><b>System Modes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__SYSTEM_MODES = eINSTANCE.getSystemContext_SystemModes();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.ActorImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__IMAGES = eINSTANCE.getActor_Images();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__INTERACTIONS = eINSTANCE.getActor_Interactions();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ADDRESS = eINSTANCE.getActor_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__EMAIL = eINSTANCE.getActor_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__PHONE_NUMBER = eINSTANCE.getActor_PhoneNumber();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.InteractionImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__ENTITY = eINSTANCE.getInteraction_Entity();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__DIRECTION = eINSTANCE.getInteraction_Direction();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.impl.ConflictImpl
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__DEGREE = eINSTANCE.getConflict_Degree();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__GOALS = eINSTANCE.getConflict_Goals();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.Direction
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.AssumptionType <em>Assumption Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.AssumptionType
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAssumptionType()
		 * @generated
		 */
		EEnum ASSUMPTION_TYPE = eINSTANCE.getAssumptionType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.RiskKind <em>Risk Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.RiskKind
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRiskKind()
		 * @generated
		 */
		EEnum RISK_KIND = eINSTANCE.getRiskKind();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.VerificationMethod <em>Verification Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.VerificationMethod
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVerificationMethod()
		 * @generated
		 */
		EEnum VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.AgregationType <em>Agregation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.AgregationType
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getAgregationType()
		 * @generated
		 */
		EEnum AGREGATION_TYPE = eINSTANCE.getAgregationType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.VariableType
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal.model.core.ContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal.model.core.ContainerType
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getContainerType()
		 * @generated
		 */
		EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '<em>Ratio</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getRatio()
		 * @generated
		 */
		EDataType RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em>Positive Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getPositiveFactor()
		 * @generated
		 */
		EDataType POSITIVE_FACTOR = eINSTANCE.getPositiveFactor();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see fr.openpeople.rdal.model.core.impl.CorePackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //RdalPackage
