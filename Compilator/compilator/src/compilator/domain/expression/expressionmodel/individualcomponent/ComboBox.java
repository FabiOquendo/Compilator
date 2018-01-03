/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.ComboBox#getTheItem <em>The Item</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getComboBox()
 * @model
 * @generated
 */
public interface ComboBox extends InputElement {
	/**
	 * Returns the value of the '<em><b>The Item</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.expressionmodel.individualcomponent.Item}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Item</em>' containment reference list.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getComboBox_TheItem()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Item#getComboBox
	 * @model opposite="ComboBox" containment="true"
	 * @generated
	 */
	EList<Item> getTheItem();

} // ComboBox
