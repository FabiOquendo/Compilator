/**
 */
package generator.genmodel.gencontainercomponent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.gencontainercomponent.GencontainercomponentPackage
 * @generated
 */
public interface GencontainercomponentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencontainercomponentFactory eINSTANCE = generator.genmodel.gencontainercomponent.impl.GencontainercomponentFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GencontainercomponentPackage getGencontainercomponentPackage();

} //GencontainercomponentFactory
