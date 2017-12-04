/**
 */
package generator.datatypes.datatypesdataform.impl;

import generator.datatypes.datatypesdataform.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tooldataform.ModelFactory;

import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;

import tooldataform.formmodel.containers.GraphicalContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesdataformFactoryImpl extends EFactoryImpl implements DatatypesdataformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesdataformFactory init() {
		try {
			DatatypesdataformFactory theDatatypesdataformFactory = (DatatypesdataformFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesdataformPackage.eNS_URI);
			if (theDatatypesdataformFactory != null) {
				return theDatatypesdataformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesdataformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesdataformPackage.GRAPHICAL_CONTAINER:
				return createGraphicalContainerFromString(eDataType, initialValue);
			case DatatypesdataformPackage.CONTAINER:
				return createContainerFromString(eDataType, initialValue);
			case DatatypesdataformPackage.DATA_FORM_DIAGRAM:
				return createDataForm_DiagramFromString(eDataType, initialValue);
			case DatatypesdataformPackage.GRAPHICAL_INDIVIDUAL_EEMENT:
				return createGraphicalIndividualEementFromString(eDataType, initialValue);
			case DatatypesdataformPackage.BUTTON:
				return createButtonFromString(eDataType, initialValue);
			case DatatypesdataformPackage.COMBO_VIEW:
				return createComboViewFromString(eDataType, initialValue);
			case DatatypesdataformPackage.LABEL_VIEW:
				return createLabelViewFromString(eDataType, initialValue);
			case DatatypesdataformPackage.TEXT_VIEW:
				return createTextViewFromString(eDataType, initialValue);
			case DatatypesdataformPackage.TABLE_VIEW:
				return createTableViewFromString(eDataType, initialValue);
			case DatatypesdataformPackage.COLUM_VIEW:
				return createColumViewFromString(eDataType, initialValue);
			case DatatypesdataformPackage.MODEL_FACTORY:
				return createModelFactoryFromString(eDataType, initialValue);
			case DatatypesdataformPackage.INTERFACE:
				return createInterfaceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesdataformPackage.GRAPHICAL_CONTAINER:
				return convertGraphicalContainerToString(eDataType, instanceValue);
			case DatatypesdataformPackage.CONTAINER:
				return convertContainerToString(eDataType, instanceValue);
			case DatatypesdataformPackage.DATA_FORM_DIAGRAM:
				return convertDataForm_DiagramToString(eDataType, instanceValue);
			case DatatypesdataformPackage.GRAPHICAL_INDIVIDUAL_EEMENT:
				return convertGraphicalIndividualEementToString(eDataType, instanceValue);
			case DatatypesdataformPackage.BUTTON:
				return convertButtonToString(eDataType, instanceValue);
			case DatatypesdataformPackage.COMBO_VIEW:
				return convertComboViewToString(eDataType, instanceValue);
			case DatatypesdataformPackage.LABEL_VIEW:
				return convertLabelViewToString(eDataType, instanceValue);
			case DatatypesdataformPackage.TEXT_VIEW:
				return convertTextViewToString(eDataType, instanceValue);
			case DatatypesdataformPackage.TABLE_VIEW:
				return convertTableViewToString(eDataType, instanceValue);
			case DatatypesdataformPackage.COLUM_VIEW:
				return convertColumViewToString(eDataType, instanceValue);
			case DatatypesdataformPackage.MODEL_FACTORY:
				return convertModelFactoryToString(eDataType, instanceValue);
			case DatatypesdataformPackage.INTERFACE:
				return convertInterfaceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainerFromString(EDataType eDataType, String initialValue) {
		return (GraphicalContainer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicalContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container createContainerFromString(EDataType eDataType, String initialValue) {
		return (tooldataform.formmodel.concreta.Container)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm_Diagram createDataForm_DiagramFromString(EDataType eDataType, String initialValue) {
		return (DataForm_Diagram)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataForm_DiagramToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividualEement createGraphicalIndividualEementFromString(EDataType eDataType, String initialValue) {
		return (GraphicalIndividualEement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicalIndividualEementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButtonFromString(EDataType eDataType, String initialValue) {
		return (Button)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboView createComboViewFromString(EDataType eDataType, String initialValue) {
		return (ComboView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComboViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelView createLabelViewFromString(EDataType eDataType, String initialValue) {
		return (LabelView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextViewFromString(EDataType eDataType, String initialValue) {
		return (TextView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTableViewFromString(EDataType eDataType, String initialValue) {
		return (TableView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumView createColumViewFromString(EDataType eDataType, String initialValue) {
		return (ColumView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactoryFromString(EDataType eDataType, String initialValue) {
		return (ModelFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterfaceFromString(EDataType eDataType, String initialValue) {
		return (Interface)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformPackage getDatatypesdataformPackage() {
		return (DatatypesdataformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesdataformPackage getPackage() {
		return DatatypesdataformPackage.eINSTANCE;
	}

} //DatatypesdataformFactoryImpl
