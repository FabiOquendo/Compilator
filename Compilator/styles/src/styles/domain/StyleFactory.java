/**
 */
package styles.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.StyleFactory#getDomain <em>Domain</em>}</li>
 *   <li>{@link styles.domain.StyleFactory#getListStyle <em>List Style</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getStyleFactory()
 * @model
 * @generated
 */
public interface StyleFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.Domain#getTheStyleFactory <em>The Style Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see styles.domain.DomainPackage#getStyleFactory_Domain()
	 * @see styles.domain.Domain#getTheStyleFactory
	 * @model opposite="theStyleFactory"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link styles.domain.StyleFactory#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference list.
	 * The list contents are of type {@link styles.domain.Style}.
	 * It is bidirectional and its opposite is '{@link styles.domain.Style#getStyleFactory <em>Style Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference list.
	 * @see styles.domain.DomainPackage#getStyleFactory_ListStyle()
	 * @see styles.domain.Style#getStyleFactory
	 * @model opposite="StyleFactory" containment="true"
	 * @generated
	 */
	EList<Style> getListStyle();

} // StyleFactory
