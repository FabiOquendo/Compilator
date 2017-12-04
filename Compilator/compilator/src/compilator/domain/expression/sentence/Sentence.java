/**
 */
package compilator.domain.expression.sentence;

import compilator.domain.expression.Expression;

import compilator.domain.expression.expressionmodel.ExpressionModel;

import compilator.domain.shapes.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getTheExpressionModel <em>The Expression Model</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getCompressedSentence <em>Compressed Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getFullSentence <em>Full Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getTextStyles <em>Text Styles</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.Sentence#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.sentence.SentencePackage#getSentence()
 * @model
 * @generated
 */
public interface Sentence extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.Expression#getTheSentence <em>The Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' container reference.
	 * @see #setExpression(Expression)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_Expression()
	 * @see compilator.domain.expression.Expression#getTheSentence
	 * @model opposite="theSentence"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getExpression <em>Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' container reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>The Expression Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence <em>The Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Expression Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Expression Model</em>' reference.
	 * @see #setTheExpressionModel(ExpressionModel)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_TheExpressionModel()
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence
	 * @model opposite="theSentence" required="true"
	 * @generated
	 */
	ExpressionModel getTheExpressionModel();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getTheExpressionModel <em>The Expression Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Expression Model</em>' reference.
	 * @see #getTheExpressionModel()
	 * @generated
	 */
	void setTheExpressionModel(ExpressionModel value);

	/**
	 * Returns the value of the '<em><b>Compressed Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressed Sentence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressed Sentence</em>' attribute.
	 * @see #setCompressedSentence(String)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_CompressedSentence()
	 * @model
	 * @generated
	 */
	String getCompressedSentence();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getCompressedSentence <em>Compressed Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed Sentence</em>' attribute.
	 * @see #getCompressedSentence()
	 * @generated
	 */
	void setCompressedSentence(String value);

	/**
	 * Returns the value of the '<em><b>Full Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Sentence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Sentence</em>' attribute.
	 * @see #setFullSentence(String)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_FullSentence()
	 * @model
	 * @generated
	 */
	String getFullSentence();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getFullSentence <em>Full Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Sentence</em>' attribute.
	 * @see #getFullSentence()
	 * @generated
	 */
	void setFullSentence(String value);

	/**
	 * Returns the value of the '<em><b>Text Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Styles</em>' attribute.
	 * @see #setTextStyles(String)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_TextStyles()
	 * @model
	 * @generated
	 */
	String getTextStyles();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getTextStyles <em>Text Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Styles</em>' attribute.
	 * @see #getTextStyles()
	 * @generated
	 */
	void setTextStyles(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.shapes.Component#getTheSentence <em>The Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see compilator.domain.expression.sentence.SentencePackage#getSentence_Component()
	 * @see compilator.domain.shapes.Component#getTheSentence
	 * @model opposite="theSentence"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.sentence.Sentence#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // Sentence
