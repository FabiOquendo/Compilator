/**
 */
package compilator.domain.generator;

import compilator.domain.expression.Expression;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;

import compilator.domain.expression.expressionmodel.containercomponent.Container;

import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.ExpressionModelGenerator#getComponents <em>Components</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelGenerator#getTextComponents <em>Text Components</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelGenerator#getComponentsStyles <em>Components Styles</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelGenerator#getExpressionManager <em>Expression Manager</em>}</li>
 * </ul>
 *
 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelGenerator()
 * @model
 * @generated
 */
public interface ExpressionModelGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' attribute.
	 * @see #setComponents(TreeMap)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelGenerator_Components()
	 * @model dataType="compilator.domain.datatypes.util.TreeMap"
	 * @generated
	 */
	TreeMap getComponents();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelGenerator#getComponents <em>Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' attribute.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(TreeMap value);

	/**
	 * Returns the value of the '<em><b>Text Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Components</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Components</em>' attribute.
	 * @see #setTextComponents(TreeSet)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelGenerator_TextComponents()
	 * @model dataType="compilator.domain.datatypes.util.TreeSet"
	 * @generated
	 */
	TreeSet getTextComponents();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelGenerator#getTextComponents <em>Text Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Components</em>' attribute.
	 * @see #getTextComponents()
	 * @generated
	 */
	void setTextComponents(TreeSet value);

	/**
	 * Returns the value of the '<em><b>Components Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Styles</em>' attribute.
	 * @see #setComponentsStyles(TreeMap)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelGenerator_ComponentsStyles()
	 * @model dataType="compilator.domain.datatypes.util.TreeMap"
	 * @generated
	 */
	TreeMap getComponentsStyles();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelGenerator#getComponentsStyles <em>Components Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Styles</em>' attribute.
	 * @see #getComponentsStyles()
	 * @generated
	 */
	void setComponentsStyles(TreeMap value);

	/**
	 * Returns the value of the '<em><b>Expression Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.generator.ExpressionModelManager#getExpressionGenerator <em>Expression Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Manager</em>' reference.
	 * @see #setExpressionManager(ExpressionModelManager)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelGenerator_ExpressionManager()
	 * @see compilator.domain.generator.ExpressionModelManager#getExpressionGenerator
	 * @model opposite="expressionGenerator" required="true"
	 * @generated
	 */
	ExpressionModelManager getExpressionManager();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelGenerator#getExpressionManager <em>Expression Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Manager</em>' reference.
	 * @see #getExpressionManager()
	 * @generated
	 */
	void setExpressionManager(ExpressionModelManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tjava.lang.Object [] elements = expressionManager.split(s).toArray();\r\n\t\r\n\tfor(int i=0;i&lt;elements.length;i++){\r\n\t\t\r\n\t\tString textElement =  (String)elements[i];\r\n\t\t\r\n\t\tif(components.containsKey(textElement)){\r\n\t\t\t\r\n\t\t\tcompilator.domain.shapes.Component component  = (compilator.domain.shapes.Component)components.get(textElement); \r\n\t\t\tcompilator.domain.expression.expressionmodel.Element e = org.eclipse.emf.ecore.util.EcoreUtil.copy(component.getTheElement());\r\n\t\t\t//TODO\r\n\t\t\tgetComponentStyles(e);\r\n\t\t\ttextComponents.add(textElement);\r\n\t\t\tparent.getListElements().add(e);\r\n\t\t}\r\n\t\telse if(expressionManager.isContainer(textElement)){\r\n\t\t\t\r\n\t\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\t\texploreSentence(body,container);\r\n\t\t\tparent.getListElements().add(container);\r\n\t\t\r\n\t\t}else{\r\n\t\t\tparent.getListElements().add(expressionManager.createIndividualElement(textElement));\r\n\t\t}\r\n\t}'"
	 * @generated
	 */
	void exploreSentence(String s, Container parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\ttextComponents = new TreeSet&lt;String&gt;();\r\n\t\r\n\tcomponentsStyles = new TreeMap&lt;String, TreeSet&lt;String&gt;&gt;();\r\n\t\r\n\tcompilator.domain.expression.Expression expression = compilator.domain.expression.ExpressionFactory.eINSTANCE.createExpression();\r\n\t\r\n\tcompilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();\r\n\t\r\n\tcompilator.domain.expression.expressionmodel.ExpressionModel model = compilator.domain.expression.expressionmodel.ExpressionmodelFactory.eINSTANCE.createExpressionModel();\r\n\t\r\n\tsentence.setCompressedSentence(unformatedSentence);\r\n\t\r\n\texpression.setTheSentence(sentence);\r\n\t\r\n\tjava.lang.Object [] elements = expressionManager.split(formatedSentence).toArray();\r\n\t\r\n\t\r\n\tfor(int i=0;i&lt;elements.length;i++){\r\n\t\t\r\n\t\tString textElement = (String) elements[i];\r\n\t\t\r\n\t\tif(components.containsKey(textElement)){\r\n\t\t\t\r\n\t\t\tcompilator.domain.shapes.Component component  = (compilator.domain.shapes.Component)components.get(textElement); \r\n\t\t\t\r\n\t\t\tcompilator.domain.expression.expressionmodel.Element e = org.eclipse.emf.ecore.util.EcoreUtil.copy(component.getTheElement());\r\n\r\n\t\t\tgetComponentStyles(e);\r\n\t\t\t\r\n\t\t\tmodel.getListElements().add(e);\r\n\t\t\t\r\n\t\t\ttextComponents.add(textElement);\r\n\t\t\t\r\n\t\t}\r\n\t\telse if(expressionManager.isContainer(textElement)){\r\n\t\t\t\r\n\t\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\t\r\n\t\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\t\t\r\n\t\t\texploreSentence(body,container);\r\n\t\t\tmodel.getListElements().add(container);\r\n\t\t}else{\r\n\t\t\tmodel.getListElements().add(expressionManager.createIndividualElement(textElement));\r\n\t\t}\r\n\t}\r\n\texpression.setTheExpressionModel(model);\r\n\treturn expression;'"
	 * @generated
	 */
	Expression createExpressionModel(String formatedSentence, String unformatedSentence);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString textExpression=\"\";\r\n\t\tfor(int i=0;i&lt;model.getListElements().size();i++){\r\n\t\t\tcompilator.domain.expression.expressionmodel.Element element = model.getListElements().get(i);\r\n\t\t\tString textElement;\r\n\t\t\tif(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){\r\n\t\t\t\t\r\n\t\t\t\ttextElement = getTextExpressionContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)element);\r\n\t\t\t\ttextExpression += (i==0)? textElement: \",\" + textElement; \r\n\t\t\t}else{\r\n\t\t\t\ttextElement = getTextElement(element);\r\n\t\t\t\ttextExpression+= (i==0)? textElement: \",\" + textElement ;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn textExpression+\";\";'"
	 * @generated
	 */
	String unpackStringExpression(ExpressionModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString textExpression= c.getName()+c.getOrientation()+\"[\";\r\n\t\t\r\n\t\tfor(int i=0;i&lt;c.getListElements().size();i++){\r\n\t\t\t\r\n\t\t\tcompilator.domain.expression.expressionmodel.Element element = c.getListElements().get(i);\r\n\t\t\t\r\n\t\t\tString textElement;\r\n\t\t\tif(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){\r\n\t\t\t\t\r\n\t\t\t\ttextElement = getTextExpressionContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)element);\r\n\t\t\t\ttextExpression += (i==0)? textElement: \",\" + textElement; \r\n\t\t\t}else{\r\n\t\t\t\ttextElement = getTextElement(element);\r\n\t\t\t\ttextExpression+= (i==0)? textElement: \",\" + textElement ;\r\n\t\t\t}\r\n\t\t}\r\n\t\ttextExpression+=\"]\";\r\n\t\treturn textExpression;'"
	 * @generated
	 */
	String getTextExpressionContainer(Container c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString ans=element.getName();\r\n\t\t\r\n\t\tif(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button){\r\n\t\t\tans = \"btn_\"+ans;\r\n\t\t}\r\n\t\telse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox){\r\n\t\t\tans = \"*\"+ans;\r\n\t\t}\r\n\t\telse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label){\r\n\t\t\tans = \"lbl_\"+ans;\r\n\t\t}\r\n\t\telse if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField){\r\n\t\t\tans = \"txt_\"+ans;\r\n\t\t}\r\n\t\telse if( element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table){\r\n\t\t\tans = getTableText(element);\r\n\t\t}\r\n\t\treturn ans;'"
	 * @generated
	 */
	String getTextElement(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t compilator.domain.expression.expressionmodel.individualcomponent.Table table = ( compilator.domain.expression.expressionmodel.individualcomponent.Table)element;\r\n\t\t \r\n\t\t String ans = table.getName()+\"&lt;\";\r\n\t\t \r\n\t\t for(int i=0;i&lt;table.getListColumn().size();i++){\r\n\t\t\t String name = table.getListColumn().get(i).getName();\r\n\t\t\t ans +=(i==0)? name: \",\" + name;\r\n\t\t }\r\n\t\t return ans+\"&gt;\";'"
	 * @generated
	 */
	String getTableText(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='getContainerStyles((compilator.domain.expression.expressionmodel.containercomponent.Container) element);'"
	 * @generated
	 */
	void getComponentStyles(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(c.getTheSytle() != null) {\r\n\tif(componentsStyles.containsKey(c.getTheSytle().getName())) {\r\n\t\tTreeSet&lt;String&gt; set = (TreeSet&lt;String&gt;) componentsStyles.get(c.getTheSytle().getName());\r\n\t\tset.add(c.getName());\r\n\t\tcomponentsStyles.put(c.getTheSytle().getName(), set);\r\n\t} else {\r\n\t\tTreeSet&lt;String&gt; set = new TreeSet&lt;String&gt;();\r\n\t\tset.add(c.getName());\r\n\t\tcomponentsStyles.put(c.getTheSytle().getName(), set);\r\n\t}\r\n}\r\n\r\nfor(int i=0;i&lt;c.getListElements().size();i++){\r\n\tcompilator.domain.expression.expressionmodel.Element element = c.getListElements().get(i);\r\n\tif(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){\r\n\t\tgetContainerStyles((compilator.domain.expression.expressionmodel.containercomponent.Container)element);\r\n\t}else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table) {\r\n\t\tgetTableStyle(element);\r\n\t}else {\r\n\t\tgetElementStyle(element);\r\n\t}\r\n}'"
	 * @generated
	 */
	void getContainerStyles(Container c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=' compilator.domain.expression.expressionmodel.individualcomponent.Table table = (compilator.domain.expression.expressionmodel.individualcomponent.Table) element;\r\n \r\n if(table.getTheSytle() != null) {\r\n\tif(componentsStyles.containsKey(table.getTheSytle().getName())) {\r\n\t\tTreeSet&lt;String&gt; set = (TreeSet&lt;String&gt;) componentsStyles.get(table.getTheSytle().getName());\r\n\t\tset.add(table.getName());\r\n\t\tcomponentsStyles.put(table.getTheSytle().getName(), set);\r\n\t} else {\r\n\t\tTreeSet&lt;String&gt; set = new TreeSet&lt;String&gt;();\r\n\t\tset.add(table.getName());\r\n\t\tcomponentsStyles.put(table.getTheSytle().getName(), set);\r\n\t}\r\n}\r\n \r\nfor(int i=0;i&lt;table.getListColumn().size();i++){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.Column column = table.getListColumn().get(i);\r\n\tif(column.getTheSytle() != null) {\r\n\t\tif(componentsStyles.containsKey(column.getTheSytle().getName())) {\r\n\t\t\tTreeSet&lt;String&gt; set = (TreeSet&lt;String&gt;) componentsStyles.get(column.getTheSytle().getName());\r\n\t\t\tset.add(column.getName());\r\n\t\t\tcomponentsStyles.put(column.getTheSytle().getName(), set);\r\n\t\t} else {\r\n\t\t\tTreeSet&lt;String&gt; set = new TreeSet&lt;String&gt;();\r\n\t\t\tset.add(column.getName());\r\n\t\t\tcomponentsStyles.put(column.getTheSytle().getName(), set);\r\n\t\t}\r\n\t}\r\n}'"
	 * @generated
	 */
	void getTableStyle(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(element.getTheSytle() != null) {\r\n\tif(componentsStyles.containsKey(element.getTheSytle().getName())) {\r\n\t\tTreeSet&lt;String&gt; set = (TreeSet&lt;String&gt;) componentsStyles.get(element.getTheSytle().getName());\r\n\t\tset.add(getTextElement(element));\r\n\t\tcomponentsStyles.put(element.getTheSytle().getName(), set);\r\n\t} else {\r\n\t\tTreeSet&lt;String&gt; set = new TreeSet&lt;String&gt;();\r\n\t\tset.add(getTextElement(element));\r\n\t\tcomponentsStyles.put(element.getTheSytle().getName(), set);\r\n\t}\r\n}'"
	 * @generated
	 */
	void getElementStyle(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String text = \"\";\r\nfillAdditionalElementStyles(elementStyles);\r\nfor(Object entry : componentsStyles.entrySet()) {\r\n\tjava.util.Map.Entry&lt;String, TreeSet&lt;String&gt;&gt; en = (java.util.Map.Entry&lt;String, TreeSet&lt;String&gt;&gt;)entry;\r\n\tString key = en.getKey();\r\n\t  TreeSet&lt;String&gt; set = en.getValue();\r\n\t  text += key + \" {\\n\";\r\n\t  int i=0;\r\n\t  for(String s : set) {\r\n\t\t  text += \"\\t\" + s;\r\n\t\t  if(i &lt; set.size()-1) {\r\n\t\t\t  text += \",\";\r\n\t\t  }\r\n\t\t  text += \"\\n\";\r\n\t\t  i++;\r\n\t  }\r\n\t  text += \"};\\n\\n\";\r\n}\r\nreturn text;'"
	 * @generated
	 */
	String getTextComponentsStyles(TreeMap elementStyles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(Object entry : elementStyles.entrySet()) {\r\n\tjava.util.Map.Entry&lt;String, styles.domain.Style &gt; en = (java.util.Map.Entry&lt;String, \r\n\t\t\tstyles.domain.Style&gt;)entry;\r\n\tString key = en.getKey();\r\n\tstyles.domain.Style s = en.getValue();\r\n\t\r\n\tif(componentsStyles.containsKey(s.getName())) {\r\n\t\tTreeSet&lt;String&gt; set = (TreeSet&lt;String&gt;) componentsStyles.get(s.getName());\r\n\t\tset.add(key);\r\n\t\tcomponentsStyles.put(s.getName(), set);\r\n\t} else {\r\n\t\tTreeSet&lt;String&gt; set = new TreeSet&lt;String&gt;();\r\n\t\tset.add(key);\r\n\t\tcomponentsStyles.put(s.getName(), set);\r\n\t}\r\n}'"
	 * @generated
	 */
	void fillAdditionalElementStyles(TreeMap elementStyles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='compilator.domain.expression.Expression expression = compilator.domain.expression.ExpressionFactory.eINSTANCE.createExpression();\r\n\r\ncompilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();\r\n\r\ncompilator.domain.expression.expressionmodel.ExpressionModel model = compilator.domain.expression.expressionmodel.ExpressionmodelFactory.eINSTANCE.createExpressionModel();\r\n\r\nsentence.setCompressedSentence(formatedString);\r\n\r\nexpression.setTheSentence(sentence);\r\n\r\njava.lang.Object [] elements = expressionManager.split(formatedString).toArray();\r\n\r\nboolean f = true;\r\nfor(int i=0;i&lt;elements.length &amp;&amp; f;i++){\r\n\t\r\n\tString textElement = (String) elements[i];\r\n\t\r\n\tif(components.containsKey(textElement)){\r\n\t\tf=false;\t\t\t\t\r\n\t}\r\n\telse if(expressionManager.isContainer(textElement)){\r\n\t\t\r\n\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\r\n\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\t\r\n\t\tf = f &amp;&amp; exploreUnpackedSentences(body,container);\r\n\t\tmodel.getListElements().add(container);\r\n\t}else{\r\n\t\tmodel.getListElements().add(expressionManager.createIndividualElement(textElement));\r\n\t}\r\n}\r\nexpression.setTheExpressionModel(model);\r\nreturn (f)?expression:null;'"
	 * @generated
	 */
	Expression createEModelFromUnpackedExpression(String formatedString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Object [] elements = expressionManager.split(s).toArray();\r\n\r\nboolean f  = true;\r\nfor(int i=0;i&lt;elements.length &amp;&amp; f;i++){\r\n\t\r\n\tString textElement =  (String)elements[i];\r\n\t\r\n\tif(components.containsKey(textElement)){\r\n\t\tf = false;\r\n\t}\r\n\telse if(expressionManager.isContainer(textElement)){\r\n\t\t\r\n\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\tf = f &amp;&amp; exploreUnpackedSentences(body,container);\r\n\t\tparent.getListElements().add(container);\r\n\t\r\n\t}else{\r\n\t\tparent.getListElements().add(expressionManager.createIndividualElement(textElement));\r\n\t}\r\n}\r\n\r\nreturn f;'"
	 * @generated
	 */
	boolean exploreUnpackedSentences(String s, Container parent);

} // ExpressionModelGenerator
