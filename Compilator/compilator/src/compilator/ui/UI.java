/**
 */
package compilator.ui;

import compilator.ModelFactory;

import compilator.domain.Domain;

import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link compilator.ui.UI#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.ui.UI#getTheCharacteristicstContainer <em>The Characteristicst Container</em>}</li>
 *   <li>{@link compilator.ui.UI#getStylesConainer <em>Styles Conainer</em>}</li>
 *   <li>{@link compilator.ui.UI#getComponentsContainer <em>Components Container</em>}</li>
 *   <li>{@link compilator.ui.UI#getTheExpressionContainer <em>The Expression Container</em>}</li>
 *   <li>{@link compilator.ui.UI#getTheStyleAssigmentContainer <em>The Style Assigment Container</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see compilator.ui.UiPackage#getUI_TheModelFactory()
	 * @see compilator.ModelFactory#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see compilator.ui.UiPackage#getUI_TheDomain()
	 * @see compilator.domain.Domain#getTheUI
	 * @model opposite="theUI" required="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Characteristicst Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.CharacteristicstContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Characteristicst Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Characteristicst Container</em>' containment reference.
	 * @see #setTheCharacteristicstContainer(CharacteristicstContainer)
	 * @see compilator.ui.UiPackage#getUI_TheCharacteristicstContainer()
	 * @see compilator.ui.CharacteristicstContainer#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	CharacteristicstContainer getTheCharacteristicstContainer();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getTheCharacteristicstContainer <em>The Characteristicst Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Characteristicst Container</em>' containment reference.
	 * @see #getTheCharacteristicstContainer()
	 * @generated
	 */
	void setTheCharacteristicstContainer(CharacteristicstContainer value);

	/**
	 * Returns the value of the '<em><b>Styles Conainer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.StylesConainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles Conainer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles Conainer</em>' containment reference.
	 * @see #setStylesConainer(StylesConainer)
	 * @see compilator.ui.UiPackage#getUI_StylesConainer()
	 * @see compilator.ui.StylesConainer#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	StylesConainer getStylesConainer();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getStylesConainer <em>Styles Conainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles Conainer</em>' containment reference.
	 * @see #getStylesConainer()
	 * @generated
	 */
	void setStylesConainer(StylesConainer value);

	/**
	 * Returns the value of the '<em><b>Components Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.ComponentsContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Container</em>' containment reference.
	 * @see #setComponentsContainer(ComponentsContainer)
	 * @see compilator.ui.UiPackage#getUI_ComponentsContainer()
	 * @see compilator.ui.ComponentsContainer#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ComponentsContainer getComponentsContainer();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getComponentsContainer <em>Components Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Container</em>' containment reference.
	 * @see #getComponentsContainer()
	 * @generated
	 */
	void setComponentsContainer(ComponentsContainer value);

	/**
	 * Returns the value of the '<em><b>The Expression Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.ExpressionContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Expression Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Expression Container</em>' containment reference.
	 * @see #setTheExpressionContainer(ExpressionContainer)
	 * @see compilator.ui.UiPackage#getUI_TheExpressionContainer()
	 * @see compilator.ui.ExpressionContainer#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	ExpressionContainer getTheExpressionContainer();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getTheExpressionContainer <em>The Expression Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Expression Container</em>' containment reference.
	 * @see #getTheExpressionContainer()
	 * @generated
	 */
	void setTheExpressionContainer(ExpressionContainer value);

	/**
	 * Returns the value of the '<em><b>The Style Assigment Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.StyleAssigmentContainer#getUI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Style Assigment Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Style Assigment Container</em>' containment reference.
	 * @see #setTheStyleAssigmentContainer(StyleAssigmentContainer)
	 * @see compilator.ui.UiPackage#getUI_TheStyleAssigmentContainer()
	 * @see compilator.ui.StyleAssigmentContainer#getUI
	 * @model opposite="UI" containment="true" required="true"
	 * @generated
	 */
	StyleAssigmentContainer getTheStyleAssigmentContainer();

	/**
	 * Sets the value of the '{@link compilator.ui.UI#getTheStyleAssigmentContainer <em>The Style Assigment Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Style Assigment Container</em>' containment reference.
	 * @see #getTheStyleAssigmentContainer()
	 * @generated
	 */
	void setTheStyleAssigmentContainer(StyleAssigmentContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" elementStyleDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='theDomain.createComponent(nameComponent,expressionString,tokens,elementStyle);'"
	 * @generated
	 */
	void createComponent(String nameComponent, String expressionString, TreeMap tokens, TreeMap elementStyle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return theDomain.createExpressionModel(expressionString, tokens,components,elementStyles);'"
	 * @generated
	 */
	String createExpressionModel(String expressionString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return theDomain.unPackStyles();'"
	 * @generated
	 */
	String unPackStyles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return theDomain.createEModelFromUnpackedExpression(formatedString, tokens,components,elementStyles);'"
	 * @generated
	 */
	boolean createEModelFromUnpackedExpression(String formatedString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

} // UI
