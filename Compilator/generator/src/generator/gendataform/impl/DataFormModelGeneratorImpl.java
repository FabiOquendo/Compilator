/**
 */
package generator.gendataform.impl;

import generator.gendataform.DataFormModelGenerator;
import generator.gendataform.GendataformPackage;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;

import tooldataform.formmodel.containers.GraphicalContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Form Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.gendataform.impl.DataFormModelGeneratorImpl#getLevelContainer <em>Level Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFormModelGeneratorImpl extends MinimalEObjectImpl.Container implements DataFormModelGenerator {
	/**
	 * The default value of the '{@link #getLevelContainer() <em>Level Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelContainer()
	 * @generated
	 * @ordered
	 */
	protected static final HashMap LEVEL_CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelContainer() <em>Level Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelContainer()
	 * @generated
	 * @ordered
	 */
	protected HashMap levelContainer = LEVEL_CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFormModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataformPackage.Literals.DATA_FORM_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap getLevelContainer() {
		return levelContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelContainer(HashMap newLevelContainer) {
		HashMap oldLevelContainer = levelContainer;
		levelContainer = newLevelContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataformPackage.DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER, oldLevelContainer, levelContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm_Diagram createDataFormModel(final GenModel genModel) {
		tooldataform.formmodel.concreta.DataForm_Diagram diagram = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createDataForm_Diagram();
		tooldataform.formmodel.concreta.Interface interFace  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createInterface();
		interFace.setName("Dataform Diagram");
		diagram.setTheInterface(interFace);
		diagram.setName("model.tooldataform_diagram");
		
		for(int i=0;i<genModel.getListGenElements().size();i++){
			GenElement element = genModel.getListGenElements().get(i);
			
			if(element instanceof GenContainer){
				tooldataform.formmodel.concreta.Container c = createToolDataFormContainer((GenContainer)element);
				interFace.getListGraphicalContainer().add(c);
			}
			else if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable || 
					element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){
				interFace.getListGraphicalContainer().add(createGraphicalContainer(element));
			}
			else{
				interFace.getListIndividualElementDataForm().add(createIndividualElement(element));
			}
		}
		levelContainer = new HashMap<GraphicalContainer, Integer>();
		setLevelContainer(interFace);
		for (int i = 0; i < interFace.getListGraphicalContainer().size(); i++) {
			setBoundsContainers(i, interFace.getListGraphicalContainer().get(i));
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container createToolDataFormContainer(final GenContainer parent) {
		tooldataform.formmodel.concreta.Container container= tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createContainer();
		container.setName(parent.getTheContainer().getName());
		container.setPositionX(parent.getTheX().getValue());
		container.setPositionY(parent.getTheY().getValue());
		container.setWidth(parent.getTheWidth().getValue());
		container.setHeight(parent.getTheHeight().getValue());
		
		for(int i=0;i<parent.getListGenElements().size();i++){
			GenElement element = parent.getListGenElements().get(i);
			
			if(element instanceof GenContainer){
				tooldataform.formmodel.concreta.Container c = createToolDataFormContainer((GenContainer)element);
				container.getListGraphicalContainer().add(c);
			}
			else if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable || 
					element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){
				container.getListGraphicalContainer().add(createGraphicalContainer(element));
			}
			else{
				container.getListIndividualElementDataForm().add(createIndividualElement(element));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividualEement createIndividualElement(final GenElement element) {
		GraphicalIndividualEement individualElement=null;
		
		if(element instanceof generator.genmodel.genindividualcomponent.genbutton.GenButton){
			individualElement = createButton((GenButton)element);
		}
		else if(element instanceof generator.genmodel.genindividualcomponent.genlabel.GenLabel){
			individualElement = createLabelView((GenLabel)element);
		}
		else if(element instanceof generator.genmodel.genindividualcomponent.gentextfield.GenTextField){
			individualElement = createTextView((GenTextField)element);
		}
		
		//Se valida si es null?
		individualElement.setPositionX(element.getTheX().getValue());
		individualElement.setPositionY(element.getTheY().getValue());
		individualElement.setWidth(element.getTheWidth().getValue());
		individualElement.setHeight(element.getTheHeight().getValue());
		
		return individualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainer(final GenElement element) {
		 tooldataform.formmodel.containers.GraphicalContainer container = null;
		 
		 if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable ){
			 	container  = createTableView((GenTable)element);
		 }else if( element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){
			 container = createComboView((GenComboBox)element);
		 }	
		 
		 //Se valida si es null?
		 container.setPositionX(element.getTheX().getValue());
		 container.setPositionY(element.getTheY().getValue());
		 container.setWidth(element.getTheWidth().getValue());
		 container.setHeight(element.getTheHeight().getValue());
		 
		 return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton(final GenButton genButton) {
		tooldataform.formmodel.concreta.Button button  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createButton();
		button.setName(genButton.getTheButton().getName());
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboView createComboView(final GenComboBox genCombo) {
		tooldataform.formmodel.concreta.ComboView combo  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createComboView();
		combo.setName(genCombo.getTheComboBox().getName());
		return combo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelView createLabelView(final GenLabel genLabel) {
		tooldataform.formmodel.concreta.LabelView label  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createLabelView();
		label.setName(genLabel.getTheLabel().getName());
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextView(final GenTextField genText) {
		tooldataform.formmodel.concreta.TextView text  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createTextView();
		text.setName(genText.getTheTextField().getName());
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTableView(final GenTable genTable) {
		tooldataform.formmodel.concreta.TableView table = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createTableView();
		table.setName(genTable.getTheTable().getName());
		for(int i=0;i<genTable.getListGenColumns().size();i++){
			table.getListColumView().add(createColumView( (GenColumn)genTable.getListGenColumns().get(i)));
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumView createColumView(final GenColumn genColumn) {
		tooldataform.formmodel.concreta.ColumView column = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createColumView();
		column.setWidth(genColumn.getTheWidth().getValue());
		column.setName(genColumn.getTheColumn().getName());
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer setLevelContainer(final GraphicalContainer container) {
		if(container.getListGraphicalContainer().size() == 0) {
			levelContainer.put(container, 1);
			return 1;
		} else {
			int max = 0;
			for(int i = 0; i < container.getListGraphicalContainer().size(); i++) {
				max = Math.max(max, setLevelContainer(container.getListGraphicalContainer().get(i)));
			}
			levelContainer.put(container, max+1);
			return max+1;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsContainers(final Integer index, final GraphicalContainer container) {
		int level = (int) levelContainer.get(container);
		if(container.getListGraphicalContainer().size() > 0) {
			container.setHeight(container.getHeight()+(60*level)+((container.getListGraphicalContainer().size()-1)*60));
		} else {
			container.setHeight(container.getHeight()+(60*level));
		}
		
		//TODO SI LA ORINTACION (-) entonces
		//container.setPositionY(container.getPositionY()+60*index);		
		
		for(int i = 0; i < container.getListGraphicalContainer().size(); i++) {
			setBoundsContainers(i, container.getListGraphicalContainer().get(i));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER:
				return getLevelContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER:
				setLevelContainer((HashMap)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER:
				setLevelContainer(LEVEL_CONTAINER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR__LEVEL_CONTAINER:
				return LEVEL_CONTAINER_EDEFAULT == null ? levelContainer != null : !LEVEL_CONTAINER_EDEFAULT.equals(levelContainer);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_DATA_FORM_MODEL__GENMODEL:
				return createDataFormModel((GenModel)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TOOL_DATA_FORM_CONTAINER__GENCONTAINER:
				return createToolDataFormContainer((GenContainer)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_INDIVIDUAL_ELEMENT__GENELEMENT:
				return createIndividualElement((GenElement)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_GRAPHICAL_CONTAINER__GENELEMENT:
				return createGraphicalContainer((GenElement)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_BUTTON__GENBUTTON:
				return createButton((GenButton)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_COMBO_VIEW__GENCOMBOBOX:
				return createComboView((GenComboBox)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_LABEL_VIEW__GENLABEL:
				return createLabelView((GenLabel)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TEXT_VIEW__GENTEXTFIELD:
				return createTextView((GenTextField)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TABLE_VIEW__GENTABLE:
				return createTableView((GenTable)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_COLUM_VIEW__GENCOLUMN:
				return createColumView((GenColumn)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___SET_LEVEL_CONTAINER__GRAPHICALCONTAINER:
				return setLevelContainer((GraphicalContainer)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___SET_BOUNDS_CONTAINERS__INTEGER_GRAPHICALCONTAINER:
				setBoundsContainers((Integer)arguments.get(0), (GraphicalContainer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (levelContainer: ");
		result.append(levelContainer);
		result.append(')');
		return result.toString();
	}

} //DataFormModelGeneratorImpl
