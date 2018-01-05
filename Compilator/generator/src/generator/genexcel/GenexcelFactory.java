/**
 */
package generator.genexcel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.genexcel.GenexcelPackage
 * @generated
 */
public interface GenexcelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenexcelFactory eINSTANCE = generator.genexcel.impl.GenexcelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Excel Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Generator</em>'.
	 * @generated
	 */
	ExcelGenerator createExcelGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenexcelPackage getGenexcelPackage();

} //GenexcelFactory
