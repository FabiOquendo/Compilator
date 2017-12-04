/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;

import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory
 * @model kind="package"
 * @generated
 */
public interface IndividualcomponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "individualcomponent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/expression/expressionmodel/individualcomponent.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.expression.expressionmodel.individualcomponent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndividualcomponentPackage eINSTANCE = compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualElementImpl <em>Individual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualElementImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getIndividualElement()
	 * @generated
	 */
	int INDIVIDUAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT__NAME = ExpressionmodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT = ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT__EXPRESSION_MODEL = ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT__THE_STYLE = ExpressionmodelPackage.ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT__COMPONENT = ExpressionmodelPackage.ELEMENT__COMPONENT;

	/**
	 * The number of structural features of the '<em>Individual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT_FEATURE_COUNT = ExpressionmodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ELEMENT_OPERATION_COUNT = ExpressionmodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ButtonImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.LabelImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ATTRIBUTE = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.TextFieldImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__ATTRIBUTE = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ColumnImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ComboBoxImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>The Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__THE_ITEM = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.TableImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>List Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COLUMN = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ItemImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Combo Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMBO_BOX = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = INDIVIDUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINER_ELEMENT = INDIVIDUAL_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EXPRESSION_MODEL = INDIVIDUAL_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__THE_STYLE = INDIVIDUAL_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMPONENT = INDIVIDUAL_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>The Text Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__THE_TEXT_FIELD = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__THE_LABEL = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = INDIVIDUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = INDIVIDUAL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.IndividualElement <em>Individual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Element</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualElement
	 * @generated
	 */
	EClass getIndividualElement();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Attribute();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.TextField#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.TextField#getAttribute()
	 * @see #getTextField()
	 * @generated
	 */
	EReference getTextField_Attribute();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.expression.expressionmodel.individualcomponent.ComboBox#getTheItem <em>The Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>The Item</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.ComboBox#getTheItem()
	 * @see #getComboBox()
	 * @generated
	 */
	EReference getComboBox_TheItem();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.expression.expressionmodel.individualcomponent.Table#getListColumn <em>List Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Column</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Table#getListColumn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListColumn();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Combo Box</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ComboBox();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheTextField <em>The Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Text Field</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheTextField()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TheTextField();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel <em>The Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Label</em>'.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_TheLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndividualcomponentFactory getIndividualcomponentFactory();

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
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ButtonImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualElementImpl <em>Individual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualElementImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getIndividualElement()
		 * @generated
		 */
		EClass INDIVIDUAL_ELEMENT = eINSTANCE.getIndividualElement();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.LabelImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__ATTRIBUTE = eINSTANCE.getLabel_Attribute();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.TextFieldImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FIELD__ATTRIBUTE = eINSTANCE.getTextField_Attribute();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ColumnImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ComboBoxImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '<em><b>The Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBO_BOX__THE_ITEM = eINSTANCE.getComboBox_TheItem();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.TableImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>List Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COLUMN = eINSTANCE.getTable_ListColumn();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.ItemImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Combo Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__COMBO_BOX = eINSTANCE.getItem_ComboBox();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl
		 * @see compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>The Text Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__THE_TEXT_FIELD = eINSTANCE.getAttribute_TheTextField();

		/**
		 * The meta object literal for the '<em><b>The Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__THE_LABEL = eINSTANCE.getAttribute_TheLabel();

	}

} //IndividualcomponentPackage
