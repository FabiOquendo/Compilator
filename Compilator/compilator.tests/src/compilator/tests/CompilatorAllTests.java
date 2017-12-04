/**
 */
package compilator.tests;

import compilator.domain.generator.tests.GeneratorTests;

import compilator.domain.tests.DomainTests;

import compilator.ui.tests.UiTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Compilator</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilatorAllTests extends TestSuite {

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
		TestSuite suite = new CompilatorAllTests("Compilator Tests");
		suite.addTest(CompilatorTests.suite());
		suite.addTest(DomainTests.suite());
		suite.addTest(GeneratorTests.suite());
		suite.addTest(UiTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilatorAllTests(String name) {
		super(name);
	}

} //CompilatorAllTests
