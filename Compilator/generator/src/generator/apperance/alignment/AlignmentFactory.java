/**
 */
package generator.apperance.alignment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.apperance.alignment.AlignmentPackage
 * @generated
 */
public interface AlignmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlignmentFactory eINSTANCE = generator.apperance.alignment.impl.AlignmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment</em>'.
	 * @generated
	 */
	Alignment createAlignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlignmentPackage getAlignmentPackage();

} //AlignmentFactory
