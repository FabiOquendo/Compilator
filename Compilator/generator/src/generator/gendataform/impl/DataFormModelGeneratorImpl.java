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
import tooldataform.styles.domain.Characteristic;
import tooldataform.styles.domain.Domain;
import tooldataform.styles.domain.Propertie;
import tooldataform.styles.domain.Style;

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
	public DataForm_Diagram createDataFormModel(final Domain domainStyle, final GenModel genModel) {
		tooldataform.formmodel.concreta.DataForm_Diagram diagram = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createDataForm_Diagram();
		tooldataform.formmodel.concreta.Interface interFace  = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createInterface();
		interFace.setName("Dataform Diagram");
		diagram.setTheInterface(interFace);
		diagram.setName("model.tooldataform_diagram");
		
		for(int i=0;i<genModel.getListGenElements().size();i++){
			GenElement genElement = genModel.getListGenElements().get(i);
		
			if(genElement instanceof GenContainer){
				tooldataform.formmodel.concreta.Container container = createToolDataFormContainer(
						domainStyle, (GenContainer) genElement);
				interFace.getListGraphicalContainer().add(container);
			}else if(genElement instanceof generator.genmodel.genindividualcomponent.gentable.GenTable) {
				tooldataform.formmodel.concreta.TableView tableView = (TableView) 
						createGraphicalContainer(domainStyle, genElement);
				interFace.getListGraphicalContainer().add(tableView);
			} 
			else if(genElement instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {
				tooldataform.formmodel.concreta.ComboView comboView = (ComboView) 
						createGraphicalContainer(domainStyle, genElement);
				interFace.getListGraphicalContainer().add(comboView);
			}
			else{
				interFace.getListIndividualElementDataForm().add(
						createIndividualElement(domainStyle, genElement));
			}
		}
		levelContainer = new HashMap<GraphicalContainer, Integer>();
		setLevelContainer(interFace);
		for (int i = 0; i < interFace.getListGraphicalContainer().size(); i++) {
			setBoundsContainers(i, "|", interFace.getListGraphicalContainer().get(i));
		}
		return diagram;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container createToolDataFormContainer(final Domain domainStyle, final GenContainer parent) {
		tooldataform.formmodel.concreta.Container container = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createContainer();
		container.setName(parent.getTheContainer().getName());
		container.setPositionX(parent.getTheX().getValue());
		container.setPositionY(parent.getTheY().getValue());
		container.setWidth(parent.getTheWidth().getValue());
		container.setHeight(parent.getTheHeight().getValue());
		
		styles.domain.Style style = parent.getTheContainer().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
				eINSTANCE.createPropertie();
		propertieDF.setName("Orientation");
		propertieDF.setValue(parent.getTheContainer().getOrientation());
		characteristicDF.getListProperties().add(propertieDF);
		
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		
		container.setTheStyle(styleDF);
		
		for (int i = 0; i < parent.getListGenElements().size(); i++) {
			GenElement element = parent.getListGenElements().get(i);
			if (element instanceof GenContainer) {
				tooldataform.formmodel.concreta.Container c = createToolDataFormContainer(domainStyle,
						(GenContainer) element);
				container.getListGraphicalContainer().add(c);
			} else if (element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable
					|| element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {
				container.getListGraphicalContainer().add(createGraphicalContainer(domainStyle, element));
			} else {
				container.getListIndividualElementDataForm().add(createIndividualElement(domainStyle, element));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividualEement createIndividualElement(final Domain domainStyle, final GenElement element) {
		GraphicalIndividualEement individualElement = null;
		
		if (element instanceof generator.genmodel.genindividualcomponent.genbutton.GenButton) {
			individualElement = createButton(domainStyle, (GenButton) element);
		} else if (element instanceof generator.genmodel.genindividualcomponent.genlabel.GenLabel) {
			individualElement = createLabelView(domainStyle, (GenLabel) element);
		} else if (element instanceof generator.genmodel.genindividualcomponent.gentextfield.GenTextField) {
			individualElement = createTextView(domainStyle, (GenTextField) element);
		}
		
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
	public GraphicalContainer createGraphicalContainer(final Domain domainStyle, final GenElement element) {
		tooldataform.formmodel.containers.GraphicalContainer container = null;
		
		if (element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable) {
			GenTable genTable = (GenTable) element;
			container = createTableView(domainStyle, genTable);
		} else if (element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {
			GenComboBox genComboBox = (GenComboBox) element;
			container = createComboView(domainStyle, genComboBox);
		}
		
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
	public Button createButton(final Domain domainStyle, final GenButton genButton) {
		tooldataform.formmodel.concreta.Button button = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createButton();
		styles.domain.Style style = genButton.getTheButton().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle,
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		
		button.setTheStyle(styleDF);
		button.setName(genButton.getTheButton().getName());
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboView createComboView(final Domain domainStyle, final GenComboBox genCombo) {
		tooldataform.formmodel.concreta.ComboView combo = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createComboView();
		styles.domain.Style style = genCombo.getTheComboBox().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		
		combo.setTheStyle(styleDF);
		combo.setName(genCombo.getTheComboBox().getName());
		return combo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelView createLabelView(final Domain domainStyle, final GenLabel genLabel) {
		tooldataform.formmodel.concreta.LabelView label = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createLabelView();
		styles.domain.Style style = genLabel.getTheLabel().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		
		label.setTheStyle(styleDF);
		label.setName(genLabel.getTheLabel().getName());
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextView(final Domain domainStyle, final GenTextField genText) {
		tooldataform.formmodel.concreta.TextView text = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createTextView();
		styles.domain.Style style = genText.getTheTextField().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		 
		text.setTheStyle(styleDF);
		text.setName(genText.getTheTextField().getName());
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTableView(final Domain domainStyle, final GenTable genTable) {
		tooldataform.formmodel.concreta.TableView table = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createTableView();
		styles.domain.Style style = genTable.getTheTable().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		 
		table.setTheStyle(styleDF);
		table.setName(genTable.getTheTable().getName());
		for (int i = 0; i < genTable.getListGenColumns().size(); i++) {
			table.getListColumView().add(createColumView(domainStyle, 
					(GenColumn) genTable.getListGenColumns().get(i)));
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumView createColumView(final Domain domainStyle, final GenColumn genColumn) {
		tooldataform.formmodel.concreta.ColumView column = tooldataform.formmodel.concreta.
				ConcretaFactory.eINSTANCE.createColumView();
		styles.domain.Style style = genColumn.getTheColumn().getTheStyle();
		styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		
		tooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());
		if(styleDF == null) {
			styleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();
			styleDF.setName(style.getName());
		}
		tooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, 
				characteristic.getName());
		if(characteristicDF == null) {	
			characteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();
			characteristicDF.setName(characteristic.getName());
		}
		EList<styles.domain.Propertie> lisProperties = characteristic.getListProperties();
		for (int i = 0; i < lisProperties.size(); i++) {
			tooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.
					eINSTANCE.createPropertie();
			propertieDF.setName(lisProperties.get(i).getName());
			propertieDF.setValue(lisProperties.get(i).getValue());
			characteristicDF.getListProperties().add(propertieDF);
		}
		domainStyle.getTheStyleFactory().getListStyle().add(styleDF);
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);
		styleDF.setTheCharacteristic(characteristicDF);
		
		column.setTheStyle(styleDF);
		column.setName(genColumn.getTheColumn().getName());
		return column;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer setLevelContainer(final GraphicalContainer container) {
		if (container.getListGraphicalContainer().size() == 0) {
			levelContainer.put(container, 1);
			return 1;
		} else {
			int max = 0;
			for (int i = 0; i < container.getListGraphicalContainer().size(); i++) {
				max = Math.max(max, setLevelContainer(container.getListGraphicalContainer().get(i)));
			}
			levelContainer.put(container, max + 1);
			return max + 1;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsContainers(final Integer index, final String orientation, final GraphicalContainer container) {
		int level = (int) levelContainer.get(container);
		if (container.getListGraphicalContainer().size() > 0) {
			container.setHeight(container.getHeight() + (65 * level) + 
					((container.getListGraphicalContainer().size() - 1) * 60));
		} else {
			container.setHeight(container.getHeight() + (65 * level));
		}
		
		if (orientation.equals("-"))
			container.setPositionY(container.getPositionY() + 65 * index);
		
		for (int i = 0; i < container.getListGraphicalContainer().size(); i++) {
			setBoundsContainers(i, getOrientation(container.getTheStyle()), 
					container.getListGraphicalContainer().get(i));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation(final Style style) {
		tooldataform.styles.domain.Characteristic characteristic = style.getTheCharacteristic();
		EList<tooldataform.styles.domain.Propertie> listProperties = characteristic.getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if (listProperties.get(i).getName().equals("Orientation")) {
				return listProperties.get(i).getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style searchStyle(final Domain domain, final String styleName) {
		EList<tooldataform.styles.domain.Style> lisStyles = domain.getTheStyleFactory().getListStyle();
		for (int i = 0; i < lisStyles.size(); i++) {
			if(lisStyles.get(i).getName().equals(styleName))
				return lisStyles.get(i);
		}
		return null;
	}
	
	public Characteristic searchCharacteristic(final Domain domain, final String characteristicName) {
		EList<tooldataform.styles.domain.Characteristic> listCharacteristics = domain.getTheCharacteristicFactory().getListCharacteristic();
		for (int i = 0; i < listCharacteristics.size(); i++) {
			if(listCharacteristics.get(i).getName().equals(characteristicName))
				return listCharacteristics.get(i);
		}
		return null;
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
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_DATA_FORM_MODEL__DOMAIN_GENMODEL:
				return createDataFormModel((Domain)arguments.get(0), (GenModel)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TOOL_DATA_FORM_CONTAINER__DOMAIN_GENCONTAINER:
				return createToolDataFormContainer((Domain)arguments.get(0), (GenContainer)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_INDIVIDUAL_ELEMENT__DOMAIN_GENELEMENT:
				return createIndividualElement((Domain)arguments.get(0), (GenElement)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_GRAPHICAL_CONTAINER__DOMAIN_GENELEMENT:
				return createGraphicalContainer((Domain)arguments.get(0), (GenElement)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_BUTTON__DOMAIN_GENBUTTON:
				return createButton((Domain)arguments.get(0), (GenButton)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_COMBO_VIEW__DOMAIN_GENCOMBOBOX:
				return createComboView((Domain)arguments.get(0), (GenComboBox)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_LABEL_VIEW__DOMAIN_GENLABEL:
				return createLabelView((Domain)arguments.get(0), (GenLabel)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TEXT_VIEW__DOMAIN_GENTEXTFIELD:
				return createTextView((Domain)arguments.get(0), (GenTextField)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_TABLE_VIEW__DOMAIN_GENTABLE:
				return createTableView((Domain)arguments.get(0), (GenTable)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___CREATE_COLUM_VIEW__DOMAIN_GENCOLUMN:
				return createColumView((Domain)arguments.get(0), (GenColumn)arguments.get(1));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___SET_LEVEL_CONTAINER__GRAPHICALCONTAINER:
				return setLevelContainer((GraphicalContainer)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___SET_BOUNDS_CONTAINERS__INTEGER_STRING_GRAPHICALCONTAINER:
				setBoundsContainers((Integer)arguments.get(0), (String)arguments.get(1), (GraphicalContainer)arguments.get(2));
				return null;
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___GET_ORIENTATION__STYLE:
				return getOrientation((Style)arguments.get(0));
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR___SEARCH_STYLE__DOMAIN_STRING:
				return searchStyle((Domain)arguments.get(0), (String)arguments.get(1));
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
