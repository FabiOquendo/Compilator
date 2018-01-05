/**
 */
package generator.genmodel.genindividualcomponent.gencolunm;

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
 * @see generator.genmodel.genindividualcomponent.gencolunm.GencolunmFactory
 * @model kind="package"
 * @generated
 */
public interface GencolunmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gencolunm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/genindividualcomponent/gencolunm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.genindividualcomponent.gencolunm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencolunmPackage eINSTANCE = generator.genmodel.genindividualcomponent.gencolunm.impl.GencolunmPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl <em>Gen Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl
	 * @see generator.genmodel.genindividualcomponent.gencolunm.impl.GencolunmPackageImpl#getGenColumn()
	 * @generated
	 */
	int GEN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__GEN_MODEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__GEN_CONTAINER_ELEMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__NAME = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gen Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__GEN_TABLE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_COLUMN = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN__THE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN_FEATURE_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_FONT_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_FONT_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_FONT_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_PROPERTIES = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___SET_DEFAULT_FONT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_PROPERTIES_COLUMN__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___CREATE_ALIGNMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Default Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN___SET_DEFAULT_COLUMN__STRING_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_COLUMN_OPERATION_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn <em>Gen Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Column</em>'.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn
	 * @generated
	 */
	EClass getGenColumn();

	/**
	 * Returns the meta object for the container reference '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Table</em>'.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getGenTable()
	 * @see #getGenColumn()
	 * @generated
	 */
	EReference getGenColumn_GenTable();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheColumn <em>The Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Column</em>'.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheColumn()
	 * @see #getGenColumn()
	 * @generated
	 */
	EReference getGenColumn_TheColumn();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Alignment</em>'.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheAlignment()
	 * @see #getGenColumn()
	 * @generated
	 */
	EReference getGenColumn_TheAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#createPropertiesColumn(java.lang.String, styles.domain.Propertie) <em>Create Properties Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Column</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#createPropertiesColumn(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenColumn__CreatePropertiesColumn__String_Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#createAlignment() <em>Create Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alignment</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#createAlignment()
	 * @generated
	 */
	EOperation getGenColumn__CreateAlignment();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#setDefaultColumn(java.lang.String, styles.domain.Propertie) <em>Set Default Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Column</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#setDefaultColumn(java.lang.String, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenColumn__SetDefaultColumn__String_Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GencolunmFactory getGencolunmFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl <em>Gen Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl
		 * @see generator.genmodel.genindividualcomponent.gencolunm.impl.GencolunmPackageImpl#getGenColumn()
		 * @generated
		 */
		EClass GEN_COLUMN = eINSTANCE.getGenColumn();

		/**
		 * The meta object literal for the '<em><b>Gen Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLUMN__GEN_TABLE = eINSTANCE.getGenColumn_GenTable();

		/**
		 * The meta object literal for the '<em><b>The Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLUMN__THE_COLUMN = eINSTANCE.getGenColumn_TheColumn();

		/**
		 * The meta object literal for the '<em><b>The Alignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_COLUMN__THE_ALIGNMENT = eINSTANCE.getGenColumn_TheAlignment();

		/**
		 * The meta object literal for the '<em><b>Create Properties Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_COLUMN___CREATE_PROPERTIES_COLUMN__STRING_PROPERTIE = eINSTANCE.getGenColumn__CreatePropertiesColumn__String_Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_COLUMN___CREATE_ALIGNMENT = eINSTANCE.getGenColumn__CreateAlignment();

		/**
		 * The meta object literal for the '<em><b>Set Default Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_COLUMN___SET_DEFAULT_COLUMN__STRING_PROPERTIE = eINSTANCE.getGenColumn__SetDefaultColumn__String_Propertie();

	}

} //GencolunmPackage
