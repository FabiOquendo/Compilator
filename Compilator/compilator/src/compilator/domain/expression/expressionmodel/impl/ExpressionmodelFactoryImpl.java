/**
 */
package compilator.domain.expression.expressionmodel.impl;

import compilator.domain.expression.expressionmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionmodelFactoryImpl extends EFactoryImpl implements ExpressionmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionmodelFactory init() {
		try {
			ExpressionmodelFactory theExpressionmodelFactory = (ExpressionmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionmodelPackage.eNS_URI);
			if (theExpressionmodelFactory != null) {
				return theExpressionmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionmodelPackage.EXPRESSION_MODEL: return createExpressionModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModel createExpressionModel() {
		ExpressionModelImpl expressionModel = new ExpressionModelImpl();
		return expressionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionmodelPackage getExpressionmodelPackage() {
		return (ExpressionmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionmodelPackage getPackage() {
		return ExpressionmodelPackage.eINSTANCE;
	}

} //ExpressionmodelFactoryImpl
