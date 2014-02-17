/**
 */
package fr.openpeople.rdal.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.RequirementsContainer#getContainedRequirements <em>Contained Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.RequirementsContainer#getType <em>Type</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.RequirementsContainer#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirementsContainer()
 * @model
 * @generated
 */
public interface RequirementsContainer extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Contained Requirements</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal.model.core.AbstractRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Requirements</em>' reference list.
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirementsContainer_ContainedRequirements()
	 * @model
	 * @generated
	 */
	EList<AbstractRequirement> getContainedRequirements();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link fr.openpeople.rdal.model.core.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.ContainerType
	 * @see #setType(ContainerType)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirementsContainer_Type()
	 * @model default="And"
	 * @generated
	 */
	ContainerType getType();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.RequirementsContainer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.ContainerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContainerType value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(AbstractRequirement)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRequirementsContainer_Requirement()
	 * @model
	 * @generated
	 */
	AbstractRequirement getRequirement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.RequirementsContainer#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(AbstractRequirement value);

} // RequirementsContainer
