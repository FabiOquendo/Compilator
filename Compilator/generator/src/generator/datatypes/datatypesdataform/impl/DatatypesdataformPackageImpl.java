/**
 */
package generator.datatypes.datatypesdataform.impl;

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

import generator.datatypes.datatypesdataform.DatatypesdataformFactory;
import generator.datatypes.datatypesdataform.DatatypesdataformPackage;

import generator.datatypes.datatypesgmf.DatatypesgmfPackage;

import generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl;

import generator.datatypes.impl.DatatypesPackageImpl;

import generator.enumeration.EnumerationPackage;

import generator.enumeration.impl.EnumerationPackageImpl;

import generator.gendataform.GendataformPackage;

import generator.gendataform.impl.GendataformPackageImpl;

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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import styles.StylesPackage;

import styles.domain.DomainPackage;

import tooldataform.ModelFactory;

import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.ModelElementDataForm;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;

import tooldataform.formmodel.containers.GraphicalContainer;

import tooldataform.styles.domain.Domain;
import tooldataform.styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesdataformPackageImpl extends EPackageImpl implements DatatypesdataformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphicalContainerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType containerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataForm_DiagramEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphicalIndividualEementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buttonEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comboViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType labelViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType columViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interfaceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domanStyleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelElementDataFormEDataType = null;

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
	 * @see generator.datatypes.datatypesdataform.DatatypesdataformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesdataformPackageImpl() {
		super(eNS_URI, DatatypesdataformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesdataformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesdataformPackage init() {
		if (isInited) return (DatatypesdataformPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesdataformPackageImpl());

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
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		GendataformPackageImpl theGendataformPackage = (GendataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) instanceof GendataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) : GendataformPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesdataformPackage.createPackageContents();
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
		theDatatypesgmfPackage.createPackageContents();
		theGendataformPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesdataformPackage.initializePackageContents();
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
		theDatatypesgmfPackage.initializePackageContents();
		theGendataformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesdataformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesdataformPackage.eNS_URI, theDatatypesdataformPackage);
		return theDatatypesdataformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGraphicalContainer() {
		return graphicalContainerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContainer() {
		return containerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataForm_Diagram() {
		return dataForm_DiagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGraphicalIndividualEement() {
		return graphicalIndividualEementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getButton() {
		return buttonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComboView() {
		return comboViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLabelView() {
		return labelViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextView() {
		return textViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableView() {
		return tableViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColumView() {
		return columViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelFactory() {
		return modelFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterface() {
		return interfaceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDomanStyle() {
		return domanStyleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyle() {
		return styleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelElementDataForm() {
		return modelElementDataFormEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformFactory getDatatypesdataformFactory() {
		return (DatatypesdataformFactory)getEFactoryInstance();
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

		// Create data types
		graphicalContainerEDataType = createEDataType(GRAPHICAL_CONTAINER);
		containerEDataType = createEDataType(CONTAINER);
		dataForm_DiagramEDataType = createEDataType(DATA_FORM_DIAGRAM);
		graphicalIndividualEementEDataType = createEDataType(GRAPHICAL_INDIVIDUAL_EEMENT);
		buttonEDataType = createEDataType(BUTTON);
		comboViewEDataType = createEDataType(COMBO_VIEW);
		labelViewEDataType = createEDataType(LABEL_VIEW);
		textViewEDataType = createEDataType(TEXT_VIEW);
		tableViewEDataType = createEDataType(TABLE_VIEW);
		columViewEDataType = createEDataType(COLUM_VIEW);
		modelFactoryEDataType = createEDataType(MODEL_FACTORY);
		interfaceEDataType = createEDataType(INTERFACE);
		domanStyleEDataType = createEDataType(DOMAN_STYLE);
		styleEDataType = createEDataType(STYLE);
		modelElementDataFormEDataType = createEDataType(MODEL_ELEMENT_DATA_FORM);
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

		// Initialize data types
		initEDataType(graphicalContainerEDataType, GraphicalContainer.class, "GraphicalContainer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(containerEDataType, tooldataform.formmodel.concreta.Container.class, "Container", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataForm_DiagramEDataType, DataForm_Diagram.class, "DataForm_Diagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphicalIndividualEementEDataType, GraphicalIndividualEement.class, "GraphicalIndividualEement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buttonEDataType, Button.class, "Button", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(comboViewEDataType, ComboView.class, "ComboView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(labelViewEDataType, LabelView.class, "LabelView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textViewEDataType, TextView.class, "TextView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tableViewEDataType, TableView.class, "TableView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(columViewEDataType, ColumView.class, "ColumView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modelFactoryEDataType, ModelFactory.class, "ModelFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interfaceEDataType, Interface.class, "Interface", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(domanStyleEDataType, Domain.class, "DomanStyle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleEDataType, Style.class, "Style", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modelElementDataFormEDataType, ModelElementDataForm.class, "ModelElementDataForm", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatatypesdataformPackageImpl
