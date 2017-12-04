/**
 */
package compilator.domain.expression.expressionmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage
 * @generated
 */
public interface ExpressionmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionmodelFactory eINSTANCE = compilator.domain.expression.expressionmodel.impl.ExpressionmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Model</em>'.
	 * @generated
	 */
	ExpressionModel createExpressionModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionmodelPackage getExpressionmodelPackage();

} //ExpressionmodelFactory
