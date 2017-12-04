/**
 */
package styles.domain;

import org.eclipse.emf.ecore.EObject;

import styles.ModelFactoryStyles;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.Domain#getModelFactoryStyles <em>Model Factory Styles</em>}</li>
 *   <li>{@link styles.domain.Domain#getTheStyleFactory <em>The Style Factory</em>}</li>
 *   <li>{@link styles.domain.Domain#getTheCharacteristicFactory <em>The Characteristic Factory</em>}</li>
 * </ul>
 *
 * @see styles.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory Styles</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link styles.ModelFactoryStyles#getTheDomainStyles <em>The Domain Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory Styles</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory Styles</em>' container reference.
	 * @see #setModelFactoryStyles(ModelFactoryStyles)
	 * @see styles.domain.DomainPackage#getDomain_ModelFactoryStyles()
	 * @see styles.ModelFactoryStyles#getTheDomainStyles
	 * @model opposite="theDomainStyles"
	 * @generated
	 */
	ModelFactoryStyles getModelFactoryStyles();

	/**
	 * Sets the value of the '{@link styles.domain.Domain#getModelFactoryStyles <em>Model Factory Styles</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory Styles</em>' container reference.
	 * @see #getModelFactoryStyles()
	 * @generated
	 */
	void setModelFactoryStyles(ModelFactoryStyles value);

	/**
	 * Returns the value of the '<em><b>The Style Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.StyleFactory#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Style Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Style Factory</em>' containment reference.
	 * @see #setTheStyleFactory(StyleFactory)
	 * @see styles.domain.DomainPackage#getDomain_TheStyleFactory()
	 * @see styles.domain.StyleFactory#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	StyleFactory getTheStyleFactory();

	/**
	 * Sets the value of the '{@link styles.domain.Domain#getTheStyleFactory <em>The Style Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Style Factory</em>' containment reference.
	 * @see #getTheStyleFactory()
	 * @generated
	 */
	void setTheStyleFactory(StyleFactory value);

	/**
	 * Returns the value of the '<em><b>The Characteristic Factory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.CharacteristicFactory#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Characteristic Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Characteristic Factory</em>' containment reference.
	 * @see #setTheCharacteristicFactory(CharacteristicFactory)
	 * @see styles.domain.DomainPackage#getDomain_TheCharacteristicFactory()
	 * @see styles.domain.CharacteristicFactory#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	CharacteristicFactory getTheCharacteristicFactory();

	/**
	 * Sets the value of the '{@link styles.domain.Domain#getTheCharacteristicFactory <em>The Characteristic Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Characteristic Factory</em>' containment reference.
	 * @see #getTheCharacteristicFactory()
	 * @generated
	 */
	void setTheCharacteristicFactory(CharacteristicFactory value);

} // Domain
