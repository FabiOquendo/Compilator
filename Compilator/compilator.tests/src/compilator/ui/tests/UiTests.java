/**
 */
package compilator.ui.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ui</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiTests extends TestSuite {

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
		TestSuite suite = new UiTests("ui Tests");
		suite.addTestSuite(UITest.class);
		suite.addTestSuite(StylesConainerTest.class);
		suite.addTestSuite(ComponentsContainerTest.class);
		suite.addTestSuite(ExpressionContainerTest.class);
		suite.addTestSuite(StyleAssigmentContainerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTests(String name) {
		super(name);
	}

} //UiTests
