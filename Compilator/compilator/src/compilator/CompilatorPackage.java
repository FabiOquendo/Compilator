/**
 */
package compilator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see compilator.CompilatorFactory
 * @model kind="package"
 * @generated
 */
public interface CompilatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compilator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompilatorPackage eINSTANCE = compilator.impl.CompilatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.impl.ModelFactoryImpl
	 * @see compilator.impl.CompilatorPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Domain Compilator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_DOMAIN_COMPILATOR = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__THE_UI = 1;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Load Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___LOAD_EXPRESSION = 0;

	/**
	 * The operation id for the '<em>Save Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___SAVE_EXPRESSION = 1;

	/**
	 * The operation id for the '<em>Load Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___LOAD_COMPONENTS = 2;

	/**
	 * The operation id for the '<em>Save Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY___SAVE_COMPONENTS = 3;

	/**
	 * The number of operations of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link compilator.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see compilator.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ModelFactory#getTheDomainCompilator <em>The Domain Compilator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Domain Compilator</em>'.
	 * @see compilator.ModelFactory#getTheDomainCompilator()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheDomainCompilator();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The UI</em>'.
	 * @see compilator.ModelFactory#getTheUI()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_TheUI();

	/**
	 * Returns the meta object for the '{@link compilator.ModelFactory#loadExpression() <em>Load Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Expression</em>' operation.
	 * @see compilator.ModelFactory#loadExpression()
	 * @generated
	 */
	EOperation getModelFactory__LoadExpression();

	/**
	 * Returns the meta object for the '{@link compilator.ModelFactory#saveExpression() <em>Save Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Expression</em>' operation.
	 * @see compilator.ModelFactory#saveExpression()
	 * @generated
	 */
	EOperation getModelFactory__SaveExpression();

	/**
	 * Returns the meta object for the '{@link compilator.ModelFactory#loadComponents() <em>Load Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Components</em>' operation.
	 * @see compilator.ModelFactory#loadComponents()
	 * @generated
	 */
	EOperation getModelFactory__LoadComponents();

	/**
	 * Returns the meta object for the '{@link compilator.ModelFactory#saveComponents() <em>Save Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Components</em>' operation.
	 * @see compilator.ModelFactory#saveComponents()
	 * @generated
	 */
	EOperation getModelFactory__SaveComponents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompilatorFactory getCompilatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link compilator.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.impl.ModelFactoryImpl
		 * @see compilator.impl.CompilatorPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Domain Compilator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_DOMAIN_COMPILATOR = eINSTANCE.getModelFactory_TheDomainCompilator();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__THE_UI = eINSTANCE.getModelFactory_TheUI();

		/**
		 * The meta object literal for the '<em><b>Load Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___LOAD_EXPRESSION = eINSTANCE.getModelFactory__LoadExpression();

		/**
		 * The meta object literal for the '<em><b>Save Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___SAVE_EXPRESSION = eINSTANCE.getModelFactory__SaveExpression();

		/**
		 * The meta object literal for the '<em><b>Load Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___LOAD_COMPONENTS = eINSTANCE.getModelFactory__LoadComponents();

		/**
		 * The meta object literal for the '<em><b>Save Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY___SAVE_COMPONENTS = eINSTANCE.getModelFactory__SaveComponents();

	}

} //CompilatorPackage
