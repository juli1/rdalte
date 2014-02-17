/**
 */
package fr.openpeople.rdal.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal.model.core.Rationale#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal.model.core.CorePackage#getRationale()
 * @model
 * @generated
 */
public interface Rationale extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal.model.core.ContractualElement#getRationales <em>Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' container reference.
	 * @see #setContract(ContractualElement)
	 * @see fr.openpeople.rdal.model.core.CorePackage#getRationale_Contract()
	 * @see fr.openpeople.rdal.model.core.ContractualElement#getRationales
	 * @model opposite="rationales" required="true" transient="false"
	 * @generated
	 */
	ContractualElement getContract();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal.model.core.Rationale#getContract <em>Contract</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' container reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(ContractualElement value);

} // Rationale
