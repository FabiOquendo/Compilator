/**
 */
package compilator.domain.expression;

import compilator.domain.Domain;
import compilator.domain.Log;

import compilator.domain.expression.expressionmodel.ExpressionModel;

import compilator.domain.expression.sentence.Sentence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.Expression#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.domain.expression.Expression#getLog <em>Log</em>}</li>
 *   <li>{@link compilator.domain.expression.Expression#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.expression.Expression#getTheSentence <em>The Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.Expression#getTheExpressionModel <em>The Expression Model</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.ExpressionPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Domain#getTheExpression <em>The Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see compilator.domain.expression.ExpressionPackage#getExpression_TheDomain()
	 * @see compilator.domain.Domain#getTheExpression
	 * @model opposite="theExpression"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.Expression#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Log#getListExpressions <em>List Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' container reference.
	 * @see #setLog(Log)
	 * @see compilator.domain.expression.ExpressionPackage#getExpression_Log()
	 * @see compilator.domain.Log#getListExpressions
	 * @model opposite="listExpressions"
	 * @generated
	 */
	Log getLog();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.Expression#getLog <em>Log</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' container reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(Log value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see compilator.domain.expression.ExpressionPackage#getExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.Expression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>The Sentence</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.sentence.Sentence#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Sentence</em>' containment reference.
	 * @see #setTheSentence(Sentence)
	 * @see compilator.domain.expression.ExpressionPackage#getExpression_TheSentence()
	 * @see compilator.domain.expression.sentence.Sentence#getExpression
	 * @model opposite="Expression" containment="true" required="true"
	 * @generated
	 */
	Sentence getTheSentence();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.Expression#getTheSentence <em>The Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Sentence</em>' containment reference.
	 * @see #getTheSentence()
	 * @generated
	 */
	void setTheSentence(Sentence value);

	/**
	 * Returns the value of the '<em><b>The Expression Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Expression Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Expression Model</em>' containment reference.
	 * @see #setTheExpressionModel(ExpressionModel)
	 * @see compilator.domain.expression.ExpressionPackage#getExpression_TheExpressionModel()
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getExpression
	 * @model opposite="Expression" containment="true" required="true"
	 * @generated
	 */
	ExpressionModel getTheExpressionModel();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.Expression#getTheExpressionModel <em>The Expression Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Expression Model</em>' containment reference.
	 * @see #getTheExpressionModel()
	 * @generated
	 */
	void setTheExpressionModel(ExpressionModel value);

} // Expression
