/**
 */
package styles.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import styles.domain.CharacteristicFactory;
import styles.domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Characteristic Factory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacteristicFactoryTest extends TestCase {

	/**
	 * The fixture for this Characteristic Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicFactory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CharacteristicFactoryTest.class);
	}

	/**
	 * Constructs a new Characteristic Factory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicFactoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Characteristic Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CharacteristicFactory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Characteristic Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicFactory getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createCharacteristicFactory());
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

} //CharacteristicFactoryTest
