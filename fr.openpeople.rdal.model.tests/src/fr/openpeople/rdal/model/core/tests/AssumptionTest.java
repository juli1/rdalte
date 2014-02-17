/**
 */
package fr.openpeople.rdal.model.core.tests;

import fr.openpeople.rdal.model.core.Assumption;
import fr.openpeople.rdal.model.core.CoreFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssumptionTest extends AbstractRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssumptionTest.class);
	}

	/**
	 * Constructs a new Assumption test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssumptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assumption test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Assumption getFixture() {
		return (Assumption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createAssumption());
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

} //AssumptionTest
