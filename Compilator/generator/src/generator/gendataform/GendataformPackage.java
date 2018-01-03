/**
 */
package generator.gendataform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see generator.gendataform.GendataformFactory
 * @model kind="package"
 * @generated
 */
public interface GendataformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gendataform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/gendataform.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.gendataform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GendataformPackage eINSTANCE = generator.gendataform.impl.GendataformPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.gendataform.impl.DataFormDiagramGeneratorImpl <em>Data Form Diagram Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.gendataform.impl.DataFormDiagramGeneratorImpl
	 * @see generator.gendataform.impl.GendataformPackageImpl#getDataFormDiagramGenerator()
	 * @generated
	 */
	int DATA_FORM_DIAGRAM_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR__INTERFACE1 = 2;

	/**
	 * The number of structural features of the '<em>Data Form Diagram Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Dataform Diagram Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY = 0;

	/**
	 * The operation id for the '<em>Salvar Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM = 1;

	/**
	 * The operation id for the '<em>Cargar Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM = 2;

	/**
	 * The operation id for the '<em>Reset Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING = 3;

	/**
	 * The operation id for the '<em>Generate Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM = 4;

	/**
	 * The operation id for the '<em>Create Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM = 5;

	/**
	 * The operation id for the '<em>Init Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE = 6;

	/**
	 * The operation id for the '<em>Create Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT = 7;

	/**
	 * The operation id for the '<em>Open Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM = 8;

	/**
	 * The operation id for the '<em>Get Font Dataform Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___GET_FONT_DATAFORM_ELEMENT__MODELELEMENTDATAFORM = 9;

	/**
	 * The operation id for the '<em>Get Font Size Dataform Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR___GET_FONT_SIZE_DATAFORM_ELEMENT__MODELELEMENTDATAFORM = 10;

	/**
	 * The number of operations of the '<em>Data Form Diagram Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_DIAGRAM_GENERATOR_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link generator.gendataform.impl.DataFormModelGeneratorImpl <em>Data Form Model Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.gendataform.impl.DataFormModelGeneratorImpl
	 * @see generator.gendataform.impl.GendataformPackageImpl#getDataFormModelGenerator()
	 * @generated
	 */
	int DATA_FORM_MODEL_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Level Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Data Form Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Data Form Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_DATA_FORM_MODEL__DOMAIN_GENMODEL = 0;

	/**
	 * The operation id for the '<em>Create Tool Data Form Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_TOOL_DATA_FORM_CONTAINER__DOMAIN_GENCONTAINER = 1;

	/**
	 * The operation id for the '<em>Create Individual Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_INDIVIDUAL_ELEMENT__DOMAIN_GENELEMENT = 2;

	/**
	 * The operation id for the '<em>Create Graphical Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_GRAPHICAL_CONTAINER__DOMAIN_GENELEMENT = 3;

	/**
	 * The operation id for the '<em>Create Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_BUTTON__DOMAIN_GENBUTTON = 4;

	/**
	 * The operation id for the '<em>Create Combo View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_COMBO_VIEW__DOMAIN_GENCOMBOBOX = 5;

	/**
	 * The operation id for the '<em>Create Label View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_LABEL_VIEW__DOMAIN_GENLABEL = 6;

	/**
	 * The operation id for the '<em>Create Text View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_TEXT_VIEW__DOMAIN_GENTEXTFIELD = 7;

	/**
	 * The operation id for the '<em>Create Table View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_TABLE_VIEW__DOMAIN_GENTABLE = 8;

	/**
	 * The operation id for the '<em>Create Colum View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___CREATE_COLUM_VIEW__DOMAIN_GENCOLUMN = 9;

	/**
	 * The operation id for the '<em>Set Level Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___SET_LEVEL_CONTAINER__GRAPHICALCONTAINER = 10;

	/**
	 * The operation id for the '<em>Set Bounds Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___SET_BOUNDS_CONTAINERS__INTEGER_STRING_GRAPHICALCONTAINER = 11;

	/**
	 * The operation id for the '<em>Get Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___GET_ORIENTATION__STYLE = 12;

	/**
	 * The operation id for the '<em>Search Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___SEARCH_STYLE__DOMAIN_STRING = 13;

	/**
	 * The operation id for the '<em>Search Characteristic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR___SEARCH_CHARACTERISTIC__DOMAIN_STRING = 14;

	/**
	 * The number of operations of the '<em>Data Form Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FORM_MODEL_GENERATOR_OPERATION_COUNT = 15;


	/**
	 * Returns the meta object for class '{@link generator.gendataform.DataFormDiagramGenerator <em>Data Form Diagram Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form Diagram Generator</em>'.
	 * @see generator.gendataform.DataFormDiagramGenerator
	 * @generated
	 */
	EClass getDataFormDiagramGenerator();

	/**
	 * Returns the meta object for the attribute '{@link generator.gendataform.DataFormDiagramGenerator#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Factory</em>'.
	 * @see generator.gendataform.DataFormDiagramGenerator#getModelFactory()
	 * @see #getDataFormDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataFormDiagramGenerator_ModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link generator.gendataform.DataFormDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataform Diagram</em>'.
	 * @see generator.gendataform.DataFormDiagramGenerator#getDataformDiagram()
	 * @see #getDataFormDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataFormDiagramGenerator_DataformDiagram();

	/**
	 * Returns the meta object for the attribute '{@link generator.gendataform.DataFormDiagramGenerator#getInterface1 <em>Interface1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface1</em>'.
	 * @see generator.gendataform.DataFormDiagramGenerator#getInterface1()
	 * @see #getDataFormDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataFormDiagramGenerator_Interface1();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#DataformDiagramGenerator(tooldataform.ModelFactory) <em>Dataform Diagram Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataform Diagram Generator</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#DataformDiagramGenerator(tooldataform.ModelFactory)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__DataformDiagramGenerator__ModelFactory();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#salvarDiagram(org.eclipse.gmf.runtime.notation.Diagram) <em>Salvar Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salvar Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#salvarDiagram(org.eclipse.gmf.runtime.notation.Diagram)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__SalvarDiagram__Diagram();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#cargarDiagram() <em>Cargar Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cargar Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#cargarDiagram()
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__CargarDiagram();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#resetDiagram(java.lang.String) <em>Reset Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#resetDiagram(java.lang.String)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__ResetDiagram__String();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#generateDiagram() <em>Generate Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#generateDiagram()
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__GenerateDiagram();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#createDiagram() <em>Create Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#createDiagram()
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__CreateDiagram();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#initComponents(tooldataform.formmodel.containers.GraphicalContainer, org.eclipse.gmf.runtime.notation.Node) <em>Init Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Components</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#initComponents(tooldataform.formmodel.containers.GraphicalContainer, org.eclipse.gmf.runtime.notation.Node)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__InitComponents__GraphicalContainer_Node();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#createBounds(int, int, int, int) <em>Create Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bounds</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#createBounds(int, int, int, int)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__CreateBounds__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#openDiagram(org.eclipse.gmf.runtime.notation.Diagram) <em>Open Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Diagram</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#openDiagram(org.eclipse.gmf.runtime.notation.Diagram)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__OpenDiagram__Diagram();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#getFontDataformElement(tooldataform.formmodel.concreta.ModelElementDataForm) <em>Get Font Dataform Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Font Dataform Element</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#getFontDataformElement(tooldataform.formmodel.concreta.ModelElementDataForm)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__GetFontDataformElement__ModelElementDataForm();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormDiagramGenerator#getFontSizeDataformElement(tooldataform.formmodel.concreta.ModelElementDataForm) <em>Get Font Size Dataform Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Font Size Dataform Element</em>' operation.
	 * @see generator.gendataform.DataFormDiagramGenerator#getFontSizeDataformElement(tooldataform.formmodel.concreta.ModelElementDataForm)
	 * @generated
	 */
	EOperation getDataFormDiagramGenerator__GetFontSizeDataformElement__ModelElementDataForm();

	/**
	 * Returns the meta object for class '{@link generator.gendataform.DataFormModelGenerator <em>Data Form Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Form Model Generator</em>'.
	 * @see generator.gendataform.DataFormModelGenerator
	 * @generated
	 */
	EClass getDataFormModelGenerator();

	/**
	 * Returns the meta object for the attribute '{@link generator.gendataform.DataFormModelGenerator#getLevelContainer <em>Level Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Container</em>'.
	 * @see generator.gendataform.DataFormModelGenerator#getLevelContainer()
	 * @see #getDataFormModelGenerator()
	 * @generated
	 */
	EAttribute getDataFormModelGenerator_LevelContainer();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createDataFormModel(tooldataform.styles.domain.Domain, generator.genmodel.GenModel) <em>Create Data Form Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Data Form Model</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createDataFormModel(tooldataform.styles.domain.Domain, generator.genmodel.GenModel)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateDataFormModel__Domain_GenModel();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createToolDataFormContainer(tooldataform.styles.domain.Domain, generator.genmodel.gencontainercomponent.gencontainer.GenContainer) <em>Create Tool Data Form Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Tool Data Form Container</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createToolDataFormContainer(tooldataform.styles.domain.Domain, generator.genmodel.gencontainercomponent.gencontainer.GenContainer)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateToolDataFormContainer__Domain_GenContainer();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createIndividualElement(tooldataform.styles.domain.Domain, generator.genmodel.GenElement) <em>Create Individual Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Individual Element</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createIndividualElement(tooldataform.styles.domain.Domain, generator.genmodel.GenElement)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateIndividualElement__Domain_GenElement();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createGraphicalContainer(tooldataform.styles.domain.Domain, generator.genmodel.GenElement) <em>Create Graphical Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graphical Container</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createGraphicalContainer(tooldataform.styles.domain.Domain, generator.genmodel.GenElement)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateGraphicalContainer__Domain_GenElement();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createButton(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.genbutton.GenButton) <em>Create Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Button</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createButton(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.genbutton.GenButton)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateButton__Domain_GenButton();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createComboView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) <em>Create Combo View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Combo View</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createComboView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gencombobox.GenComboBox)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateComboView__Domain_GenComboBox();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createLabelView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.genlabel.GenLabel) <em>Create Label View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Label View</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createLabelView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.genlabel.GenLabel)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateLabelView__Domain_GenLabel();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createTextView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gentextfield.GenTextField) <em>Create Text View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Text View</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createTextView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gentextfield.GenTextField)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateTextView__Domain_GenTextField();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createTableView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gentable.GenTable) <em>Create Table View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table View</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createTableView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gentable.GenTable)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateTableView__Domain_GenTable();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#createColumView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gencolunm.GenColumn) <em>Create Colum View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Colum View</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#createColumView(tooldataform.styles.domain.Domain, generator.genmodel.genindividualcomponent.gencolunm.GenColumn)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__CreateColumView__Domain_GenColumn();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#setLevelContainer(tooldataform.formmodel.containers.GraphicalContainer) <em>Set Level Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Level Container</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#setLevelContainer(tooldataform.formmodel.containers.GraphicalContainer)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__SetLevelContainer__GraphicalContainer();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#setBoundsContainers(java.lang.Integer, java.lang.String, tooldataform.formmodel.containers.GraphicalContainer) <em>Set Bounds Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bounds Containers</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#setBoundsContainers(java.lang.Integer, java.lang.String, tooldataform.formmodel.containers.GraphicalContainer)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__SetBoundsContainers__Integer_String_GraphicalContainer();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#getOrientation(tooldataform.styles.domain.Style) <em>Get Orientation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Orientation</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#getOrientation(tooldataform.styles.domain.Style)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__GetOrientation__Style();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#searchStyle(tooldataform.styles.domain.Domain, java.lang.String) <em>Search Style</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Style</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#searchStyle(tooldataform.styles.domain.Domain, java.lang.String)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__SearchStyle__Domain_String();

	/**
	 * Returns the meta object for the '{@link generator.gendataform.DataFormModelGenerator#searchCharacteristic(tooldataform.styles.domain.Domain, java.lang.String) <em>Search Characteristic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Characteristic</em>' operation.
	 * @see generator.gendataform.DataFormModelGenerator#searchCharacteristic(tooldataform.styles.domain.Domain, java.lang.String)
	 * @generated
	 */
	EOperation getDataFormModelGenerator__SearchCharacteristic__Domain_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GendataformFactory getGendataformFactory();

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
		 * The meta object literal for the '{@link generator.gendataform.impl.DataFormDiagramGeneratorImpl <em>Data Form Diagram Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.gendataform.impl.DataFormDiagramGeneratorImpl
		 * @see generator.gendataform.impl.GendataformPackageImpl#getDataFormDiagramGenerator()
		 * @generated
		 */
		EClass DATA_FORM_DIAGRAM_GENERATOR = eINSTANCE.getDataFormDiagramGenerator();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM_DIAGRAM_GENERATOR__MODEL_FACTORY = eINSTANCE.getDataFormDiagramGenerator_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Dataform Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM = eINSTANCE.getDataFormDiagramGenerator_DataformDiagram();

		/**
		 * The meta object literal for the '<em><b>Interface1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM_DIAGRAM_GENERATOR__INTERFACE1 = eINSTANCE.getDataFormDiagramGenerator_Interface1();

		/**
		 * The meta object literal for the '<em><b>Dataform Diagram Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY = eINSTANCE.getDataFormDiagramGenerator__DataformDiagramGenerator__ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Salvar Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM = eINSTANCE.getDataFormDiagramGenerator__SalvarDiagram__Diagram();

		/**
		 * The meta object literal for the '<em><b>Cargar Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM = eINSTANCE.getDataFormDiagramGenerator__CargarDiagram();

		/**
		 * The meta object literal for the '<em><b>Reset Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING = eINSTANCE.getDataFormDiagramGenerator__ResetDiagram__String();

		/**
		 * The meta object literal for the '<em><b>Generate Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM = eINSTANCE.getDataFormDiagramGenerator__GenerateDiagram();

		/**
		 * The meta object literal for the '<em><b>Create Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM = eINSTANCE.getDataFormDiagramGenerator__CreateDiagram();

		/**
		 * The meta object literal for the '<em><b>Init Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE = eINSTANCE.getDataFormDiagramGenerator__InitComponents__GraphicalContainer_Node();

		/**
		 * The meta object literal for the '<em><b>Create Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT = eINSTANCE.getDataFormDiagramGenerator__CreateBounds__int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Open Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM = eINSTANCE.getDataFormDiagramGenerator__OpenDiagram__Diagram();

		/**
		 * The meta object literal for the '<em><b>Get Font Dataform Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___GET_FONT_DATAFORM_ELEMENT__MODELELEMENTDATAFORM = eINSTANCE.getDataFormDiagramGenerator__GetFontDataformElement__ModelElementDataForm();

		/**
		 * The meta object literal for the '<em><b>Get Font Size Dataform Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_DIAGRAM_GENERATOR___GET_FONT_SIZE_DATAFORM_ELEMENT__MODELELEMENTDATAFORM = eINSTANCE.getDataFormDiagramGenerator__GetFontSizeDataformElement__ModelElementDataForm();

		/**
		 * The meta object literal for the '{@link generator.gendataform.impl.DataFormModelGeneratorImpl <em>Data Form Model Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.gendataform.impl.DataFormModelGeneratorImpl
		 * @see generator.gendataform.impl.GendataformPackageImpl#getDataFormModelGenerator()
		 * @generated
		 */
		EClass DATA_FORM_MODEL_GENERATOR = eINSTANCE.getDataFormModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Level Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER = eINSTANCE.getDataFormModelGenerator_LevelContainer();

		/**
		 * The meta object literal for the '<em><b>Create Data Form Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_DATA_FORM_MODEL__DOMAIN_GENMODEL = eINSTANCE.getDataFormModelGenerator__CreateDataFormModel__Domain_GenModel();

		/**
		 * The meta object literal for the '<em><b>Create Tool Data Form Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_TOOL_DATA_FORM_CONTAINER__DOMAIN_GENCONTAINER = eINSTANCE.getDataFormModelGenerator__CreateToolDataFormContainer__Domain_GenContainer();

		/**
		 * The meta object literal for the '<em><b>Create Individual Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_INDIVIDUAL_ELEMENT__DOMAIN_GENELEMENT = eINSTANCE.getDataFormModelGenerator__CreateIndividualElement__Domain_GenElement();

		/**
		 * The meta object literal for the '<em><b>Create Graphical Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_GRAPHICAL_CONTAINER__DOMAIN_GENELEMENT = eINSTANCE.getDataFormModelGenerator__CreateGraphicalContainer__Domain_GenElement();

		/**
		 * The meta object literal for the '<em><b>Create Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_BUTTON__DOMAIN_GENBUTTON = eINSTANCE.getDataFormModelGenerator__CreateButton__Domain_GenButton();

		/**
		 * The meta object literal for the '<em><b>Create Combo View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_COMBO_VIEW__DOMAIN_GENCOMBOBOX = eINSTANCE.getDataFormModelGenerator__CreateComboView__Domain_GenComboBox();

		/**
		 * The meta object literal for the '<em><b>Create Label View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_LABEL_VIEW__DOMAIN_GENLABEL = eINSTANCE.getDataFormModelGenerator__CreateLabelView__Domain_GenLabel();

		/**
		 * The meta object literal for the '<em><b>Create Text View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_TEXT_VIEW__DOMAIN_GENTEXTFIELD = eINSTANCE.getDataFormModelGenerator__CreateTextView__Domain_GenTextField();

		/**
		 * The meta object literal for the '<em><b>Create Table View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_TABLE_VIEW__DOMAIN_GENTABLE = eINSTANCE.getDataFormModelGenerator__CreateTableView__Domain_GenTable();

		/**
		 * The meta object literal for the '<em><b>Create Colum View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___CREATE_COLUM_VIEW__DOMAIN_GENCOLUMN = eINSTANCE.getDataFormModelGenerator__CreateColumView__Domain_GenColumn();

		/**
		 * The meta object literal for the '<em><b>Set Level Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___SET_LEVEL_CONTAINER__GRAPHICALCONTAINER = eINSTANCE.getDataFormModelGenerator__SetLevelContainer__GraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Set Bounds Containers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___SET_BOUNDS_CONTAINERS__INTEGER_STRING_GRAPHICALCONTAINER = eINSTANCE.getDataFormModelGenerator__SetBoundsContainers__Integer_String_GraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Get Orientation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___GET_ORIENTATION__STYLE = eINSTANCE.getDataFormModelGenerator__GetOrientation__Style();

		/**
		 * The meta object literal for the '<em><b>Search Style</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___SEARCH_STYLE__DOMAIN_STRING = eINSTANCE.getDataFormModelGenerator__SearchStyle__Domain_String();

		/**
		 * The meta object literal for the '<em><b>Search Characteristic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FORM_MODEL_GENERATOR___SEARCH_CHARACTERISTIC__DOMAIN_STRING = eINSTANCE.getDataFormModelGenerator__SearchCharacteristic__Domain_String();

	}

} //GendataformPackage
