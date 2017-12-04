/**
 */
package styles.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see styles.domain.DomainFactory
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
	String eNS_URI = "http:///styles/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "styles.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = styles.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link styles.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.DomainImpl
	 * @see styles.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Model Factory Styles</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MODEL_FACTORY_STYLES = 0;

	/**
	 * The feature id for the '<em><b>The Style Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_STYLE_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>The Characteristic Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_CHARACTERISTIC_FACTORY = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link styles.domain.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.StyleImpl
	 * @see styles.domain.impl.DomainPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>The Characteristic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__THE_CHARACTERISTIC = 1;

	/**
	 * The feature id for the '<em><b>Style Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__STYLE_FACTORY = 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link styles.domain.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.CharacteristicImpl
	 * @see styles.domain.impl.DomainPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__LIST_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>The Sytle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__THE_SYTLE = 2;

	/**
	 * The feature id for the '<em><b>Characteristic Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__CHARACTERISTIC_FACTORY = 3;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link styles.domain.impl.PropertieImpl <em>Propertie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.PropertieImpl
	 * @see styles.domain.impl.DomainPackageImpl#getPropertie()
	 * @generated
	 */
	int PROPERTIE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__CHARACTERISTIC = 2;

	/**
	 * The number of structural features of the '<em>Propertie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Propertie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link styles.domain.impl.StyleFactoryImpl <em>Style Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.StyleFactoryImpl
	 * @see styles.domain.impl.DomainPackageImpl#getStyleFactory()
	 * @generated
	 */
	int STYLE_FACTORY = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FACTORY__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FACTORY__LIST_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Style Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link styles.domain.impl.CharacteristicFactoryImpl <em>Characteristic Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.impl.CharacteristicFactoryImpl
	 * @see styles.domain.impl.DomainPackageImpl#getCharacteristicFactory()
	 * @generated
	 */
	int CHARACTERISTIC_FACTORY = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FACTORY__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>List Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC = 1;

	/**
	 * The number of structural features of the '<em>Characteristic Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Characteristic Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FACTORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link styles.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see styles.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.Domain#getModelFactoryStyles <em>Model Factory Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Factory Styles</em>'.
	 * @see styles.domain.Domain#getModelFactoryStyles()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ModelFactoryStyles();

	/**
	 * Returns the meta object for the containment reference '{@link styles.domain.Domain#getTheStyleFactory <em>The Style Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Style Factory</em>'.
	 * @see styles.domain.Domain#getTheStyleFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheStyleFactory();

	/**
	 * Returns the meta object for the containment reference '{@link styles.domain.Domain#getTheCharacteristicFactory <em>The Characteristic Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Characteristic Factory</em>'.
	 * @see styles.domain.Domain#getTheCharacteristicFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheCharacteristicFactory();

	/**
	 * Returns the meta object for class '{@link styles.domain.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see styles.domain.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link styles.domain.Style#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see styles.domain.Style#getName()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Name();

	/**
	 * Returns the meta object for the reference '{@link styles.domain.Style#getTheCharacteristic <em>The Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Characteristic</em>'.
	 * @see styles.domain.Style#getTheCharacteristic()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_TheCharacteristic();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.Style#getStyleFactory <em>Style Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Style Factory</em>'.
	 * @see styles.domain.Style#getStyleFactory()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_StyleFactory();

	/**
	 * Returns the meta object for class '{@link styles.domain.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see styles.domain.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link styles.domain.Characteristic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see styles.domain.Characteristic#getName()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link styles.domain.Characteristic#getListProperties <em>List Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Properties</em>'.
	 * @see styles.domain.Characteristic#getListProperties()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_ListProperties();

	/**
	 * Returns the meta object for the reference list '{@link styles.domain.Characteristic#getTheSytle <em>The Sytle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Sytle</em>'.
	 * @see styles.domain.Characteristic#getTheSytle()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_TheSytle();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.Characteristic#getCharacteristicFactory <em>Characteristic Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Characteristic Factory</em>'.
	 * @see styles.domain.Characteristic#getCharacteristicFactory()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_CharacteristicFactory();

	/**
	 * Returns the meta object for class '{@link styles.domain.Propertie <em>Propertie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propertie</em>'.
	 * @see styles.domain.Propertie
	 * @generated
	 */
	EClass getPropertie();

	/**
	 * Returns the meta object for the attribute '{@link styles.domain.Propertie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see styles.domain.Propertie#getName()
	 * @see #getPropertie()
	 * @generated
	 */
	EAttribute getPropertie_Name();

	/**
	 * Returns the meta object for the attribute '{@link styles.domain.Propertie#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see styles.domain.Propertie#getValue()
	 * @see #getPropertie()
	 * @generated
	 */
	EAttribute getPropertie_Value();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.Propertie#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Characteristic</em>'.
	 * @see styles.domain.Propertie#getCharacteristic()
	 * @see #getPropertie()
	 * @generated
	 */
	EReference getPropertie_Characteristic();

	/**
	 * Returns the meta object for class '{@link styles.domain.StyleFactory <em>Style Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Factory</em>'.
	 * @see styles.domain.StyleFactory
	 * @generated
	 */
	EClass getStyleFactory();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.StyleFactory#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see styles.domain.StyleFactory#getDomain()
	 * @see #getStyleFactory()
	 * @generated
	 */
	EReference getStyleFactory_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link styles.domain.StyleFactory#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Style</em>'.
	 * @see styles.domain.StyleFactory#getListStyle()
	 * @see #getStyleFactory()
	 * @generated
	 */
	EReference getStyleFactory_ListStyle();

	/**
	 * Returns the meta object for class '{@link styles.domain.CharacteristicFactory <em>Characteristic Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Factory</em>'.
	 * @see styles.domain.CharacteristicFactory
	 * @generated
	 */
	EClass getCharacteristicFactory();

	/**
	 * Returns the meta object for the container reference '{@link styles.domain.CharacteristicFactory#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see styles.domain.CharacteristicFactory#getDomain()
	 * @see #getCharacteristicFactory()
	 * @generated
	 */
	EReference getCharacteristicFactory_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link styles.domain.CharacteristicFactory#getListCharacteristic <em>List Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Characteristic</em>'.
	 * @see styles.domain.CharacteristicFactory#getListCharacteristic()
	 * @see #getCharacteristicFactory()
	 * @generated
	 */
	EReference getCharacteristicFactory_ListCharacteristic();

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
		 * The meta object literal for the '{@link styles.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.DomainImpl
		 * @see styles.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Model Factory Styles</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__MODEL_FACTORY_STYLES = eINSTANCE.getDomain_ModelFactoryStyles();

		/**
		 * The meta object literal for the '<em><b>The Style Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_STYLE_FACTORY = eINSTANCE.getDomain_TheStyleFactory();

		/**
		 * The meta object literal for the '<em><b>The Characteristic Factory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_CHARACTERISTIC_FACTORY = eINSTANCE.getDomain_TheCharacteristicFactory();

		/**
		 * The meta object literal for the '{@link styles.domain.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.StyleImpl
		 * @see styles.domain.impl.DomainPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

		/**
		 * The meta object literal for the '<em><b>The Characteristic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__THE_CHARACTERISTIC = eINSTANCE.getStyle_TheCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Style Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__STYLE_FACTORY = eINSTANCE.getStyle_StyleFactory();

		/**
		 * The meta object literal for the '{@link styles.domain.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.CharacteristicImpl
		 * @see styles.domain.impl.DomainPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__NAME = eINSTANCE.getCharacteristic_Name();

		/**
		 * The meta object literal for the '<em><b>List Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__LIST_PROPERTIES = eINSTANCE.getCharacteristic_ListProperties();

		/**
		 * The meta object literal for the '<em><b>The Sytle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__THE_SYTLE = eINSTANCE.getCharacteristic_TheSytle();

		/**
		 * The meta object literal for the '<em><b>Characteristic Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__CHARACTERISTIC_FACTORY = eINSTANCE.getCharacteristic_CharacteristicFactory();

		/**
		 * The meta object literal for the '{@link styles.domain.impl.PropertieImpl <em>Propertie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.PropertieImpl
		 * @see styles.domain.impl.DomainPackageImpl#getPropertie()
		 * @generated
		 */
		EClass PROPERTIE = eINSTANCE.getPropertie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIE__NAME = eINSTANCE.getPropertie_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIE__VALUE = eINSTANCE.getPropertie_Value();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIE__CHARACTERISTIC = eINSTANCE.getPropertie_Characteristic();

		/**
		 * The meta object literal for the '{@link styles.domain.impl.StyleFactoryImpl <em>Style Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.StyleFactoryImpl
		 * @see styles.domain.impl.DomainPackageImpl#getStyleFactory()
		 * @generated
		 */
		EClass STYLE_FACTORY = eINSTANCE.getStyleFactory();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_FACTORY__DOMAIN = eINSTANCE.getStyleFactory_Domain();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_FACTORY__LIST_STYLE = eINSTANCE.getStyleFactory_ListStyle();

		/**
		 * The meta object literal for the '{@link styles.domain.impl.CharacteristicFactoryImpl <em>Characteristic Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.impl.CharacteristicFactoryImpl
		 * @see styles.domain.impl.DomainPackageImpl#getCharacteristicFactory()
		 * @generated
		 */
		EClass CHARACTERISTIC_FACTORY = eINSTANCE.getCharacteristicFactory();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_FACTORY__DOMAIN = eINSTANCE.getCharacteristicFactory_Domain();

		/**
		 * The meta object literal for the '<em><b>List Characteristic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC = eINSTANCE.getCharacteristicFactory_ListCharacteristic();

	}

} //DomainPackage
