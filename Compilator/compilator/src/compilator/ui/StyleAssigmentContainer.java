/**
 */
package compilator.ui;

import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Assigment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.StyleAssigmentContainer#getText <em>Text</em>}</li>
 *   <li>{@link compilator.ui.StyleAssigmentContainer#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getStyleAssigmentContainer()
 * @model
 * @generated
 */
public interface StyleAssigmentContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see compilator.ui.UiPackage#getStyleAssigmentContainer_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link compilator.ui.StyleAssigmentContainer#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getTheStyleAssigmentContainer <em>The Style Assigment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see compilator.ui.UiPackage#getStyleAssigmentContainer_UI()
	 * @see compilator.ui.UI#getTheStyleAssigmentContainer
	 * @model opposite="theStyleAssigmentContainer"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link compilator.ui.StyleAssigmentContainer#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUI().unPackStyles();'"
	 * @generated
	 */
	String unPackStyles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String body =\"\";\r\nint i=0;\r\nwhile(i&lt; styleComponent.length() &amp;&amp; styleComponent.charAt(i)!=\'{\')i++;i++;\r\nwhile(i&lt; styleComponent.length() &amp;&amp; styleComponent.charAt(i)!=\'}\'){body+=styleComponent.charAt(i);i++;}\r\nreturn body;'"
	 * @generated
	 */
	String getStyleBody(String styleComponent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String name =\"\";\r\nint i=0;\r\nwhile(i&lt;styleComponent.length() &amp;&amp; styleComponent.charAt(i)!=\'{\' &amp;&amp; i&lt; styleComponent.length()){ \r\n\tname+=styleComponent.charAt(i);i++;\r\n}\r\nreturn name;'"
	 * @generated
	 */
	String getStyleName(String styleComponent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="compilator.domain.datatypes.util.TreeMap" stylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String [] stylesArray  = text.split(\";\");\r\nTreeMap elementsMap =  new TreeMap&lt;String, styles.domain.Style &gt;();\r\nfor(int i=0;i&lt;stylesArray.length;i++){\r\n\tString stylesComponent = stylesArray[i];\r\n\tString sytleName = getStyleName(stylesComponent);\r\n\tString styleBody = getStyleBody(stylesComponent);\r\n\tString [] elements = styleBody.split(\",\");\r\n\t\r\n\tfor(int j=0;j&lt;elements.length;j++){\r\n\t\telementsMap.put(elements[j],styles.get(sytleName) );\r\n\t}\r\n}\r\nreturn elementsMap;'"
	 * @generated
	 */
	TreeMap loadElementsStyles(TreeMap styles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int i =0;\r\nString formated=\"\";\r\nwhile(i&lt;t.length()){\r\n\tchar c = t.charAt(i);\r\n\tif(c!=\'\\n\' &amp;&amp; c!=\'\\r\' &amp;&amp; c!=\'\\t\' &amp;&amp; c!=\' \')\r\n\t\tformated+=t.charAt(i);\r\n\ti++;\r\n}\r\nreturn formated;'"
	 * @generated
	 */
	String getFormatedString(String t);

} // StyleAssigmentContainer
