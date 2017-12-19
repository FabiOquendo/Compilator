/**
 */
package compilator.domain;

import compilator.domain.expression.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.Log#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.domain.Log#getListExpressions <em>List Expressions</em>}</li>
 * </ul>
 *
 * @see compilator.domain.DomainPackage#getLog()
 * @model
 * @generated
 */
public interface Log extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Domain#getTheLog <em>The Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see compilator.domain.DomainPackage#getLog_TheDomain()
	 * @see compilator.domain.Domain#getTheLog
	 * @model opposite="theLog"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link compilator.domain.Log#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>List Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.Expression}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.Expression#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Expressions</em>' containment reference list.
	 * @see compilator.domain.DomainPackage#getLog_ListExpressions()
	 * @see compilator.domain.expression.Expression#getLog
	 * @model opposite="Log" containment="true"
	 * @generated
	 */
	EList<Expression> getListExpressions();

} // Log
