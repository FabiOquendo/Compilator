/**
 */
package compilator.domain.expression.sentence.tests;

import compilator.domain.expression.sentence.Sentence;
import compilator.domain.expression.sentence.SentenceFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SentenceTest extends TestCase {

	/**
	 * The fixture for this Sentence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sentence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SentenceTest.class);
	}

	/**
	 * Constructs a new Sentence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sentence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sentence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sentence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sentence getFixture() {
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
		setFixture(SentenceFactory.eINSTANCE.createSentence());
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

} //SentenceTest
