/**
 */
package generator.genexcel.tests;

import generator.genexcel.ExcelGenerator;
import generator.genexcel.GenexcelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link generator.genexcel.ExcelGenerator#createExcel(generator.genmodel.GenModel) <em>Create Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createContainerExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.gencontainercomponent.gencontainer.GenContainer, java.lang.Integer, java.lang.Integer) <em>Create Container Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createLabelExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genlabel.GenLabel, java.lang.Integer, java.lang.Integer) <em>Create Label Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createTextExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentextfield.GenTextField, java.lang.Integer, java.lang.Integer) <em>Create Text Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createTableExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentable.GenTable, java.lang.Integer, java.lang.Integer) <em>Create Table Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createColumnExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Column Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createTableRowExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Table Row Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createComboExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox, java.lang.Integer, java.lang.Integer) <em>Create Combo Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#createButtonExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genbutton.GenButton, java.lang.Integer, java.lang.Integer) <em>Create Button Excel</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#calculateR1(java.lang.Integer) <em>Calculate R1</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#calculateR2(java.lang.Integer, java.lang.Integer) <em>Calculate R2</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#getColumnLetters(java.lang.Integer) <em>Get Column Letters</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#changeFont(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.Integer, java.lang.String) <em>Change Font</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#changeAlignment(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.String) <em>Change Alignment</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#addBorderToMergedRegion(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Merged Region</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#addBorderToButton(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Button</em>}</li>
 *   <li>{@link generator.genexcel.ExcelGenerator#addBorderToContainer(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Container</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExcelGeneratorTest extends TestCase {

	/**
	 * The fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcelGeneratorTest.class);
	}

	/**
	 * Constructs a new Excel Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExcelGenerator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGenerator getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenexcelFactory.eINSTANCE.createExcelGenerator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createExcel(generator.genmodel.GenModel) <em>Create Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createExcel(generator.genmodel.GenModel)
	 * @generated
	 */
	public void testCreateExcel__GenModel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#openFileIntoEditor(java.lang.String)
	 * @generated
	 */
	public void testOpenFileIntoEditor__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createContainerExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.gencontainercomponent.gencontainer.GenContainer, java.lang.Integer, java.lang.Integer) <em>Create Container Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createContainerExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.gencontainercomponent.gencontainer.GenContainer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateContainerExcel__Workbook_Sheet_GenContainer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createLabelExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genlabel.GenLabel, java.lang.Integer, java.lang.Integer) <em>Create Label Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createLabelExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genlabel.GenLabel, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateLabelExcel__Workbook_Sheet_GenLabel_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createTextExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentextfield.GenTextField, java.lang.Integer, java.lang.Integer) <em>Create Text Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createTextExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentextfield.GenTextField, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateTextExcel__Workbook_Sheet_GenTextField_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createTableExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentable.GenTable, java.lang.Integer, java.lang.Integer) <em>Create Table Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createTableExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gentable.GenTable, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateTableExcel__Workbook_Sheet_GenTable_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createColumnExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Column Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createColumnExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateColumnExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createTableRowExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Create Table Row Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createTableRowExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencolunm.GenColumn, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateTableRowExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createComboExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox, java.lang.Integer, java.lang.Integer) <em>Create Combo Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createComboExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateComboExcel__Workbook_Sheet_GenComboBox_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#createButtonExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genbutton.GenButton, java.lang.Integer, java.lang.Integer) <em>Create Button Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#createButtonExcel(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, generator.genmodel.genindividualcomponent.genbutton.GenButton, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCreateButtonExcel__Workbook_Sheet_GenButton_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#calculateR1(java.lang.Integer) <em>Calculate R1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#calculateR1(java.lang.Integer)
	 * @generated
	 */
	public void testCalculateR1__Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#calculateR2(java.lang.Integer, java.lang.Integer) <em>Calculate R2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#calculateR2(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testCalculateR2__Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#getColumnLetters(java.lang.Integer) <em>Get Column Letters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#getColumnLetters(java.lang.Integer)
	 * @generated
	 */
	public void testGetColumnLetters__Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#changeFont(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.Integer, java.lang.String) <em>Change Font</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#changeFont(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.Integer, java.lang.String)
	 * @generated
	 */
	public void testChangeFont__Workbook_Cell_Integer_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#changeAlignment(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.String) <em>Change Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#changeAlignment(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Cell, java.lang.String)
	 * @generated
	 */
	public void testChangeAlignment__Workbook_Cell_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#addBorderToMergedRegion(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Merged Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#addBorderToMergedRegion(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testAddBorderToMergedRegion__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#addBorderToButton(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#addBorderToButton(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testAddBorderToButton__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link generator.genexcel.ExcelGenerator#addBorderToContainer(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Add Border To Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genexcel.ExcelGenerator#addBorderToContainer(org.apache.poi.ss.usermodel.Workbook, org.apache.poi.ss.usermodel.Sheet, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	public void testAddBorderToContainer__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ExcelGeneratorTest
