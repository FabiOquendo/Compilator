/**
 */
package compilator.domain.expression.expressionmodel.containercomponent;

import compilator.domain.expression.expressionmodel.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getListElements <em>List Elements</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getIsVisible <em>Is Visible</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage#getContainerElement()
 * @model abstract="true"
 * @generated
 */
public interface ContainerElement extends Element {
	/**
	 * Returns the value of the '<em><b>List Elements</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.expressionmodel.Element}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.Element#getContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elements</em>' containment reference list.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage#getContainerElement_ListElements()
	 * @see compilator.domain.expression.expressionmodel.Element#getContainerElement
	 * @model opposite="ContainerElement" containment="true"
	 * @generated
	 */
	EList<Element> getListElements();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage#getContainerElement_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #setIsVisible(Boolean)
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage#getContainerElement_IsVisible()
	 * @model
	 * @generated
	 */
	Boolean getIsVisible();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible</em>' attribute.
	 * @see #getIsVisible()
	 * @generated
	 */
	void setIsVisible(Boolean value);

} // ContainerElement
