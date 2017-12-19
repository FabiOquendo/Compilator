/**
 */
package generator.genmodel.gencontainercomponent.gencontainer.impl;

import compilator.CompilatorPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

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

import generator.genmodel.GenmodelPackage;

import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerFactory;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

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
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import styles.StylesPackage;

import styles.domain.DomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GencontainerPackageImpl extends EPackageImpl implements GencontainerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContainerEClass = null;

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
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GencontainerPackageImpl() {
		super(eNS_URI, GencontainerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GencontainerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GencontainerPackage init() {
		if (isInited) return (GencontainerPackage)EPackage.Registry.INSTANCE.getEPackage(GencontainerPackage.eNS_URI);

		// Obtain or create and register package
		GencontainerPackageImpl theGencontainerPackage = (GencontainerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GencontainerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GencontainerPackageImpl());

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
		EnumerationPackageImpl theEnumerationPackage = (EnumerationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) instanceof EnumerationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) : EnumerationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) : DatatypesdataformPackage.eINSTANCE);
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		GendataformPackageImpl theGendataformPackage = (GendataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) instanceof GendataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GendataformPackage.eNS_URI) : GendataformPackage.eINSTANCE);

		// Create package meta-data objects
		theGencontainerPackage.createPackageContents();
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
		theEnumerationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesdataformPackage.createPackageContents();
		theDatatypesgmfPackage.createPackageContents();
		theGendataformPackage.createPackageContents();

		// Initialize created meta-data
		theGencontainerPackage.initializePackageContents();
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
		theEnumerationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesdataformPackage.initializePackageContents();
		theDatatypesgmfPackage.initializePackageContents();
		theGendataformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGencontainerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GencontainerPackage.eNS_URI, theGencontainerPackage);
		return theGencontainerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContainer() {
		return genContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainer_TheTitleHeight() {
		return (EReference)genContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainer_TheOrientation() {
		return (EReference)genContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainer_TheContainer() {
		return (EReference)genContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainer_TheBackground() {
		return (EReference)genContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenContainer__CreatePropertiesContainer__String_Propertie() {
		return genContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenContainer__CreateBackground() {
		return genContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenContainer__CreateOrientation() {
		return genContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenContainer__CreateTitleHeight() {
		return genContainerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGenContainer__SetDefaultContainer__String_Propertie() {
		return genContainerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencontainerFactory getGencontainerFactory() {
		return (GencontainerFactory)getEFactoryInstance();
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
		genContainerEClass = createEClass(GEN_CONTAINER);
		createEReference(genContainerEClass, GEN_CONTAINER__THE_TITLE_HEIGHT);
		createEReference(genContainerEClass, GEN_CONTAINER__THE_ORIENTATION);
		createEReference(genContainerEClass, GEN_CONTAINER__THE_CONTAINER);
		createEReference(genContainerEClass, GEN_CONTAINER__THE_BACKGROUND);
		createEOperation(genContainerEClass, GEN_CONTAINER___CREATE_PROPERTIES_CONTAINER__STRING_PROPERTIE);
		createEOperation(genContainerEClass, GEN_CONTAINER___CREATE_BACKGROUND);
		createEOperation(genContainerEClass, GEN_CONTAINER___CREATE_ORIENTATION);
		createEOperation(genContainerEClass, GEN_CONTAINER___CREATE_TITLE_HEIGHT);
		createEOperation(genContainerEClass, GEN_CONTAINER___SET_DEFAULT_CONTAINER__STRING_PROPERTIE);
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
		GencontainercomponentPackage theGencontainercomponentPackage = (GencontainercomponentPackage)EPackage.Registry.INSTANCE.getEPackage(GencontainercomponentPackage.eNS_URI);
		TitlesizePackage theTitlesizePackage = (TitlesizePackage)EPackage.Registry.INSTANCE.getEPackage(TitlesizePackage.eNS_URI);
		OrientationPackage theOrientationPackage = (OrientationPackage)EPackage.Registry.INSTANCE.getEPackage(OrientationPackage.eNS_URI);
		ContainercomponentPackage theContainercomponentPackage = (ContainercomponentPackage)EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI);
		BackgroundPackage theBackgroundPackage = (BackgroundPackage)EPackage.Registry.INSTANCE.getEPackage(BackgroundPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genContainerEClass.getESuperTypes().add(theGencontainercomponentPackage.getGenContainerElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(genContainerEClass, GenContainer.class, "GenContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenContainer_TheTitleHeight(), theTitlesizePackage.getTitleHeight(), theTitlesizePackage.getTitleHeight_GenContainer(), "theTitleHeight", null, 1, 1, GenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenContainer_TheOrientation(), theOrientationPackage.getOrientation(), theOrientationPackage.getOrientation_GenContainer(), "theOrientation", null, 1, 1, GenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenContainer_TheContainer(), theContainercomponentPackage.getContainer(), null, "theContainer", null, 1, 1, GenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenContainer_TheBackground(), theBackgroundPackage.getBackground(), theBackgroundPackage.getBackground_GenContainer(), "theBackground", null, 1, 1, GenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGenContainer__CreatePropertiesContainer__String_Propertie(), null, "createPropertiesContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orientation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getPropertie(), "fontSize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGenContainer__CreateBackground(), null, "createBackground", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGenContainer__CreateOrientation(), null, "createOrientation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGenContainer__CreateTitleHeight(), null, "createTitleHeight", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGenContainer__SetDefaultContainer__String_Propertie(), null, "setDefaultContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "orientation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getPropertie(), "fontSize", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //GencontainerPackageImpl
