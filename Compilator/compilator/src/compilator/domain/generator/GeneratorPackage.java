/**
 */
package compilator.domain.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see compilator.domain.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/generator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = compilator.domain.generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.generator.impl.ExpressionModelManagerImpl <em>Expression Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.generator.impl.ExpressionModelManagerImpl
	 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getExpressionModelManager()
	 * @generated
	 */
	int EXPRESSION_MODEL_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER__TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER__BODY = 1;

	/**
	 * The feature id for the '<em><b>Element Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Expression Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Component Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR = 4;

	/**
	 * The number of structural features of the '<em>Expression Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___GET_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Create Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___CREATE_TABLE__STRING = 1;

	/**
	 * The operation id for the '<em>Is Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___IS_CONTAINER__STRING = 2;

	/**
	 * The operation id for the '<em>Create Individual Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___CREATE_INDIVIDUAL_ELEMENT__STRING = 3;

	/**
	 * The operation id for the '<em>Split</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___SPLIT__STRING = 4;

	/**
	 * The operation id for the '<em>Create Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___CREATE_CONTAINER__STRING_CONTAINER = 5;

	/**
	 * The operation id for the '<em>Find Style Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER___FIND_STYLE_ELEMENT__STRING = 6;

	/**
	 * The number of operations of the '<em>Expression Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_MANAGER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link compilator.domain.generator.impl.ComponentModelGeneratorImpl <em>Component Model Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.generator.impl.ComponentModelGeneratorImpl
	 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getComponentModelGenerator()
	 * @generated
	 */
	int COMPONENT_MODEL_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Expression Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Component Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_GENERATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Explore Sentence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER = 0;

	/**
	 * The operation id for the '<em>Create Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_GENERATOR___CREATE_COMPONENT__STRING_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Component Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODEL_GENERATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl <em>Expression Model Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.generator.impl.ExpressionModelGeneratorImpl
	 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getExpressionModelGenerator()
	 * @generated
	 */
	int EXPRESSION_MODEL_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Text Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Components Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES = 2;

	/**
	 * The feature id for the '<em><b>Expression Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Expression Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Explore Sentence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER = 0;

	/**
	 * The operation id for the '<em>Create Expression Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___CREATE_EXPRESSION_MODEL__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Unpack String Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___UNPACK_STRING_EXPRESSION__EXPRESSIONMODEL = 2;

	/**
	 * The operation id for the '<em>Get Text Expression Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_TEXT_EXPRESSION_CONTAINER__CONTAINER = 3;

	/**
	 * The operation id for the '<em>Get Text Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_TEXT_ELEMENT__ELEMENT = 4;

	/**
	 * The operation id for the '<em>Get Table Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_TABLE_TEXT__ELEMENT = 5;

	/**
	 * The operation id for the '<em>Get Component Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_COMPONENT_STYLES__ELEMENT = 6;

	/**
	 * The operation id for the '<em>Get Container Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_CONTAINER_STYLES__CONTAINER = 7;

	/**
	 * The operation id for the '<em>Get Table Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_TABLE_STYLE__ELEMENT = 8;

	/**
	 * The operation id for the '<em>Get Element Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_ELEMENT_STYLE__ELEMENT = 9;

	/**
	 * The operation id for the '<em>Get Text Components Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___GET_TEXT_COMPONENTS_STYLES__TREEMAP = 10;

	/**
	 * The operation id for the '<em>Fill Additional Element Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___FILL_ADDITIONAL_ELEMENT_STYLES__TREEMAP = 11;

	/**
	 * The operation id for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING = 12;

	/**
	 * The operation id for the '<em>Explore Unpacked Sentences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR___EXPLORE_UNPACKED_SENTENCES__STRING_CONTAINER = 13;

	/**
	 * The number of operations of the '<em>Expression Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_GENERATOR_OPERATION_COUNT = 14;


	/**
	 * Returns the meta object for class '{@link compilator.domain.generator.ExpressionModelManager <em>Expression Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Model Manager</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager
	 * @generated
	 */
	EClass getExpressionModelManager();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelManager#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager#getTokens()
	 * @see #getExpressionModelManager()
	 * @generated
	 */
	EAttribute getExpressionModelManager_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelManager#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager#getBody()
	 * @see #getExpressionModelManager()
	 * @generated
	 */
	EAttribute getExpressionModelManager_Body();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelManager#getElementStyle <em>Element Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Style</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager#getElementStyle()
	 * @see #getExpressionModelManager()
	 * @generated
	 */
	EAttribute getExpressionModelManager_ElementStyle();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.generator.ExpressionModelManager#getExpressionGenerator <em>Expression Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression Generator</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager#getExpressionGenerator()
	 * @see #getExpressionModelManager()
	 * @generated
	 */
	EReference getExpressionModelManager_ExpressionGenerator();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.generator.ExpressionModelManager#getComponentGenerator <em>Component Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Generator</em>'.
	 * @see compilator.domain.generator.ExpressionModelManager#getComponentGenerator()
	 * @see #getExpressionModelManager()
	 * @generated
	 */
	EReference getExpressionModelManager_ComponentGenerator();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#getName(java.lang.String) <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#getName(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__GetName__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#createTable(java.lang.String) <em>Create Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#createTable(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__CreateTable__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#isContainer(java.lang.String) <em>Is Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Container</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#isContainer(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__IsContainer__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#createIndividualElement(java.lang.String) <em>Create Individual Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Individual Element</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#createIndividualElement(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__CreateIndividualElement__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#split(java.lang.String) <em>Split</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Split</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#split(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__Split__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#createContainer(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Create Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Container</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#createContainer(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getExpressionModelManager__CreateContainer__String_Container();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelManager#findStyleElement(java.lang.String) <em>Find Style Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Style Element</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelManager#findStyleElement(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelManager__FindStyleElement__String();

	/**
	 * Returns the meta object for class '{@link compilator.domain.generator.ComponentModelGenerator <em>Component Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Model Generator</em>'.
	 * @see compilator.domain.generator.ComponentModelGenerator
	 * @generated
	 */
	EClass getComponentModelGenerator();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.generator.ComponentModelGenerator#getExpressionManager <em>Expression Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression Manager</em>'.
	 * @see compilator.domain.generator.ComponentModelGenerator#getExpressionManager()
	 * @see #getComponentModelGenerator()
	 * @generated
	 */
	EReference getComponentModelGenerator_ExpressionManager();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ComponentModelGenerator#exploreSentence(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Explore Sentence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Sentence</em>' operation.
	 * @see compilator.domain.generator.ComponentModelGenerator#exploreSentence(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getComponentModelGenerator__ExploreSentence__String_Container();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ComponentModelGenerator#createComponent(java.lang.String, java.lang.String, java.lang.String) <em>Create Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Component</em>' operation.
	 * @see compilator.domain.generator.ComponentModelGenerator#createComponent(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getComponentModelGenerator__CreateComponent__String_String_String();

	/**
	 * Returns the meta object for class '{@link compilator.domain.generator.ExpressionModelGenerator <em>Expression Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Model Generator</em>'.
	 * @see compilator.domain.generator.ExpressionModelGenerator
	 * @generated
	 */
	EClass getExpressionModelGenerator();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelGenerator#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Components</em>'.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getComponents()
	 * @see #getExpressionModelGenerator()
	 * @generated
	 */
	EAttribute getExpressionModelGenerator_Components();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelGenerator#getTextComponents <em>Text Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Components</em>'.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTextComponents()
	 * @see #getExpressionModelGenerator()
	 * @generated
	 */
	EAttribute getExpressionModelGenerator_TextComponents();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.generator.ExpressionModelGenerator#getComponentsStyles <em>Components Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Components Styles</em>'.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getComponentsStyles()
	 * @see #getExpressionModelGenerator()
	 * @generated
	 */
	EAttribute getExpressionModelGenerator_ComponentsStyles();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.generator.ExpressionModelGenerator#getExpressionManager <em>Expression Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression Manager</em>'.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getExpressionManager()
	 * @see #getExpressionModelGenerator()
	 * @generated
	 */
	EReference getExpressionModelGenerator_ExpressionManager();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#exploreSentence(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Explore Sentence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Sentence</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#exploreSentence(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__ExploreSentence__String_Container();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#createExpressionModel(java.lang.String, java.lang.String) <em>Create Expression Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Expression Model</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#createExpressionModel(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__CreateExpressionModel__String_String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#unpackStringExpression(compilator.domain.expression.expressionmodel.ExpressionModel) <em>Unpack String Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unpack String Expression</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#unpackStringExpression(compilator.domain.expression.expressionmodel.ExpressionModel)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__UnpackStringExpression__ExpressionModel();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getTextExpressionContainer(compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Get Text Expression Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text Expression Container</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTextExpressionContainer(compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetTextExpressionContainer__Container();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getTextElement(compilator.domain.expression.expressionmodel.Element) <em>Get Text Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text Element</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTextElement(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetTextElement__Element();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getTableText(compilator.domain.expression.expressionmodel.Element) <em>Get Table Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Table Text</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTableText(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetTableText__Element();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getComponentStyles(compilator.domain.expression.expressionmodel.Element) <em>Get Component Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Component Styles</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getComponentStyles(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetComponentStyles__Element();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getContainerStyles(compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Get Container Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container Styles</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getContainerStyles(compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetContainerStyles__Container();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getTableStyle(compilator.domain.expression.expressionmodel.Element) <em>Get Table Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Table Style</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTableStyle(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetTableStyle__Element();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getElementStyle(compilator.domain.expression.expressionmodel.Element) <em>Get Element Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element Style</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getElementStyle(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetElementStyle__Element();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#getTextComponentsStyles(java.util.TreeMap) <em>Get Text Components Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text Components Styles</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#getTextComponentsStyles(java.util.TreeMap)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__GetTextComponentsStyles__TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#fillAdditionalElementStyles(java.util.TreeMap) <em>Fill Additional Element Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Additional Element Styles</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#fillAdditionalElementStyles(java.util.TreeMap)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__FillAdditionalElementStyles__TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#createEModelFromUnpackedExpression(java.lang.String) <em>Create EModel From Unpacked Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#createEModelFromUnpackedExpression(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__CreateEModelFromUnpackedExpression__String();

	/**
	 * Returns the meta object for the '{@link compilator.domain.generator.ExpressionModelGenerator#exploreUnpackedSentences(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Explore Unpacked Sentences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Unpacked Sentences</em>' operation.
	 * @see compilator.domain.generator.ExpressionModelGenerator#exploreUnpackedSentences(java.lang.String, compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getExpressionModelGenerator__ExploreUnpackedSentences__String_Container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link compilator.domain.generator.impl.ExpressionModelManagerImpl <em>Expression Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.generator.impl.ExpressionModelManagerImpl
		 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getExpressionModelManager()
		 * @generated
		 */
		EClass EXPRESSION_MODEL_MANAGER = eINSTANCE.getExpressionModelManager();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_MANAGER__TOKENS = eINSTANCE.getExpressionModelManager_Tokens();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_MANAGER__BODY = eINSTANCE.getExpressionModelManager_Body();

		/**
		 * The meta object literal for the '<em><b>Element Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE = eINSTANCE.getExpressionModelManager_ElementStyle();

		/**
		 * The meta object literal for the '<em><b>Expression Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR = eINSTANCE.getExpressionModelManager_ExpressionGenerator();

		/**
		 * The meta object literal for the '<em><b>Component Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR = eINSTANCE.getExpressionModelManager_ComponentGenerator();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___GET_NAME__STRING = eINSTANCE.getExpressionModelManager__GetName__String();

		/**
		 * The meta object literal for the '<em><b>Create Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___CREATE_TABLE__STRING = eINSTANCE.getExpressionModelManager__CreateTable__String();

		/**
		 * The meta object literal for the '<em><b>Is Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___IS_CONTAINER__STRING = eINSTANCE.getExpressionModelManager__IsContainer__String();

		/**
		 * The meta object literal for the '<em><b>Create Individual Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___CREATE_INDIVIDUAL_ELEMENT__STRING = eINSTANCE.getExpressionModelManager__CreateIndividualElement__String();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___SPLIT__STRING = eINSTANCE.getExpressionModelManager__Split__String();

		/**
		 * The meta object literal for the '<em><b>Create Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___CREATE_CONTAINER__STRING_CONTAINER = eINSTANCE.getExpressionModelManager__CreateContainer__String_Container();

		/**
		 * The meta object literal for the '<em><b>Find Style Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_MANAGER___FIND_STYLE_ELEMENT__STRING = eINSTANCE.getExpressionModelManager__FindStyleElement__String();

		/**
		 * The meta object literal for the '{@link compilator.domain.generator.impl.ComponentModelGeneratorImpl <em>Component Model Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.generator.impl.ComponentModelGeneratorImpl
		 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getComponentModelGenerator()
		 * @generated
		 */
		EClass COMPONENT_MODEL_GENERATOR = eINSTANCE.getComponentModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Expression Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER = eINSTANCE.getComponentModelGenerator_ExpressionManager();

		/**
		 * The meta object literal for the '<em><b>Explore Sentence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER = eINSTANCE.getComponentModelGenerator__ExploreSentence__String_Container();

		/**
		 * The meta object literal for the '<em><b>Create Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT_MODEL_GENERATOR___CREATE_COMPONENT__STRING_STRING_STRING = eINSTANCE.getComponentModelGenerator__CreateComponent__String_String_String();

		/**
		 * The meta object literal for the '{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl <em>Expression Model Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.generator.impl.ExpressionModelGeneratorImpl
		 * @see compilator.domain.generator.impl.GeneratorPackageImpl#getExpressionModelGenerator()
		 * @generated
		 */
		EClass EXPRESSION_MODEL_GENERATOR = eINSTANCE.getExpressionModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_GENERATOR__COMPONENTS = eINSTANCE.getExpressionModelGenerator_Components();

		/**
		 * The meta object literal for the '<em><b>Text Components</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS = eINSTANCE.getExpressionModelGenerator_TextComponents();

		/**
		 * The meta object literal for the '<em><b>Components Styles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES = eINSTANCE.getExpressionModelGenerator_ComponentsStyles();

		/**
		 * The meta object literal for the '<em><b>Expression Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER = eINSTANCE.getExpressionModelGenerator_ExpressionManager();

		/**
		 * The meta object literal for the '<em><b>Explore Sentence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER = eINSTANCE.getExpressionModelGenerator__ExploreSentence__String_Container();

		/**
		 * The meta object literal for the '<em><b>Create Expression Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___CREATE_EXPRESSION_MODEL__STRING_STRING = eINSTANCE.getExpressionModelGenerator__CreateExpressionModel__String_String();

		/**
		 * The meta object literal for the '<em><b>Unpack String Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___UNPACK_STRING_EXPRESSION__EXPRESSIONMODEL = eINSTANCE.getExpressionModelGenerator__UnpackStringExpression__ExpressionModel();

		/**
		 * The meta object literal for the '<em><b>Get Text Expression Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_TEXT_EXPRESSION_CONTAINER__CONTAINER = eINSTANCE.getExpressionModelGenerator__GetTextExpressionContainer__Container();

		/**
		 * The meta object literal for the '<em><b>Get Text Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_TEXT_ELEMENT__ELEMENT = eINSTANCE.getExpressionModelGenerator__GetTextElement__Element();

		/**
		 * The meta object literal for the '<em><b>Get Table Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_TABLE_TEXT__ELEMENT = eINSTANCE.getExpressionModelGenerator__GetTableText__Element();

		/**
		 * The meta object literal for the '<em><b>Get Component Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_COMPONENT_STYLES__ELEMENT = eINSTANCE.getExpressionModelGenerator__GetComponentStyles__Element();

		/**
		 * The meta object literal for the '<em><b>Get Container Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_CONTAINER_STYLES__CONTAINER = eINSTANCE.getExpressionModelGenerator__GetContainerStyles__Container();

		/**
		 * The meta object literal for the '<em><b>Get Table Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_TABLE_STYLE__ELEMENT = eINSTANCE.getExpressionModelGenerator__GetTableStyle__Element();

		/**
		 * The meta object literal for the '<em><b>Get Element Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_ELEMENT_STYLE__ELEMENT = eINSTANCE.getExpressionModelGenerator__GetElementStyle__Element();

		/**
		 * The meta object literal for the '<em><b>Get Text Components Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___GET_TEXT_COMPONENTS_STYLES__TREEMAP = eINSTANCE.getExpressionModelGenerator__GetTextComponentsStyles__TreeMap();

		/**
		 * The meta object literal for the '<em><b>Fill Additional Element Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___FILL_ADDITIONAL_ELEMENT_STYLES__TREEMAP = eINSTANCE.getExpressionModelGenerator__FillAdditionalElementStyles__TreeMap();

		/**
		 * The meta object literal for the '<em><b>Create EModel From Unpacked Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING = eINSTANCE.getExpressionModelGenerator__CreateEModelFromUnpackedExpression__String();

		/**
		 * The meta object literal for the '<em><b>Explore Unpacked Sentences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_MODEL_GENERATOR___EXPLORE_UNPACKED_SENTENCES__STRING_CONTAINER = eINSTANCE.getExpressionModelGenerator__ExploreUnpackedSentences__String_Container();

	}

} //GeneratorPackage
