/**
 */
package compilator.domain.expression.sentence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see compilator.domain.expression.sentence.SentenceFactory
 * @model kind="package"
 * @generated
 */
public interface SentencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sentence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/expression/sentence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.expression.sentence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SentencePackage eINSTANCE = compilator.domain.expression.sentence.impl.SentencePackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.expression.sentence.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.sentence.impl.SentenceImpl
	 * @see compilator.domain.expression.sentence.impl.SentencePackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>The Expression Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__THE_EXPRESSION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Compressed Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__COMPRESSED_SENTENCE = 2;

	/**
	 * The feature id for the '<em><b>Full Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__FULL_SENTENCE = 3;

	/**
	 * The feature id for the '<em><b>Text Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__TEXT_STYLES = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__COMPONENT = 5;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.sentence.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see compilator.domain.expression.sentence.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.sentence.Sentence#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Expression</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getExpression()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Expression();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.expression.sentence.Sentence#getTheExpressionModel <em>The Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Expression Model</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getTheExpressionModel()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_TheExpressionModel();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.sentence.Sentence#getCompressedSentence <em>Compressed Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compressed Sentence</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getCompressedSentence()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_CompressedSentence();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.sentence.Sentence#getFullSentence <em>Full Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Sentence</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getFullSentence()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_FullSentence();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.sentence.Sentence#getTextStyles <em>Text Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Styles</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getTextStyles()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_TextStyles();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.sentence.Sentence#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see compilator.domain.expression.sentence.Sentence#getComponent()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Component();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SentenceFactory getSentenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link compilator.domain.expression.sentence.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.sentence.impl.SentenceImpl
		 * @see compilator.domain.expression.sentence.impl.SentencePackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__EXPRESSION = eINSTANCE.getSentence_Expression();

		/**
		 * The meta object literal for the '<em><b>The Expression Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__THE_EXPRESSION_MODEL = eINSTANCE.getSentence_TheExpressionModel();

		/**
		 * The meta object literal for the '<em><b>Compressed Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__COMPRESSED_SENTENCE = eINSTANCE.getSentence_CompressedSentence();

		/**
		 * The meta object literal for the '<em><b>Full Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__FULL_SENTENCE = eINSTANCE.getSentence_FullSentence();

		/**
		 * The meta object literal for the '<em><b>Text Styles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__TEXT_STYLES = eINSTANCE.getSentence_TextStyles();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__COMPONENT = eINSTANCE.getSentence_Component();

	}

} //SentencePackage
