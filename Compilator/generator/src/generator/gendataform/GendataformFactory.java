/**
 */
package generator.gendataform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.gendataform.GendataformPackage
 * @generated
 */
public interface GendataformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GendataformFactory eINSTANCE = generator.gendataform.impl.GendataformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Form Diagram Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Form Diagram Generator</em>'.
	 * @generated
	 */
	DataFormDiagramGenerator createDataFormDiagramGenerator();

	/**
	 * Returns a new object of class '<em>Data Form Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Form Model Generator</em>'.
	 * @generated
	 */
	DataFormModelGenerator createDataFormModelGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GendataformPackage getGendataformPackage();

} //GendataformFactory
