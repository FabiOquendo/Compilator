/**
 */
package styles.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import styles.domain.DomainFactory;
import styles.domain.StyleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Style Factory</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleFactoryTest extends TestCase {

	/**
	 * The fixture for this Style Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleFactory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StyleFactoryTest.class);
	}

	/**
	 * Constructs a new Style Factory test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Style Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StyleFactory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Style Factory test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleFactory getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createStyleFactory());
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

} //StyleFactoryTest
