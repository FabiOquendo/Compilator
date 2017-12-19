/**
 */
package compilator.domain;

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
 * @see compilator.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = compilator.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.impl.DomainImpl
	 * @see compilator.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 1;

	/**
	 * The feature id for the '<em><b>The Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>The Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_LOG = 3;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SHAPES = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Create Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = 0;

	/**
	 * The operation id for the '<em>Create Expression Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = 1;

	/**
	 * The operation id for the '<em>Un Pack Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___UN_PACK_STYLES = 2;

	/**
	 * The operation id for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link compilator.domain.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.impl.LogImpl
	 * @see compilator.domain.impl.DomainPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 1;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__THE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>List Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LIST_EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see compilator.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see compilator.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see compilator.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.Domain#getTheExpression <em>The Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Expression</em>'.
	 * @see compilator.domain.Domain#getTheExpression()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheExpression();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.Domain#getTheLog <em>The Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Log</em>'.
	 * @see compilator.domain.Domain#getTheLog()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheLog();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.Domain#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shapes</em>'.
	 * @see compilator.domain.Domain#getShapes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Shapes();

	/**
	 * Returns the meta object for the '{@link compilator.domain.Domain#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap) <em>Create Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Component</em>' operation.
	 * @see compilator.domain.Domain#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getDomain__CreateComponent__String_String_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.domain.Domain#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create Expression Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Expression Model</em>' operation.
	 * @see compilator.domain.Domain#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getDomain__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.domain.Domain#unPackStyles() <em>Un Pack Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Pack Styles</em>' operation.
	 * @see compilator.domain.Domain#unPackStyles()
	 * @generated
	 */
	EOperation getDomain__UnPackStyles();

	/**
	 * Returns the meta object for the '{@link compilator.domain.Domain#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create EModel From Unpacked Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * @see compilator.domain.Domain#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getDomain__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for class '{@link compilator.domain.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see compilator.domain.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.Log#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see compilator.domain.Log#getTheDomain()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_TheDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.Log#getListExpressions <em>List Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Expressions</em>'.
	 * @see compilator.domain.Log#getListExpressions()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_ListExpressions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link compilator.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.impl.DomainImpl
		 * @see compilator.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '<em><b>The Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_EXPRESSION = eINSTANCE.getDomain_TheExpression();

		/**
		 * The meta object literal for the '<em><b>The Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_LOG = eINSTANCE.getDomain_TheLog();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SHAPES = eINSTANCE.getDomain_Shapes();

		/**
		 * The meta object literal for the '<em><b>Create Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = eINSTANCE.getDomain__CreateComponent__String_String_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Create Expression Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getDomain__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Un Pack Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___UN_PACK_STYLES = eINSTANCE.getDomain__UnPackStyles();

		/**
		 * The meta object literal for the '<em><b>Create EModel From Unpacked Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getDomain__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '{@link compilator.domain.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.impl.LogImpl
		 * @see compilator.domain.impl.DomainPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__THE_DOMAIN = eINSTANCE.getLog_TheDomain();

		/**
		 * The meta object literal for the '<em><b>List Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__LIST_EXPRESSIONS = eINSTANCE.getLog_ListExpressions();

	}

} //DomainPackage
