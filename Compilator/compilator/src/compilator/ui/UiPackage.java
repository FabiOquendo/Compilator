/**
 */
package compilator.ui;

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
 * @see compilator.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/ui.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = compilator.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.ui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.UIImpl
	 * @see compilator.ui.impl.UiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>The Characteristicst Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CHARACTERISTICST_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Styles Conainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__STYLES_CONAINER = 3;

	/**
	 * The feature id for the '<em><b>Components Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__COMPONENTS_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>The Expression Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_EXPRESSION_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>The Style Assigment Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_STYLE_ASSIGMENT_CONTAINER = 6;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Create Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = 0;

	/**
	 * The operation id for the '<em>Create Expression Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = 1;

	/**
	 * The operation id for the '<em>Un Pack Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___UN_PACK_STYLES = 2;

	/**
	 * The operation id for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = 3;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link compilator.ui.impl.StylesConainerImpl <em>Styles Conainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.StylesConainerImpl
	 * @see compilator.ui.impl.UiPackageImpl#getStylesConainer()
	 * @generated
	 */
	int STYLES_CONAINER = 1;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_CONAINER__UI = 0;

	/**
	 * The number of structural features of the '<em>Styles Conainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_CONAINER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Load Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_CONAINER___LOAD_STYLES__MODELFACTORYSTYLES = 0;

	/**
	 * The number of operations of the '<em>Styles Conainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLES_CONAINER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link compilator.ui.impl.ComponentsContainerImpl <em>Components Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.ComponentsContainerImpl
	 * @see compilator.ui.impl.UiPackageImpl#getComponentsContainer()
	 * @generated
	 */
	int COMPONENTS_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_CONTAINER__UI = 0;

	/**
	 * The number of structural features of the '<em>Components Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_CONTAINER___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = 0;

	/**
	 * The operation id for the '<em>Get Formated String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_CONTAINER___GET_FORMATED_STRING__STRING = 1;

	/**
	 * The number of operations of the '<em>Components Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_CONTAINER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link compilator.ui.impl.CharacteristicstContainerImpl <em>Characteristicst Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.CharacteristicstContainerImpl
	 * @see compilator.ui.impl.UiPackageImpl#getCharacteristicstContainer()
	 * @generated
	 */
	int CHARACTERISTICST_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICST_CONTAINER__UI = 0;

	/**
	 * The number of structural features of the '<em>Characteristicst Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICST_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Characteristicst Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICST_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link compilator.ui.impl.ExpressionContainerImpl <em>Expression Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.ExpressionContainerImpl
	 * @see compilator.ui.impl.UiPackageImpl#getExpressionContainer()
	 * @generated
	 */
	int EXPRESSION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER__UI = 0;

	/**
	 * The number of structural features of the '<em>Expression Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Formated String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER___GET_FORMATED_STRING__STRING = 0;

	/**
	 * The operation id for the '<em>Create Expression Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = 1;

	/**
	 * The operation id for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = 2;

	/**
	 * The number of operations of the '<em>Expression Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONTAINER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link compilator.ui.impl.StyleAssigmentContainerImpl <em>Style Assigment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.ui.impl.StyleAssigmentContainerImpl
	 * @see compilator.ui.impl.UiPackageImpl#getStyleAssigmentContainer()
	 * @generated
	 */
	int STYLE_ASSIGMENT_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER__TEXT = 0;

	/**
	 * The feature id for the '<em><b>UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER__UI = 1;

	/**
	 * The number of structural features of the '<em>Style Assigment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Un Pack Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER___UN_PACK_STYLES = 0;

	/**
	 * The operation id for the '<em>Get Style Body</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER___GET_STYLE_BODY__STRING = 1;

	/**
	 * The operation id for the '<em>Get Style Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER___GET_STYLE_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Load Elements Styles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER___LOAD_ELEMENTS_STYLES__TREEMAP = 3;

	/**
	 * The operation id for the '<em>Get Formated String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER___GET_FORMATED_STRING__STRING = 4;

	/**
	 * The number of operations of the '<em>Style Assigment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ASSIGMENT_CONTAINER_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link compilator.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see compilator.ui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see compilator.ui.UI#getTheModelFactory()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheModelFactory();

	/**
	 * Returns the meta object for the reference '{@link compilator.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Domain</em>'.
	 * @see compilator.ui.UI#getTheDomain()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheDomain();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ui.UI#getTheCharacteristicstContainer <em>The Characteristicst Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Characteristicst Container</em>'.
	 * @see compilator.ui.UI#getTheCharacteristicstContainer()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheCharacteristicstContainer();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ui.UI#getStylesConainer <em>Styles Conainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styles Conainer</em>'.
	 * @see compilator.ui.UI#getStylesConainer()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_StylesConainer();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ui.UI#getComponentsContainer <em>Components Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components Container</em>'.
	 * @see compilator.ui.UI#getComponentsContainer()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_ComponentsContainer();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ui.UI#getTheExpressionContainer <em>The Expression Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Expression Container</em>'.
	 * @see compilator.ui.UI#getTheExpressionContainer()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheExpressionContainer();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.ui.UI#getTheStyleAssigmentContainer <em>The Style Assigment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Style Assigment Container</em>'.
	 * @see compilator.ui.UI#getTheStyleAssigmentContainer()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheStyleAssigmentContainer();

	/**
	 * Returns the meta object for the '{@link compilator.ui.UI#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap) <em>Create Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Component</em>' operation.
	 * @see compilator.ui.UI#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getUI__CreateComponent__String_String_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.ui.UI#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create Expression Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Expression Model</em>' operation.
	 * @see compilator.ui.UI#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getUI__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.ui.UI#unPackStyles() <em>Un Pack Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Pack Styles</em>' operation.
	 * @see compilator.ui.UI#unPackStyles()
	 * @generated
	 */
	EOperation getUI__UnPackStyles();

	/**
	 * Returns the meta object for the '{@link compilator.ui.UI#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create EModel From Unpacked Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * @see compilator.ui.UI#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getUI__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for class '{@link compilator.ui.StylesConainer <em>Styles Conainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styles Conainer</em>'.
	 * @see compilator.ui.StylesConainer
	 * @generated
	 */
	EClass getStylesConainer();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.StylesConainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see compilator.ui.StylesConainer#getUI()
	 * @see #getStylesConainer()
	 * @generated
	 */
	EReference getStylesConainer_UI();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StylesConainer#loadStyles(styles.ModelFactoryStyles) <em>Load Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Styles</em>' operation.
	 * @see compilator.ui.StylesConainer#loadStyles(styles.ModelFactoryStyles)
	 * @generated
	 */
	EOperation getStylesConainer__LoadStyles__ModelFactoryStyles();

	/**
	 * Returns the meta object for class '{@link compilator.ui.ComponentsContainer <em>Components Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Container</em>'.
	 * @see compilator.ui.ComponentsContainer
	 * @generated
	 */
	EClass getComponentsContainer();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.ComponentsContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see compilator.ui.ComponentsContainer#getUI()
	 * @see #getComponentsContainer()
	 * @generated
	 */
	EReference getComponentsContainer_UI();

	/**
	 * Returns the meta object for the '{@link compilator.ui.ComponentsContainer#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap) <em>Create Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Component</em>' operation.
	 * @see compilator.ui.ComponentsContainer#createComponent(java.lang.String, java.lang.String, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getComponentsContainer__CreateComponent__String_String_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.ui.ComponentsContainer#getFormatedString(java.lang.String) <em>Get Formated String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Formated String</em>' operation.
	 * @see compilator.ui.ComponentsContainer#getFormatedString(java.lang.String)
	 * @generated
	 */
	EOperation getComponentsContainer__GetFormatedString__String();

	/**
	 * Returns the meta object for class '{@link compilator.ui.CharacteristicstContainer <em>Characteristicst Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristicst Container</em>'.
	 * @see compilator.ui.CharacteristicstContainer
	 * @generated
	 */
	EClass getCharacteristicstContainer();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.CharacteristicstContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see compilator.ui.CharacteristicstContainer#getUI()
	 * @see #getCharacteristicstContainer()
	 * @generated
	 */
	EReference getCharacteristicstContainer_UI();

	/**
	 * Returns the meta object for class '{@link compilator.ui.ExpressionContainer <em>Expression Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Container</em>'.
	 * @see compilator.ui.ExpressionContainer
	 * @generated
	 */
	EClass getExpressionContainer();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.ExpressionContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see compilator.ui.ExpressionContainer#getUI()
	 * @see #getExpressionContainer()
	 * @generated
	 */
	EReference getExpressionContainer_UI();

	/**
	 * Returns the meta object for the '{@link compilator.ui.ExpressionContainer#getFormatedString(java.lang.String) <em>Get Formated String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Formated String</em>' operation.
	 * @see compilator.ui.ExpressionContainer#getFormatedString(java.lang.String)
	 * @generated
	 */
	EOperation getExpressionContainer__GetFormatedString__String();

	/**
	 * Returns the meta object for the '{@link compilator.ui.ExpressionContainer#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create Expression Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Expression Model</em>' operation.
	 * @see compilator.ui.ExpressionContainer#createExpressionModel(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getExpressionContainer__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.ui.ExpressionContainer#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap) <em>Create EModel From Unpacked Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EModel From Unpacked Expression</em>' operation.
	 * @see compilator.ui.ExpressionContainer#createEModelFromUnpackedExpression(java.lang.String, java.util.TreeMap, java.util.TreeMap, java.util.TreeMap)
	 * @generated
	 */
	EOperation getExpressionContainer__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

	/**
	 * Returns the meta object for class '{@link compilator.ui.StyleAssigmentContainer <em>Style Assigment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Assigment Container</em>'.
	 * @see compilator.ui.StyleAssigmentContainer
	 * @generated
	 */
	EClass getStyleAssigmentContainer();

	/**
	 * Returns the meta object for the attribute '{@link compilator.ui.StyleAssigmentContainer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see compilator.ui.StyleAssigmentContainer#getText()
	 * @see #getStyleAssigmentContainer()
	 * @generated
	 */
	EAttribute getStyleAssigmentContainer_Text();

	/**
	 * Returns the meta object for the container reference '{@link compilator.ui.StyleAssigmentContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>UI</em>'.
	 * @see compilator.ui.StyleAssigmentContainer#getUI()
	 * @see #getStyleAssigmentContainer()
	 * @generated
	 */
	EReference getStyleAssigmentContainer_UI();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StyleAssigmentContainer#unPackStyles() <em>Un Pack Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Pack Styles</em>' operation.
	 * @see compilator.ui.StyleAssigmentContainer#unPackStyles()
	 * @generated
	 */
	EOperation getStyleAssigmentContainer__UnPackStyles();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StyleAssigmentContainer#getStyleBody(java.lang.String) <em>Get Style Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Style Body</em>' operation.
	 * @see compilator.ui.StyleAssigmentContainer#getStyleBody(java.lang.String)
	 * @generated
	 */
	EOperation getStyleAssigmentContainer__GetStyleBody__String();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StyleAssigmentContainer#getStyleName(java.lang.String) <em>Get Style Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Style Name</em>' operation.
	 * @see compilator.ui.StyleAssigmentContainer#getStyleName(java.lang.String)
	 * @generated
	 */
	EOperation getStyleAssigmentContainer__GetStyleName__String();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StyleAssigmentContainer#loadElementsStyles(java.util.TreeMap) <em>Load Elements Styles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Elements Styles</em>' operation.
	 * @see compilator.ui.StyleAssigmentContainer#loadElementsStyles(java.util.TreeMap)
	 * @generated
	 */
	EOperation getStyleAssigmentContainer__LoadElementsStyles__TreeMap();

	/**
	 * Returns the meta object for the '{@link compilator.ui.StyleAssigmentContainer#getFormatedString(java.lang.String) <em>Get Formated String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Formated String</em>' operation.
	 * @see compilator.ui.StyleAssigmentContainer#getFormatedString(java.lang.String)
	 * @generated
	 */
	EOperation getStyleAssigmentContainer__GetFormatedString__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link compilator.ui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.UIImpl
		 * @see compilator.ui.impl.UiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_MODEL_FACTORY = eINSTANCE.getUI_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_DOMAIN = eINSTANCE.getUI_TheDomain();

		/**
		 * The meta object literal for the '<em><b>The Characteristicst Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CHARACTERISTICST_CONTAINER = eINSTANCE.getUI_TheCharacteristicstContainer();

		/**
		 * The meta object literal for the '<em><b>Styles Conainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__STYLES_CONAINER = eINSTANCE.getUI_StylesConainer();

		/**
		 * The meta object literal for the '<em><b>Components Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__COMPONENTS_CONTAINER = eINSTANCE.getUI_ComponentsContainer();

		/**
		 * The meta object literal for the '<em><b>The Expression Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_EXPRESSION_CONTAINER = eINSTANCE.getUI_TheExpressionContainer();

		/**
		 * The meta object literal for the '<em><b>The Style Assigment Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_STYLE_ASSIGMENT_CONTAINER = eINSTANCE.getUI_TheStyleAssigmentContainer();

		/**
		 * The meta object literal for the '<em><b>Create Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = eINSTANCE.getUI__CreateComponent__String_String_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Create Expression Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getUI__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Un Pack Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___UN_PACK_STYLES = eINSTANCE.getUI__UnPackStyles();

		/**
		 * The meta object literal for the '<em><b>Create EModel From Unpacked Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getUI__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '{@link compilator.ui.impl.StylesConainerImpl <em>Styles Conainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.StylesConainerImpl
		 * @see compilator.ui.impl.UiPackageImpl#getStylesConainer()
		 * @generated
		 */
		EClass STYLES_CONAINER = eINSTANCE.getStylesConainer();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLES_CONAINER__UI = eINSTANCE.getStylesConainer_UI();

		/**
		 * The meta object literal for the '<em><b>Load Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLES_CONAINER___LOAD_STYLES__MODELFACTORYSTYLES = eINSTANCE.getStylesConainer__LoadStyles__ModelFactoryStyles();

		/**
		 * The meta object literal for the '{@link compilator.ui.impl.ComponentsContainerImpl <em>Components Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.ComponentsContainerImpl
		 * @see compilator.ui.impl.UiPackageImpl#getComponentsContainer()
		 * @generated
		 */
		EClass COMPONENTS_CONTAINER = eINSTANCE.getComponentsContainer();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS_CONTAINER__UI = eINSTANCE.getComponentsContainer_UI();

		/**
		 * The meta object literal for the '<em><b>Create Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENTS_CONTAINER___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP = eINSTANCE.getComponentsContainer__CreateComponent__String_String_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Get Formated String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENTS_CONTAINER___GET_FORMATED_STRING__STRING = eINSTANCE.getComponentsContainer__GetFormatedString__String();

		/**
		 * The meta object literal for the '{@link compilator.ui.impl.CharacteristicstContainerImpl <em>Characteristicst Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.CharacteristicstContainerImpl
		 * @see compilator.ui.impl.UiPackageImpl#getCharacteristicstContainer()
		 * @generated
		 */
		EClass CHARACTERISTICST_CONTAINER = eINSTANCE.getCharacteristicstContainer();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTICST_CONTAINER__UI = eINSTANCE.getCharacteristicstContainer_UI();

		/**
		 * The meta object literal for the '{@link compilator.ui.impl.ExpressionContainerImpl <em>Expression Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.ExpressionContainerImpl
		 * @see compilator.ui.impl.UiPackageImpl#getExpressionContainer()
		 * @generated
		 */
		EClass EXPRESSION_CONTAINER = eINSTANCE.getExpressionContainer();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONTAINER__UI = eINSTANCE.getExpressionContainer_UI();

		/**
		 * The meta object literal for the '<em><b>Get Formated String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_CONTAINER___GET_FORMATED_STRING__STRING = eINSTANCE.getExpressionContainer__GetFormatedString__String();

		/**
		 * The meta object literal for the '<em><b>Create Expression Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_CONTAINER___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getExpressionContainer__CreateExpressionModel__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '<em><b>Create EModel From Unpacked Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION_CONTAINER___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP = eINSTANCE.getExpressionContainer__CreateEModelFromUnpackedExpression__String_TreeMap_TreeMap_TreeMap();

		/**
		 * The meta object literal for the '{@link compilator.ui.impl.StyleAssigmentContainerImpl <em>Style Assigment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.ui.impl.StyleAssigmentContainerImpl
		 * @see compilator.ui.impl.UiPackageImpl#getStyleAssigmentContainer()
		 * @generated
		 */
		EClass STYLE_ASSIGMENT_CONTAINER = eINSTANCE.getStyleAssigmentContainer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_ASSIGMENT_CONTAINER__TEXT = eINSTANCE.getStyleAssigmentContainer_Text();

		/**
		 * The meta object literal for the '<em><b>UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_ASSIGMENT_CONTAINER__UI = eINSTANCE.getStyleAssigmentContainer_UI();

		/**
		 * The meta object literal for the '<em><b>Un Pack Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLE_ASSIGMENT_CONTAINER___UN_PACK_STYLES = eINSTANCE.getStyleAssigmentContainer__UnPackStyles();

		/**
		 * The meta object literal for the '<em><b>Get Style Body</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLE_ASSIGMENT_CONTAINER___GET_STYLE_BODY__STRING = eINSTANCE.getStyleAssigmentContainer__GetStyleBody__String();

		/**
		 * The meta object literal for the '<em><b>Get Style Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLE_ASSIGMENT_CONTAINER___GET_STYLE_NAME__STRING = eINSTANCE.getStyleAssigmentContainer__GetStyleName__String();

		/**
		 * The meta object literal for the '<em><b>Load Elements Styles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLE_ASSIGMENT_CONTAINER___LOAD_ELEMENTS_STYLES__TREEMAP = eINSTANCE.getStyleAssigmentContainer__LoadElementsStyles__TreeMap();

		/**
		 * The meta object literal for the '<em><b>Get Formated String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STYLE_ASSIGMENT_CONTAINER___GET_FORMATED_STRING__STRING = eINSTANCE.getStyleAssigmentContainer__GetFormatedString__String();

	}

} //UiPackage
