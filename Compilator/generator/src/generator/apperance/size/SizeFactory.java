/**
 */
package generator.apperance.size;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.size.SizePackage
 * @generated
 */
public interface SizeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SizeFactory eINSTANCE = generator.apperance.size.impl.SizeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Width</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Width</em>'.
	 * @generated
	 */
	Width createWidth();

	/**
	 * Returns a new object of class '<em>Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Height</em>'.
	 * @generated
	 */
	Height createHeight();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SizePackage getSizePackage();

} //SizeFactory
