/**
 */
package generator.genmodel.genindividualcomponent.gentextfield;

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
 * @see generator.genmodel.genindividualcomponent.gentextfield.GentextfieldFactory
 * @model kind="package"
 * @generated
 */
public interface GentextfieldPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gentextfield";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/genindividualcomponent/gentextfield.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.genindividualcomponent.gentextfield";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GentextfieldPackage eINSTANCE = generator.genmodel.genindividualcomponent.gentextfield.impl.GentextfieldPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl <em>Gen Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl
	 * @see generator.genmodel.genindividualcomponent.gentextfield.impl.GentextfieldPackageImpl#getGenTextField()
	 * @generated
	 */
	int GEN_TEXT_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__GEN_MODEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__GEN_CONTAINER_ELEMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>The Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Text Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD__THE_TEXT_FIELD = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD_FEATURE_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_FONT_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_FONT_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_FONT_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_PROPERTIES = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___SET_DEFAULT_FONT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Text Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_PROPERTIES_TEXT_FIELD__PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___CREATE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Default Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD___SET_DEFAULT_TEXT__PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TEXT_FIELD_OPERATION_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField <em>Gen Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Text Field</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField
	 * @generated
	 */
	EClass getGenTextField();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Background</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground()
	 * @see #getGenTextField()
	 * @generated
	 */
	EReference getGenTextField_TheBackground();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheTextField <em>The Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Text Field</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheTextField()
	 * @see #getGenTextField()
	 * @generated
	 */
	EReference getGenTextField_TheTextField();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#createPropertiesTextField(styles.domain.Propertie) <em>Create Properties Text Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Text Field</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#createPropertiesTextField(styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenTextField__CreatePropertiesTextField__Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#createBackground() <em>Create Background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Background</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#createBackground()
	 * @generated
	 */
	EOperation getGenTextField__CreateBackground();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#setDefaultText(styles.domain.Propertie) <em>Set Default Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Text</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#setDefaultText(styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenTextField__SetDefaultText__Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GentextfieldFactory getGentextfieldFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl <em>Gen Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl
		 * @see generator.genmodel.genindividualcomponent.gentextfield.impl.GentextfieldPackageImpl#getGenTextField()
		 * @generated
		 */
		EClass GEN_TEXT_FIELD = eINSTANCE.getGenTextField();

		/**
		 * The meta object literal for the '<em><b>The Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TEXT_FIELD__THE_BACKGROUND = eINSTANCE.getGenTextField_TheBackground();

		/**
		 * The meta object literal for the '<em><b>The Text Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TEXT_FIELD__THE_TEXT_FIELD = eINSTANCE.getGenTextField_TheTextField();

		/**
		 * The meta object literal for the '<em><b>Create Properties Text Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TEXT_FIELD___CREATE_PROPERTIES_TEXT_FIELD__PROPERTIE = eINSTANCE.getGenTextField__CreatePropertiesTextField__Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TEXT_FIELD___CREATE_BACKGROUND = eINSTANCE.getGenTextField__CreateBackground();

		/**
		 * The meta object literal for the '<em><b>Set Default Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TEXT_FIELD___SET_DEFAULT_TEXT__PROPERTIE = eINSTANCE.getGenTextField__SetDefaultText__Propertie();

	}

} //GentextfieldPackage
