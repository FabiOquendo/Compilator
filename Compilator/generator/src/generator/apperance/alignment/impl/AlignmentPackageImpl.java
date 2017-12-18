/**
 */
package generator.apperance.alignment.impl;

import compilator.CompilatorPackage;

import generator.GeneratorPackage;

import generator.apperance.alignment.Alignment;
import generator.apperance.alignment.AlignmentFactory;
import generator.apperance.alignment.AlignmentPackage;

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
public class AlignmentPackageImpl extends EPackageImpl implements AlignmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignmentEClass = null;

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
	 * @see generator.apperance.alignment.AlignmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlignmentPackageImpl() {
		super(eNS_URI, AlignmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlignmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlignmentPackage init() {
		if (isInited) return (AlignmentPackage)EPackage.Registry.INSTANCE.getEPackage(AlignmentPackage.eNS_URI);

		// Obtain or create and register package
		AlignmentPackageImpl theAlignmentPackage = (AlignmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlignmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlignmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CompilatorPackage.eINSTANCE.eClass();
		DomainPackage.eINSTANCE.eClass();
		StylesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);
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
		theAlignmentPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
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
		theAlignmentPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
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
		theAlignmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlignmentPackage.eNS_URI, theAlignmentPackage);
		return theAlignmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignment() {
		return alignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignment_Value() {
		return (EAttribute)alignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignment_GenButton() {
		return (EReference)alignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignment_GenColumn() {
		return (EReference)alignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignment_GenLabel() {
		return (EReference)alignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentFactory getAlignmentFactory() {
		return (AlignmentFactory)getEFactoryInstance();
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
		alignmentEClass = createEClass(ALIGNMENT);
		createEAttribute(alignmentEClass, ALIGNMENT__VALUE);
		createEReference(alignmentEClass, ALIGNMENT__GEN_BUTTON);
		createEReference(alignmentEClass, ALIGNMENT__GEN_COLUMN);
		createEReference(alignmentEClass, ALIGNMENT__GEN_LABEL);
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
		GenbuttonPackage theGenbuttonPackage = (GenbuttonPackage)EPackage.Registry.INSTANCE.getEPackage(GenbuttonPackage.eNS_URI);
		GencolunmPackage theGencolunmPackage = (GencolunmPackage)EPackage.Registry.INSTANCE.getEPackage(GencolunmPackage.eNS_URI);
		GenlabelPackage theGenlabelPackage = (GenlabelPackage)EPackage.Registry.INSTANCE.getEPackage(GenlabelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(alignmentEClass, Alignment.class, "Alignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, Alignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignment_GenButton(), theGenbuttonPackage.getGenButton(), theGenbuttonPackage.getGenButton_TheAlignment(), "GenButton", null, 0, 1, Alignment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignment_GenColumn(), theGencolunmPackage.getGenColumn(), theGencolunmPackage.getGenColumn_TheAlignment(), "GenColumn", null, 0, 1, Alignment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignment_GenLabel(), theGenlabelPackage.getGenLabel(), theGenlabelPackage.getGenLabel_TheAlignment(), "GenLabel", null, 0, 1, Alignment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AlignmentPackageImpl
