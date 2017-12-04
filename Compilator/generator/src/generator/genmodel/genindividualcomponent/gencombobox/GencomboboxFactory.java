/**
 */
package generator.genmodel.genindividualcomponent.gencombobox;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage
 * @generated
 */
public interface GencomboboxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencomboboxFactory eINSTANCE = generator.genmodel.genindividualcomponent.gencombobox.impl.GencomboboxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Combo Box</em>'.
	 * @generated
	 */
	GenComboBox createGenComboBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GencomboboxPackage getGencomboboxPackage();

} //GencomboboxFactory
