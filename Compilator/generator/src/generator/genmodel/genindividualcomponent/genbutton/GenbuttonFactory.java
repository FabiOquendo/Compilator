/**
 */
package generator.genmodel.genindividualcomponent.genbutton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage
 * @generated
 */
public interface GenbuttonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenbuttonFactory eINSTANCE = generator.genmodel.genindividualcomponent.genbutton.impl.GenbuttonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Button</em>'.
	 * @generated
	 */
	GenButton createGenButton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenbuttonPackage getGenbuttonPackage();

} //GenbuttonFactory
