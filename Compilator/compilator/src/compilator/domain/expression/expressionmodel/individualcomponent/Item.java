/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox <em>Combo Box</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends IndividualElement {
	/**
	 * Returns the value of the '<em><b>Combo Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.ComboBox#getTheItem <em>The Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Box</em>' container reference.
	 * @see #setComboBox(ComboBox)
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getItem_ComboBox()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.ComboBox#getTheItem
	 * @model opposite="theItem"
	 * @generated
	 */
	ComboBox getComboBox();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox <em>Combo Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Box</em>' container reference.
	 * @see #getComboBox()
	 * @generated
	 */
	void setComboBox(ComboBox value);

} // Item
