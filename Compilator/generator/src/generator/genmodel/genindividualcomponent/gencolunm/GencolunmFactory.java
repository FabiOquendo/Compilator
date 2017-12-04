/**
 */
package generator.genmodel.genindividualcomponent.gencolunm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.gencolunm.GencolunmPackage
 * @generated
 */
public interface GencolunmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencolunmFactory eINSTANCE = generator.genmodel.genindividualcomponent.gencolunm.impl.GencolunmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Column</em>'.
	 * @generated
	 */
	GenColumn createGenColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GencolunmPackage getGencolunmPackage();

} //GencolunmFactory
