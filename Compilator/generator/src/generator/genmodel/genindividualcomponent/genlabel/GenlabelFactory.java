/**
 */
package generator.genmodel.genindividualcomponent.genlabel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage
 * @generated
 */
public interface GenlabelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenlabelFactory eINSTANCE = generator.genmodel.genindividualcomponent.genlabel.impl.GenlabelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Label</em>'.
	 * @generated
	 */
	GenLabel createGenLabel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenlabelPackage getGenlabelPackage();

} //GenlabelFactory
