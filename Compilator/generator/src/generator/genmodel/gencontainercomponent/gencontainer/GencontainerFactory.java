/**
 */
package generator.genmodel.gencontainercomponent.gencontainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage
 * @generated
 */
public interface GencontainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencontainerFactory eINSTANCE = generator.genmodel.gencontainercomponent.gencontainer.impl.GencontainerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Container</em>'.
	 * @generated
	 */
	GenContainer createGenContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GencontainerPackage getGencontainerPackage();

} //GencontainerFactory
