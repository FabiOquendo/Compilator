/**
 */
package generator.apperance.background;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.background.BackgroundPackage
 * @generated
 */
public interface BackgroundFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackgroundFactory eINSTANCE = generator.apperance.background.impl.BackgroundFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background</em>'.
	 * @generated
	 */
	Background createBackground();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BackgroundPackage getBackgroundPackage();

} //BackgroundFactory
