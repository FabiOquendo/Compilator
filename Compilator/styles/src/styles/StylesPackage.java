/**
 */
package styles;

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
 * @see styles.StylesFactory
 * @model kind="package"
 * @generated
 */
public interface StylesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "styles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///styles.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "styles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StylesPackage eINSTANCE = styles.impl.StylesPackageImpl.init();

	/**
	 * The meta object id for the '{@link styles.impl.ModelFactoryStylesImpl <em>Model Factory Styles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.impl.ModelFactoryStylesImpl
	 * @see styles.impl.StylesPackageImpl#getModelFactoryStyles()
	 * @generated
	 */
	int MODEL_FACTORY_STYLES = 0;

	/**
	 * The feature id for the '<em><b>The Domain Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES = 0;

	/**
	 * The number of structural features of the '<em>Model Factory Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_STYLES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_STYLES___LOAD = 0;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_STYLES___SAVE = 1;

	/**
	 * The number of operations of the '<em>Model Factory Styles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_STYLES_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link styles.ModelFactoryStyles <em>Model Factory Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Styles</em>'.
	 * @see styles.ModelFactoryStyles
	 * @generated
	 */
	EClass getModelFactoryStyles();

	/**
	 * Returns the meta object for the containment reference '{@link styles.ModelFactoryStyles#getTheDomainStyles <em>The Domain Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Domain Styles</em>'.
	 * @see styles.ModelFactoryStyles#getTheDomainStyles()
	 * @see #getModelFactoryStyles()
	 * @generated
	 */
	EReference getModelFactoryStyles_TheDomainStyles();

	/**
	 * Returns the meta object for the '{@link styles.ModelFactoryStyles#load() <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see styles.ModelFactoryStyles#load()
	 * @generated
	 */
	EOperation getModelFactoryStyles__Load();

	/**
	 * Returns the meta object for the '{@link styles.ModelFactoryStyles#save() <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see styles.ModelFactoryStyles#save()
	 * @generated
	 */
	EOperation getModelFactoryStyles__Save();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StylesFactory getStylesFactory();

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
		 * The meta object literal for the '{@link styles.impl.ModelFactoryStylesImpl <em>Model Factory Styles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.impl.ModelFactoryStylesImpl
		 * @see styles.impl.StylesPackageImpl#getModelFactoryStyles()
		 * @generated
		 */
		EClass MODEL_FACTORY_STYLES = eINSTANCE.getModelFactoryStyles();

		/**
		 * The meta object literal for the '<em><b>The Domain Styles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES = eINSTANCE.getModelFactoryStyles_TheDomainStyles();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY_STYLES___LOAD = eINSTANCE.getModelFactoryStyles__Load();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_FACTORY_STYLES___SAVE = eINSTANCE.getModelFactoryStyles__Save();

	}

} //StylesPackage
