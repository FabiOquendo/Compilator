/**
 */
package generator.datatypes.datatypesdataform;

import org.eclipse.emf.ecore.EDataType;
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
 * @see generator.datatypes.datatypesdataform.DatatypesdataformFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesdataformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypesdataform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/datatypes/datatypesdataform.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.datatypes.datatypesdataform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesdataformPackage eINSTANCE = generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl.init();

	/**
	 * The meta object id for the '<em>Graphical Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.containers.GraphicalContainer
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 0;

	/**
	 * The meta object id for the '<em>Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Container
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The meta object id for the '<em>Data Form Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.DataForm_Diagram
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDataForm_Diagram()
	 * @generated
	 */
	int DATA_FORM_DIAGRAM = 2;

	/**
	 * The meta object id for the '<em>Graphical Individual Eement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.GraphicalIndividualEement
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalIndividualEement()
	 * @generated
	 */
	int GRAPHICAL_INDIVIDUAL_EEMENT = 3;

	/**
	 * The meta object id for the '<em>Button</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Button
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The meta object id for the '<em>Combo View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.ComboView
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getComboView()
	 * @generated
	 */
	int COMBO_VIEW = 5;

	/**
	 * The meta object id for the '<em>Label View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.LabelView
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getLabelView()
	 * @generated
	 */
	int LABEL_VIEW = 6;

	/**
	 * The meta object id for the '<em>Text View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.TextView
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 7;

	/**
	 * The meta object id for the '<em>Table View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.TableView
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getTableView()
	 * @generated
	 */
	int TABLE_VIEW = 8;

	/**
	 * The meta object id for the '<em>Colum View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.ColumView
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getColumView()
	 * @generated
	 */
	int COLUM_VIEW = 9;

	/**
	 * The meta object id for the '<em>Model Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.ModelFactory
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 10;

	/**
	 * The meta object id for the '<em>Interface</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Interface
	 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 11;


	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.containers.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graphical Container</em>'.
	 * @see tooldataform.formmodel.containers.GraphicalContainer
	 * @model instanceClass="tooldataform.formmodel.containers.GraphicalContainer"
	 * @generated
	 */
	EDataType getGraphicalContainer();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Container</em>'.
	 * @see tooldataform.formmodel.concreta.Container
	 * @model instanceClass="tooldataform.formmodel.concreta.Container"
	 * @generated
	 */
	EDataType getContainer();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.DataForm_Diagram <em>Data Form Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Form Diagram</em>'.
	 * @see tooldataform.formmodel.concreta.DataForm_Diagram
	 * @model instanceClass="tooldataform.formmodel.concreta.DataForm_Diagram"
	 * @generated
	 */
	EDataType getDataForm_Diagram();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.GraphicalIndividualEement <em>Graphical Individual Eement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graphical Individual Eement</em>'.
	 * @see tooldataform.formmodel.concreta.GraphicalIndividualEement
	 * @model instanceClass="tooldataform.formmodel.concreta.GraphicalIndividualEement"
	 * @generated
	 */
	EDataType getGraphicalIndividualEement();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Button</em>'.
	 * @see tooldataform.formmodel.concreta.Button
	 * @model instanceClass="tooldataform.formmodel.concreta.Button"
	 * @generated
	 */
	EDataType getButton();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.ComboView <em>Combo View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Combo View</em>'.
	 * @see tooldataform.formmodel.concreta.ComboView
	 * @model instanceClass="tooldataform.formmodel.concreta.ComboView"
	 * @generated
	 */
	EDataType getComboView();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.LabelView <em>Label View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Label View</em>'.
	 * @see tooldataform.formmodel.concreta.LabelView
	 * @model instanceClass="tooldataform.formmodel.concreta.LabelView"
	 * @generated
	 */
	EDataType getLabelView();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text View</em>'.
	 * @see tooldataform.formmodel.concreta.TextView
	 * @model instanceClass="tooldataform.formmodel.concreta.TextView"
	 * @generated
	 */
	EDataType getTextView();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.TableView <em>Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table View</em>'.
	 * @see tooldataform.formmodel.concreta.TableView
	 * @model instanceClass="tooldataform.formmodel.concreta.TableView"
	 * @generated
	 */
	EDataType getTableView();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.ColumView <em>Colum View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Colum View</em>'.
	 * @see tooldataform.formmodel.concreta.ColumView
	 * @model instanceClass="tooldataform.formmodel.concreta.ColumView"
	 * @generated
	 */
	EDataType getColumView();

	/**
	 * Returns the meta object for data type '{@link tooldataform.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Model Factory</em>'.
	 * @see tooldataform.ModelFactory
	 * @model instanceClass="tooldataform.ModelFactory"
	 * @generated
	 */
	EDataType getModelFactory();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface</em>'.
	 * @see tooldataform.formmodel.concreta.Interface
	 * @model instanceClass="tooldataform.formmodel.concreta.Interface"
	 * @generated
	 */
	EDataType getInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesdataformFactory getDatatypesdataformFactory();

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
		 * The meta object literal for the '<em>Graphical Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.containers.GraphicalContainer
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EDataType GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em>Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Container
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainer()
		 * @generated
		 */
		EDataType CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em>Data Form Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.DataForm_Diagram
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDataForm_Diagram()
		 * @generated
		 */
		EDataType DATA_FORM_DIAGRAM = eINSTANCE.getDataForm_Diagram();

		/**
		 * The meta object literal for the '<em>Graphical Individual Eement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.GraphicalIndividualEement
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalIndividualEement()
		 * @generated
		 */
		EDataType GRAPHICAL_INDIVIDUAL_EEMENT = eINSTANCE.getGraphicalIndividualEement();

		/**
		 * The meta object literal for the '<em>Button</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Button
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getButton()
		 * @generated
		 */
		EDataType BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em>Combo View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.ComboView
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getComboView()
		 * @generated
		 */
		EDataType COMBO_VIEW = eINSTANCE.getComboView();

		/**
		 * The meta object literal for the '<em>Label View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.LabelView
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getLabelView()
		 * @generated
		 */
		EDataType LABEL_VIEW = eINSTANCE.getLabelView();

		/**
		 * The meta object literal for the '<em>Text View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.TextView
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getTextView()
		 * @generated
		 */
		EDataType TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '<em>Table View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.TableView
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getTableView()
		 * @generated
		 */
		EDataType TABLE_VIEW = eINSTANCE.getTableView();

		/**
		 * The meta object literal for the '<em>Colum View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.ColumView
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getColumView()
		 * @generated
		 */
		EDataType COLUM_VIEW = eINSTANCE.getColumView();

		/**
		 * The meta object literal for the '<em>Model Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.ModelFactory
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getModelFactory()
		 * @generated
		 */
		EDataType MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em>Interface</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Interface
		 * @see generator.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getInterface()
		 * @generated
		 */
		EDataType INTERFACE = eINSTANCE.getInterface();

	}

} //DatatypesdataformPackage
