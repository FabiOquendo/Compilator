/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel <em>The Label</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheInputElement <em>The Input Element</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends IndividualElement {
	/**
	 * Returns the value of the '<em><b>The Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Label</em>' containment reference.
	 * @see #setTheLabel(Label)
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getAttribute_TheLabel()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Label#getAttribute
	 * @model opposite="Attribute" containment="true" required="true"
	 * @generated
	 */
	Label getTheLabel();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheLabel <em>The Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Label</em>' containment reference.
	 * @see #getTheLabel()
	 * @generated
	 */
	void setTheLabel(Label value);

	/**
	 * Returns the value of the '<em><b>The Input Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.InputElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Input Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Input Element</em>' containment reference.
	 * @see #setTheInputElement(InputElement)
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getAttribute_TheInputElement()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.InputElement#getAttribute
	 * @model opposite="Attribute" containment="true" required="true"
	 * @generated
	 */
	InputElement getTheInputElement();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.individualcomponent.Attribute#getTheInputElement <em>The Input Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Input Element</em>' containment reference.
	 * @see #getTheInputElement()
	 * @generated
	 */
	void setTheInputElement(InputElement value);

} // Attribute
