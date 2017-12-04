/**
 */
package compilator.domain.generator.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>generator</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorTests extends TestSuite {

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
		TestSuite suite = new GeneratorTests("generator Tests");
		suite.addTestSuite(ExpressionModelManagerTest.class);
		suite.addTestSuite(ComponentModelGeneratorTest.class);
		suite.addTestSuite(ExpressionModelGeneratorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTests(String name) {
		super(name);
	}

} //GeneratorTests
