/**
 */
package fr.openpeople.rdal.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.Variable#getFeature <em>Feature</em>}</li>
 *   <li>{@link fr.openpeople.rdal.model.core.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EObject)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVariable_Feature()
	 * @model required="true"
	 * @generated
	 */
	EObject getFeature();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Variable#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.openpeople.rdal.model.core.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.VariableType
	 * @see #setType(VariableType)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal.model.core.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

} // Variable
