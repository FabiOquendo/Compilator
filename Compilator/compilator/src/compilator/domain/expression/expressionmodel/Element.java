/**
 */
package compilator.domain.expression.expressionmodel;

import compilator.domain.expression.expressionmodel.containercomponent.ContainerElement;

import compilator.domain.shapes.Component;

import org.eclipse.emf.ecore.EObject;

import styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.Element#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.Element#getContainerElement <em>Container Element</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.Element#getExpressionModel <em>Expression Model</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.Element#getTheStyle <em>The Style</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.Element#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Element</em>' container reference.
	 * @see #setContainerElement(ContainerElement)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement_ContainerElement()
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getListElements
	 * @model opposite="listElements"
	 * @generated
	 */
	ContainerElement getContainerElement();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.Element#getContainerElement <em>Container Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Element</em>' container reference.
	 * @see #getContainerElement()
	 * @generated
	 */
	void setContainerElement(ContainerElement value);

	/**
	 * Returns the value of the '<em><b>Expression Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Model</em>' container reference.
	 * @see #setExpressionModel(ExpressionModel)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement_ExpressionModel()
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getListElements
	 * @model opposite="listElements"
	 * @generated
	 */
	ExpressionModel getExpressionModel();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.Element#getExpressionModel <em>Expression Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Model</em>' container reference.
	 * @see #getExpressionModel()
	 * @generated
	 */
	void setExpressionModel(ExpressionModel value);

	/**
	 * Returns the value of the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Style</em>' reference.
	 * @see #setTheStyle(Style)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement_TheStyle()
	 * @model required="true"
	 * @generated
	 */
	Style getTheStyle();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.Element#getTheStyle <em>The Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Style</em>' reference.
	 * @see #getTheStyle()
	 * @generated
	 */
	void setTheStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.shapes.Component#getTheElement <em>The Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see compilator.domain.expression.expressionmodel.ExpressionmodelPackage#getElement_Component()
	 * @see compilator.domain.shapes.Component#getTheElement
	 * @model opposite="theElement"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.Element#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // Element
