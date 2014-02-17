/**
 */
package fr.openpeople.rdal.model.core.tests;

import fr.openpeople.rdal.model.core.CoreFactory;
import fr.openpeople.rdal.model.core.RefDerivedModelElements;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ref Derived Model Elements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefDerivedModelElementsTest extends ReferencedModelElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RefDerivedModelElementsTest.class);
	}

	/**
	 * Constructs a new Ref Derived Model Elements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDerivedModelElementsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ref Derived Model Elements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RefDerivedModelElements getFixture() {
		return (RefDerivedModelElements)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createRefDerivedModelElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RefDerivedModelElementsTest
