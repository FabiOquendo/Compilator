/**
 */
package generator;

import compilator.domain.expression.Expression;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;

import compilator.domain.expression.expressionmodel.containercomponent.Container;

import compilator.domain.expression.expressionmodel.individualcomponent.Button;
import compilator.domain.expression.expressionmodel.individualcomponent.Column;
import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.Label;
import compilator.domain.expression.expressionmodel.individualcomponent.Table;
import compilator.domain.expression.expressionmodel.individualcomponent.TextField;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Generator#getTheExpression <em>The Expression</em>}</li>
 *   <li>{@link generator.Generator#getTheGenModel <em>The Gen Model</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends EObject {
	/**
	 * Returns the value of the '<em><b>The Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Expression</em>' containment reference.
	 * @see #setTheExpression(Expression)
	 * @see generator.GeneratorPackage#getGenerator_TheExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTheExpression();

	/**
	 * Sets the value of the '{@link generator.Generator#getTheExpression <em>The Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Expression</em>' containment reference.
	 * @see #getTheExpression()
	 * @generated
	 */
	void setTheExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>The Gen Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenModel#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Gen Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Gen Model</em>' containment reference.
	 * @see #setTheGenModel(GenModel)
	 * @see generator.GeneratorPackage#getGenerator_TheGenModel()
	 * @see generator.genmodel.GenModel#getGenerator
	 * @model opposite="Generator" containment="true" required="true"
	 * @generated
	 */
	GenModel getTheGenModel();

	/**
	 * Sets the value of the '{@link generator.Generator#getTheGenModel <em>The Gen Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Gen Model</em>' containment reference.
	 * @see #getTheGenModel()
	 * @generated
	 */
	void setTheGenModel(GenModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='generator.genmodel.GenModel genModel= generator.genmodel.GenmodelFactory.eINSTANCE.createGenModel();\r\n\t\t\r\nfor(int i =0 ;i&lt; expressionModel.getListElements().size();i++){\r\n      compilator.domain.expression.expressionmodel.Element element = expressionModel.getListElements().get(i);\r\n      if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){\r\n\tgenModel.getListGenElements().add(createGenContainer((compilator.domain.expression.expressionmodel.containercomponent.Container) element));\r\n       }else{\r\n\tgenModel.getListGenElements().add(createGenIndividualElement(element));\r\n        }\r\n}\r\nthis.setTheGenModel(genModel);'"
	 * @generated
	 */
	void createGenModel(ExpressionModel expressionModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenContainer genContainer = generator.genmodel.gencontainercomponent.gencontainer.\r\n\t\tGencontainerFactory.eINSTANCE.createGenContainer();\r\ngenContainer.setTheContainer(container);\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = container.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\nString orientation = container.getOrientation();\r\ngenContainer.createPropertiesContainer(orientation, fontSize);\r\nif(container.getTheStyle() != null) {\r\n\tgenContainer = (GenContainer) setApperances(container, genContainer);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Background\")) {\r\n\t\t\tgenerator.apperance.background.Background b = generator.apperance.background.\r\n\t\t\t\t\tBackgroundFactory.eINSTANCE.createBackground();\r\n\t\t\tb.setValue(propertie.getValue());\r\n\t\t\tgenContainer.setTheBackground(b);\r\n\t\t}\r\n\t}\r\n}\r\n\r\nint x, y;\r\nif(container.getIsVisible()){\r\n\tx = 10; y = 10;\r\n} else {\r\n\tx = 0; y = 0;\r\n}\r\nint xa=0,ya=0;\r\nint maxix=10,maxiy=10;\r\n\r\nfor(int i =0 ;i&lt; container.getListElements().size();i++){\r\n\tcompilator.domain.expression.expressionmodel.Element element = container.getListElements().get(i);\r\n\tif(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){\r\n\t\tGenContainer c = createGenContainer((compilator.domain.expression.expressionmodel.\r\n\t\t\t\tcontainercomponent.Container) element);\r\n\t\tc.getTheX().setValue(new Integer(x)); c.getTheY().setValue(new Integer(y));\r\n\t\tgenContainer.getListGenElements().add(c);\r\n\t\txa = c.getTheWidth().getValue().intValue(); ya = c.getTheHeight().getValue().intValue()+c.getTheTitleHeight().getValue().intValue(); \r\n\t}else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Attribute){\r\n\t\tcompilator.domain.expression.expressionmodel.individualcomponent.Attribute attribute = \r\n\t\t\t\t(compilator.domain.expression.expressionmodel.individualcomponent.Attribute) element;\r\n\t\tattribute.getTheLabel().setTheStyle(attribute.getTheStyle());\r\n\t\tattribute.getTheInputElement().setTheStyle(attribute.getTheStyle());\r\n\t\tGenLabel label = (GenLabel) createGenIndividualElement(attribute.getTheLabel());\r\n\t\tlabel.getTheX().setValue(new Integer(x)); label.getTheY().setValue(new Integer(y));\r\n\t\tgenContainer.getListGenElements().add(label);\r\n\t\txa = label.getTheWidth().getValue().intValue(); ya = label.getTheHeight().getValue().intValue();\r\n\t\t\r\n\t\tif(container.getOrientation().charAt(1) == \'|\'){ \r\n\t\t\txa += 5;\r\n\t\t\tx += xa;\r\n\t\t}\r\n\t\telse {\r\n\t\t\tya += 5;\r\n\t\t\ty += ya;\r\n\t\t}\r\n\t\t\r\n\t\tGenIndividualElement input =  createGenIndividualElement(attribute.getTheInputElement());\r\n\t\tinput.getTheX().setValue(new Integer(x)); input.getTheY().setValue(new Integer(y));\r\n\t\tgenContainer.getListGenElements().add(input);\r\n\t\tif(container.getOrientation().charAt(1) == \'|\'){ \r\n\t\t\tx -= xa;\r\n\t\t\txa += input.getTheWidth().getValue().intValue();\r\n\t\t\tya = input.getTheHeight().getValue().intValue();\r\n\t\t}\r\n\t\telse {\r\n\t\t\ty -= ya;\r\n\t\t\tya += input.getTheHeight().getValue().intValue();\r\n\t\t\txa = input.getTheWidth().getValue().intValue();\r\n\t\t}\r\n\t\t\r\n\t} else  if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table){\r\n\t\tGenTable genTable = createGenTable((Table) element);\r\n\t\tgenTable.getTheX().setValue(new Integer(x)); genTable.getTheY().setValue(new Integer(y));\r\n\t\tgenContainer.getListGenElements().add(genTable);\r\n\t\txa = genTable.getTheWidth().getValue().intValue(); \r\n\t\tya = genTable.getTheHeight().getValue().intValue()+genTable.getTheTitleHeight().getValue().intValue(); \r\n\t} else {\r\n\t\r\n\t\tGenIndividualElement ind = createGenIndividualElement(element);\r\n\t\tind.getTheX().setValue(new Integer(x)); ind.getTheY().setValue(new Integer(y));\r\n\t\t\r\n\t\tgenContainer.getListGenElements().add(ind);\r\n\t\t\r\n\t\txa = ind.getTheWidth().getValue().intValue(); ya = ind.getTheHeight().getValue().intValue();\r\n\t}\r\n\t\r\n\tif(container.getOrientation().charAt(0) == \'|\'){ \r\n\t\tx = x + xa + 10;\r\n\t\tmaxix = x;\r\n\t\tmaxiy = java.lang.Math.max(maxiy, ya+20) ;\r\n\t}\r\n\telse {\r\n\t\ty = y + ya + 10;\r\n\t\tmaxiy=y;\r\n\t\tmaxix = java.lang.Math.max(maxix,xa+20);\r\n\t}\r\n}\r\n\r\nif(!container.getIsVisible()){\r\n\tif(container.getOrientation().charAt(0) == \'|\') {\r\n\t\tmaxix -= 10; maxiy -= 20;\r\n\t} else {\r\n\t\tmaxix -= 20; maxiy -= 10;\r\n\t}\r\n}\r\n\r\ngenerator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\nh.setValue(new Integer(maxiy));\r\ngenerator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\nw.setValue(new Integer(maxix));\r\ngenerator.apperance.position.X xx = generator.apperance.position.PositionFactory.eINSTANCE.createX();\r\nxx.setValue(0);\r\ngenerator.apperance.position.Y yy = generator.apperance.position.PositionFactory.eINSTANCE.createY();\r\nyy.setValue(0);\r\ngenContainer.setTheHeight(h); genContainer.setTheWidth(w);\r\ngenContainer.setTheX(xx); genContainer.setTheY(yy);\r\nreturn genContainer;'"
	 * @generated
	 */
	GenContainer createGenContainer(Container container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button){\r\n\tGenButton genButton = createGenButton((Button) element);\r\n\treturn genButton;\r\n}\r\nelse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox){\r\n\tGenComboBox genComboBox = createGenComboBox((ComboBox) element);\r\n\treturn genComboBox;\r\n}\r\nelse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label){\r\n\tGenLabel genLabel = createGenLabel((Label) element);\r\n\treturn genLabel;\r\n}\r\nelse  if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table){\r\n\tGenTable genTable = createGenTable((Table) element);\r\n\treturn genTable;\r\n}\r\nelse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField){\r\n\tGenTextField genTextField = createGenTextField((TextField) element);\r\n\treturn genTextField;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	GenIndividualElement createGenIndividualElement(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenButton genButton = generator.genmodel.genindividualcomponent.genbutton.\r\n\t\tGenbuttonFactory.eINSTANCE.createGenButton();\r\ngenButton.setTheButton(button);\r\nString text = button.getName();\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = button.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\ngenButton.createPropertiesButton(text, fontSize);\r\n\r\nif(button.getTheStyle() != null) {\r\n\tgenButton = (GenButton) setApperances(button, genButton);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Alignment\")) {\r\n\t\t\tgenerator.apperance.alignment.Alignment a = generator.apperance.alignment.\r\n\t\t\t\t\tAlignmentFactory.eINSTANCE.createAlignment();\r\n\t\t\ta.setValue(propertie.getValue());\r\n\t\t\tgenButton.setTheAlignment(a);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genButton;'"
	 * @generated
	 */
	GenButton createGenButton(Button button);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenColumn genColumn = generator.genmodel.genindividualcomponent.gencolunm.\r\n\t\tGencolunmFactory.eINSTANCE.createGenColumn();\r\ngenColumn.setTheColumn(column);\r\nString text = column.getName();\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = column.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\t\t\t\r\ngenColumn.createPropertiesColumn(text, fontSize);\r\n\r\nif(column.getTheStyle() != null) {\r\n\tgenColumn = (GenColumn) setApperances(column, genColumn);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Alignment\")) {\r\n\t\t\tgenerator.apperance.alignment.Alignment a = generator.apperance.alignment.\r\n\t\t\t\t\tAlignmentFactory.eINSTANCE.createAlignment();\r\n\t\t\ta.setValue(propertie.getValue());\r\n\t\t\tgenColumn.setTheAlignment(a);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genColumn;'"
	 * @generated
	 */
	GenColumn createGenColumn(Column column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenComboBox genCombo = generator.genmodel.genindividualcomponent.gencombobox.\r\n\t\tGencomboboxFactory.eINSTANCE.createGenComboBox();\r\ngenCombo.setTheComboBox(combo);\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = combo.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\ngenCombo.createPropertiesComboBox(fontSize);\r\n\r\nif(combo.getTheStyle() != null) {\r\n\tgenCombo = (GenComboBox) setApperances(combo, genCombo);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Background\")) {\r\n\t\t\tgenerator.apperance.background.Background b = generator.apperance.background.\r\n\t\t\t\t\tBackgroundFactory.eINSTANCE.createBackground();\r\n\t\t\tb.setValue(propertie.getValue());\r\n\t\t\tgenCombo.setTheBackground(b);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genCombo;'"
	 * @generated
	 */
	GenComboBox createGenComboBox(ComboBox combo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenLabel genLabel = generator.genmodel.genindividualcomponent.genlabel.\r\n\t\tGenlabelFactory.eINSTANCE.createGenLabel();\r\ngenLabel.setTheLabel(label);\r\nString text = label.getName();\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = label.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\ngenLabel.createPropertiesLabel(text, fontSize);\r\n\r\nif(label.getTheStyle() != null) {\r\n\tgenLabel = (GenLabel) setApperances(label, genLabel);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Alignment\")) {\r\n\t\t\tgenerator.apperance.alignment.Alignment a = generator.apperance.alignment.\r\n\t\t\t\t\tAlignmentFactory.eINSTANCE.createAlignment();\r\n\t\t\ta.setValue(propertie.getValue());\r\n\t\t\tgenLabel.setTheAlignment(a);\r\n\t\t} else if(propertie.getName().equals(\"Background\")) {\r\n\t\t\tgenerator.apperance.background.Background b = generator.apperance.background.\r\n\t\t\t\t\tBackgroundFactory.eINSTANCE.createBackground();\r\n\t\t\tb.setValue(propertie.getValue());\r\n\t\t\tgenLabel.setTheBackground(b);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genLabel;'"
	 * @generated
	 */
	GenLabel createGenLabel(Label label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenTable genTable = generator.genmodel.genindividualcomponent.gentable.\r\n\t\tGentableFactory.eINSTANCE.createGenTable();\r\ngenTable.setTheTable(table);\r\nint columnsWidth = 0;\r\nint columnHeight = 0;\r\nfor(int i=0;i&lt;table.getListColumn().size();i++){\r\n\tGenColumn genColumn = createGenColumn(table.getListColumn().get(i));\r\n\tcolumnsWidth += genColumn.getTheWidth().getValue();\r\n\tcolumnHeight = genColumn.getTheHeight().getValue();\r\n\tgenTable.getListGenColumns().add(genColumn);\r\n}\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = table.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\ngenTable.createPropertiesTable(columnHeight, columnsWidth, fontSize);\r\nif(table.getTheStyle() != null) {\r\n\tgenTable = (GenTable) setApperances(table, genTable);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Background\")) {\r\n\t\t\tgenerator.apperance.background.Background b = generator.apperance.background.\r\n\t\t\t\t\tBackgroundFactory.eINSTANCE.createBackground();\r\n\t\t\tb.setValue(propertie.getValue());\r\n\t\t\tgenTable.setTheBackground(b);\r\n\t\t} else if(propertie.getName().equals(\"Lines Visible\")) {\r\n\t\t\tgenerator.apperance.linesvisible.LinesVisible l = generator.apperance.linesvisible.\r\n\t\t\t\t\tLinesvisibleFactory.eINSTANCE.createLinesVisible();\r\n\t\t\tl.setValue(propertie.getValue().equals(\"True\"));\r\n\t\t\tgenTable.setTheLinesVisible(l);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genTable;'"
	 * @generated
	 */
	GenTable createGenTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='GenTextField genText = generator.genmodel.genindividualcomponent.gentextfield.\r\n\t\tGentextfieldFactory.eINSTANCE.createGenTextField();\t\t\r\ngenText.setTheTextField(text);\r\nstyles.domain.Propertie fontSize = null;\r\nEList&lt;styles.domain.Propertie&gt; listProperties = text.getTheStyle().\r\n\t\tgetTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tif(listProperties.get(i).getName().equals(\"Font Size\")) {\r\n\t\tfontSize = listProperties.get(i);\r\n\t\tbreak;\r\n\t}\r\n}\r\ngenText.createPropertiesTextField(fontSize);\r\n\r\nif(text.getTheStyle() != null) {\r\n\tgenText = (GenTextField) setApperances(text, genText);\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\t\r\n\t\tif(propertie.getName().equals(\"Background\")) {\r\n\t\t\tgenerator.apperance.background.Background b = generator.apperance.background.\r\n\t\t\t\t\tBackgroundFactory.eINSTANCE.createBackground();\r\n\t\t\tb.setValue(propertie.getValue());\r\n\t\t\tgenText.setTheBackground(b);\r\n\t\t}\r\n\t}\r\n}\r\nreturn genText;'"
	 * @generated
	 */
	GenTextField createGenTextField(TextField text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;styles.domain.Propertie&gt; listProperties = element.getTheStyle().getTheCharacteristic().getListProperties();\r\nfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\tstyles.domain.Propertie propertie = listProperties.get(i);\r\n\t\r\n\tif(propertie.getName().equals(\"X\")) {\r\n\t\tgenerator.apperance.position.X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();\r\n\t\tx.setValue(Integer.parseInt(propertie.getValue()));\r\n\t\tgenElement.setTheX(x);\r\n\t} else if(propertie.getName().equals(\"Y\")) {\r\n\t\tgenerator.apperance.position.Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();\r\n\t\ty.setValue(Integer.parseInt(propertie.getValue()));\r\n\t\tgenElement.setTheY(y);\r\n\t} else if(propertie.getName().equals(\"Width\")) {\r\n\t\tgenerator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\t\tw.setValue(Integer.parseInt(propertie.getValue()));\r\n\t\tgenElement.setTheWidth(w);\r\n\t} else if(propertie.getName().equals(\"Height\")) {\r\n\t\tgenerator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\t\th.setValue(Integer.parseInt(propertie.getValue()));\r\n\t\tgenElement.setTheHeight(h);\r\n\t} else if(propertie.getName().equals(\"Font Color\")) {\r\n\t\tgenerator.apperance.font.Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();\r\n\t\tc.setValue(propertie.getValue());\r\n\t\tgenElement.setTheColor(c);\r\n\t} else if(propertie.getName().equals(\"Font Type\")) {\r\n\t\tgenerator.apperance.font.Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();\r\n\t\tt.setValue(propertie.getValue());\r\n\t\tgenElement.setTheType(t);\r\n\t} else if(propertie.getName().equals(\"Font Size\")) {\r\n\t\tgenerator.apperance.font.Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();\r\n\t\ts.setValue(Integer.parseInt(propertie.getValue()));\r\n\t\tgenElement.setTheSize(s);\r\n\t} \r\n}\r\n\r\nreturn genElement;'"
	 * @generated
	 */
	GenElement setApperances(Element element, GenElement genElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tGenerator gen = this;\r\n\t\t\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/generator.generator\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\tresource.getContents().add(gen);\r\n\t\ttry {\r\n\t\t\tresource.save(java.util.Collections.EMPTY_MAP);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}'"
	 * @generated
	 */
	void saveGenModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tGenerator gen = null;\r\n\t\t\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/generator.generator\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\ttry {\r\n\t\t\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\t\t\tgen = (Generator) resource.getContents().get(0);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn gen;'"
	 * @generated
	 */
	Generator loadGenModel();

} // Generator
