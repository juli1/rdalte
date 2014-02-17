/**
 */
package fr.openpeople.rdal.model.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>core</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CoreTests("core Tests");
		suite.addTestSuite(UncertaintyTest.class);
		suite.addTestSuite(SpecificationTest.class);
		suite.addTestSuite(SystemOverviewTest.class);
		suite.addTestSuite(GoalTest.class);
		suite.addTestSuite(RequirementsGroupTest.class);
		suite.addTestSuite(RequirementTest.class);
		suite.addTestSuite(AssumptionTest.class);
		suite.addTestSuite(TraceTest.class);
		suite.addTestSuite(TraceModelElementReferenceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreTests(String name) {
		super(name);
	}

} //CoreTests
