/**
 */
package generator.gendataform.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gendataform</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GendataformTests extends TestSuite {

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
		TestSuite suite = new GendataformTests("gendataform Tests");
		suite.addTestSuite(DataFormDiagramGeneratorTest.class);
		suite.addTestSuite(DataFormModelGeneratorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataformTests(String name) {
		super(name);
	}

} //GendataformTests
