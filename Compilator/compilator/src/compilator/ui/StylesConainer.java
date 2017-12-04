/**
 */
package compilator.ui;

import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

import styles.ModelFactoryStyles;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles Conainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.StylesConainer#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getStylesConainer()
 * @model
 * @generated
 */
public interface StylesConainer extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getStylesConainer <em>Styles Conainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see compilator.ui.UiPackage#getStylesConainer_UI()
	 * @see compilator.ui.UI#getStylesConainer
	 * @model opposite="StylesConainer"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link compilator.ui.StylesConainer#getUI <em>UI</em>}' container reference.
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
	 * @model dataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='styles.domain.StyleFactory styleFactory = mfStyles.getTheDomainStyles().getTheStyleFactory();\r\norg.eclipse.emf.common.util.EList&lt;styles.domain.Style&gt; list = styleFactory.getListStyle();\r\njava.util.TreeMap styles =  new java.util.TreeMap&lt;String, styles.domain.Style&gt;();\r\nfor(styles.domain.Style s : list) styles.put(s.getName(), s);\r\nreturn styles;'"
	 * @generated
	 */
	TreeMap loadStyles(ModelFactoryStyles mfStyles);

} // StylesConainer
