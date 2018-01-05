/**
 */
package generator.genexcel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see generator.genexcel.GenexcelFactory
 * @model kind="package"
 * @generated
 */
public interface GenexcelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genexcel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genexcel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genexcel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenexcelPackage eINSTANCE = generator.genexcel.impl.GenexcelPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genexcel.impl.ExcelGeneratorImpl <em>Excel Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.impl.ExcelGeneratorImpl
	 * @see generator.genexcel.impl.GenexcelPackageImpl#getExcelGenerator()
	 * @generated
	 */
	int EXCEL_GENERATOR = 0;

	/**
	 * The number of structural features of the '<em>Excel Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_EXCEL__GENMODEL = 0;

	/**
	 * The operation id for the '<em>Open File Into Editor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING = 1;

	/**
	 * The operation id for the '<em>Create Container Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_CONTAINER_EXCEL__WORKBOOK_SHEET_GENCONTAINER_INTEGER_INTEGER = 2;

	/**
	 * The operation id for the '<em>Create Label Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_LABEL_EXCEL__WORKBOOK_SHEET_GENLABEL_INTEGER_INTEGER = 3;

	/**
	 * The operation id for the '<em>Create Text Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_TEXT_EXCEL__WORKBOOK_SHEET_GENTEXTFIELD_INTEGER_INTEGER = 4;

	/**
	 * The operation id for the '<em>Create Table Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_TABLE_EXCEL__WORKBOOK_SHEET_GENTABLE_INTEGER_INTEGER = 5;

	/**
	 * The operation id for the '<em>Create Column Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_COLUMN_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER = 6;

	/**
	 * The operation id for the '<em>Create Table Row Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_TABLE_ROW_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER_INTEGER = 7;

	/**
	 * The operation id for the '<em>Create Combo Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_COMBO_EXCEL__WORKBOOK_SHEET_GENCOMBOBOX_INTEGER_INTEGER = 8;

	/**
	 * The operation id for the '<em>Create Button Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_BUTTON_EXCEL__WORKBOOK_SHEET_GENBUTTON_INTEGER_INTEGER = 9;

	/**
	 * The operation id for the '<em>Calculate R1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CALCULATE_R1__INTEGER = 10;

	/**
	 * The operation id for the '<em>Calculate R2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CALCULATE_R2__INTEGER_INTEGER = 11;

	/**
	 * The operation id for the '<em>Get Column Letters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_COLUMN_LETTERS__INTEGER = 12;

	/**
	 * The operation id for the '<em>Change Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CHANGE_FONT__WORKBOOK_CELL_INTEGER_STRING = 13;

	/**
	 * The operation id for the '<em>Change Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CHANGE_ALIGNMENT__WORKBOOK_CELL_STRING = 14;

	/**
	 * The operation id for the '<em>Add Border To Merged Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___ADD_BORDER_TO_MERGED_REGION__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = 15;

	/**
	 * The operation id for the '<em>Add Border To Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___ADD_BORDER_TO_BUTTON__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = 16;

	/**
	 * The operation id for the '<em>Add Border To Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___ADD_BORDER_TO_CONTAINER__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = 17;

	/**
	 * The number of operations of the '<em>Excel Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR_OPERATION_COUNT = 18;


	/**
	 * Returns the meta object for class '{@link generator.genexcel.ExcelGenerator <em>Excel Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Generator</em>'.
	 * @see generator.genexcel.ExcelGenerator
	 * @generated
	 */
	EClass getExcelGenerator();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createExcel(generator.genmodel.GenModel) <em>Create Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createExcel(generator.genmodel.GenModel)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateExcel__GenModel();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open File Into Editor</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#openFileIntoEditor(java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__OpenFileIntoEditor__String();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createContainerExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.gencontainercomponent.gencontainer.GenContainer, java.lang.Integer, java.lang.Integer) <em>Create Container Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Container Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createContainerExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.gencontainercomponent.gencontainer.GenContainer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateContainerExcel__Workbook_Sheet_GenContainer_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createLabelExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genlabel.GenLabel, java.lang.Integer, java.lang.Integer) <em>Create Label Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Label Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createLabelExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genlabel.GenLabel, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateLabelExcel__Workbook_Sheet_GenLabel_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createTextExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentextfield.GenTextField, java.lang.Integer, java.lang.Integer) <em>Create Text Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Text Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createTextExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentextfield.GenTextField, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateTextExcel__Workbook_Sheet_GenTextField_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createTableExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentable.GenTable, java.lang.Integer, java.lang.Integer) <em>Create Table Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createTableExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentable.GenTable, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateTableExcel__Workbook_Sheet_GenTable_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createColumnExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Column Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Column Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createColumnExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateColumnExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createTableRowExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Table Row Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table Row Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createTableRowExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateTableRowExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createComboExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox, java.lang.Integer, java.lang.Integer) <em>Create Combo Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Combo Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createComboExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateComboExcel__Workbook_Sheet_GenComboBox_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#createButtonExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genbutton.GenButton, java.lang.Integer, java.lang.Integer) <em>Create Button Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Button Excel</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#createButtonExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genbutton.GenButton, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateButtonExcel__Workbook_Sheet_GenButton_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#calculateR1(java.lang.Integer) <em>Calculate R1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate R1</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#calculateR1(java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CalculateR1__Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#calculateR2(java.lang.Integer, java.lang.Integer) <em>Calculate R2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate R2</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#calculateR2(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__CalculateR2__Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#getColumnLetters(java.lang.Integer) <em>Get Column Letters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Column Letters</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#getColumnLetters(java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__GetColumnLetters__Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#changeFont(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.Integer, java.lang.String) <em>Change Font</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Font</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#changeFont(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.Integer, java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__ChangeFont__Workbook_Cell_Integer_String();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#changeAlignment(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.String) <em>Change Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Alignment</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#changeAlignment(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__ChangeAlignment__Workbook_Cell_String();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#addBorderToMergedRegion(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Merged Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Border To Merged Region</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#addBorderToMergedRegion(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__AddBorderToMergedRegion__Workbook_Sheet_Integer_Integer_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#addBorderToButton(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Border To Button</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#addBorderToButton(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__AddBorderToButton__Workbook_Sheet_Integer_Integer_Integer_Integer();

	/**
	 * Returns the meta object for the '{@link generator.genexcel.ExcelGenerator#addBorderToContainer(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Border To Container</em>' operation.
	 * @see generator.genexcel.ExcelGenerator#addBorderToContainer(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getExcelGenerator__AddBorderToContainer__Workbook_Sheet_Integer_Integer_Integer_Integer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenexcelFactory getGenexcelFactory();

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
		 * The meta object literal for the '{@link generator.genexcel.impl.ExcelGeneratorImpl <em>Excel Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genexcel.impl.ExcelGeneratorImpl
		 * @see generator.genexcel.impl.GenexcelPackageImpl#getExcelGenerator()
		 * @generated
		 */
		EClass EXCEL_GENERATOR = eINSTANCE.getExcelGenerator();

		/**
		 * The meta object literal for the '<em><b>Create Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_EXCEL__GENMODEL = eINSTANCE.getExcelGenerator__CreateExcel__GenModel();

		/**
		 * The meta object literal for the '<em><b>Open File Into Editor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING = eINSTANCE.getExcelGenerator__OpenFileIntoEditor__String();

		/**
		 * The meta object literal for the '<em><b>Create Container Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_CONTAINER_EXCEL__WORKBOOK_SHEET_GENCONTAINER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateContainerExcel__Workbook_Sheet_GenContainer_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Label Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_LABEL_EXCEL__WORKBOOK_SHEET_GENLABEL_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateLabelExcel__Workbook_Sheet_GenLabel_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Text Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_TEXT_EXCEL__WORKBOOK_SHEET_GENTEXTFIELD_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateTextExcel__Workbook_Sheet_GenTextField_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Table Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_TABLE_EXCEL__WORKBOOK_SHEET_GENTABLE_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateTableExcel__Workbook_Sheet_GenTable_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Column Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_COLUMN_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateColumnExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Table Row Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_TABLE_ROW_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateTableRowExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Combo Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_COMBO_EXCEL__WORKBOOK_SHEET_GENCOMBOBOX_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateComboExcel__Workbook_Sheet_GenComboBox_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Create Button Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_BUTTON_EXCEL__WORKBOOK_SHEET_GENBUTTON_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CreateButtonExcel__Workbook_Sheet_GenButton_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Calculate R1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CALCULATE_R1__INTEGER = eINSTANCE.getExcelGenerator__CalculateR1__Integer();

		/**
		 * The meta object literal for the '<em><b>Calculate R2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CALCULATE_R2__INTEGER_INTEGER = eINSTANCE.getExcelGenerator__CalculateR2__Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Get Column Letters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_COLUMN_LETTERS__INTEGER = eINSTANCE.getExcelGenerator__GetColumnLetters__Integer();

		/**
		 * The meta object literal for the '<em><b>Change Font</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CHANGE_FONT__WORKBOOK_CELL_INTEGER_STRING = eINSTANCE.getExcelGenerator__ChangeFont__Workbook_Cell_Integer_String();

		/**
		 * The meta object literal for the '<em><b>Change Alignment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CHANGE_ALIGNMENT__WORKBOOK_CELL_STRING = eINSTANCE.getExcelGenerator__ChangeAlignment__Workbook_Cell_String();

		/**
		 * The meta object literal for the '<em><b>Add Border To Merged Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___ADD_BORDER_TO_MERGED_REGION__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__AddBorderToMergedRegion__Workbook_Sheet_Integer_Integer_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Add Border To Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___ADD_BORDER_TO_BUTTON__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__AddBorderToButton__Workbook_Sheet_Integer_Integer_Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>Add Border To Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___ADD_BORDER_TO_CONTAINER__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER = eINSTANCE.getExcelGenerator__AddBorderToContainer__Workbook_Sheet_Integer_Integer_Integer_Integer();

	}

} //GenexcelPackage
