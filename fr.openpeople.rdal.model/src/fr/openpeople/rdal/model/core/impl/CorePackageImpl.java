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

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.openpeople.rdal.model.core.AbstractRequirement;
import fr.openpeople.rdal.model.core.Actor;
import fr.openpeople.rdal.model.core.AgregationType;
import fr.openpeople.rdal.model.core.Assumption;
import fr.openpeople.rdal.model.core.AssumptionType;
import fr.openpeople.rdal.model.core.Conflict;
import fr.openpeople.rdal.model.core.ContainerType;
import fr.openpeople.rdal.model.core.ContractReferencedModelElements;
import fr.openpeople.rdal.model.core.ContractualElement;
import fr.openpeople.rdal.model.core.CoreFactory;
import fr.openpeople.rdal.model.core.CorePackage;
import fr.openpeople.rdal.model.core.Direction;
import fr.openpeople.rdal.model.core.EnumAssumptionType;
import fr.openpeople.rdal.model.core.EnumFunctionalRequirementType;
import fr.openpeople.rdal.model.core.EnumRiskKind;
import fr.openpeople.rdal.model.core.EnumVerificationMethod;
import fr.openpeople.rdal.model.core.Goal;
import fr.openpeople.rdal.model.core.IdentifiedElement;
import fr.openpeople.rdal.model.core.Interaction;
import fr.openpeople.rdal.model.core.ModelElementReference;
import fr.openpeople.rdal.model.core.Rationale;
import fr.openpeople.rdal.model.core.RefDerivedModelElements;
import fr.openpeople.rdal.model.core.RefExpressionCollectedModelElements;
import fr.openpeople.rdal.model.core.RefUserSelectedModelElements;
import fr.openpeople.rdal.model.core.ReferencedModelElements;
import fr.openpeople.rdal.model.core.Requirement;
import fr.openpeople.rdal.model.core.RequirementsContainer;
import fr.openpeople.rdal.model.core.RequirementsCoverageData;
import fr.openpeople.rdal.model.core.RequirementsGroup;
import fr.openpeople.rdal.model.core.RiskKind;
import fr.openpeople.rdal.model.core.Specification;
import fr.openpeople.rdal.model.core.StakeHolder;
import fr.openpeople.rdal.model.core.SystemContext;
import fr.openpeople.rdal.model.core.SystemOverview;
import fr.openpeople.rdal.model.core.Trace;
import fr.openpeople.rdal.model.core.TraceModelElementReference;
import fr.openpeople.rdal.model.core.Uncertainty;
import fr.openpeople.rdal.model.core.Variable;
import fr.openpeople.rdal.model.core.VariableType;
import fr.openpeople.rdal.model.core.VerifiableElement;
import fr.openpeople.rdal.model.core.VerificationActivity;
import fr.openpeople.rdal.model.core.VerificationMethod;
import fr.openpeople.rdal.model.core.util.CoreValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refExpressionCollectedModelElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refUserSelectedModelElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedModelElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceModelElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsCoverageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refDerivedModelElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemOverviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assumptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verificationMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agregationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ratioEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveFactorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.openpeople.rdal.model.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SettingsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Description() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractualElement() {
		return contractualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_SatisfactionLevel() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Rationales() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_TimeCriticality() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_ChangeUncertainty() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_ContactInformation() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Expression() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Condition() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Modes() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_OriginDate() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_ScheduleDate() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Stakeholders() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_Sources() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_SatisfiedBy() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Agents() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_DerivedFrom() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_EvolvedTo() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_Dropped() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContractualElement_DroppingReason() {
		return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_TracedTo() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractualElement_Category() {
		return (EReference)contractualElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Specifies() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_PrimaryActors() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Actors() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_VerificationActivities() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_RequirementGroups() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ConstraintLanguagesSpecification() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Version() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_SystOverview() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Conflicts() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRequirement() {
		return abstractRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_ContainedRequirements() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_Group() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_Risk() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_AssignedVariable() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_ConditionVariables() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_VerifiedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RefinedBY() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Assumptions() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_ImageAssumption() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssumption_Requirements() {
		return (EReference)assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssumption_Type() {
		return (EAttribute)assumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssumption_ImageRequirement() {
		return (EReference)assumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationActivity() {
		return verificationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_Requirement() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerificationActivity_VerificationMethod() {
		return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_ExternalRef() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerificationActivity_Passed() {
		return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_Expression() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Derivations() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_SubRequirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeHolder() {
		return stakeHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolder_ContractualElements() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolder_Rationales() {
		return (EReference)stakeHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsGroup() {
		return requirementsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsGroup_Requirements() {
		return (EReference)requirementsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsGroup_Specification() {
		return (EReference)requirementsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefExpressionCollectedModelElements() {
		return refExpressionCollectedModelElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefExpressionCollectedModelElements_QueryExpression() {
		return (EReference)refExpressionCollectedModelElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefUserSelectedModelElements() {
		return refUserSelectedModelElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedModelElements() {
		return referencedModelElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedModelElements_ModelElementReferences() {
		return (EReference)referencedModelElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencedModelElements_AgregationType() {
		return (EAttribute)referencedModelElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementReference() {
		return modelElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementReference_ModelElement() {
		return (EReference)modelElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementReference_Verifies() {
		return (EAttribute)modelElementReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementReference_SatisfactionLevel() {
		return (EAttribute)modelElementReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementReference_Reason() {
		return (EAttribute)modelElementReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementReference_Parent() {
		return (EReference)modelElementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElementReference_Weight() {
		return (EAttribute)modelElementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Specifications() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceModelElementReference() {
		return traceModelElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceModelElementReference_Container() {
		return (EAttribute)traceModelElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsCoverageData() {
		return requirementsCoverageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsCoverageData_NbRequirements() {
		return (EAttribute)requirementsCoverageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsCoverageData_VerificationLevel() {
		return (EAttribute)requirementsCoverageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Feature() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefDerivedModelElements() {
		return refDerivedModelElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Contract() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsContainer() {
		return requirementsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsContainer_Type() {
		return (EAttribute)requirementsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsContainer_Requirement() {
		return (EReference)requirementsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsContainer_Requirements() {
		return (EReference)requirementsContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Conflicts() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Priority() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiableElement() {
		return verifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifiableElement_Verified() {
		return (EAttribute)verifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertainty() {
		return uncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_Volatility() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_CostsImpact() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_ScheduleImpact() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_Precedence() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_RiskIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_PropRiskIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_MaturityIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemOverview() {
		return systemOverviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_Contexts() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_SystemBoundary() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_SystemToBe() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOverview_Purpose() {
		return (EAttribute)systemOverviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_Goals() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOverview_Capabilities() {
		return (EAttribute)systemOverviewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContext() {
		return systemContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_GlobalSystem() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_Actors() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_SystemBoundary() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_SystemModes() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Images() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Interactions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Address() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Email() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_PhoneNumber() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Entity() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Direction() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflict_Degree() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_Goals() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssumptionType() {
		return assumptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskKind() {
		return riskKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerificationMethod() {
		return verificationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgregationType() {
		return agregationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainerType() {
		return containerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRatio() {
		return ratioEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveFactor() {
		return positiveFactorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__DESCRIPTION);

		contractualElementEClass = createEClass(CONTRACTUAL_ELEMENT);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__SOURCES);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__ORIGIN_DATE);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__SCHEDULE_DATE);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__STAKEHOLDERS);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__EVOLVED_TO);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__TRACED_TO);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CATEGORY);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__SATISFIED_BY);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__AGENTS);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__DERIVED_FROM);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__DROPPED);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__DROPPING_REASON);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__RATIONALES);
		createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__TIME_CRITICALITY);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CONTACT_INFORMATION);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__EXPRESSION);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CONDITION);
		createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__MODES);

		uncertaintyEClass = createEClass(UNCERTAINTY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__VOLATILITY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__COSTS_IMPACT);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__SCHEDULE_IMPACT);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__PRECEDENCE);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__RISK_INDEX);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__PROP_RISK_INDEX);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__MATURITY_INDEX);

		verifiableElementEClass = createEClass(VERIFIABLE_ELEMENT);
		createEAttribute(verifiableElementEClass, VERIFIABLE_ELEMENT__VERIFIED);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__ACTORS);
		createEReference(specificationEClass, SPECIFICATION__SYST_OVERVIEW);
		createEReference(specificationEClass, SPECIFICATION__REQUIREMENT_GROUPS);
		createEReference(specificationEClass, SPECIFICATION__VERIFICATION_ACTIVITIES);
		createEReference(specificationEClass, SPECIFICATION__CONFLICTS);
		createEReference(specificationEClass, SPECIFICATION__CONSTRAINT_LANGUAGES_SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SPECIFIES);
		createEReference(specificationEClass, SPECIFICATION__PRIMARY_ACTORS);
		createEAttribute(specificationEClass, SPECIFICATION__VERSION);

		systemOverviewEClass = createEClass(SYSTEM_OVERVIEW);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__GOALS);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__SYSTEM_TO_BE);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__CONTEXTS);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__SYSTEM_BOUNDARY);
		createEAttribute(systemOverviewEClass, SYSTEM_OVERVIEW__PURPOSE);
		createEAttribute(systemOverviewEClass, SYSTEM_OVERVIEW__CAPABILITIES);

		systemContextEClass = createEClass(SYSTEM_CONTEXT);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__GLOBAL_SYSTEM);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__ACTORS);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__SYSTEM_BOUNDARY);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__SYSTEM_MODES);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__IMAGES);
		createEReference(actorEClass, ACTOR__INTERACTIONS);
		createEAttribute(actorEClass, ACTOR__ADDRESS);
		createEAttribute(actorEClass, ACTOR__EMAIL);
		createEAttribute(actorEClass, ACTOR__PHONE_NUMBER);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__ENTITY);
		createEAttribute(interactionEClass, INTERACTION__DIRECTION);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__CONFLICTS);
		createEAttribute(goalEClass, GOAL__PRIORITY);

		conflictEClass = createEClass(CONFLICT);
		createEReference(conflictEClass, CONFLICT__GOALS);
		createEAttribute(conflictEClass, CONFLICT__DEGREE);

		stakeHolderEClass = createEClass(STAKE_HOLDER);
		createEReference(stakeHolderEClass, STAKE_HOLDER__CONTRACTUAL_ELEMENTS);
		createEReference(stakeHolderEClass, STAKE_HOLDER__RATIONALES);

		requirementsGroupEClass = createEClass(REQUIREMENTS_GROUP);
		createEReference(requirementsGroupEClass, REQUIREMENTS_GROUP__REQUIREMENTS);
		createEReference(requirementsGroupEClass, REQUIREMENTS_GROUP__SPECIFICATION);

		abstractRequirementEClass = createEClass(ABSTRACT_REQUIREMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__CONTAINED_REQUIREMENTS);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__VERIFIED_BY);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__GROUP);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__RISK);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__ASSIGNED_VARIABLE);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__CONDITION_VARIABLES);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__REFINED_BY);
		createEReference(requirementEClass, REQUIREMENT__ASSUMPTIONS);
		createEReference(requirementEClass, REQUIREMENT__IMAGE_ASSUMPTION);
		createEReference(requirementEClass, REQUIREMENT__DERIVATIONS);
		createEReference(requirementEClass, REQUIREMENT__SUB_REQUIREMENTS);

		assumptionEClass = createEClass(ASSUMPTION);
		createEReference(assumptionEClass, ASSUMPTION__REQUIREMENTS);
		createEAttribute(assumptionEClass, ASSUMPTION__TYPE);
		createEReference(assumptionEClass, ASSUMPTION__IMAGE_REQUIREMENT);

		verificationActivityEClass = createEClass(VERIFICATION_ACTIVITY);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__REQUIREMENT);
		createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__VERIFICATION_METHOD);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__EXTERNAL_REF);
		createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__PASSED);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__EXPRESSION);

		refExpressionCollectedModelElementsEClass = createEClass(REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS);
		createEReference(refExpressionCollectedModelElementsEClass, REF_EXPRESSION_COLLECTED_MODEL_ELEMENTS__QUERY_EXPRESSION);

		refUserSelectedModelElementsEClass = createEClass(REF_USER_SELECTED_MODEL_ELEMENTS);

		referencedModelElementsEClass = createEClass(REFERENCED_MODEL_ELEMENTS);
		createEReference(referencedModelElementsEClass, REFERENCED_MODEL_ELEMENTS__MODEL_ELEMENT_REFERENCES);
		createEAttribute(referencedModelElementsEClass, REFERENCED_MODEL_ELEMENTS__AGREGATION_TYPE);

		modelElementReferenceEClass = createEClass(MODEL_ELEMENT_REFERENCE);
		createEReference(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__MODEL_ELEMENT);
		createEReference(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__PARENT);
		createEAttribute(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__WEIGHT);
		createEAttribute(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__VERIFIES);
		createEAttribute(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__SATISFACTION_LEVEL);
		createEAttribute(modelElementReferenceEClass, MODEL_ELEMENT_REFERENCE__REASON);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__SPECIFICATIONS);

		traceModelElementReferenceEClass = createEClass(TRACE_MODEL_ELEMENT_REFERENCE);
		createEAttribute(traceModelElementReferenceEClass, TRACE_MODEL_ELEMENT_REFERENCE__CONTAINER);

		requirementsCoverageDataEClass = createEClass(REQUIREMENTS_COVERAGE_DATA);
		createEAttribute(requirementsCoverageDataEClass, REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS);
		createEAttribute(requirementsCoverageDataEClass, REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__FEATURE);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		refDerivedModelElementsEClass = createEClass(REF_DERIVED_MODEL_ELEMENTS);

		rationaleEClass = createEClass(RATIONALE);
		createEReference(rationaleEClass, RATIONALE__CONTRACT);

		requirementsContainerEClass = createEClass(REQUIREMENTS_CONTAINER);
		createEAttribute(requirementsContainerEClass, REQUIREMENTS_CONTAINER__TYPE);
		createEReference(requirementsContainerEClass, REQUIREMENTS_CONTAINER__REQUIREMENT);
		createEReference(requirementsContainerEClass, REQUIREMENTS_CONTAINER__REQUIREMENTS);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		assumptionTypeEEnum = createEEnum(ASSUMPTION_TYPE);
		riskKindEEnum = createEEnum(RISK_KIND);
		verificationMethodEEnum = createEEnum(VERIFICATION_METHOD);
		agregationTypeEEnum = createEEnum(AGREGATION_TYPE);
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		containerTypeEEnum = createEEnum(CONTAINER_TYPE);

		// Create data types
		ratioEDataType = createEDataType(RATIO);
		positiveFactorEDataType = createEDataType(POSITIVE_FACTOR);
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SettingsPackage theSettingsPackage = (SettingsPackage)EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contractualElementEClass.getESuperTypes().add(this.getIdentifiedElement());
		uncertaintyEClass.getESuperTypes().add(this.getIdentifiedElement());
		verifiableElementEClass.getESuperTypes().add(this.getContractualElement());
		specificationEClass.getESuperTypes().add(this.getVerifiableElement());
		systemOverviewEClass.getESuperTypes().add(this.getContractualElement());
		systemContextEClass.getESuperTypes().add(this.getIdentifiedElement());
		actorEClass.getESuperTypes().add(this.getIdentifiedElement());
		interactionEClass.getESuperTypes().add(this.getIdentifiedElement());
		goalEClass.getESuperTypes().add(this.getContractualElement());
		conflictEClass.getESuperTypes().add(this.getIdentifiedElement());
		stakeHolderEClass.getESuperTypes().add(this.getActor());
		requirementsGroupEClass.getESuperTypes().add(this.getVerifiableElement());
		abstractRequirementEClass.getESuperTypes().add(this.getVerifiableElement());
		requirementEClass.getESuperTypes().add(this.getAbstractRequirement());
		assumptionEClass.getESuperTypes().add(this.getAbstractRequirement());
		verificationActivityEClass.getESuperTypes().add(this.getIdentifiedElement());
		refExpressionCollectedModelElementsEClass.getESuperTypes().add(this.getReferencedModelElements());
		refUserSelectedModelElementsEClass.getESuperTypes().add(this.getReferencedModelElements());
		referencedModelElementsEClass.getESuperTypes().add(this.getIdentifiedElement());
		modelElementReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());
		traceEClass.getESuperTypes().add(this.getReferencedModelElements());
		traceModelElementReferenceEClass.getESuperTypes().add(this.getModelElementReference());
		traceModelElementReferenceEClass.getESuperTypes().add(this.getRequirementsCoverageData());
		requirementsCoverageDataEClass.getESuperTypes().add(this.getIdentifiedElement());
		variableEClass.getESuperTypes().add(this.getIdentifiedElement());
		refDerivedModelElementsEClass.getESuperTypes().add(this.getReferencedModelElements());
		rationaleEClass.getESuperTypes().add(this.getIdentifiedElement());
		requirementsContainerEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractualElementEClass, ContractualElement.class, "ContractualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContractualElement_ChangeUncertainty(), this.getUncertainty(), null, "changeUncertainty", null, 1, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_Sources(), ecorePackage.getEString(), "sources", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_OriginDate(), this.getDate(), "originDate", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_ScheduleDate(), this.getDate(), "scheduleDate", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Stakeholders(), this.getStakeHolder(), this.getStakeHolder_ContractualElements(), "stakeholders", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_EvolvedTo(), this.getContractualElement(), null, "evolvedTo", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_TracedTo(), ecorePackage.getEObject(), null, "tracedTo", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_SatisfiedBy(), this.getReferencedModelElements(), null, "satisfiedBy", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Agents(), ecorePackage.getEObject(), null, "agents", null, 0, -1, ContractualElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_DerivedFrom(), ecorePackage.getEObject(), null, "derivedFrom", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_Dropped(), ecorePackage.getEBoolean(), "dropped", null, 1, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_DroppingReason(), ecorePackage.getEString(), "droppingReason", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_SatisfactionLevel(), this.getRatio(), "satisfactionLevel", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Rationales(), this.getRationale(), this.getRationale_Contract(), "rationales", null, 1, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContractualElement_TimeCriticality(), this.getRatio(), "timeCriticality", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_ContactInformation(), this.getActor(), null, "contactInformation", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Expression(), theConstraintsPackage.getExpression(), null, "expression", null, 1, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Condition(), theConstraintsPackage.getExpression(), null, "condition", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContractualElement_Modes(), ecorePackage.getEObject(), null, "modes", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyEClass, Uncertainty.class, "Uncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUncertainty_Volatility(), this.getRatio(), "volatility", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_CostsImpact(), this.getPositiveFactor(), "costsImpact", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_ScheduleImpact(), this.getPositiveFactor(), "scheduleImpact", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_Precedence(), this.getRatio(), "precedence", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_RiskIndex(), this.getRatio(), "riskIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_PropRiskIndex(), this.getRatio(), "propRiskIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_MaturityIndex(), this.getRatio(), "maturityIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(verifiableElementEClass, VerifiableElement.class, "VerifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerifiableElement_Verified(), ecorePackage.getEBooleanObject(), "verified", null, 0, 1, VerifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Actors(), this.getActor(), null, "actors", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_SystOverview(), this.getSystemOverview(), null, "systOverview", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_RequirementGroups(), this.getRequirementsGroup(), this.getRequirementsGroup_Specification(), "requirementGroups", null, 1, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_VerificationActivities(), this.getVerificationActivity(), null, "verificationActivities", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Conflicts(), this.getConflict(), null, "conflicts", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ConstraintLanguagesSpecification(), theConstraintsPackage.getConstraintLanguagesSpecification(), null, "constraintLanguagesSpecification", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Specifies(), ecorePackage.getEObject(), null, "specifies", null, 1, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_PrimaryActors(), ecorePackage.getEObject(), null, "primaryActors", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Version(), ecorePackage.getEString(), "version", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemOverviewEClass, SystemOverview.class, "SystemOverview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemOverview_Goals(), this.getGoal(), null, "goals", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_SystemToBe(), ecorePackage.getEObject(), null, "systemToBe", null, 1, 1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_Contexts(), this.getSystemContext(), null, "contexts", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_SystemBoundary(), this.getVariable(), null, "systemBoundary", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemOverview_Purpose(), ecorePackage.getEString(), "purpose", null, 1, 1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemOverview_Capabilities(), ecorePackage.getEString(), "capabilities", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemContextEClass, SystemContext.class, "SystemContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContext_GlobalSystem(), ecorePackage.getEObject(), null, "globalSystem", null, 1, 1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_Actors(), this.getActor(), null, "actors", null, 0, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_SystemBoundary(), this.getVariable(), null, "systemBoundary", null, 1, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_SystemModes(), ecorePackage.getEObject(), null, "systemModes", null, 0, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Images(), ecorePackage.getEObject(), null, "images", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Interactions(), this.getInteraction(), null, "interactions", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Address(), ecorePackage.getEString(), "address", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Email(), ecorePackage.getEString(), "email", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Entity(), ecorePackage.getEObject(), null, "entity", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Direction(), this.getDirection(), "direction", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Conflicts(), this.getConflict(), this.getConflict_Goals(), "conflicts", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Priority(), this.getRatio(), "priority", null, 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflict_Goals(), this.getGoal(), this.getGoal_Conflicts(), "goals", null, 2, 2, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflict_Degree(), this.getRatio(), "degree", null, 1, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stakeHolderEClass, StakeHolder.class, "StakeHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeHolder_ContractualElements(), this.getContractualElement(), this.getContractualElement_Stakeholders(), "contractualElements", null, 1, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStakeHolder_Rationales(), this.getRationale(), null, "rationales", null, 0, -1, StakeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsGroupEClass, RequirementsGroup.class, "RequirementsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsGroup_Requirements(), this.getAbstractRequirement(), this.getAbstractRequirement_Group(), "requirements", null, 1, -1, RequirementsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsGroup_Specification(), this.getSpecification(), this.getSpecification_RequirementGroups(), "specification", null, 1, 1, RequirementsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRequirementEClass, AbstractRequirement.class, "AbstractRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRequirement_ContainedRequirements(), this.getAbstractRequirement(), null, "containedRequirements", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_VerifiedBy(), this.getVerificationActivity(), this.getVerificationActivity_Requirement(), "verifiedBy", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_Group(), this.getRequirementsGroup(), this.getRequirementsGroup_Requirements(), "group", null, 1, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_Risk(), this.getRiskKind(), "risk", "Medium", 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_AssignedVariable(), this.getVariable(), null, "assignedVariable", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_ConditionVariables(), this.getVariable(), null, "conditionVariables", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_RefinedBY(), this.getRequirement(), null, "refinedBY", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Assumptions(), this.getAssumption(), this.getAssumption_Requirements(), "assumptions", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_ImageAssumption(), this.getAssumption(), this.getAssumption_ImageRequirement(), "imageAssumption", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Derivations(), this.getRequirement(), null, "derivations", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_SubRequirements(), this.getRequirementsContainer(), null, "subRequirements", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssumption_Requirements(), this.getRequirement(), this.getRequirement_Assumptions(), "requirements", null, 0, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssumption_Type(), this.getAssumptionType(), "type", null, 0, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssumption_ImageRequirement(), this.getRequirement(), this.getRequirement_ImageAssumption(), "imageRequirement", null, 0, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationActivityEClass, VerificationActivity.class, "VerificationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationActivity_Requirement(), this.getAbstractRequirement(), this.getAbstractRequirement_VerifiedBy(), "requirement", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationActivity_VerificationMethod(), this.getVerificationMethod(), "verificationMethod", "Test", 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationActivity_ExternalRef(), ecorePackage.getEObject(), null, "externalRef", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationActivity_Passed(), ecorePackage.getEBoolean(), "passed", null, 1, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationActivity_Expression(), theConstraintsPackage.getExpression(), null, "expression", null, 1, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refExpressionCollectedModelElementsEClass, RefExpressionCollectedModelElements.class, "RefExpressionCollectedModelElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefExpressionCollectedModelElements_QueryExpression(), theConstraintsPackage.getFormalLanguageExpression(), null, "queryExpression", null, 1, 1, RefExpressionCollectedModelElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refUserSelectedModelElementsEClass, RefUserSelectedModelElements.class, "RefUserSelectedModelElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencedModelElementsEClass, ReferencedModelElements.class, "ReferencedModelElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedModelElements_ModelElementReferences(), this.getModelElementReference(), this.getModelElementReference_Parent(), "modelElementReferences", null, 0, -1, ReferencedModelElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferencedModelElements_AgregationType(), this.getAgregationType(), "agregationType", null, 1, 1, ReferencedModelElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementReferenceEClass, ModelElementReference.class, "ModelElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementReference_ModelElement(), ecorePackage.getEObject(), null, "modelElement", null, 1, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementReference_Parent(), this.getReferencedModelElements(), this.getReferencedModelElements_ModelElementReferences(), "parent", null, 1, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementReference_Weight(), this.getRatio(), "weight", null, 0, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementReference_Verifies(), ecorePackage.getEBooleanObject(), "verifies", null, 0, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementReference_SatisfactionLevel(), this.getRatio(), "satisfactionLevel", null, 0, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElementReference_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, ModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Specifications(), this.getSpecification(), null, "specifications", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(traceEClass, this.getTraceModelElementReference(), "modelElementReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(traceModelElementReferenceEClass, TraceModelElementReference.class, "TraceModelElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceModelElementReference_Container(), ecorePackage.getEBoolean(), "container", null, 1, 1, TraceModelElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(traceModelElementReferenceEClass, null, "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTraceModelElementReference(), "modelElementReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requirementsCoverageDataEClass, RequirementsCoverageData.class, "RequirementsCoverageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsCoverageData_NbRequirements(), ecorePackage.getEInt(), "nbRequirements", null, 0, 1, RequirementsCoverageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementsCoverageData_VerificationLevel(), this.getRatio(), "verificationLevel", null, 0, 1, RequirementsCoverageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Feature(), ecorePackage.getEObject(), null, "feature", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getVariableType(), "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refDerivedModelElementsEClass, RefDerivedModelElements.class, "RefDerivedModelElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRationale_Contract(), this.getContractualElement(), this.getContractualElement_Rationales(), "contract", null, 1, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsContainerEClass, RequirementsContainer.class, "RequirementsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsContainer_Type(), this.getContainerType(), "type", "And", 0, 1, RequirementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsContainer_Requirement(), this.getRequirement(), null, "requirement", null, 0, 1, RequirementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsContainer_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, RequirementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.IN_OUT);

		initEEnum(assumptionTypeEEnum, AssumptionType.class, "AssumptionType");
		addEEnumLiteral(assumptionTypeEEnum, AssumptionType.TECHNICAL);
		addEEnumLiteral(assumptionTypeEEnum, AssumptionType.ORGANIZATIONAL);
		addEEnumLiteral(assumptionTypeEEnum, AssumptionType.MANAGERIAL);

		initEEnum(riskKindEEnum, RiskKind.class, "RiskKind");
		addEEnumLiteral(riskKindEEnum, RiskKind.HIGH);
		addEEnumLiteral(riskKindEEnum, RiskKind.MEDIUM);
		addEEnumLiteral(riskKindEEnum, RiskKind.LOW);

		initEEnum(verificationMethodEEnum, VerificationMethod.class, "VerificationMethod");
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.ANALYSIS);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.DEMONSTRATION);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.INSPECTION);
		addEEnumLiteral(verificationMethodEEnum, VerificationMethod.TEST);

		initEEnum(agregationTypeEEnum, AgregationType.class, "AgregationType");
		addEEnumLiteral(agregationTypeEEnum, AgregationType.COMPOSITION);
		addEEnumLiteral(agregationTypeEEnum, AgregationType.ALTERNATIVE);

		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.MONITORED);
		addEEnumLiteral(variableTypeEEnum, VariableType.CONTROLLED);
		addEEnumLiteral(variableTypeEEnum, VariableType.BOTH);

		initEEnum(containerTypeEEnum, ContainerType.class, "ContainerType");
		addEEnumLiteral(containerTypeEEnum, ContainerType.AND);
		addEEnumLiteral(containerTypeEEnum, ContainerType.OR);

		// Initialize data types
		initEDataType(ratioEDataType, Float.class, "Ratio", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveFactorEDataType, Float.class, "PositiveFactor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (ratioEDataType, 
		   source, 
		   new String[] {
			 "constraints", "rangeZeroOne"
		   });		
		addAnnotation
		  (refUserSelectedModelElementsEClass, 
		   source, 
		   new String[] {
			 "constraints", "modelElementsCardinality"
		   });		
		addAnnotation
		  (modelElementReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "modelElementsContainedInSpecifedArchSpecs"
		   });
	}

} //RdalPackageImpl
