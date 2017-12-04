/**
 */
package generator.apperance.position;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.position.PositionPackage
 * @generated
 */
public interface PositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PositionFactory eINSTANCE = generator.apperance.position.impl.PositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X</em>'.
	 * @generated
	 */
	X createX();

	/**
	 * Returns a new object of class '<em>Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Y</em>'.
	 * @generated
	 */
	Y createY();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PositionPackage getPositionPackage();

} //PositionFactory
