/**
 */
package compilator.domain.generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see compilator.domain.generator.GeneratorPackage
 * @generated
 */
public interface GeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorFactory eINSTANCE = compilator.domain.generator.impl.GeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Model Manager</em>'.
	 * @generated
	 */
	ExpressionModelManager createExpressionModelManager();

	/**
	 * Returns a new object of class '<em>Component Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Model Generator</em>'.
	 * @generated
	 */
	ComponentModelGenerator createComponentModelGenerator();

	/**
	 * Returns a new object of class '<em>Expression Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Model Generator</em>'.
	 * @generated
	 */
	ExpressionModelGenerator createExpressionModelGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
