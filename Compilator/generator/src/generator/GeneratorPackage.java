/**
 */
package generator;

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
 * @see generator.GeneratorFactory
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
	String eNS_URI = "http:///generator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.impl.GeneratorImpl
	 * @see generator.impl.GeneratorPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>The Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__THE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>The Gen Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__THE_GEN_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Gen Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_MODEL__EXPRESSIONMODEL = 0;

	/**
	 * The operation id for the '<em>Create Gen Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_CONTAINER__CONTAINER = 1;

	/**
	 * The operation id for the '<em>Create Gen Individual Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_INDIVIDUAL_ELEMENT__ELEMENT = 2;

	/**
	 * The operation id for the '<em>Create Gen Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_BUTTON__BUTTON = 3;

	/**
	 * The operation id for the '<em>Create Gen Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_COLUMN__COLUMN = 4;

	/**
	 * The operation id for the '<em>Create Gen Combo Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_COMBO_BOX__COMBOBOX = 5;

	/**
	 * The operation id for the '<em>Create Gen Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_LABEL__LABEL = 6;

	/**
	 * The operation id for the '<em>Create Gen Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_TABLE__TABLE = 7;

	/**
	 * The operation id for the '<em>Create Gen Text Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___CREATE_GEN_TEXT_FIELD__TEXTFIELD = 8;

	/**
	 * The operation id for the '<em>Set Apperances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SET_APPERANCES__ELEMENT_GENELEMENT = 9;

	/**
	 * The operation id for the '<em>Save Gen Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___SAVE_GEN_MODEL = 10;

	/**
	 * The operation id for the '<em>Load Gen Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR___LOAD_GEN_MODEL = 11;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = 12;


	/**
	 * Returns the meta object for class '{@link generator.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see generator.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Generator#getTheExpression <em>The Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Expression</em>'.
	 * @see generator.Generator#getTheExpression()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_TheExpression();

	/**
	 * Returns the meta object for the containment reference '{@link generator.Generator#getTheGenModel <em>The Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Gen Model</em>'.
	 * @see generator.Generator#getTheGenModel()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_TheGenModel();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenModel(compilator.domain.expression.expressionmodel.ExpressionModel) <em>Create Gen Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Model</em>' operation.
	 * @see generator.Generator#createGenModel(compilator.domain.expression.expressionmodel.ExpressionModel)
	 * @generated
	 */
	EOperation getGenerator__CreateGenModel__ExpressionModel();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenContainer(compilator.domain.expression.expressionmodel.containercomponent.Container) <em>Create Gen Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Container</em>' operation.
	 * @see generator.Generator#createGenContainer(compilator.domain.expression.expressionmodel.containercomponent.Container)
	 * @generated
	 */
	EOperation getGenerator__CreateGenContainer__Container();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenIndividualElement(compilator.domain.expression.expressionmodel.Element) <em>Create Gen Individual Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Individual Element</em>' operation.
	 * @see generator.Generator#createGenIndividualElement(compilator.domain.expression.expressionmodel.Element)
	 * @generated
	 */
	EOperation getGenerator__CreateGenIndividualElement__Element();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenButton(compilator.domain.expression.expressionmodel.individualcomponent.Button) <em>Create Gen Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Button</em>' operation.
	 * @see generator.Generator#createGenButton(compilator.domain.expression.expressionmodel.individualcomponent.Button)
	 * @generated
	 */
	EOperation getGenerator__CreateGenButton__Button();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenColumn(compilator.domain.expression.expressionmodel.individualcomponent.Column) <em>Create Gen Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Column</em>' operation.
	 * @see generator.Generator#createGenColumn(compilator.domain.expression.expressionmodel.individualcomponent.Column)
	 * @generated
	 */
	EOperation getGenerator__CreateGenColumn__Column();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenComboBox(compilator.domain.expression.expressionmodel.individualcomponent.ComboBox) <em>Create Gen Combo Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Combo Box</em>' operation.
	 * @see generator.Generator#createGenComboBox(compilator.domain.expression.expressionmodel.individualcomponent.ComboBox)
	 * @generated
	 */
	EOperation getGenerator__CreateGenComboBox__ComboBox();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenLabel(compilator.domain.expression.expressionmodel.individualcomponent.Label) <em>Create Gen Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Label</em>' operation.
	 * @see generator.Generator#createGenLabel(compilator.domain.expression.expressionmodel.individualcomponent.Label)
	 * @generated
	 */
	EOperation getGenerator__CreateGenLabel__Label();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenTable(compilator.domain.expression.expressionmodel.individualcomponent.Table) <em>Create Gen Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Table</em>' operation.
	 * @see generator.Generator#createGenTable(compilator.domain.expression.expressionmodel.individualcomponent.Table)
	 * @generated
	 */
	EOperation getGenerator__CreateGenTable__Table();

	/**
	 * Returns the meta object for the '{@link generator.Generator#createGenTextField(compilator.domain.expression.expressionmodel.individualcomponent.TextField) <em>Create Gen Text Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Gen Text Field</em>' operation.
	 * @see generator.Generator#createGenTextField(compilator.domain.expression.expressionmodel.individualcomponent.TextField)
	 * @generated
	 */
	EOperation getGenerator__CreateGenTextField__TextField();

	/**
	 * Returns the meta object for the '{@link generator.Generator#setApperances(compilator.domain.expression.expressionmodel.Element, generator.genmodel.GenElement) <em>Set Apperances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Apperances</em>' operation.
	 * @see generator.Generator#setApperances(compilator.domain.expression.expressionmodel.Element, generator.genmodel.GenElement)
	 * @generated
	 */
	EOperation getGenerator__SetApperances__Element_GenElement();

	/**
	 * Returns the meta object for the '{@link generator.Generator#saveGenModel() <em>Save Gen Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Gen Model</em>' operation.
	 * @see generator.Generator#saveGenModel()
	 * @generated
	 */
	EOperation getGenerator__SaveGenModel();

	/**
	 * Returns the meta object for the '{@link generator.Generator#loadGenModel() <em>Load Gen Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Gen Model</em>' operation.
	 * @see generator.Generator#loadGenModel()
	 * @generated
	 */
	EOperation getGenerator__LoadGenModel();

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
		 * The meta object literal for the '{@link generator.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.impl.GeneratorImpl
		 * @see generator.impl.GeneratorPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>The Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__THE_EXPRESSION = eINSTANCE.getGenerator_TheExpression();

		/**
		 * The meta object literal for the '<em><b>The Gen Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__THE_GEN_MODEL = eINSTANCE.getGenerator_TheGenModel();

		/**
		 * The meta object literal for the '<em><b>Create Gen Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_MODEL__EXPRESSIONMODEL = eINSTANCE.getGenerator__CreateGenModel__ExpressionModel();

		/**
		 * The meta object literal for the '<em><b>Create Gen Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_CONTAINER__CONTAINER = eINSTANCE.getGenerator__CreateGenContainer__Container();

		/**
		 * The meta object literal for the '<em><b>Create Gen Individual Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_INDIVIDUAL_ELEMENT__ELEMENT = eINSTANCE.getGenerator__CreateGenIndividualElement__Element();

		/**
		 * The meta object literal for the '<em><b>Create Gen Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_BUTTON__BUTTON = eINSTANCE.getGenerator__CreateGenButton__Button();

		/**
		 * The meta object literal for the '<em><b>Create Gen Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_COLUMN__COLUMN = eINSTANCE.getGenerator__CreateGenColumn__Column();

		/**
		 * The meta object literal for the '<em><b>Create Gen Combo Box</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_COMBO_BOX__COMBOBOX = eINSTANCE.getGenerator__CreateGenComboBox__ComboBox();

		/**
		 * The meta object literal for the '<em><b>Create Gen Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_LABEL__LABEL = eINSTANCE.getGenerator__CreateGenLabel__Label();

		/**
		 * The meta object literal for the '<em><b>Create Gen Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_TABLE__TABLE = eINSTANCE.getGenerator__CreateGenTable__Table();

		/**
		 * The meta object literal for the '<em><b>Create Gen Text Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___CREATE_GEN_TEXT_FIELD__TEXTFIELD = eINSTANCE.getGenerator__CreateGenTextField__TextField();

		/**
		 * The meta object literal for the '<em><b>Set Apperances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___SET_APPERANCES__ELEMENT_GENELEMENT = eINSTANCE.getGenerator__SetApperances__Element_GenElement();

		/**
		 * The meta object literal for the '<em><b>Save Gen Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___SAVE_GEN_MODEL = eINSTANCE.getGenerator__SaveGenModel();

		/**
		 * The meta object literal for the '<em><b>Load Gen Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERATOR___LOAD_GEN_MODEL = eINSTANCE.getGenerator__LoadGenModel();

	}

} //GeneratorPackage
