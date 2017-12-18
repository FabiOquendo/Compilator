/**
 */
package generator.apperance.orientation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.orientation.OrientationPackage
 * @generated
 */
public interface OrientationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrientationFactory eINSTANCE = generator.apperance.orientation.impl.OrientationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Orientation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation</em>'.
	 * @generated
	 */
	Orientation createOrientation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrientationPackage getOrientationPackage();

} //OrientationFactory
