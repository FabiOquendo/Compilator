/**
 */
package styles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see styles.StylesPackage
 * @generated
 */
public interface StylesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StylesFactory eINSTANCE = styles.impl.StylesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Styles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Styles</em>'.
	 * @generated
	 */
	ModelFactoryStyles createModelFactoryStyles();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StylesPackage getStylesPackage();

} //StylesFactory
