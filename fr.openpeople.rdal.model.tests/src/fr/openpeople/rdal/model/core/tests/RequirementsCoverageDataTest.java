/**
 */
package fr.openpeople.rdal.model.core.tests;

import fr.openpeople.rdal.model.core.CoreFactory;
import fr.openpeople.rdal.model.core.RequirementsCoverageData;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirements Coverage Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsCoverageDataTest extends IdentifiedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsCoverageDataTest.class);
	}

	/**
	 * Constructs a new Requirements Coverage Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsCoverageDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirements Coverage Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementsCoverageData getFixture() {
		return (RequirementsCoverageData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createRequirementsCoverageData());
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

} //RequirementsCoverageDataTest
