/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends IndividualElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel <em>The Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' container reference.
	 * @see #setAttribute(Attribute)
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getLabel_Attribute()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel
	 * @model opposite="theLabel"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute <em>Attribute</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' container reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // Label
