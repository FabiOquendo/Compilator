/**
 */
package compilator.domain.generator;

import compilator.domain.expression.expressionmodel.Element;

import compilator.domain.expression.expressionmodel.containercomponent.Container;

import compilator.domain.expression.expressionmodel.individualcomponent.Table;

import java.util.ArrayList;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

import styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Model Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.ExpressionModelManager#getTokens <em>Tokens</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelManager#getBody <em>Body</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelManager#getElementStyle <em>Element Style</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelManager#getExpressionGenerator <em>Expression Generator</em>}</li>
 *   <li>{@link compilator.domain.generator.ExpressionModelManager#getComponentGenerator <em>Component Generator</em>}</li>
 * </ul>
 *
 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager()
 * @model
 * @generated
 */
public interface ExpressionModelManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(TreeMap)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager_Tokens()
	 * @model dataType="compilator.domain.datatypes.util.TreeMap"
	 * @generated
	 */
	TreeMap getTokens();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelManager#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(TreeMap value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelManager#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Element Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Style</em>' attribute.
	 * @see #setElementStyle(TreeMap)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager_ElementStyle()
	 * @model dataType="compilator.domain.datatypes.util.TreeMap"
	 * @generated
	 */
	TreeMap getElementStyle();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelManager#getElementStyle <em>Element Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Style</em>' attribute.
	 * @see #getElementStyle()
	 * @generated
	 */
	void setElementStyle(TreeMap value);

	/**
	 * Returns the value of the '<em><b>Expression Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.generator.ExpressionModelGenerator#getExpressionManager <em>Expression Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Generator</em>' reference.
	 * @see #setExpressionGenerator(ExpressionModelGenerator)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager_ExpressionGenerator()
	 * @see compilator.domain.generator.ExpressionModelGenerator#getExpressionManager
	 * @model opposite="expressionManager" required="true"
	 * @generated
	 */
	ExpressionModelGenerator getExpressionGenerator();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelManager#getExpressionGenerator <em>Expression Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Generator</em>' reference.
	 * @see #getExpressionGenerator()
	 * @generated
	 */
	void setExpressionGenerator(ExpressionModelGenerator value);

	/**
	 * Returns the value of the '<em><b>Component Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.generator.ComponentModelGenerator#getExpressionManager <em>Expression Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Generator</em>' reference.
	 * @see #setComponentGenerator(ComponentModelGenerator)
	 * @see compilator.domain.generator.GeneratorPackage#getExpressionModelManager_ComponentGenerator()
	 * @see compilator.domain.generator.ComponentModelGenerator#getExpressionManager
	 * @model opposite="expressionManager" required="true"
	 * @generated
	 */
	ComponentModelGenerator getComponentGenerator();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ExpressionModelManager#getComponentGenerator <em>Component Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Generator</em>' reference.
	 * @see #getComponentGenerator()
	 * @generated
	 */
	void setComponentGenerator(ComponentModelGenerator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return s.split(\"_\")[1];'"
	 * @generated
	 */
	String getName(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Table table = compilator.domain.expression.expressionmodel.\r\n\t\tindividualcomponent.IndividualcomponentFactory.eINSTANCE.createTable();\r\nString nameTable=\"\",body=\"\";\r\nint j =0;\r\nwhile(s.charAt(j)!=\'&lt;\'){ nameTable+=s.charAt(j);j++;} j++;\r\nwhile(s.charAt(j)!=\'&gt;\'){body+=s.charAt(j);j++;}\r\n\r\nstyles.domain.Style style = findStyleElement(nameTable);\r\nif(style!=null) table.setTheStyle(style);\r\n\r\nString [] columns = body.split(\",\");\r\n\r\nfor(int i=0;i&lt;columns.length;i++){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.\r\n\t\tColumn co = compilator.domain.expression.expressionmodel.individualcomponent.\r\n\t\tIndividualcomponentFactory.eINSTANCE.createColumn();\r\n\tco.setName(columns[i]);\r\n\tstyles.domain.Style styleColumn = findStyleElement(columns[i]);\r\n\tif(styleColumn!=null) co.setTheStyle(styleColumn);\r\n\ttable.getListColumn().add(co);\r\n}\r\ntable.setName(nameTable);\r\nreturn table;'"
	 * @generated
	 */
	Table createTable(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return s.contains(\"[\");'"
	 * @generated
	 */
	boolean isContainer(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Element e=null;\r\nstyles.domain.Style style;\r\n\r\nif(tokens.get(s)!=null &amp;&amp; tokens.get(s).equals(\"Boton\")){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.Button b = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createButton();\r\n\tb.setName(getName(s));\r\n\tstyle = findStyleElement(s);\r\n\tif(style!=null) b.setTheStyle(style);\r\n\te=b;\r\n}\r\nelse if(tokens.get(s)!=null &amp;&amp; tokens.get(s).equals(\"ComboBox\")){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.ComboBox cb = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createComboBox();\r\n\tcb.setName(s.substring(1));\r\n\tstyle = findStyleElement(cb.getName());\r\n\tif(style!=null) cb.setTheStyle(style);\r\n\te=cb;\r\n}\r\nelse if(tokens.get(s)!=null &amp;&amp; tokens.get(s).equals(\"Campo de Texto\")){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.TextField txt = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createTextField();\r\n\ttxt.setName(getName(s));\r\n\tstyle = findStyleElement(s);\r\n\tif(style!=null) txt.setTheStyle(style);\r\n\te = txt;\r\n}\r\nelse if(tokens.get(s)!=null &amp;&amp; tokens.get(s).equals(\"Label\")){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.Label l = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createLabel();\r\n\tl.setName(getName(s));\r\n\tstyle = findStyleElement(s);\r\n\tif(style!=null) l.setTheStyle(style);\r\n\te=l;\r\n}else if(tokens.get(s)!=null &amp;&amp; tokens.get(s).equals(\"Atributo\")){\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.Attribute a = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createAttribute();\r\n\ta.setName(s);\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.Label l = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createLabel();\r\n\tl.setName(s);\r\n\tstyle = findStyleElement(s);\r\n\tif(style!=null) l.setTheStyle(style);\r\n\ta.setTheLabel(l);\r\n\tcompilator.domain.expression.expressionmodel.individualcomponent.TextField txt = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createTextField();\r\n\ttxt.setName(s);\r\n\tstyle = findStyleElement(s);\r\n\tif(style!=null) txt.setTheStyle(style);\r\n\ta.setTheTextField(txt);\r\n\te=a;\r\n}else if(s.contains(\"&lt;\")){\r\n\tTable  t = createTable(s);\r\n\te = t;\r\n}\r\nreturn e;'"
	 * @generated
	 */
	Element createIndividualElement(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="compilator.domain.datatypes.util.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ArrayList&lt;String&gt; components=new ArrayList&lt;String&gt;();\r\nint f=0;\r\nString si=\"\";\r\nfor(int i=0;i&lt;s.length();i++){\r\n\tif(s.charAt(i)==\',\' &amp;&amp; f==0){\r\n\t\tcomponents.add(si);\r\n\t\tsi=\"\";\r\n\t\tcontinue;\r\n\t}\r\n\tf = (s.charAt(i)==\'[\' ||s.charAt(i)==\'&lt;\' )? f+1:f;\r\n\tf = (s.charAt(i)==\']\' ||s.charAt(i)==\'&gt;\' )? f-1:f;\r\n\tsi+=s.charAt(i);\r\n}\r\ncomponents.add(si);\r\nreturn components;'"
	 * @generated
	 */
	ArrayList split(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String nameContainer=\"\";\r\nString body=\"\";\r\nint j =0;\r\n\r\nwhile(textElement.charAt(j)!=\'[\'){\r\n\tnameContainer+=textElement.charAt(j);\r\n\tj++;\r\n}\r\nj++;\r\n\t\t\r\nString orientation =\"-|\";\r\nint lenghtName = nameContainer.length()-1;\r\n\r\nif(nameContainer.charAt( lenghtName)==\'|\' || nameContainer.charAt(lenghtName)==\'-\'){\r\n\torientation = nameContainer.substring(nameContainer.length()-2, nameContainer.length());\r\n\tnameContainer = nameContainer.substring(0, lenghtName-1);\r\n}\r\n\r\nstyles.domain.Style style = findStyleElement(nameContainer);\r\nif(style!=null) container.setTheStyle(style);\r\n\r\nint f=0;\r\nwhile(textElement.charAt(j)!=\']\' || f!=0){\r\n\tf = (textElement.charAt(j)==\'[\')? f+1:f;\r\n\tf = (textElement.charAt(j)==\']\')? f-1:f;\r\n\tbody+=textElement.charAt(j);j++;\r\n}\r\n\r\ncontainer.setName(nameContainer);\r\ncontainer.setOrientation(orientation);\r\ncontainer.setIsVisible( (textElement.charAt( textElement.length()-1)!=39 )  );\r\nreturn body;'"
	 * @generated
	 */
	String createContainer(String textElement, Container container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (Style) elementStyle.get(element);'"
	 * @generated
	 */
	Style findStyleElement(String element);

} // ExpressionModelManager
