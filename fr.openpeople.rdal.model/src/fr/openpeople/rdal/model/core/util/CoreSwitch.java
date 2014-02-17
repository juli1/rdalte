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
package fr.openpeople.rdal.model.core.util;

import fr.openpeople.rdal.model.core.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal.model.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTRACTUAL_ELEMENT: {
				ContractualElement contractualElement = (ContractualElement)theEObject;
				T result = caseContractualElement(contractualElement);
				if (result == null) result = caseIdentifiedElement(contractualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNCERTAINTY: {
				Uncertainty uncertainty = (Uncertainty)theEObject;
				T result = caseUncertainty(uncertainty);
				if (result == null) result = caseIdentifiedElement(uncertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VERIFIABLE_ELEMENT: {
				VerifiableElement verifiableElement = (VerifiableElement)theEObject;
				T result = caseVerifiableElement(verifiableElement);
				if (result == null) result = caseContractualElement(verifiableElement);
				if (result == null) result = caseIdentifiedElement(verifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseVerifiableElement(specification);
				if (result == null) result = caseContractualElement(specification);
				if (result == null) result = caseIdentifiedElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SYSTEM_OVERVIEW: {
				SystemOverview systemOverview = (SystemOverview)theEObject;
				T result = caseSystemOverview(systemOverview);
				if (result == null) result = caseContractualElement(systemOverview);
				if (result == null) result = caseIdentifiedElement(systemOverview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SYSTEM_CONTEXT: {
				SystemContext systemContext = (SystemContext)theEObject;
				T result = caseSystemContext(systemContext);
				if (result == null) result = caseIdentifiedElement(systemContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseIdentifiedElement(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseIdentifiedElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseContractualElement(goal);
				if (result == null) result = caseIdentifiedElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = caseIdentifiedElement(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STAKE_HOLDER: {
				StakeHolder stakeHolder = (StakeHolder)theEObject;
				T result = caseStakeHolder(stakeHolder);
				if (result == null) result = caseActor(stakeHolder);
				if (result == null) result = caseIdentifiedElement(stakeHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIREMENTS_GROUP: {
				RequirementsGroup requirementsGroup = (RequirementsGroup)theEObject;
				T result = caseRequirementsGroup(requirementsGroup);
				if (result == null) result = caseVerifiableElement(requirementsGroup);
				if (result == null) result = caseContractualElement(requirementsGroup);
				if (result == null) result = caseIdentifiedElement(requirementsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_REQUIREMENT: {
				AbstractRequirement abstractRequirement = (AbstractRequirement)theEObject;
				T result = caseAbstractRequirement(abstractRequirement);
				if (result == null) result = caseVerifiableElement(abstractRequirement);
				if (result == null) result = caseContractualElement(abstractRequirement);
				if (result == null) result = caseIdentifiedElement(abstractRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseAbstractRequirement(requirement);
				if (result == null) result = caseVerifiableElement(requirement);
				if (result == null) result = caseContractualElement(requirement);
				if (result == null) result = caseIdentifiedElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseAbstractRequirement(assumption);
				if (result == null) result = caseVerifiableElement(assumption);
				if (result == null) result = caseContractualElement(assumption);
				if (result == null) result = caseIdentifiedElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VERIFICATION_ACTIVITY: {
				VerificationActivity verificationActivity = (VerificationActivity)theEObject;
				T result = caseVerificationActivity(verificationActivity);
				if (result == null) result = caseIdentifiedElement(verificationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS: {
				RefExpressionCollectedModelElements refExpressionCollectedModelElements = (RefExpressionCollectedModelElements)theEObject;
				T result = caseRefExpressionCollectedModelElements(refExpressionCollectedModelElements);
				if (result == null) result = caseReferencedModelElements(refExpressionCollectedModelElements);
				if (result == null) result = caseIdentifiedElement(refExpressionCollectedModelElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REF_USER_SELECTED_MODEL_ELEMENTS: {
				RefUserSelectedModelElements refUserSelectedModelElements = (RefUserSelectedModelElements)theEObject;
				T result = caseRefUserSelectedModelElements(refUserSelectedModelElements);
				if (result == null) result = caseReferencedModelElements(refUserSelectedModelElements);
				if (result == null) result = caseIdentifiedElement(refUserSelectedModelElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFERENCED_MODEL_ELEMENTS: {
				ReferencedModelElements referencedModelElements = (ReferencedModelElements)theEObject;
				T result = caseReferencedModelElements(referencedModelElements);
				if (result == null) result = caseIdentifiedElement(referencedModelElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_ELEMENT_REFERENCE: {
				ModelElementReference modelElementReference = (ModelElementReference)theEObject;
				T result = caseModelElementReference(modelElementReference);
				if (result == null) result = caseIdentifiedElement(modelElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = caseReferencedModelElements(trace);
				if (result == null) result = caseIdentifiedElement(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_MODEL_ELEMENT_REFERENCE: {
				TraceModelElementReference traceModelElementReference = (TraceModelElementReference)theEObject;
				T result = caseTraceModelElementReference(traceModelElementReference);
				if (result == null) result = caseModelElementReference(traceModelElementReference);
				if (result == null) result = caseRequirementsCoverageData(traceModelElementReference);
				if (result == null) result = caseIdentifiedElement(traceModelElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIREMENTS_COVERAGE_DATA: {
				RequirementsCoverageData requirementsCoverageData = (RequirementsCoverageData)theEObject;
				T result = caseRequirementsCoverageData(requirementsCoverageData);
				if (result == null) result = caseIdentifiedElement(requirementsCoverageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseIdentifiedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REF_DERIVED_MODEL_ELEMENTS: {
				RefDerivedModelElements refDerivedModelElements = (RefDerivedModelElements)theEObject;
				T result = caseRefDerivedModelElements(refDerivedModelElements);
				if (result == null) result = caseReferencedModelElements(refDerivedModelElements);
				if (result == null) result = caseIdentifiedElement(refDerivedModelElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RATIONALE: {
				Rationale rationale = (Rationale)theEObject;
				T result = caseRationale(rationale);
				if (result == null) result = caseIdentifiedElement(rationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIREMENTS_CONTAINER: {
				RequirementsContainer requirementsContainer = (RequirementsContainer)theEObject;
				T result = caseRequirementsContainer(requirementsContainer);
				if (result == null) result = caseIdentifiedElement(requirementsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractualElement(ContractualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationActivity(VerificationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stake Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stake Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeHolder(StakeHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsGroup(RequirementsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Expression Collected Model Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Expression Collected Model Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefExpressionCollectedModelElements(RefExpressionCollectedModelElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref User Selected Model Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref User Selected Model Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefUserSelectedModelElements(RefUserSelectedModelElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Model Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Model Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedModelElements(ReferencedModelElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementReference(ModelElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Model Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Model Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceModelElementReference(TraceModelElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Coverage Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Coverage Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsCoverageData(RequirementsCoverageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Derived Model Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Derived Model Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefDerivedModelElements(RefDerivedModelElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsContainer(RequirementsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableElement(VerifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUncertainty(Uncertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemOverview(SystemOverview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContext(SystemContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RdalSwitch
