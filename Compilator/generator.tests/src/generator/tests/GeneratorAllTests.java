/**
 */
package generator.tests;

import generator.gendataform.tests.GendataformTests;

import generator.genmodel.gencontainercomponent.gencontainer.tests.GencontainerTests;

import generator.genmodel.gencontainercomponent.tests.GencontainercomponentTests;

import generator.genmodel.genindividualcomponent.genbutton.tests.GenbuttonTests;

import generator.genmodel.genindividualcomponent.gencolunm.tests.GencolunmTests;

import generator.genmodel.genindividualcomponent.gencombobox.tests.GencomboboxTests;

import generator.genmodel.genindividualcomponent.genlabel.tests.GenlabelTests;

import generator.genmodel.genindividualcomponent.gentable.tests.GentableTests;

import generator.genmodel.genindividualcomponent.gentextfield.tests.GentextfieldTests;

import generator.genmodel.genindividualcomponent.tests.GenindividualcomponentTests;

import generator.genmodel.tests.GenmodelTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Generator</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorAllTests extends TestSuite {

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
		TestSuite suite = new GeneratorAllTests("Generator Tests");
		suite.addTest(GeneratorTests.suite());
		suite.addTest(GenmodelTests.suite());
		suite.addTest(GenindividualcomponentTests.suite());
		suite.addTest(GenbuttonTests.suite());
		suite.addTest(GencolunmTests.suite());
		suite.addTest(GencomboboxTests.suite());
		suite.addTest(GenlabelTests.suite());
		suite.addTest(GentableTests.suite());
		suite.addTest(GentextfieldTests.suite());
		suite.addTest(GencontainercomponentTests.suite());
		suite.addTest(GencontainerTests.suite());
		suite.addTest(GendataformTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAllTests(String name) {
		super(name);
	}

} //GeneratorAllTests
