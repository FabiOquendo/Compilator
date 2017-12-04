/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent.tests;

import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory;
import compilator.domain.expression.expressionmodel.individualcomponent.Item;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemTest extends IndividualElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemTest.class);
	}

	/**
	 * Constructs a new Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Item getFixture() {
		return (Item)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IndividualcomponentFactory.eINSTANCE.createItem());
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

} //ItemTest
