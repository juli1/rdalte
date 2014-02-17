/**
 */
package fr.openpeople.rdal.model.tests;

import fr.openpeople.rdal.model.core.tests.CoreTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Rdal</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdalAllTests extends TestSuite {

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
		TestSuite suite = new RdalAllTests("Rdal Tests");
		suite.addTest(CoreTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalAllTests(String name) {
		super(name);
	}

} //RdalAllTests
