/**
 */
package generator.genexcel.impl;

import compilator.CompilatorPackage;

import generator.GeneratorPackage;

import generator.apperance.alignment.AlignmentPackage;

import generator.apperance.alignment.impl.AlignmentPackageImpl;

import generator.apperance.background.BackgroundPackage;

import generator.apperance.background.impl.BackgroundPackageImpl;

import generator.apperance.font.FontPackage;

import generator.apperance.font.impl.FontPackageImpl;

import generator.apperance.linesvisible.LinesvisiblePackage;

import generator.apperance.linesvisible.impl.LinesvisiblePackageImpl;

import generator.apperance.orientation.OrientationPackage;

import generator.apperance.orientation.impl.OrientationPackageImpl;

import generator.apperance.position.PositionPackage;

import generator.apperance.position.impl.PositionPackageImpl;

import generator.apperance.size.SizePackage;

import generator.apperance.size.impl.SizePackageImpl;

import generator.apperance.titlesize.TitlesizePackage;

import generator.apperance.titlesize.impl.TitlesizePackageImpl;

import generator.datatypes.DatatypesPackage;

import generator.datatypes.datatypesdataform.DatatypesdataformPackage;

import generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl;

import generator.datatypes.datatypesgmf.DatatypesgmfPackage;

import generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl;

import generator.datatypes.impl.DatatypesPackageImpl;

import generator.enumeration.EnumerationPackage;

import generator.enumeration.impl.EnumerationPackageImpl;

import generator.gendataform.GendataformPackage;

import generator.gendataform.impl.GendataformPackageImpl;

import generator.genexcel.ExcelGenerator;
import generator.genexcel.GenexcelFactory;
import generator.genexcel.GenexcelPackage;

import generator.genmodel.GenmodelPackage;

import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

import generator.genmodel.gencontainercomponent.gencontainer.impl.GencontainerPackageImpl;

import generator.genmodel.gencontainercomponent.impl.GencontainercomponentPackageImpl;

import generator.genmodel.genindividualcomponent.GenindividualcomponentPackage;

import generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage;

import generator.genmodel.genindividualcomponent.genbutton.impl.GenbuttonPackageImpl;

import generator.genmodel.genindividualcomponent.gencolunm.GencolunmPackage;

import generator.genmodel.genindividualcomponent.gencolunm.impl.GencolunmPackageImpl;

import generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage;

import generator.genmodel.genindividualcomponent.gencombobox.impl.GencomboboxPackageImpl;

import generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage;

import generator.genmodel.genindividualcomponent.genlabel.impl.GenlabelPackageImpl;

import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import generator.genmodel.genindividualcomponent.gentable.impl.GentablePackageImpl;

import generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage;

import generator.genmodel.genindividualcomponent.gentextfield.impl.GentextfieldPackageImpl;

import generator.genmodel.genindividualcomponent.impl.GenindividualcomponentPackageImpl;

import generator.genmodel.impl.GenmodelPackageImpl;

import generator.impl.GeneratorPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import styles.StylesPackage;

import styles.domain.DomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenexcelPackageImpl extends EPackageImpl implements GenexcelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelGeneratorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see generator.genexcel.GenexcelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenexcelPackageImpl() {
		super(eNS_URI, GenexcelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GenexcelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenexcelPackage init() {
		if (isInited) return (GenexcelPackage)EPackage.Registry.INSTANCE.getEPackage(GenexcelPackage.eNS_URI);

		// Obtain or create and register package
		GenexcelPackageImpl theGenexcelPackage = (GenexcelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenexcelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenexcelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompilatorPackage.eINSTANCE.eClass();
		DomainPackage.eINSTANCE.eClass();
		StylesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);
		AlignmentPackageImpl theAlignmentPackage = (AlignmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlignmentPackage.eNS_URI) instanceof AlignmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlignmentPackage.eNS_URI) : AlignmentPackage.eINSTANCE);
		BackgroundPackageImpl theBackgroundPackage = (BackgroundPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackgroundPackage.eNS_URI) instanceof BackgroundPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackgroundPackage.eNS_URI) : BackgroundPackage.eINSTANCE);
		LinesvisiblePackageImpl theLinesvisiblePackage = (LinesvisiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinesvisiblePackage.eNS_URI) instanceof LinesvisiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinesvisiblePackage.eNS_URI) : LinesvisiblePackage.eINSTANCE);
		PositionPackageImpl thePositionPackage = (PositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PositionPackage.eNS_URI) instanceof PositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PositionPackage.eNS_URI) : PositionPackage.eINSTANCE);
		SizePackageImpl theSizePackage = (SizePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SizePackage.eNS_URI) instanceof SizePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SizePackage.eNS_URI) : SizePackage.eINSTANCE);
		FontPackageImpl theFontPackage = (FontPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FontPackage.eNS_URI) instanceof FontPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FontPackage.eNS_URI) : FontPackage.eINSTANCE);
		TitlesizePackageImpl theTitlesizePackage = (TitlesizePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TitlesizePackage.eNS_URI) instanceof TitlesizePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TitlesizePackage.eNS_URI) : TitlesizePackage.eINSTANCE);
		OrientationPackageImpl theOrientationPackage = (OrientationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrientationPackage.eNS_URI) instanceof OrientationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrientationPackage.eNS_URI) : OrientationPackage.eINSTANCE);
		GenmodelPackageImpl theGenmodelPackage = (GenmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenmodelPackage.eNS_URI) instanceof GenmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenmodelPackage.eNS_URI) : GenmodelPackage.eINSTANCE);
		GenindividualcomponentPackageImpl theGenindividualcomponentPackage = (GenindividualcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenindividualcomponentPackage.eNS_URI) instanceof GenindividualcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenindividualcomponentPackage.eNS_URI) : GenindividualcomponentPackage.eINSTANCE);
		GenbuttonPackageImpl theGenbuttonPackage = (GenbuttonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenbuttonPackage.eNS_URI) instanceof GenbuttonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenbuttonPackage.eNS_URI) : GenbuttonPackage.eINSTANCE);
		GencolunmPackageImpl theGencolunmPackage = (GencolunmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GencolunmPackage.eNS_URI) instanceof GencolunmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GencolunmPackage.eNS_URI) : GencolunmPackage.eINSTANCE);
		GencomboboxPackageImpl theGencomboboxPackage = (GencomboboxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GencomboboxPackage.eNS_URI) instanceof GencomboboxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GencomboboxPackage.eNS_URI) : GencomboboxPackage.eINSTANCE);
		GenlabelPackageImpl theGenlabelPackage = (GenlabelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenlabelPackage.eNS_URI) instanceof GenlabelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenlabelPackage.eNS_URI) : GenlabelPackage.eINSTANCE);
		GentablePackageImpl theGentablePackage = (GentablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GentablePackage.eNS_URI) instanceof GentablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GentablePackage.eNS_URI) : GentablePackage.eINSTANCE);
		GentextfieldPackageImpl theGentextfieldPackage = (GentextfieldPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GentextfieldPackage.eNS_URI) instanceof GentextfieldPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GentextfieldPackage.eNS_URI) : GentextfieldPackage.eINSTANCE);
		GencontainercomponentPackageImpl theGencontainercomponentPackage = (GencontainercomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GencontainercomponentPackage.eNS_URI) instanceof GencontainercomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GencontainercomponentPackage.eNS_URI) : GencontainercomponentPackage.eINSTANCE);
		GencontainerPackageImpl theGencontainerPackage = (GencontainerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GencontainerPackage.eNS_URI) instanceof GencontainerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GencontainerPackage.eNS_URI) : GencontainerPackage.eINSTANCE);
		EnumerationPackageImpl theEnumerationPackage = (EnumerationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) instanceof EnumerationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) : EnumerationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) : DatatypesdataformPackage.eINSTANCE);
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		GendataformPackageImpl theGendataformPackage = (GendataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) instanceof GendataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) : GendataformPackage.eINSTANCE);

		// Create package meta-data objects
		theGenexcelPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
		theAlignmentPackage.createPackageContents();
		theBackgroundPackage.createPackageContents();
		theLinesvisiblePackage.createPackageContents();
		thePositionPackage.createPackageContents();
		theSizePackage.createPackageContents();
		theFontPackage.createPackageContents();
		theTitlesizePackage.createPackageContents();
		theOrientationPackage.createPackageContents();
		theGenmodelPackage.createPackageContents();
		theGenindividualcomponentPackage.createPackageContents();
		theGenbuttonPackage.createPackageContents();
		theGencolunmPackage.createPackageContents();
		theGencomboboxPackage.createPackageContents();
		theGenlabelPackage.createPackageContents();
		theGentablePackage.createPackageContents();
		theGentextfieldPackage.createPackageContents();
		theGencontainercomponentPackage.createPackageContents();
		theGencontainerPackage.createPackageContents();
		theEnumerationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesdataformPackage.createPackageContents();
		theDatatypesgmfPackage.createPackageContents();
		theGendataformPackage.createPackageContents();

		// Initialize created meta-data
		theGenexcelPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
		theAlignmentPackage.initializePackageContents();
		theBackgroundPackage.initializePackageContents();
		theLinesvisiblePackage.initializePackageContents();
		thePositionPackage.initializePackageContents();
		theSizePackage.initializePackageContents();
		theFontPackage.initializePackageContents();
		theTitlesizePackage.initializePackageContents();
		theOrientationPackage.initializePackageContents();
		theGenmodelPackage.initializePackageContents();
		theGenindividualcomponentPackage.initializePackageContents();
		theGenbuttonPackage.initializePackageContents();
		theGencolunmPackage.initializePackageContents();
		theGencomboboxPackage.initializePackageContents();
		theGenlabelPackage.initializePackageContents();
		theGentablePackage.initializePackageContents();
		theGentextfieldPackage.initializePackageContents();
		theGencontainercomponentPackage.initializePackageContents();
		theGencontainerPackage.initializePackageContents();
		theEnumerationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesdataformPackage.initializePackageContents();
		theDatatypesgmfPackage.initializePackageContents();
		theGendataformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenexcelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenexcelPackage.eNS_URI, theGenexcelPackage);
		return theGenexcelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcelGenerator() {
		return excelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateExcel__GenModel() {
		return excelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__OpenFileIntoEditor__String() {
		return excelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateContainerExcel__Workbook_Sheet_GenContainer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateLabelExcel__Workbook_Sheet_GenLabel_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateTextExcel__Workbook_Sheet_GenTextField_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateTableExcel__Workbook_Sheet_GenTable_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateColumnExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateTableRowExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateComboExcel__Workbook_Sheet_GenComboBox_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateButtonExcel__Workbook_Sheet_GenButton_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CalculateR1__Integer() {
		return excelGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CalculateR2__Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetColumnLetters__Integer() {
		return excelGeneratorEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ChangeFont__Workbook_Cell_Integer_String() {
		return excelGeneratorEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ChangeAlignment__Workbook_Cell_String() {
		return excelGeneratorEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__AddBorderToMergedRegion__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__AddBorderToButton__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__AddBorderToContainer__Workbook_Sheet_Integer_Integer_Integer_Integer() {
		return excelGeneratorEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenexcelFactory getGenexcelFactory() {
		return (GenexcelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		excelGeneratorEClass = createEClass(EXCEL_GENERATOR);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_EXCEL__GENMODEL);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_CONTAINER_EXCEL__WORKBOOK_SHEET_GENCONTAINER_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_LABEL_EXCEL__WORKBOOK_SHEET_GENLABEL_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_TEXT_EXCEL__WORKBOOK_SHEET_GENTEXTFIELD_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_TABLE_EXCEL__WORKBOOK_SHEET_GENTABLE_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_COLUMN_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_TABLE_ROW_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_COMBO_EXCEL__WORKBOOK_SHEET_GENCOMBOBOX_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_BUTTON_EXCEL__WORKBOOK_SHEET_GENBUTTON_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CALCULATE_R1__INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CALCULATE_R2__INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_COLUMN_LETTERS__INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CHANGE_FONT__WORKBOOK_CELL_INTEGER_STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CHANGE_ALIGNMENT__WORKBOOK_CELL_STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___ADD_BORDER_TO_MERGED_REGION__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___ADD_BORDER_TO_BUTTON__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___ADD_BORDER_TO_CONTAINER__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenmodelPackage theGenmodelPackage = (GenmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GenmodelPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		GencontainerPackage theGencontainerPackage = (GencontainerPackage)EPackage.Registry.INSTANCE.getEPackage(GencontainerPackage.eNS_URI);
		GenlabelPackage theGenlabelPackage = (GenlabelPackage)EPackage.Registry.INSTANCE.getEPackage(GenlabelPackage.eNS_URI);
		GentextfieldPackage theGentextfieldPackage = (GentextfieldPackage)EPackage.Registry.INSTANCE.getEPackage(GentextfieldPackage.eNS_URI);
		GentablePackage theGentablePackage = (GentablePackage)EPackage.Registry.INSTANCE.getEPackage(GentablePackage.eNS_URI);
		GencolunmPackage theGencolunmPackage = (GencolunmPackage)EPackage.Registry.INSTANCE.getEPackage(GencolunmPackage.eNS_URI);
		GencomboboxPackage theGencomboboxPackage = (GencomboboxPackage)EPackage.Registry.INSTANCE.getEPackage(GencomboboxPackage.eNS_URI);
		GenbuttonPackage theGenbuttonPackage = (GenbuttonPackage)EPackage.Registry.INSTANCE.getEPackage(GenbuttonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(excelGeneratorEClass, ExcelGenerator.class, "ExcelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getExcelGenerator__CreateExcel__GenModel(), null, "createExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenmodelPackage.getGenModel(), "genModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__OpenFileIntoEditor__String(), null, "openFileIntoEditor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateContainerExcel__Workbook_Sheet_GenContainer_Integer_Integer(), null, "createContainerExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencontainerPackage.getGenContainer(), "genContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateLabelExcel__Workbook_Sheet_GenLabel_Integer_Integer(), null, "createLabelExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenlabelPackage.getGenLabel(), "genLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateTextExcel__Workbook_Sheet_GenTextField_Integer_Integer(), null, "createTextExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGentextfieldPackage.getGenTextField(), "genText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateTableExcel__Workbook_Sheet_GenTable_Integer_Integer(), null, "createTableExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGentablePackage.getGenTable(), "genTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateColumnExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer(), null, "createColumnExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencolunmPackage.getGenColumn(), "genColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateTableRowExcel__Workbook_Sheet_GenColumn_Integer_Integer_Integer_Integer(), null, "createTableRowExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencolunmPackage.getGenColumn(), "genColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateComboExcel__Workbook_Sheet_GenComboBox_Integer_Integer(), null, "createComboExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencomboboxPackage.getGenComboBox(), "genCombo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateButtonExcel__Workbook_Sheet_GenButton_Integer_Integer(), null, "createButtonExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenbuttonPackage.getGenButton(), "genButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CalculateR1__Integer(), ecorePackage.getEIntegerObject(), "calculateR1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CalculateR2__Integer_Integer(), ecorePackage.getEIntegerObject(), "calculateR2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "h", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetColumnLetters__Integer(), ecorePackage.getEString(), "getColumnLetters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__ChangeFont__Workbook_Cell_Integer_String(), null, "changeFont", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "fontSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fontType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__ChangeAlignment__Workbook_Cell_String(), null, "changeAlignment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getCell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "alignment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__AddBorderToMergedRegion__Workbook_Sheet_Integer_Integer_Integer_Integer(), null, "addBorderToMergedRegion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__AddBorderToButton__Workbook_Sheet_Integer_Integer_Integer_Integer(), null, "addBorderToButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__AddBorderToContainer__Workbook_Sheet_Integer_Integer_Integer_Integer(), null, "addBorderToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getWorkbook(), "wb", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "r2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "c2", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //GenexcelPackageImpl
