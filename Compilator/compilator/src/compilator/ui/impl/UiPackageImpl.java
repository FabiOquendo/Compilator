/**
 */
package compilator.ui.impl;

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

import compilator.domain.shapes.ShapesPackage;

import compilator.domain.shapes.impl.ShapesPackageImpl;

import compilator.impl.CompilatorPackageImpl;

import compilator.ui.CharacteristicstContainer;
import compilator.ui.ComponentsContainer;
import compilator.ui.ExpressionContainer;
import compilator.ui.StyleAssigmentContainer;
import compilator.ui.StylesConainer;
import compilator.ui.UiFactory;
import compilator.ui.UiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesConainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicstContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleAssigmentContainerEClass = null;

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
	 * @see compilator.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiPackageImpl());

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
		ShapesPackageImpl theShapesPackage = (ShapesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) : ShapesPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		theCompilatorPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theExpressionmodelPackage.createPackageContents();
		theIndividualcomponentPackage.createPackageContents();
		theContainercomponentPackage.createPackageContents();
		theSentencePackage.createPackageContents();
		theShapesPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		theCompilatorPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theExpressionmodelPackage.initializePackageContents();
		theIndividualcomponentPackage.initializePackageContents();
		theContainercomponentPackage.initializePackageContents();
		theSentencePackage.initializePackageContents();
		theShapesPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheModelFactory() {
		return (EReference)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheDomain() {
		return (EReference)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheCharacteristicstContainer() {
		return (EReference)uiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_StylesConainer() {
		return (EReference)uiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_ComponentsContainer() {
		return (EReference)uiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheExpressionContainer() {
		return (EReference)uiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheStyleAssigmentContainer() {
		return (EReference)uiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CreateComponent__String_String_TreeMap_TreeMap() {
		return uiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap() {
		return uiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__UnPackStyles() {
		return uiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUI__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap() {
		return uiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylesConainer() {
		return stylesConainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesConainer_UI() {
		return (EReference)stylesConainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStylesConainer__LoadStyles__ModelFactoryStyles() {
		return stylesConainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentsContainer() {
		return componentsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentsContainer_UI() {
		return (EReference)componentsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentsContainer__CreateComponent__String_String_TreeMap_TreeMap() {
		return componentsContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentsContainer__GetFormatedString__String() {
		return componentsContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicstContainer() {
		return characteristicstContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristicstContainer_UI() {
		return (EReference)characteristicstContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionContainer() {
		return expressionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionContainer_UI() {
		return (EReference)expressionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionContainer__GetFormatedString__String() {
		return expressionContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionContainer__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap() {
		return expressionContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionContainer__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap() {
		return expressionContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleAssigmentContainer() {
		return styleAssigmentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAssigmentContainer_Text() {
		return (EAttribute)styleAssigmentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleAssigmentContainer_UI() {
		return (EReference)styleAssigmentContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStyleAssigmentContainer__UnPackStyles() {
		return styleAssigmentContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStyleAssigmentContainer__GetStyleBody__String() {
		return styleAssigmentContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStyleAssigmentContainer__GetStyleName__String() {
		return styleAssigmentContainerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStyleAssigmentContainer__LoadElementsStyles__TreeMap() {
		return styleAssigmentContainerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStyleAssigmentContainer__GetFormatedString__String() {
		return styleAssigmentContainerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
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
		uiEClass = createEClass(UI);
		createEReference(uiEClass, UI__THE_MODEL_FACTORY);
		createEReference(uiEClass, UI__THE_DOMAIN);
		createEReference(uiEClass, UI__THE_CHARACTERISTICST_CONTAINER);
		createEReference(uiEClass, UI__STYLES_CONAINER);
		createEReference(uiEClass, UI__COMPONENTS_CONTAINER);
		createEReference(uiEClass, UI__THE_EXPRESSION_CONTAINER);
		createEReference(uiEClass, UI__THE_STYLE_ASSIGMENT_CONTAINER);
		createEOperation(uiEClass, UI___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP);
		createEOperation(uiEClass, UI___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP);
		createEOperation(uiEClass, UI___UN_PACK_STYLES);
		createEOperation(uiEClass, UI___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP);

		stylesConainerEClass = createEClass(STYLES_CONAINER);
		createEReference(stylesConainerEClass, STYLES_CONAINER__UI);
		createEOperation(stylesConainerEClass, STYLES_CONAINER___LOAD_STYLES__MODELFACTORYSTYLES);

		componentsContainerEClass = createEClass(COMPONENTS_CONTAINER);
		createEReference(componentsContainerEClass, COMPONENTS_CONTAINER__UI);
		createEOperation(componentsContainerEClass, COMPONENTS_CONTAINER___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP);
		createEOperation(componentsContainerEClass, COMPONENTS_CONTAINER___GET_FORMATED_STRING__STRING);

		characteristicstContainerEClass = createEClass(CHARACTERISTICST_CONTAINER);
		createEReference(characteristicstContainerEClass, CHARACTERISTICST_CONTAINER__UI);

		expressionContainerEClass = createEClass(EXPRESSION_CONTAINER);
		createEReference(expressionContainerEClass, EXPRESSION_CONTAINER__UI);
		createEOperation(expressionContainerEClass, EXPRESSION_CONTAINER___GET_FORMATED_STRING__STRING);
		createEOperation(expressionContainerEClass, EXPRESSION_CONTAINER___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP);
		createEOperation(expressionContainerEClass, EXPRESSION_CONTAINER___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP);

		styleAssigmentContainerEClass = createEClass(STYLE_ASSIGMENT_CONTAINER);
		createEAttribute(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER__TEXT);
		createEReference(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER__UI);
		createEOperation(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER___UN_PACK_STYLES);
		createEOperation(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER___GET_STYLE_BODY__STRING);
		createEOperation(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER___GET_STYLE_NAME__STRING);
		createEOperation(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER___LOAD_ELEMENTS_STYLES__TREEMAP);
		createEOperation(styleAssigmentContainerEClass, STYLE_ASSIGMENT_CONTAINER___GET_FORMATED_STRING__STRING);
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
		CompilatorPackage theCompilatorPackage = (CompilatorPackage)EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		StylesPackage theStylesPackage = (StylesPackage)EPackage.Registry.INSTANCE.getEPackage(StylesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(uiEClass, compilator.ui.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_TheModelFactory(), theCompilatorPackage.getModelFactory(), theCompilatorPackage.getModelFactory_TheUI(), "theModelFactory", null, 0, 1, compilator.ui.UI.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheUI(), "theDomain", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheCharacteristicstContainer(), this.getCharacteristicstContainer(), this.getCharacteristicstContainer_UI(), "theCharacteristicstContainer", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_StylesConainer(), this.getStylesConainer(), this.getStylesConainer_UI(), "StylesConainer", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_ComponentsContainer(), this.getComponentsContainer(), this.getComponentsContainer_UI(), "ComponentsContainer", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheExpressionContainer(), this.getExpressionContainer(), this.getExpressionContainer_UI(), "theExpressionContainer", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheStyleAssigmentContainer(), this.getStyleAssigmentContainer(), this.getStyleAssigmentContainer_UI(), "theStyleAssigmentContainer", null, 1, 1, compilator.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUI__CreateComponent__String_String_TreeMap_TreeMap(), null, "createComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expressionString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap(), ecorePackage.getEString(), "createExpressionModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expressionString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "components", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUI__UnPackStyles(), ecorePackage.getEString(), "unPackStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUI__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap(), ecorePackage.getEBoolean(), "createEModelFromUnpackedExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "formatedString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "components", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stylesConainerEClass, StylesConainer.class, "StylesConainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStylesConainer_UI(), this.getUI(), this.getUI_StylesConainer(), "UI", null, 0, 1, StylesConainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStylesConainer__LoadStyles__ModelFactoryStyles(), theUtilPackage.getTreeMap(), "loadStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStylesPackage.getModelFactoryStyles(), "mfStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentsContainerEClass, ComponentsContainer.class, "ComponentsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentsContainer_UI(), this.getUI(), this.getUI_ComponentsContainer(), "UI", null, 0, 1, ComponentsContainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComponentsContainer__CreateComponent__String_String_TreeMap_TreeMap(), null, "createComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expressionString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponentsContainer__GetFormatedString__String(), ecorePackage.getEString(), "getFormatedString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(characteristicstContainerEClass, CharacteristicstContainer.class, "CharacteristicstContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacteristicstContainer_UI(), this.getUI(), this.getUI_TheCharacteristicstContainer(), "UI", null, 0, 1, CharacteristicstContainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionContainerEClass, ExpressionContainer.class, "ExpressionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionContainer_UI(), this.getUI(), this.getUI_TheExpressionContainer(), "UI", null, 0, 1, ExpressionContainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExpressionContainer__GetFormatedString__String(), ecorePackage.getEString(), "getFormatedString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionContainer__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap(), ecorePackage.getEString(), "createExpressionModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expressionString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "components", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionContainer__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap(), ecorePackage.getEBoolean(), "createEModelFromUnpackedExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "expressionString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "tokens", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "components", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(styleAssigmentContainerEClass, StyleAssigmentContainer.class, "StyleAssigmentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleAssigmentContainer_Text(), ecorePackage.getEString(), "text", null, 0, 1, StyleAssigmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleAssigmentContainer_UI(), this.getUI(), this.getUI_TheStyleAssigmentContainer(), "UI", null, 0, 1, StyleAssigmentContainer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStyleAssigmentContainer__UnPackStyles(), ecorePackage.getEString(), "unPackStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyleAssigmentContainer__GetStyleBody__String(), ecorePackage.getEString(), "getStyleBody", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "styleComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyleAssigmentContainer__GetStyleName__String(), ecorePackage.getEString(), "getStyleName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "styleComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyleAssigmentContainer__LoadElementsStyles__TreeMap(), theUtilPackage.getTreeMap(), "loadElementsStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "styles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStyleAssigmentContainer__GetFormatedString__String(), ecorePackage.getEString(), "getFormatedString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UiPackageImpl
