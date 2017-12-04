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
	 * @model dataType="generator.datatypes.datatypesdataform.DataForm_Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.DataForm_Diagram diagram = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createDataForm_Diagram();\r\ntooldataform.formmodel.concreta.Interface interFace  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createInterface();\r\ninterFace.setName(\"Dataform Diagram\");\r\ndiagram.setTheInterface(interFace);\r\ndiagram.setName(\"model.tooldataform_diagram\");\r\n\r\nfor(int i=0;i&lt;genModel.getListGenElements().size();i++){\r\n\tGenElement element = genModel.getListGenElements().get(i);\r\n\t\r\n\tif(element instanceof GenContainer){\r\n\t\ttooldataform.formmodel.concreta.Container c = createToolDataFormContainer((GenContainer)element);\r\n\t\tinterFace.getListGraphicalContainer().add(c);\r\n\t}\r\n\telse if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable || \r\n\t\t\telement instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){\r\n\t\tinterFace.getListGraphicalContainer().add(createGraphicalContainer(element));\r\n\t}\r\n\telse{\r\n\t\tinterFace.getListIndividualElementDataForm().add(createIndividualElement(element));\r\n\t}\r\n}\r\nlevelContainer = new HashMap&lt;GraphicalContainer, Integer&gt;();\r\nsetLevelContainer(interFace);\r\nfor (int i = 0; i &lt; interFace.getListGraphicalContainer().size(); i++) {\r\n\tsetBoundsContainers(i, interFace.getListGraphicalContainer().get(i));\r\n}\r\nreturn diagram;'"
	 * @generated
	 */
	DataForm_Diagram createDataFormModel(GenModel genModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Container"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.Container container= tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createContainer();\r\ncontainer.setName(parent.getTheContainer().getName());\r\ncontainer.setPositionX(parent.getTheX().getValue());\r\ncontainer.setPositionY(parent.getTheY().getValue());\r\ncontainer.setWidth(parent.getTheWidth().getValue());\r\ncontainer.setHeight(parent.getTheHeight().getValue());\r\n\r\nfor(int i=0;i&lt;parent.getListGenElements().size();i++){\r\n\tGenElement element = parent.getListGenElements().get(i);\r\n\t\r\n\tif(element instanceof GenContainer){\r\n\t\ttooldataform.formmodel.concreta.Container c = createToolDataFormContainer((GenContainer)element);\r\n\t\tcontainer.getListGraphicalContainer().add(c);\r\n\t}\r\n\telse if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable || \r\n\t\t\telement instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){\r\n\t\tcontainer.getListGraphicalContainer().add(createGraphicalContainer(element));\r\n\t}\r\n\telse{\r\n\t\tcontainer.getListIndividualElementDataForm().add(createIndividualElement(element));\r\n\t}\r\n}\r\nreturn container;'"
	 * @generated
	 */
	Container createToolDataFormContainer(GenContainer parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.GraphicalIndividualEement"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='GraphicalIndividualEement individualElement=null;\r\n\r\nif(element instanceof generator.genmodel.genindividualcomponent.genbutton.GenButton){\r\n\tindividualElement = createButton((GenButton)element);\r\n}\r\nelse if(element instanceof generator.genmodel.genindividualcomponent.genlabel.GenLabel){\r\n\tindividualElement = createLabelView((GenLabel)element);\r\n}\r\nelse if(element instanceof generator.genmodel.genindividualcomponent.gentextfield.GenTextField){\r\n\tindividualElement = createTextView((GenTextField)element);\r\n}\r\n\r\n//Se valida si es null?\r\nindividualElement.setPositionX(element.getTheX().getValue());\r\nindividualElement.setPositionY(element.getTheY().getValue());\r\nindividualElement.setWidth(element.getTheWidth().getValue());\r\nindividualElement.setHeight(element.getTheHeight().getValue());\r\n\r\nreturn individualElement;'"
	 * @generated
	 */
	GraphicalIndividualEement createIndividualElement(GenElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=' tooldataform.formmodel.containers.GraphicalContainer container = null;\r\n \r\n if(element instanceof generator.genmodel.genindividualcomponent.gentable.GenTable ){\r\n\t \tcontainer  = createTableView((GenTable)element);\r\n }else if( element instanceof generator.genmodel.genindividualcomponent.gencombobox.GenComboBox){\r\n\t container = createComboView((GenComboBox)element);\r\n }\t\r\n \r\n //Se valida si es null?\r\n container.setPositionX(element.getTheX().getValue());\r\n container.setPositionY(element.getTheY().getValue());\r\n container.setWidth(element.getTheWidth().getValue());\r\n container.setHeight(element.getTheHeight().getValue());\r\n \r\n return container;'"
	 * @generated
	 */
	GraphicalContainer createGraphicalContainer(GenElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.Button"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.Button button  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createButton();\r\nbutton.setName(genButton.getTheButton().getName());\r\nreturn button;'"
	 * @generated
	 */
	Button createButton(GenButton genButton);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.ComboView"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.ComboView combo  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createComboView();\r\ncombo.setName(genCombo.getTheComboBox().getName());\r\nreturn combo;'"
	 * @generated
	 */
	ComboView createComboView(GenComboBox genCombo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.LabelView"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.LabelView label  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createLabelView();\r\nlabel.setName(genLabel.getTheLabel().getName());\r\nreturn label;'"
	 * @generated
	 */
	LabelView createLabelView(GenLabel genLabel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.TextView"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.TextView text  = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createTextView();\r\ntext.setName(genText.getTheTextField().getName());\r\nreturn text;'"
	 * @generated
	 */
	TextView createTextView(GenTextField genText);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.TableView"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.TableView table = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createTableView();\r\ntable.setName(genTable.getTheTable().getName());\r\nfor(int i=0;i&lt;genTable.getListGenColumns().size();i++){\r\n\ttable.getListColumView().add(createColumView( (GenColumn)genTable.getListGenColumns().get(i)));\r\n}\r\nreturn table;'"
	 * @generated
	 */
	TableView createTableView(GenTable genTable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesdataform.ColumView"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='tooldataform.formmodel.concreta.ColumView column = tooldataform.formmodel.concreta.\r\n\t\tConcretaFactory.eINSTANCE.createColumView();\r\ncolumn.setWidth(genColumn.getTheWidth().getValue());\r\ncolumn.setName(genColumn.getTheColumn().getName());\r\nreturn column;'"
	 * @generated
	 */
	ColumView createColumView(GenColumn genColumn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerDataType="generator.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(container.getListGraphicalContainer().size() == 0) {\r\n\tlevelContainer.put(container, 1);\r\n\treturn 1;\r\n} else {\r\n\tint max = 0;\r\n\tfor(int i = 0; i &lt; container.getListGraphicalContainer().size(); i++) {\r\n\t\tmax = Math.max(max, setLevelContainer(container.getListGraphicalContainer().get(i)));\r\n\t}\r\n\tlevelContainer.put(container, max+1);\r\n\treturn max+1;\r\n}'"
	 * @generated
	 */
	Integer setLevelContainer(GraphicalContainer container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model containerDataType="generator.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int level = (int) levelContainer.get(container);\r\nif(container.getListGraphicalContainer().size() &gt; 0) {\r\n\tcontainer.setHeight(container.getHeight()+(60*level)+((container.getListGraphicalContainer().size()-1)*60));\r\n} else {\r\n\tcontainer.setHeight(container.getHeight()+(60*level));\r\n}\r\n\r\n//TODO SI LA ORINTACION (-) entonces\r\ncontainer.setPositionY(container.getPositionY()+60*index);\t\t\r\n\r\nfor(int i = 0; i &lt; container.getListGraphicalContainer().size(); i++) {\r\n\tsetBoundsContainers(i, container.getListGraphicalContainer().get(i));\r\n}'"
	 * @generated
	 */
	void setBoundsContainers(Integer index, GraphicalContainer container);

} // DataFormModelGenerator
