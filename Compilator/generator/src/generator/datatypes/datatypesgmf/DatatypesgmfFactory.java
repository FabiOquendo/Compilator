/**
 */
package generator.datatypes.datatypesgmf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.datatypes.datatypesgmf.DatatypesgmfPackage
 * @generated
 */
public interface DatatypesgmfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesgmfFactory eINSTANCE = generator.datatypes.datatypesgmf.impl.DatatypesgmfFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesgmfPackage getDatatypesgmfPackage();

} //DatatypesgmfFactory
