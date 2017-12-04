/**
 */
package compilator.ui;

import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.ComponentsContainer#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getComponentsContainer()
 * @model
 * @generated
 */
public interface ComponentsContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getComponentsContainer <em>Components Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see compilator.ui.UiPackage#getComponentsContainer_UI()
	 * @see compilator.ui.UI#getComponentsContainer
	 * @model opposite="ComponentsContainer"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link compilator.ui.ComponentsContainer#getUI <em>UI</em>}' container reference.
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
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" elementStyleDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='getUI().createComponent(nameComponent,getFormatedString(expressionString),tokens,elementStyle);'"
	 * @generated
	 */
	void createComponent(String nameComponent, String expressionString, TreeMap tokens, TreeMap elementStyle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int i =0;\r\nString formated=\"\";\r\nwhile(t.charAt(i)!=\';\'){\r\n\tchar c = t.charAt(i);\r\n\tif(c!=\'\\n\' &amp;&amp; c!=\'\\r\' &amp;&amp; c!=\'\\t\' &amp;&amp; c!=\' \')\r\n\t\tformated+=t.charAt(i);\r\n\ti++;\r\n}\r\nreturn formated;'"
	 * @generated
	 */
	String getFormatedString(String t);

} // ComponentsContainer
