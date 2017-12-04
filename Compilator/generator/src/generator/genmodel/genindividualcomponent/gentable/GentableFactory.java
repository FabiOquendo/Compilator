/**
 */
package generator.genmodel.genindividualcomponent.gentable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage
 * @generated
 */
public interface GentableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GentableFactory eINSTANCE = generator.genmodel.genindividualcomponent.gentable.impl.GentableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Table</em>'.
	 * @generated
	 */
	GenTable createGenTable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GentablePackage getGentablePackage();

} //GentableFactory
