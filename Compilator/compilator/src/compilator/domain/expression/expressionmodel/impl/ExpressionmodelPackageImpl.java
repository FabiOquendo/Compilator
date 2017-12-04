/**
 */
package compilator.domain.expression.expressionmodel.impl;

import compilator.CompilatorPackage;

import compilator.domain.DomainPackage;

import compilator.domain.datatypes.util.UtilPackage;

import compilator.domain.datatypes.util.impl.UtilPackageImpl;

import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.ExpressionmodelFactory;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl;

import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;

import compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl;

import compilator.domain.expression.impl.ExpressionPackageImpl;

import compilator.domain.expression.sentence.SentencePackage;

import compilator.domain.expression.sentence.impl.SentencePackageImpl;

import compilator.domain.generator.GeneratorPackage;

import compilator.domain.generator.impl.GeneratorPackageImpl;

import compilator.domain.impl.DomainPackageImpl;

import compilator.domain.shapes.ShapesPackage;

import compilator.domain.shapes.impl.ShapesPackageImpl;

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
public class ExpressionmodelPackageImpl extends EPackageImpl implements ExpressionmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionModelEClass = null;

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
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionmodelPackageImpl() {
		super(eNS_URI, ExpressionmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionmodelPackage init() {
		if (isInited) return (ExpressionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionmodelPackageImpl theExpressionmodelPackage = (ExpressionmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StylesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CompilatorPackageImpl theCompilatorPackage = (CompilatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) instanceof CompilatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) : CompilatorPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		IndividualcomponentPackageImpl theIndividualcomponentPackage = (IndividualcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) instanceof IndividualcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) : IndividualcomponentPackage.eINSTANCE);
		ContainercomponentPackageImpl theContainercomponentPackage = (ContainercomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) instanceof ContainercomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) : ContainercomponentPackage.eINSTANCE);
		SentencePackageImpl theSentencePackage = (SentencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) instanceof SentencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) : SentencePackage.eINSTANCE);
		ShapesPackageImpl theShapesPackage = (ShapesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) : ShapesPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionmodelPackage.createPackageContents();
		theCompilatorPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theIndividualcomponentPackage.createPackageContents();
		theContainercomponentPackage.createPackageContents();
		theSentencePackage.createPackageContents();
		theShapesPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionmodelPackage.initializePackageContents();
		theCompilatorPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theIndividualcomponentPackage.initializePackageContents();
		theContainercomponentPackage.initializePackageContents();
		theSentencePackage.initializePackageContents();
		theShapesPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionmodelPackage.eNS_URI, theExpressionmodelPackage);
		return theExpressionmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ContainerElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ExpressionModel() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_TheStyle() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Component() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionModel() {
		return expressionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModel_Expression() {
		return (EReference)expressionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModel_TheSentence() {
		return (EReference)expressionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModel_ListElements() {
		return (EReference)expressionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionmodelFactory getExpressionmodelFactory() {
		return (ExpressionmodelFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__CONTAINER_ELEMENT);
		createEReference(elementEClass, ELEMENT__EXPRESSION_MODEL);
		createEReference(elementEClass, ELEMENT__THE_STYLE);
		createEReference(elementEClass, ELEMENT__COMPONENT);

		expressionModelEClass = createEClass(EXPRESSION_MODEL);
		createEReference(expressionModelEClass, EXPRESSION_MODEL__EXPRESSION);
		createEReference(expressionModelEClass, EXPRESSION_MODEL__THE_SENTENCE);
		createEReference(expressionModelEClass, EXPRESSION_MODEL__LIST_ELEMENTS);
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
		IndividualcomponentPackage theIndividualcomponentPackage = (IndividualcomponentPackage)EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI);
		ContainercomponentPackage theContainercomponentPackage = (ContainercomponentPackage)EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI);
		styles.domain.DomainPackage theDomainPackage_1 = (styles.domain.DomainPackage)EPackage.Registry.INSTANCE.getEPackage(styles.domain.DomainPackage.eNS_URI);
		ShapesPackage theShapesPackage = (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		SentencePackage theSentencePackage = (SentencePackage)EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theIndividualcomponentPackage);
		getESubpackages().add(theContainercomponentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ContainerElement(), theContainercomponentPackage.getContainerElement(), theContainercomponentPackage.getContainerElement_ListElements(), "ContainerElement", null, 0, 1, Element.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ExpressionModel(), this.getExpressionModel(), this.getExpressionModel_ListElements(), "ExpressionModel", null, 0, 1, Element.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_TheStyle(), theDomainPackage_1.getStyle(), null, "theStyle", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Component(), theShapesPackage.getComponent(), theShapesPackage.getComponent_TheElement(), "Component", null, 0, 1, Element.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionModelEClass, ExpressionModel.class, "ExpressionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionModel_Expression(), theExpressionPackage.getExpression(), theExpressionPackage.getExpression_TheExpressionModel(), "Expression", null, 0, 1, ExpressionModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionModel_TheSentence(), theSentencePackage.getSentence(), theSentencePackage.getSentence_TheExpressionModel(), "theSentence", null, 1, 1, ExpressionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionModel_ListElements(), this.getElement(), this.getElement_ExpressionModel(), "listElements", null, 0, -1, ExpressionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ExpressionmodelPackageImpl
