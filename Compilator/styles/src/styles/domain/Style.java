/**
 */
package styles.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.Style#getName <em>Name</em>}</li>
 *   <li>{@link styles.domain.Style#getTheCharacteristic <em>The Characteristic</em>}</li>
 *   <li>{@link styles.domain.Style#getStyleFactory <em>Style Factory</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject {
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
	 * @see styles.domain.DomainPackage#getStyle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link styles.domain.Style#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>The Characteristic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.Characteristic#getTheSytle <em>The Sytle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Characteristic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Characteristic</em>' reference.
	 * @see #setTheCharacteristic(Characteristic)
	 * @see styles.domain.DomainPackage#getStyle_TheCharacteristic()
	 * @see styles.domain.Characteristic#getTheSytle
	 * @model opposite="theSytle" required="true"
	 * @generated
	 */
	Characteristic getTheCharacteristic();

	/**
	 * Sets the value of the '{@link styles.domain.Style#getTheCharacteristic <em>The Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Characteristic</em>' reference.
	 * @see #getTheCharacteristic()
	 * @generated
	 */
	void setTheCharacteristic(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Style Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.StyleFactory#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Factory</em>' container reference.
	 * @see #setStyleFactory(StyleFactory)
	 * @see styles.domain.DomainPackage#getStyle_StyleFactory()
	 * @see styles.domain.StyleFactory#getListStyle
	 * @model opposite="listStyle"
	 * @generated
	 */
	StyleFactory getStyleFactory();

	/**
	 * Sets the value of the '{@link styles.domain.Style#getStyleFactory <em>Style Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Factory</em>' container reference.
	 * @see #getStyleFactory()
	 * @generated
	 */
	void setStyleFactory(StyleFactory value);

} // Style
