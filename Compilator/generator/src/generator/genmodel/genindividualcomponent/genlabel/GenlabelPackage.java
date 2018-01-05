/**
 */
package generator.genmodel.genindividualcomponent.genlabel;

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
 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelFactory
 * @model kind="package"
 * @generated
 */
public interface GenlabelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genlabel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/genindividualcomponent/genlabel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.genindividualcomponent.genlabel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenlabelPackage eINSTANCE = generator.genmodel.genindividualcomponent.genlabel.impl.GenlabelPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl <em>Gen Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl
	 * @see generator.genmodel.genindividualcomponent.genlabel.impl.GenlabelPackageImpl#getGenLabel()
	 * @generated
	 */
	int GEN_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__GEN_MODEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__GEN_CONTAINER_ELEMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__NAME = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>The Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_LABEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL__THE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL_FEATURE_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_FONT_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_FONT_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_FONT_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_PROPERTIES = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___SET_DEFAULT_FONT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_PROPERTIES_LABEL__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___CREATE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Default Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL___SET_DEFAULT_LABEL__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gen Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_LABEL_OPERATION_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Label</em>'.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel
	 * @generated
	 */
	EClass getGenLabel();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Background</em>'.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground()
	 * @see #getGenLabel()
	 * @generated
	 */
	EReference getGenLabel_TheBackground();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheLabel <em>The Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Label</em>'.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheLabel()
	 * @see #getGenLabel()
	 * @generated
	 */
	EReference getGenLabel_TheLabel();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Alignment</em>'.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment()
	 * @see #getGenLabel()
	 * @generated
	 */
	EReference getGenLabel_TheAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#createPropertiesLabel(java.lang.String, styles.domain.Propertie) <em>Create Properties Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Label</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#createPropertiesLabel(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenLabel__CreatePropertiesLabel__String_Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#createAlignment() <em>Create Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alignment</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#createAlignment()
	 * @generated
	 */
	EOperation getGenLabel__CreateAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#createBackground() <em>Create Background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Background</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#createBackground()
	 * @generated
	 */
	EOperation getGenLabel__CreateBackground();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#setDefaultLabel(java.lang.String, styles.domain.Propertie) <em>Set Default Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Label</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#setDefaultLabel(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenLabel__SetDefaultLabel__String_Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenlabelFactory getGenlabelFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl <em>Gen Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl
		 * @see generator.genmodel.genindividualcomponent.genlabel.impl.GenlabelPackageImpl#getGenLabel()
		 * @generated
		 */
		EClass GEN_LABEL = eINSTANCE.getGenLabel();

		/**
		 * The meta object literal for the '<em><b>The Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LABEL__THE_BACKGROUND = eINSTANCE.getGenLabel_TheBackground();

		/**
		 * The meta object literal for the '<em><b>The Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LABEL__THE_LABEL = eINSTANCE.getGenLabel_TheLabel();

		/**
		 * The meta object literal for the '<em><b>The Alignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_LABEL__THE_ALIGNMENT = eINSTANCE.getGenLabel_TheAlignment();

		/**
		 * The meta object literal for the '<em><b>Create Properties Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_LABEL___CREATE_PROPERTIES_LABEL__STRING_PROPERTIE = eINSTANCE.getGenLabel__CreatePropertiesLabel__String_Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_LABEL___CREATE_ALIGNMENT = eINSTANCE.getGenLabel__CreateAlignment();

		/**
		 * The meta object literal for the '<em><b>Create Background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_LABEL___CREATE_BACKGROUND = eINSTANCE.getGenLabel__CreateBackground();

		/**
		 * The meta object literal for the '<em><b>Set Default Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_LABEL___SET_DEFAULT_LABEL__STRING_PROPERTIE = eINSTANCE.getGenLabel__SetDefaultLabel__String_Propertie();

	}

} //GenlabelPackage
