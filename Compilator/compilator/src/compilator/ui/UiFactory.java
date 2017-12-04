/**
 */
package compilator.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see compilator.ui.UiPackage
 * @generated
 */
public interface UiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiFactory eINSTANCE = compilator.ui.impl.UiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI</em>'.
	 * @generated
	 */
	UI createUI();

	/**
	 * Returns a new object of class '<em>Styles Conainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styles Conainer</em>'.
	 * @generated
	 */
	StylesConainer createStylesConainer();

	/**
	 * Returns a new object of class '<em>Components Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Container</em>'.
	 * @generated
	 */
	ComponentsContainer createComponentsContainer();

	/**
	 * Returns a new object of class '<em>Characteristicst Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristicst Container</em>'.
	 * @generated
	 */
	CharacteristicstContainer createCharacteristicstContainer();

	/**
	 * Returns a new object of class '<em>Expression Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Container</em>'.
	 * @generated
	 */
	ExpressionContainer createExpressionContainer();

	/**
	 * Returns a new object of class '<em>Style Assigment Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Assigment Container</em>'.
	 * @generated
	 */
	StyleAssigmentContainer createStyleAssigmentContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiPackage getUiPackage();

} //UiFactory
