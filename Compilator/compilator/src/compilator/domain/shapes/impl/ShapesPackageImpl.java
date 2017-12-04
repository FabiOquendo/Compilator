/**
 */
package compilator.domain.shapes.impl;

import compilator.CompilatorPackage;

import compilator.domain.DomainPackage;

import compilator.domain.datatypes.util.UtilPackage;

import compilator.domain.datatypes.util.impl.UtilPackageImpl;

import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl;

import compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl;

import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;

import compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl;

import compilator.domain.expression.impl.ExpressionPackageImpl;

import compilator.domain.expression.sentence.SentencePackage;

import compilator.domain.expression.sentence.impl.SentencePackageImpl;

import compilator.domain.generator.GeneratorPackage;

import compilator.domain.generator.impl.GeneratorPackageImpl;

import compilator.domain.impl.DomainPackageImpl;

import compilator.domain.shapes.Component;
import compilator.domain.shapes.Shapes;
import compilator.domain.shapes.ShapesFactory;
import compilator.domain.shapes.ShapesPackage;

import compilator.impl.CompilatorPackageImpl;

import compilator.ui.UiPackage;

import compilator.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapesPackageImpl extends EPackageImpl implements ShapesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

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
	 * @see compilator.domain.shapes.ShapesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShapesPackageImpl() {
		super(eNS_URI, ShapesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ShapesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShapesPackage init() {
		if (isInited) return (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);

		// Obtain or create and register package
		ShapesPackageImpl theShapesPackage = (ShapesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShapesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StylesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CompilatorPackageImpl theCompilatorPackage = (CompilatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) instanceof CompilatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) : CompilatorPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		ExpressionmodelPackageImpl theExpressionmodelPackage = (ExpressionmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI) instanceof ExpressionmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI) : ExpressionmodelPackage.eINSTANCE);
		IndividualcomponentPackageImpl theIndividualcomponentPackage = (IndividualcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) instanceof IndividualcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) : IndividualcomponentPackage.eINSTANCE);
		ContainercomponentPackageImpl theContainercomponentPackage = (ContainercomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) instanceof ContainercomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) : ContainercomponentPackage.eINSTANCE);
		SentencePackageImpl theSentencePackage = (SentencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) instanceof SentencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) : SentencePackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theShapesPackage.createPackageContents();
		theCompilatorPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theExpressionmodelPackage.createPackageContents();
		theIndividualcomponentPackage.createPackageContents();
		theContainercomponentPackage.createPackageContents();
		theSentencePackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theShapesPackage.initializePackageContents();
		theCompilatorPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theExpressionmodelPackage.initializePackageContents();
		theIndividualcomponentPackage.initializePackageContents();
		theContainercomponentPackage.initializePackageContents();
		theSentencePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShapesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, theShapesPackage);
		return theShapesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapes() {
		return shapesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapes_Domain() {
		return (EReference)shapesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapes_ListComponents() {
		return (EReference)shapesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Shapes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_TheElement() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_TheSentence() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesFactory getShapesFactory() {
		return (ShapesFactory)getEFactoryInstance();
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
		shapesEClass = createEClass(SHAPES);
		createEReference(shapesEClass, SHAPES__DOMAIN);
		createEReference(shapesEClass, SHAPES__LIST_COMPONENTS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__SHAPES);
		createEReference(componentEClass, COMPONENT__THE_ELEMENT);
		createEReference(componentEClass, COMPONENT__THE_SENTENCE);
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
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		ExpressionmodelPackage theExpressionmodelPackage = (ExpressionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI);
		SentencePackage theSentencePackage = (SentencePackage)EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(shapesEClass, Shapes.class, "Shapes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapes_Domain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_Shapes(), "Domain", null, 0, 1, Shapes.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapes_ListComponents(), this.getComponent(), this.getComponent_Shapes(), "listComponents", null, 0, -1, Shapes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Shapes(), this.getShapes(), this.getShapes_ListComponents(), "Shapes", null, 0, 1, Component.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_TheElement(), theExpressionmodelPackage.getElement(), theExpressionmodelPackage.getElement_Component(), "theElement", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_TheSentence(), theSentencePackage.getSentence(), theSentencePackage.getSentence_Component(), "theSentence", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ShapesPackageImpl
