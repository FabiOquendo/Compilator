/**
 */
package generator.datatypes.datatypesdataform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.datatypes.datatypesdataform.DatatypesdataformPackage
 * @generated
 */
public interface DatatypesdataformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesdataformFactory eINSTANCE = generator.datatypes.datatypesdataform.impl.DatatypesdataformFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesdataformPackage getDatatypesdataformPackage();

} //DatatypesdataformFactory
