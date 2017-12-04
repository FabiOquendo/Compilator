/**
 */
package generator.gendataform.impl;

import compilator.CompilatorPackage;

import compilator.domain.datatypes.util.UtilPackage;

import generator.GeneratorPackage;

import generator.apperance.alignment.AlignmentPackage;

import generator.apperance.alignment.impl.AlignmentPackageImpl;

import generator.apperance.background.BackgroundPackage;

import generator.apperance.background.impl.BackgroundPackageImpl;

import generator.apperance.font.FontPackage;

import generator.apperance.font.impl.FontPackageImpl;

import generator.apperance.linesvisible.LinesvisiblePackage;

import generator.apperance.linesvisible.impl.LinesvisiblePackageImpl;

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

import generator.gendataform.DataFormDiagramGenerator;
import generator.gendataform.DataFormModelGenerator;
import generator.gendataform.GendataformFactory;
import generator.gendataform.GendataformPackage;

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

import org.eclipse.emf.ecore.EAttribute;
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
public class GendataformPackageImpl extends EPackageImpl implements GendataformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormDiagramGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFormModelGeneratorEClass = null;

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
	 * @see generator.gendataform.GendataformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GendataformPackageImpl() {
		super(eNS_URI, GendataformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GendataformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GendataformPackage init() {
		if (isInited) return (GendataformPackage)EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI);

		// Obtain or create and register package
		GendataformPackageImpl theGendataformPackage = (GendataformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GendataformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GendataformPackageImpl());

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

		// Create package meta-data objects
		theGendataformPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
		theAlignmentPackage.createPackageContents();
		theBackgroundPackage.createPackageContents();
		theLinesvisiblePackage.createPackageContents();
		thePositionPackage.createPackageContents();
		theSizePackage.createPackageContents();
		theFontPackage.createPackageContents();
		theTitlesizePackage.createPackageContents();
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

		// Initialize created meta-data
		theGendataformPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
		theAlignmentPackage.initializePackageContents();
		theBackgroundPackage.initializePackageContents();
		theLinesvisiblePackage.initializePackageContents();
		thePositionPackage.initializePackageContents();
		theSizePackage.initializePackageContents();
		theFontPackage.initializePackageContents();
		theTitlesizePackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theGendataformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GendataformPackage.eNS_URI, theGendataformPackage);
		return theGendataformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormDiagramGenerator() {
		return dataFormDiagramGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormDiagramGenerator_ModelFactory() {
		return (EAttribute)dataFormDiagramGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormDiagramGenerator_DataformDiagram() {
		return (EAttribute)dataFormDiagramGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormDiagramGenerator_Interface1() {
		return (EAttribute)dataFormDiagramGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__DataformDiagramGenerator__ModelFactory() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__SalvarDiagram__Diagram() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__CargarDiagram() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__ResetDiagram__String() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__GenerateDiagram() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__CreateDiagram() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__InitComponents__GraphicalContainer_Node() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__CreateBounds__int_int_int_int() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormDiagramGenerator__OpenDiagram__Diagram() {
		return dataFormDiagramGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFormModelGenerator() {
		return dataFormModelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFormModelGenerator_LevelContainer() {
		return (EAttribute)dataFormModelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateDataFormModel__GenModel() {
		return dataFormModelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateToolDataFormContainer__GenContainer() {
		return dataFormModelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateIndividualElement__GenElement() {
		return dataFormModelGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateGraphicalContainer__GenElement() {
		return dataFormModelGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateButton__GenButton() {
		return dataFormModelGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateComboView__GenComboBox() {
		return dataFormModelGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateLabelView__GenLabel() {
		return dataFormModelGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateTextView__GenTextField() {
		return dataFormModelGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateTableView__GenTable() {
		return dataFormModelGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__CreateColumView__GenColumn() {
		return dataFormModelGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__SetLevelContainer__GraphicalContainer() {
		return dataFormModelGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFormModelGenerator__SetBoundsContainers__Integer_GraphicalContainer() {
		return dataFormModelGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataformFactory getGendataformFactory() {
		return (GendataformFactory)getEFactoryInstance();
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
		dataFormDiagramGeneratorEClass = createEClass(DATA_FORM_DIAGRAM_GENERATOR);
		createEAttribute(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR__MODEL_FACTORY);
		createEAttribute(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM);
		createEAttribute(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR__INTERFACE1);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT);
		createEOperation(dataFormDiagramGeneratorEClass, DATA_FORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM);

		dataFormModelGeneratorEClass = createEClass(DATA_FORM_MODEL_GENERATOR);
		createEAttribute(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_DATA_FORM_MODEL__GENMODEL);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_TOOL_DATA_FORM_CONTAINER__GENCONTAINER);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_INDIVIDUAL_ELEMENT__GENELEMENT);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_GRAPHICAL_CONTAINER__GENELEMENT);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_BUTTON__GENBUTTON);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_COMBO_VIEW__GENCOMBOBOX);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_LABEL_VIEW__GENLABEL);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_TEXT_VIEW__GENTEXTFIELD);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_TABLE_VIEW__GENTABLE);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___CREATE_COLUM_VIEW__GENCOLUMN);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___SET_LEVEL_CONTAINER__GRAPHICALCONTAINER);
		createEOperation(dataFormModelGeneratorEClass, DATA_FORM_MODEL_GENERATOR___SET_BOUNDS_CONTAINERS__INTEGER_GRAPHICALCONTAINER);
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
		DatatypesdataformPackage theDatatypesdataformPackage = (DatatypesdataformPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI);
		DatatypesgmfPackage theDatatypesgmfPackage = (DatatypesgmfPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		GenmodelPackage theGenmodelPackage = (GenmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GenmodelPackage.eNS_URI);
		GencontainerPackage theGencontainerPackage = (GencontainerPackage)EPackage.Registry.INSTANCE.getEPackage(GencontainerPackage.eNS_URI);
		GenbuttonPackage theGenbuttonPackage = (GenbuttonPackage)EPackage.Registry.INSTANCE.getEPackage(GenbuttonPackage.eNS_URI);
		GencomboboxPackage theGencomboboxPackage = (GencomboboxPackage)EPackage.Registry.INSTANCE.getEPackage(GencomboboxPackage.eNS_URI);
		GenlabelPackage theGenlabelPackage = (GenlabelPackage)EPackage.Registry.INSTANCE.getEPackage(GenlabelPackage.eNS_URI);
		GentextfieldPackage theGentextfieldPackage = (GentextfieldPackage)EPackage.Registry.INSTANCE.getEPackage(GentextfieldPackage.eNS_URI);
		GentablePackage theGentablePackage = (GentablePackage)EPackage.Registry.INSTANCE.getEPackage(GentablePackage.eNS_URI);
		GencolunmPackage theGencolunmPackage = (GencolunmPackage)EPackage.Registry.INSTANCE.getEPackage(GencolunmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataFormDiagramGeneratorEClass, DataFormDiagramGenerator.class, "DataFormDiagramGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFormDiagramGenerator_ModelFactory(), theDatatypesdataformPackage.getModelFactory(), "modelFactory", null, 0, 1, DataFormDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFormDiagramGenerator_DataformDiagram(), theDatatypesdataformPackage.getDataForm_Diagram(), "dataformDiagram", null, 0, 1, DataFormDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataFormDiagramGenerator_Interface1(), theDatatypesdataformPackage.getInterface(), "interface1", null, 0, 1, DataFormDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDataFormDiagramGenerator__DataformDiagramGenerator__ModelFactory(), null, "DataformDiagramGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getModelFactory(), "modelFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormDiagramGenerator__SalvarDiagram__Diagram(), null, "salvarDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getDiagram(), "diagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataFormDiagramGenerator__CargarDiagram(), null, "cargarDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormDiagramGenerator__ResetDiagram__String(), null, "resetDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataFormDiagramGenerator__GenerateDiagram(), null, "generateDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataFormDiagramGenerator__CreateDiagram(), theDatatypesgmfPackage.getDiagram(), "createDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormDiagramGenerator__InitComponents__GraphicalContainer_Node(), null, "initComponents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getGraphicalContainer(), "graphicalContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getNode(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormDiagramGenerator__CreateBounds__int_int_int_int(), theDatatypesgmfPackage.getBounds(), "createBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormDiagramGenerator__OpenDiagram__Diagram(), null, "openDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getDiagram(), "diag", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataFormModelGeneratorEClass, DataFormModelGenerator.class, "DataFormModelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFormModelGenerator_LevelContainer(), theUtilPackage.getHashMap(), "levelContainer", null, 0, 1, DataFormModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateDataFormModel__GenModel(), theDatatypesdataformPackage.getDataForm_Diagram(), "createDataFormModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenmodelPackage.getGenModel(), "genModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateToolDataFormContainer__GenContainer(), theDatatypesdataformPackage.getContainer(), "createToolDataFormContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencontainerPackage.getGenContainer(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateIndividualElement__GenElement(), theDatatypesdataformPackage.getGraphicalIndividualEement(), "createIndividualElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenmodelPackage.getGenElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateGraphicalContainer__GenElement(), theDatatypesdataformPackage.getGraphicalContainer(), "createGraphicalContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenmodelPackage.getGenElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateButton__GenButton(), theDatatypesdataformPackage.getButton(), "createButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenbuttonPackage.getGenButton(), "genButton", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateComboView__GenComboBox(), theDatatypesdataformPackage.getComboView(), "createComboView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencomboboxPackage.getGenComboBox(), "genCombo", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateLabelView__GenLabel(), theDatatypesdataformPackage.getLabelView(), "createLabelView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGenlabelPackage.getGenLabel(), "genLabel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateTextView__GenTextField(), theDatatypesdataformPackage.getTextView(), "createTextView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGentextfieldPackage.getGenTextField(), "genText", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateTableView__GenTable(), theDatatypesdataformPackage.getTableView(), "createTableView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGentablePackage.getGenTable(), "genTable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__CreateColumView__GenColumn(), theDatatypesdataformPackage.getColumView(), "createColumView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGencolunmPackage.getGenColumn(), "genColumn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__SetLevelContainer__GraphicalContainer(), ecorePackage.getEIntegerObject(), "setLevelContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getGraphicalContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataFormModelGenerator__SetBoundsContainers__Integer_GraphicalContainer(), null, "setBoundsContainers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getGraphicalContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //GendataformPackageImpl
