/**
 */
package styles.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.CharacteristicFactory#getDomain <em>Domain</em>}</li>
 *   <li>{@link styles.domain.CharacteristicFactory#getListCharacteristic <em>List Characteristic</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getCharacteristicFactory()
 * @model
 * @generated
 */
public interface CharacteristicFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.Domain#getTheCharacteristicFactory <em>The Characteristic Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see styles.domain.DomainPackage#getCharacteristicFactory_Domain()
	 * @see styles.domain.Domain#getTheCharacteristicFactory
	 * @model opposite="theCharacteristicFactory"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link styles.domain.CharacteristicFactory#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>List Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link styles.domain.Characteristic}.
	 * It is bidirectional and its opposite is '{@link styles.domain.Characteristic#getCharacteristicFactory <em>Characteristic Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Characteristic</em>' containment reference list.
	 * @see styles.domain.DomainPackage#getCharacteristicFactory_ListCharacteristic()
	 * @see styles.domain.Characteristic#getCharacteristicFactory
	 * @model opposite="CharacteristicFactory" containment="true"
	 * @generated
	 */
	EList<Characteristic> getListCharacteristic();

} // CharacteristicFactory
