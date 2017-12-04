/**
 */
package compilator.domain.expression.expressionmodel;

import compilator.domain.expression.Expression;

import compilator.domain.expression.sentence.Sentence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.ExpressionModel#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence <em>The Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.ExpressionModel#getListElements <em>List Elements</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getExpressionModel()
 * @model
 * @generated
 */
public interface ExpressionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.Expression#getTheExpressionModel <em>The Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' container reference.
	 * @see #setExpression(Expression)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getExpressionModel_Expression()
	 * @see compilator.domain.expression.Expression#getTheExpressionModel
	 * @model opposite="theExpressionModel"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getExpression <em>Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' container reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>The Sentence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.sentence.Sentence#getTheExpressionModel <em>The Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Sentence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Sentence</em>' reference.
	 * @see #setTheSentence(Sentence)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getExpressionModel_TheSentence()
	 * @see compilator.domain.expression.sentence.Sentence#getTheExpressionModel
	 * @model opposite="theExpressionModel" required="true"
	 * @generated
	 */
	Sentence getTheSentence();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence <em>The Sentence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Sentence</em>' reference.
	 * @see #getTheSentence()
	 * @generated
	 */
	void setTheSentence(Sentence value);

	/**
	 * Returns the value of the '<em><b>List Elements</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.expressionmodel.Element}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.Element#getExpressionModel <em>Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elements</em>' containment reference list.
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getExpressionModel_ListElements()
	 * @see compilator.domain.expression.expressionmodel.Element#getExpressionModel
	 * @model opposite="ExpressionModel" containment="true"
	 * @generated
	 */
	EList<Element> getListElements();

} // ExpressionModel
