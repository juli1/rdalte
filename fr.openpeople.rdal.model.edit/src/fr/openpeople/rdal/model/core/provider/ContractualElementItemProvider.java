/**
 */
package fr.openpeople.rdal.model.core.provider;


import fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory;

import fr.openpeople.rdal.model.core.ContractualElement;
import fr.openpeople.rdal.model.core.CoreFactory;
import fr.openpeople.rdal.model.core.CorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.openpeople.rdal.model.core.ContractualElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractualElementItemProvider
	extends IdentifiedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractualElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcesPropertyDescriptor(object);
			addOriginDatePropertyDescriptor(object);
			addScheduleDatePropertyDescriptor(object);
			addStakeholdersPropertyDescriptor(object);
			addEvolvedToPropertyDescriptor(object);
			addTracedToPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addAgentsPropertyDescriptor(object);
			addDerivedFromPropertyDescriptor(object);
			addDroppedPropertyDescriptor(object);
			addDroppingReasonPropertyDescriptor(object);
			addSatisfactionLevelPropertyDescriptor(object);
			addTimeCriticalityPropertyDescriptor(object);
			addContactInformationPropertyDescriptor(object);
			addModesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_sources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_sources_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__SOURCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_originDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_originDate_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__ORIGIN_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_scheduleDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_scheduleDate_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__SCHEDULE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stakeholders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_stakeholders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_stakeholders_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__STAKEHOLDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolved To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolvedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_evolvedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_evolvedTo_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__EVOLVED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Traced To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTracedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_tracedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_tracedTo_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__TRACED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_category_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_agents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_agents_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__AGENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_derivedFrom_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__DERIVED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dropped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDroppedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_dropped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_dropped_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__DROPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dropping Reason feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDroppingReasonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_droppingReason_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_droppingReason_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__DROPPING_REASON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Satisfaction Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatisfactionLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_satisfactionLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_satisfactionLevel_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Criticality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeCriticalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_timeCriticality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_timeCriticality_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__TIME_CRITICALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_contactInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_contactInformation_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContractualElement_modes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContractualElement_modes_feature", "_UI_ContractualElement_type"),
				 CorePackage.Literals.CONTRACTUAL_ELEMENT__MODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY);
			childrenFeatures.add(CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFIED_BY);
			childrenFeatures.add(CorePackage.Literals.CONTRACTUAL_ELEMENT__RATIONALES);
			childrenFeatures.add(CorePackage.Literals.CONTRACTUAL_ELEMENT__EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CONTRACTUAL_ELEMENT__CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContractualElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContractualElement_type") :
			getString("_UI_ContractualElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ContractualElement.class)) {
			case CorePackage.CONTRACTUAL_ELEMENT__SOURCES:
			case CorePackage.CONTRACTUAL_ELEMENT__ORIGIN_DATE:
			case CorePackage.CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPED:
			case CorePackage.CONTRACTUAL_ELEMENT__DROPPING_REASON:
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFACTION_LEVEL:
			case CorePackage.CONTRACTUAL_ELEMENT__TIME_CRITICALITY:
			case CorePackage.CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
			case CorePackage.CONTRACTUAL_ELEMENT__SATISFIED_BY:
			case CorePackage.CONTRACTUAL_ELEMENT__RATIONALES:
			case CorePackage.CONTRACTUAL_ELEMENT__EXPRESSION:
			case CorePackage.CONTRACTUAL_ELEMENT__CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY,
				 CoreFactory.eINSTANCE.createUncertainty()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFIED_BY,
				 CoreFactory.eINSTANCE.createRefExpressionCollectedModelElements()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFIED_BY,
				 CoreFactory.eINSTANCE.createRefUserSelectedModelElements()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFIED_BY,
				 CoreFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__SATISFIED_BY,
				 CoreFactory.eINSTANCE.createRefDerivedModelElements()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__RATIONALES,
				 CoreFactory.eINSTANCE.createRationale()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__EXPRESSION,
				 ConstraintsFactory.eINSTANCE.createFormalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__EXPRESSION,
				 ConstraintsFactory.eINSTANCE.createNaturalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__CONDITION,
				 ConstraintsFactory.eINSTANCE.createFormalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CONTRACTUAL_ELEMENT__CONDITION,
				 ConstraintsFactory.eINSTANCE.createNaturalLanguageExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.CONTRACTUAL_ELEMENT__EXPRESSION ||
			childFeature == CorePackage.Literals.CONTRACTUAL_ELEMENT__CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
