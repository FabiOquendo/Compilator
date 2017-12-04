/**
 */
package compilator.domain.generator.impl;

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

import compilator.domain.generator.ComponentModelGenerator;
import compilator.domain.generator.ExpressionModelGenerator;
import compilator.domain.generator.ExpressionModelManager;
import compilator.domain.generator.GeneratorFactory;
import compilator.domain.generator.GeneratorPackage;

import compilator.domain.impl.DomainPackageImpl;

import compilator.domain.shapes.ShapesPackage;

import compilator.domain.shapes.impl.ShapesPackageImpl;

import compilator.impl.CompilatorPackageImpl;

import compilator.ui.UiPackage;

import compilator.ui.impl.UiPackageImpl;

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
public class GeneratorPackageImpl extends EPackageImpl implements GeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModelGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionModelGeneratorEClass = null;

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
	 * @see compilator.domain.generator.GeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorPackageImpl() {
		super(eNS_URI, GeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorPackage init() {
		if (isInited) return (GeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

		// Obtain or create and register package
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneratorPackageImpl());

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
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratorPackage.createPackageContents();
		theCompilatorPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theExpressionmodelPackage.createPackageContents();
		theIndividualcomponentPackage.createPackageContents();
		theContainercomponentPackage.createPackageContents();
		theSentencePackage.createPackageContents();
		theShapesPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratorPackage.initializePackageContents();
		theCompilatorPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theExpressionmodelPackage.initializePackageContents();
		theIndividualcomponentPackage.initializePackageContents();
		theContainercomponentPackage.initializePackageContents();
		theSentencePackage.initializePackageContents();
		theShapesPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorPackage.eNS_URI, theGeneratorPackage);
		return theGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionModelManager() {
		return expressionModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelManager_Tokens() {
		return (EAttribute)expressionModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelManager_Body() {
		return (EAttribute)expressionModelManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelManager_ElementStyle() {
		return (EAttribute)expressionModelManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModelManager_ExpressionGenerator() {
		return (EReference)expressionModelManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModelManager_ComponentGenerator() {
		return (EReference)expressionModelManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__GetName__String() {
		return expressionModelManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__CreateTable__String() {
		return expressionModelManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__IsContainer__String() {
		return expressionModelManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__CreateIndividualElement__String() {
		return expressionModelManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__Split__String() {
		return expressionModelManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__CreateContainer__String_Container() {
		return expressionModelManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelManager__FindStyleElement__String() {
		return expressionModelManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModelGenerator() {
		return componentModelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModelGenerator_ExpressionManager() {
		return (EReference)componentModelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentModelGenerator__ExploreSentence__String_Container() {
		return componentModelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponentModelGenerator__CreateComponent__String_String_String() {
		return componentModelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionModelGenerator() {
		return expressionModelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelGenerator_Components() {
		return (EAttribute)expressionModelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelGenerator_TextComponents() {
		return (EAttribute)expressionModelGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionModelGenerator_ComponentsStyles() {
		return (EAttribute)expressionModelGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionModelGenerator_ExpressionManager() {
		return (EReference)expressionModelGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__ExploreSentence__String_Container() {
		return expressionModelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__CreateExpressionModel__String_String() {
		return expressionModelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__UnpackStringExpression__ExpressionModel() {
		return expressionModelGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetTextExpressionContainer__Container() {
		return expressionModelGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetTextElement__Element() {
		return expressionModelGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetTableText__Element() {
		return expressionModelGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetComponentStyles__Element() {
		return expressionModelGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetContainerStyles__Container() {
		return expressionModelGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetTableStyle__Element() {
		return expressionModelGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetElementStyle__Element() {
		return expressionModelGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__GetTextComponentsStyles__TreeMap() {
		return expressionModelGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__FillAdditionalElementStyles__TreeMap() {
		return expressionModelGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__CreateEModelFromUnpackedExpression__String() {
		return expressionModelGeneratorEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpressionModelGenerator__ExploreUnpackedSentences__String_Container() {
		return expressionModelGeneratorEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFactory getGeneratorFactory() {
		return (GeneratorFactory)getEFactoryInstance();
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
		expressionModelManagerEClass = createEClass(EXPRESSION_MODEL_MANAGER);
		createEAttribute(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER__TOKENS);
		createEAttribute(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER__BODY);
		createEAttribute(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE);
		createEReference(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR);
		createEReference(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___GET_NAME__STRING);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___CREATE_TABLE__STRING);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___IS_CONTAINER__STRING);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___CREATE_INDIVIDUAL_ELEMENT__STRING);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___SPLIT__STRING);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___CREATE_CONTAINER__STRING_CONTAINER);
		createEOperation(expressionModelManagerEClass, EXPRESSION_MODEL_MANAGER___FIND_STYLE_ELEMENT__STRING);

		componentModelGeneratorEClass = createEClass(COMPONENT_MODEL_GENERATOR);
		createEReference(componentModelGeneratorEClass, COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER);
		createEOperation(componentModelGeneratorEClass, COMPONENT_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER);
		createEOperation(componentModelGeneratorEClass, COMPONENT_MODEL_GENERATOR___CREATE_COMPONENT__STRING_STRING_STRING);

		expressionModelGeneratorEClass = createEClass(EXPRESSION_MODEL_GENERATOR);
		createEAttribute(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR__COMPONENTS);
		createEAttribute(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS);
		createEAttribute(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES);
		createEReference(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___CREATE_EXPRESSION_MODEL__STRING_STRING);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___UNPACK_STRING_EXPRESSION__EXPRESSIONMODEL);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_TEXT_EXPRESSION_CONTAINER__CONTAINER);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_TEXT_ELEMENT__ELEMENT);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_TABLE_TEXT__ELEMENT);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_COMPONENT_STYLES__ELEMENT);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_CONTAINER_STYLES__CONTAINER);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_TABLE_STYLE__ELEMENT);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_ELEMENT_STYLE__ELEMENT);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___GET_TEXT_COMPONENTS_STYLES__TREEMAP);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___FILL_ADDITIONAL_ELEMENT_STYLES__TREEMAP);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING);
		createEOperation(expressionModelGeneratorEClass, EXPRESSION_MODEL_GENERATOR___EXPLORE_UNPACKED_SENTENCES__STRING_CONTAINER);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		IndividualcomponentPackage theIndividualcomponentPackage = (IndividualcomponentPackage)EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI);
		ExpressionmodelPackage theExpressionmodelPackage = (ExpressionmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI);
		ContainercomponentPackage theContainercomponentPackage = (ContainercomponentPackage)EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI);
		styles.domain.DomainPackage theDomainPackage_1 = (styles.domain.DomainPackage)EPackage.Registry.INSTANCE.getEPackage(styles.domain.DomainPackage.eNS_URI);
		ShapesPackage theShapesPackage = (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionModelManagerEClass, ExpressionModelManager.class, "ExpressionModelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionModelManager_Tokens(), theUtilPackage.getTreeMap(), "tokens", null, 0, 1, ExpressionModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionModelManager_Body(), ecorePackage.getEString(), "body", null, 0, 1, ExpressionModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionModelManager_ElementStyle(), theUtilPackage.getTreeMap(), "elementStyle", null, 0, 1, ExpressionModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionModelManager_ExpressionGenerator(), this.getExpressionModelGenerator(), this.getExpressionModelGenerator_ExpressionManager(), "expressionGenerator", null, 1, 1, ExpressionModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionModelManager_ComponentGenerator(), this.getComponentModelGenerator(), this.getComponentModelGenerator_ExpressionManager(), "componentGenerator", null, 1, 1, ExpressionModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getExpressionModelManager__GetName__String(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__CreateTable__String(), theIndividualcomponentPackage.getTable(), "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__IsContainer__String(), ecorePackage.getEBoolean(), "isContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__CreateIndividualElement__String(), theExpressionmodelPackage.getElement(), "createIndividualElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__Split__String(), theUtilPackage.getArrayList(), "split", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__CreateContainer__String_Container(), ecorePackage.getEString(), "createContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "textElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelManager__FindStyleElement__String(), theDomainPackage_1.getStyle(), "findStyleElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentModelGeneratorEClass, ComponentModelGenerator.class, "ComponentModelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModelGenerator_ExpressionManager(), this.getExpressionModelManager(), this.getExpressionModelManager_ComponentGenerator(), "expressionManager", null, 1, 1, ComponentModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComponentModelGenerator__ExploreSentence__String_Container(), null, "exploreSentence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponentModelGenerator__CreateComponent__String_String_String(), theShapesPackage.getComponent(), "createComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nameComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "formatedSentence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "unformatedSentence", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionModelGeneratorEClass, ExpressionModelGenerator.class, "ExpressionModelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionModelGenerator_Components(), theUtilPackage.getTreeMap(), "components", null, 0, 1, ExpressionModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionModelGenerator_TextComponents(), theUtilPackage.getTreeSet(), "textComponents", null, 0, 1, ExpressionModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionModelGenerator_ComponentsStyles(), theUtilPackage.getTreeMap(), "componentsStyles", null, 0, 1, ExpressionModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionModelGenerator_ExpressionManager(), this.getExpressionModelManager(), this.getExpressionModelManager_ExpressionGenerator(), "expressionManager", null, 1, 1, ExpressionModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__ExploreSentence__String_Container(), null, "exploreSentence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__CreateExpressionModel__String_String(), theExpressionPackage.getExpression(), "createExpressionModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "formatedSentence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "unformatedSentence", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__UnpackStringExpression__ExpressionModel(), ecorePackage.getEString(), "unpackStringExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getExpressionModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetTextExpressionContainer__Container(), ecorePackage.getEString(), "getTextExpressionContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetTextElement__Element(), ecorePackage.getEString(), "getTextElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetTableText__Element(), ecorePackage.getEString(), "getTableText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetComponentStyles__Element(), null, "getComponentStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetContainerStyles__Container(), null, "getContainerStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetTableStyle__Element(), null, "getTableStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetElementStyle__Element(), null, "getElementStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionmodelPackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__GetTextComponentsStyles__TreeMap(), ecorePackage.getEString(), "getTextComponentsStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__FillAdditionalElementStyles__TreeMap(), null, "fillAdditionalElementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getTreeMap(), "elementStyles", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__CreateEModelFromUnpackedExpression__String(), theExpressionPackage.getExpression(), "createEModelFromUnpackedExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "formatedString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExpressionModelGenerator__ExploreUnpackedSentences__String_Container(), ecorePackage.getEBoolean(), "exploreUnpackedSentences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContainercomponentPackage.getContainer(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //GeneratorPackageImpl
