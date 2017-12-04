/**
 */
package generator.genmodel.genindividualcomponent.genbutton;

import generator.genmodel.genindividualcomponent.GenindividualcomponentPackage;

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
 * @see generator.genmodel.genindividualcomponent.genbutton.GenbuttonFactory
 * @model kind="package"
 * @generated
 */
public interface GenbuttonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genbutton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/genindividualcomponent/genbutton.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.genindividualcomponent.genbutton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenbuttonPackage eINSTANCE = generator.genmodel.genindividualcomponent.genbutton.impl.GenbuttonPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl <em>Gen Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl
	 * @see generator.genmodel.genindividualcomponent.genbutton.impl.GenbuttonPackageImpl#getGenButton()
	 * @generated
	 */
	int GEN_BUTTON = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__GEN_MODEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__GEN_CONTAINER_ELEMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>The Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_BUTTON = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON__THE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON_FEATURE_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_FONT_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_FONT_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_FONT_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_PROPERTIES = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___SET_DEFAULT_FONT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_PROPERTIES_BUTTON__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___CREATE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Default Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON___SET_DEFAULT_BUTTON__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_BUTTON_OPERATION_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton <em>Gen Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Button</em>'.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton
	 * @generated
	 */
	EClass getGenButton();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheButton <em>The Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Button</em>'.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheButton()
	 * @see #getGenButton()
	 * @generated
	 */
	EReference getGenButton_TheButton();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Alignment</em>'.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment()
	 * @see #getGenButton()
	 * @generated
	 */
	EReference getGenButton_TheAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#createPropertiesButton(java.lang.String, styles.domain.Propertie) <em>Create Properties Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Button</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#createPropertiesButton(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenButton__CreatePropertiesButton__String_Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#createAlignment() <em>Create Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alignment</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#createAlignment()
	 * @generated
	 */
	EOperation getGenButton__CreateAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#setDefaultButton(java.lang.String, styles.domain.Propertie) <em>Set Default Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Button</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#setDefaultButton(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenButton__SetDefaultButton__String_Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenbuttonFactory getGenbuttonFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl <em>Gen Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl
		 * @see generator.genmodel.genindividualcomponent.genbutton.impl.GenbuttonPackageImpl#getGenButton()
		 * @generated
		 */
		EClass GEN_BUTTON = eINSTANCE.getGenButton();

		/**
		 * The meta object literal for the '<em><b>The Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_BUTTON__THE_BUTTON = eINSTANCE.getGenButton_TheButton();

		/**
		 * The meta object literal for the '<em><b>The Alignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_BUTTON__THE_ALIGNMENT = eINSTANCE.getGenButton_TheAlignment();

		/**
		 * The meta object literal for the '<em><b>Create Properties Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_BUTTON___CREATE_PROPERTIES_BUTTON__STRING_PROPERTIE = eINSTANCE.getGenButton__CreatePropertiesButton__String_Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_BUTTON___CREATE_ALIGNMENT = eINSTANCE.getGenButton__CreateAlignment();

		/**
		 * The meta object literal for the '<em><b>Set Default Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_BUTTON___SET_DEFAULT_BUTTON__STRING_PROPERTIE = eINSTANCE.getGenButton__SetDefaultButton__String_Propertie();

	}

} //GenbuttonPackage
