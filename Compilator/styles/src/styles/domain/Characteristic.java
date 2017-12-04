/**
 */
package styles.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.Characteristic#getName <em>Name</em>}</li>
 *   <li>{@link styles.domain.Characteristic#getListProperties <em>List Properties</em>}</li>
 *   <li>{@link styles.domain.Characteristic#getTheSytle <em>The Sytle</em>}</li>
 *   <li>{@link styles.domain.Characteristic#getCharacteristicFactory <em>Characteristic Factory</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends EObject {
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
	 * @see styles.domain.DomainPackage#getCharacteristic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link styles.domain.Characteristic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Properties</b></em>' containment reference list.
	 * The list contents are of type {@link styles.domain.Propertie}.
	 * It is bidirectional and its opposite is '{@link styles.domain.Propertie#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Properties</em>' containment reference list.
	 * @see styles.domain.DomainPackage#getCharacteristic_ListProperties()
	 * @see styles.domain.Propertie#getCharacteristic
	 * @model opposite="Characteristic" containment="true"
	 * @generated
	 */
	EList<Propertie> getListProperties();

	/**
	 * Returns the value of the '<em><b>The Sytle</b></em>' reference list.
	 * The list contents are of type {@link styles.domain.Style}.
	 * It is bidirectional and its opposite is '{@link styles.domain.Style#getTheCharacteristic <em>The Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Sytle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Sytle</em>' reference list.
	 * @see styles.domain.DomainPackage#getCharacteristic_TheSytle()
	 * @see styles.domain.Style#getTheCharacteristic
	 * @model opposite="theCharacteristic"
	 * @generated
	 */
	EList<Style> getTheSytle();

	/**
	 * Returns the value of the '<em><b>Characteristic Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.CharacteristicFactory#getListCharacteristic <em>List Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Factory</em>' container reference.
	 * @see #setCharacteristicFactory(CharacteristicFactory)
	 * @see styles.domain.DomainPackage#getCharacteristic_CharacteristicFactory()
	 * @see styles.domain.CharacteristicFactory#getListCharacteristic
	 * @model opposite="listCharacteristic"
	 * @generated
	 */
	CharacteristicFactory getCharacteristicFactory();

	/**
	 * Sets the value of the '{@link styles.domain.Characteristic#getCharacteristicFactory <em>Characteristic Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic Factory</em>' container reference.
	 * @see #getCharacteristicFactory()
	 * @generated
	 */
	void setCharacteristicFactory(CharacteristicFactory value);

} // Characteristic
