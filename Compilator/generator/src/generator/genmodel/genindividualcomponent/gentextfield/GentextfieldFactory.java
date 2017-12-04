/**
 */
package generator.genmodel.genindividualcomponent.gentextfield;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage
 * @generated
 */
public interface GentextfieldFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GentextfieldFactory eINSTANCE = generator.genmodel.genindividualcomponent.gentextfield.impl.GentextfieldFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Text Field</em>'.
	 * @generated
	 */
	GenTextField createGenTextField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GentextfieldPackage getGentextfieldPackage();

} //GentextfieldFactory
