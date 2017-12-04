/**
 */
package compilator.ui;

import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.ExpressionContainer#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getExpressionContainer()
 * @model
 * @generated
 */
public interface ExpressionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getTheExpressionContainer <em>The Expression Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see compilator.ui.UiPackage#getExpressionContainer_UI()
	 * @see compilator.ui.UI#getTheExpressionContainer
	 * @model opposite="theExpressionContainer"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link compilator.ui.ExpressionContainer#getUI <em>UI</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint i =0;\r\n\t\tString formated=\"\";\r\n\t\twhile(t.charAt(i)!=\';\'){\r\n\t\t\tchar c = t.charAt(i);\r\n\t\t\tif(c!=\'\\n\' &amp;&amp; c!=\'\\r\' &amp;&amp; c!=\'\\t\' &amp;&amp; c!=\' \')\r\n\t\t\t\tformated+=t.charAt(i);\r\n\t\t\ti++;\r\n\t\t}\r\n\t\treturn formated;'"
	 * @generated
	 */
	String getFormatedString(String t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUI().createExpressionModel(getFormatedString(expressionString), tokens,components,elementStyles);'"
	 * @generated
	 */
	String createExpressionModel(String expressionString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUI().createEModelFromUnpackedExpression(getFormatedString(expressionString), tokens,components,elementStyles);'"
	 * @generated
	 */
	boolean createEModelFromUnpackedExpression(String expressionString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

} // ExpressionContainer
