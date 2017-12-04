/**
 */
package styles.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propertie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.Propertie#getName <em>Name</em>}</li>
 *   <li>{@link styles.domain.Propertie#getValue <em>Value</em>}</li>
 *   <li>{@link styles.domain.Propertie#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getPropertie()
 * @model
 * @generated
 */
public interface Propertie extends EObject {
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
	 * @see styles.domain.DomainPackage#getPropertie_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link styles.domain.Propertie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see styles.domain.DomainPackage#getPropertie_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link styles.domain.Propertie#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.Characteristic#getListProperties <em>List Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' container reference.
	 * @see #setCharacteristic(Characteristic)
	 * @see styles.domain.DomainPackage#getPropertie_Characteristic()
	 * @see styles.domain.Characteristic#getListProperties
	 * @model opposite="listProperties"
	 * @generated
	 */
	Characteristic getCharacteristic();

	/**
	 * Sets the value of the '{@link styles.domain.Propertie#getCharacteristic <em>Characteristic</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic</em>' container reference.
	 * @see #getCharacteristic()
	 * @generated
	 */
	void setCharacteristic(Characteristic value);

} // Propertie
