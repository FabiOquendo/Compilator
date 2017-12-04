/**
 */
package generator.genmodel.genindividualcomponent.gentable;

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
 * @see generator.genmodel.genindividualcomponent.gentable.GentableFactory
 * @model kind="package"
 * @generated
 */
public interface GentablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gentable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/genindividualcomponent/gentable.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.genindividualcomponent.gentable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GentablePackage eINSTANCE = generator.genmodel.genindividualcomponent.gentable.impl.GentablePackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl <em>Gen Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl
	 * @see generator.genmodel.genindividualcomponent.gentable.impl.GentablePackageImpl#getGenTable()
	 * @generated
	 */
	int GEN_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__GEN_MODEL = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__GEN_CONTAINER_ELEMENT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>The Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Lines Visible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_LINES_VISIBLE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Title Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_TITLE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Gen Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__LIST_GEN_COLUMNS = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE__THE_TABLE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gen Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE_FEATURE_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_X = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_Y = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_WIDTH = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_FONT_COLOR = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_FONT_TYPE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_FONT_SIZE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_PROPERTIES = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___SET_DEFAULT_FONT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_PROPERTIES_TABLE__INTEGER_INTEGER_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_BACKGROUND = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Lines Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_LINES_VISIBLE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Title Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___CREATE_TITLE_HEIGHT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Default Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE___SET_DEFAULT_TABLE__INTEGER_INTEGER_PROPERTIE = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gen Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_TABLE_OPERATION_COUNT = GenindividualcomponentPackage.GEN_INDIVIDUAL_ELEMENT_OPERATION_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.genindividualcomponent.gentable.GenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Table</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable
	 * @generated
	 */
	EClass getGenTable();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Background</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground()
	 * @see #getGenTable()
	 * @generated
	 */
	EReference getGenTable_TheBackground();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible <em>The Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Lines Visible</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible()
	 * @see #getGenTable()
	 * @generated
	 */
	EReference getGenTable_TheLinesVisible();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight <em>The Title Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Title Height</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight()
	 * @see #getGenTable()
	 * @generated
	 */
	EReference getGenTable_TheTitleHeight();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getListGenColumns <em>List Gen Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Gen Columns</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getListGenColumns()
	 * @see #getGenTable()
	 * @generated
	 */
	EReference getGenTable_ListGenColumns();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTable <em>The Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Table</em>'.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTable()
	 * @see #getGenTable()
	 * @generated
	 */
	EReference getGenTable_TheTable();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#createPropertiesTable(java.lang.Integer, java.lang.Integer, styles.domain.Propertie) <em>Create Properties Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Table</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#createPropertiesTable(java.lang.Integer, java.lang.Integer, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenTable__CreatePropertiesTable__Integer_Integer_Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#createBackground() <em>Create Background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Background</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#createBackground()
	 * @generated
	 */
	EOperation getGenTable__CreateBackground();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#createLinesVisible() <em>Create Lines Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Lines Visible</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#createLinesVisible()
	 * @generated
	 */
	EOperation getGenTable__CreateLinesVisible();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#createTitleHeight() <em>Create Title Height</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Title Height</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#createTitleHeight()
	 * @generated
	 */
	EOperation getGenTable__CreateTitleHeight();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#setDefaultTable(java.lang.Integer, java.lang.Integer, styles.domain.Propertie) <em>Set Default Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Table</em>' operation.
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#setDefaultTable(java.lang.Integer, java.lang.Integer, styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenTable__SetDefaultTable__Integer_Integer_Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GentableFactory getGentableFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl <em>Gen Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl
		 * @see generator.genmodel.genindividualcomponent.gentable.impl.GentablePackageImpl#getGenTable()
		 * @generated
		 */
		EClass GEN_TABLE = eINSTANCE.getGenTable();

		/**
		 * The meta object literal for the '<em><b>The Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TABLE__THE_BACKGROUND = eINSTANCE.getGenTable_TheBackground();

		/**
		 * The meta object literal for the '<em><b>The Lines Visible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TABLE__THE_LINES_VISIBLE = eINSTANCE.getGenTable_TheLinesVisible();

		/**
		 * The meta object literal for the '<em><b>The Title Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TABLE__THE_TITLE_HEIGHT = eINSTANCE.getGenTable_TheTitleHeight();

		/**
		 * The meta object literal for the '<em><b>List Gen Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TABLE__LIST_GEN_COLUMNS = eINSTANCE.getGenTable_ListGenColumns();

		/**
		 * The meta object literal for the '<em><b>The Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_TABLE__THE_TABLE = eINSTANCE.getGenTable_TheTable();

		/**
		 * The meta object literal for the '<em><b>Create Properties Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TABLE___CREATE_PROPERTIES_TABLE__INTEGER_INTEGER_PROPERTIE = eINSTANCE.getGenTable__CreatePropertiesTable__Integer_Integer_Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TABLE___CREATE_BACKGROUND = eINSTANCE.getGenTable__CreateBackground();

		/**
		 * The meta object literal for the '<em><b>Create Lines Visible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TABLE___CREATE_LINES_VISIBLE = eINSTANCE.getGenTable__CreateLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Create Title Height</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TABLE___CREATE_TITLE_HEIGHT = eINSTANCE.getGenTable__CreateTitleHeight();

		/**
		 * The meta object literal for the '<em><b>Set Default Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_TABLE___SET_DEFAULT_TABLE__INTEGER_INTEGER_PROPERTIE = eINSTANCE.getGenTable__SetDefaultTable__Integer_Integer_Propertie();

	}

} //GentablePackage
