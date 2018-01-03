/**
 */
package generator.gendataform;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.Container;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;

import tooldataform.formmodel.containers.GraphicalContainer;

import tooldataform.styles.domain.Characteristic;
import tooldataform.styles.domain.Domain;
import tooldataform.styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Form Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.gendataform.DataFormModelGenerator#getLevelContainer <em>Level Container</em>}</li>
 * </ul>
 *
 * @see generator.gendataform.GendataformPackage#getDataFormModelGenerator()
 * @model
 * @generated
 */
public interface DataFormModelGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Level Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Container</em>' attribute.
	 * @see #setLevelContainer(HashMap)
	 * @see generator.gendataform.GendataformPackage#getDataFormModelGenerator_LevelContainer()
	 * @model dataType="compilator.domain.datatypes.util.HashMap"
	 * @generated
	 */
	HashMap getLevelContainer();

	/**
	 * Sets the value of the '{@link generator.gendataform.DataFormModelGenerator#getLevelContainer <em>Level Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Container</em>' attribute.
	 * @see #getLevelContainer()
	 * @generated
	 */
	void setLevelContainer(HashMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.DataForm_Diagram" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.DataForm_Diagram diagram = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createDataForm_Diagram();\r\ntooldataform.formmodel.concreta.Interface interFace  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createInterface();\r\ninterFace.setName(\"Dataform Diagram\");\r\ndiagram.setTheInterface(interFace);\r\ndiagram.setName(\"model.tooldataform_diagram\");\r\n\r\nfor(int i=0;i&lt;genModel.getListGenElements().size();i++){\r\n\tGenElement genElement = genModel.getListGenElements().get(i);\r\n\r\n\tif(genElement instanceof GenContainer){\r\n\t\ttooldataform.formmodel.concreta.Container container = createToolDataFormContainer(\r\n\t\t\t\tdomainStyle, (GenContainer) genElement);\r\n\t\tinterFace.getListGraphicalContainer().add(container);\r\n\t}else if(genElement instanceof generator.genmodel.genindividualcomponent.gentable.GenTable) {\r\n\t\ttooldataform.formmodel.concreta.TableView tableView = (TableView) \r\n\t\t\t\tcreateGraphicalContainer(domainStyle, genElement);\r\n\t\tinterFace.getListGraphicalContainer().add(tableView);\r\n\t} \r\n\telse if(genElement instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {\r\n\t\ttooldataform.formmodel.concreta.ComboView comboView = (ComboView) \r\n\t\t\t\tcreateGraphicalContainer(domainStyle, genElement);\r\n\t\tinterFace.getListGraphicalContainer().add(comboView);\r\n\t}\r\n\telse{\r\n\t\tinterFace.getListIndividualElementDataForm().add(\r\n\t\t\t\tcreateIndividualElement(domainStyle, genElement));\r\n\t}\r\n}\r\nlevelContainer = new HashMap&lt;GraphicalContainer, Integer&gt;();\r\nsetLevelContainer(interFace);\r\nfor (int i = 0; i &lt; interFace.getListGraphicalContainer().size(); i++) {\r\n\tsetBoundsContainers(i, \"|\", interFace.getListGraphicalContainer().get(i));\r\n}\r\nreturn diagram;\r\n'"
	 * @generated
	 */
	DataForm_Diagram createDataFormModel(Domain domainStyle, GenModel genModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Container" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.Container container = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createContainer();\r\ncontainer.setName(parent.getTheContainer().getName());\r\ncontainer.setPositionX(parent.getTheX().getValue());\r\ncontainer.setPositionY(parent.getTheY().getValue());\r\ncontainer.setWidth(parent.getTheWidth().getValue());\r\ncontainer.setHeight(parent.getTheHeight().getValue());\r\n\r\nstyles.domain.Style style = parent.getTheContainer().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ntooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\teINSTANCE.createPropertie();\r\npropertieDF.setName(\"Orientation\");\r\npropertieDF.setValue(parent.getTheContainer().getOrientation());\r\ncharacteristicDF.getListProperties().add(propertieDF);\r\n\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n\r\ncontainer.setTheStyle(styleDF);\r\n\r\nfor (int i = 0; i &lt; parent.getListGenElements().size(); i++) {\r\n\tGenElement element = parent.getListGenElements().get(i);\r\n\tif (element instanceof GenContainer) {\r\n\t\ttooldataform.formmodel.concreta.Container c = createToolDataFormContainer(domainStyle,\r\n\t\t\t\t(GenContainer) element);\r\n\t\tcontainer.getListGraphicalContainer().add(c);\r\n\t} else if (element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable\r\n\t\t\t|| element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {\r\n\t\tcontainer.getListGraphicalContainer().add(createGraphicalContainer(domainStyle, element));\r\n\t} else {\r\n\t\tcontainer.getListIndividualElementDataForm().add(createIndividualElement(domainStyle, element));\r\n\t}\r\n}\r\nreturn container;'"
	 * @generated
	 */
	Container createToolDataFormContainer(Domain domainStyle, GenContainer parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.GraphicalIndividualEement" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='GraphicalIndividualEement individualElement = null;\r\n\r\nif (element instanceof generator.genmodel.genindividualcomponent.genbutton.GenButton) {\r\n\tindividualElement = createButton(domainStyle, (GenButton) element);\r\n} else if (element instanceof generator.genmodel.genindividualcomponent.genlabel.GenLabel) {\r\n\tindividualElement = createLabelView(domainStyle, (GenLabel) element);\r\n} else if (element instanceof generator.genmodel.genindividualcomponent.gentextfield.GenTextField) {\r\n\tindividualElement = createTextView(domainStyle, (GenTextField) element);\r\n}\r\n\r\nindividualElement.setPositionX(element.getTheX().getValue());\r\nindividualElement.setPositionY(element.getTheY().getValue());\r\nindividualElement.setWidth(element.getTheWidth().getValue());\r\nindividualElement.setHeight(element.getTheHeight().getValue());\r\n\r\nreturn individualElement;'"
	 * @generated
	 */
	GraphicalIndividualEement createIndividualElement(Domain domainStyle, GenElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.GraphicalContainer" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.containers.GraphicalContainer container = null;\r\n\r\nif (element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable) {\r\n\tGenTable genTable = (GenTable) element;\r\n\tcontainer = createTableView(domainStyle, (GenTable) element);\r\n} else if (element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox) {\r\n\tGenComboBox genComboBox = (GenComboBox) element;\r\n\tcontainer = createComboView(domainStyle, (GenComboBox) element);\r\n}\r\n\r\ncontainer.setPositionX(element.getTheX().getValue());\r\ncontainer.setPositionY(element.getTheY().getValue());\r\ncontainer.setWidth(element.getTheWidth().getValue());\r\ncontainer.setHeight(element.getTheHeight().getValue());\r\n\r\nreturn container;'"
	 * @generated
	 */
	GraphicalContainer createGraphicalContainer(Domain domainStyle, GenElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Button" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.Button button = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createButton();\r\nstyles.domain.Style style = genButton.getTheButton().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle,\r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n\r\nbutton.setTheStyle(styleDF);\r\nbutton.setName(genButton.getTheButton().getName());\r\nreturn button;'"
	 * @generated
	 */
	Button createButton(Domain domainStyle, GenButton genButton);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.ComboView" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.ComboView combo = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createComboView();\r\nstyles.domain.Style style = genCombo.getTheComboBox().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n\r\ncombo.setTheStyle(styleDF);\r\ncombo.setName(genCombo.getTheComboBox().getName());\r\nreturn combo;'"
	 * @generated
	 */
	ComboView createComboView(Domain domainStyle, GenComboBox genCombo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.LabelView" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.LabelView label = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createLabelView();\r\nstyles.domain.Style style = genLabel.getTheLabel().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n\r\nlabel.setTheStyle(styleDF);\r\nlabel.setName(genLabel.getTheLabel().getName());\r\nreturn label;'"
	 * @generated
	 */
	LabelView createLabelView(Domain domainStyle, GenLabel genLabel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.TextView" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.TextView text = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createTextView();\r\nstyles.domain.Style style = genText.getTheTextField().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n \r\ntext.setTheStyle(styleDF);\r\ntext.setName(genText.getTheTextField().getName());\r\nreturn text;'"
	 * @generated
	 */
	TextView createTextView(Domain domainStyle, GenTextField genText);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.TableView" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.TableView table = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createTableView();\r\nstyles.domain.Style style = genTable.getTheTable().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n \r\ntable.setTheStyle(styleDF);\r\ntable.setName(genTable.getTheTable().getName());\r\nfor (int i = 0; i &lt; genTable.getListGenColumns().size(); i++) {\r\n\ttable.getListColumView().add(createColumView(domainStyle, \r\n\t\t\t(GenColumn) genTable.getListGenColumns().get(i)));\r\n}\r\nreturn table;'"
	 * @generated
	 */
	TableView createTableView(Domain domainStyle, GenTable genTable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.ColumView" domainStyleDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.ColumView column = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createColumView();\r\nstyles.domain.Style style = genColumn.getTheColumn().getTheStyle();\r\nstyles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\n\r\ntooldataform.styles.domain.Style styleDF = searchStyle(domainStyle, style.getName());\r\nif(styleDF == null) {\r\n\tstyleDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createStyle();\r\n\tstyleDF.setName(style.getName());\r\n}\r\ntooldataform.styles.domain.Characteristic characteristicDF = searchCharacteristic(domainStyle, \r\n\t\tcharacteristic.getName());\r\nif(characteristicDF == null) {\t\r\n\tcharacteristicDF = tooldataform.styles.domain.DomainFactory.eINSTANCE.createCharacteristic();\r\n\tcharacteristicDF.setName(characteristic.getName());\r\n}\r\nEList&lt;styles.domain.Propertie&gt; lisProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; lisProperties.size(); i++) {\r\n\ttooldataform.styles.domain.Propertie propertieDF = tooldataform.styles.domain.DomainFactory.\r\n\t\t\teINSTANCE.createPropertie();\r\n\tpropertieDF.setName(lisProperties.get(i).getName());\r\n\tpropertieDF.setValue(lisProperties.get(i).getValue());\r\n\tcharacteristicDF.getListProperties().add(propertieDF);\r\n}\r\ndomainStyle.getTheStyleFactory().getListStyle().add(styleDF);\r\ndomainStyle.getTheCharacteristicFactory().getListCharacteristic().add(characteristicDF);\r\nstyleDF.setTheCharacteristic(characteristicDF);\r\n\r\ncolumn.setTheStyle(styleDF);\r\ncolumn.setName(genColumn.getTheColumn().getName());\r\nreturn column;'"
	 * @generated
	 */
	ColumView createColumView(Domain domainStyle, GenColumn genColumn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerDataType="generator.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (container.getListGraphicalContainer().size() == 0) {\r\n\tlevelContainer.put(container, 1);\r\n\treturn 1;\r\n} else {\r\n\tint max = 0;\r\n\tfor (int i = 0; i &lt; container.getListGraphicalContainer().size(); i++) {\r\n\t\tmax = Math.max(max, setLevelContainer(container.getListGraphicalContainer().get(i)));\r\n\t}\r\n\tlevelContainer.put(container, max + 1);\r\n\treturn max + 1;\r\n}'"
	 * @generated
	 */
	Integer setLevelContainer(GraphicalContainer container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerDataType="generator.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int level = (int) levelContainer.get(container);\r\nif (container.getListGraphicalContainer().size() &gt; 0) {\r\n\tcontainer.setHeight(container.getHeight() + (65 * level) + \r\n\t\t\t((container.getListGraphicalContainer().size() - 1) * 60));\r\n} else {\r\n\tcontainer.setHeight(container.getHeight() + (65 * level));\r\n}\r\n\r\nif (orientation.equals(\"-\"))\r\n\tcontainer.setPositionY(container.getPositionY() + 65 * index);\r\n\r\nfor (int i = 0; i &lt; container.getListGraphicalContainer().size(); i++) {\r\n\tsetBoundsContainers(i, getOrientation(container.getTheStyle()), \r\n\t\t\tcontainer.getListGraphicalContainer().get(i));\r\n}'"
	 * @generated
	 */
	void setBoundsContainers(Integer index, String orientation, GraphicalContainer container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model styleDataType="generator.datatypes.datatypesdataform.Style"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.styles.domain.Characteristic characteristic = style.getTheCharacteristic();\r\nEList&lt;tooldataform.styles.domain.Propertie&gt; listProperties = characteristic.getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif (listProperties.get(i).getName().equals(\"Orientation\")) {\r\n\t\treturn listProperties.get(i).getValue();\r\n\t}\r\n}\r\nreturn null;'"
	 * @generated
	 */
	String getOrientation(Style style);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Style" domainDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;tooldataform.styles.domain.Style&gt; lisStyles = domain.getTheStyleFactory().getListStyle();\r\nfor (int i = 0; i &lt; lisStyles.size(); i++) {\r\n\tif(lisStyles.get(i).getName().equals(styleName))\r\n\t\treturn lisStyles.get(i);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Style searchStyle(Domain domain, String styleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Characteristic" domainDataType="generator.datatypes.datatypesdataform.DomanStyle"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;tooldataform.styles.domain.Characteristic&gt; listCharacteristics = domain.getTheCharacteristicFactory().getListCharacteristic();\r\nfor (int i = 0; i &lt; listCharacteristics.size(); i++) {\r\n\tif(listCharacteristics.get(i).getName().equals(characteristicName))\r\n\t\treturn listCharacteristics.get(i);\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Characteristic searchCharacteristic(Domain domain, String characteristicName);

} // DataFormModelGenerator
