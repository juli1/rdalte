/**
 */
package fr.openpeople.rdal.model.core.tests;

import fr.openpeople.rdal.model.core.CoreFactory;
import fr.openpeople.rdal.model.core.RefUserSelectedModelElements;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ref User Selected Model Elements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefUserSelectedModelElementsTest extends ReferencedModelElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RefUserSelectedModelElementsTest.class);
	}

	/**
	 * Constructs a new Ref User Selected Model Elements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUserSelectedModelElementsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ref User Selected Model Elements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RefUserSelectedModelElements getFixture() {
		return (RefUserSelectedModelElements)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createRefUserSelectedModelElements());
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

} //RefUserSelectedModelElementsTest
