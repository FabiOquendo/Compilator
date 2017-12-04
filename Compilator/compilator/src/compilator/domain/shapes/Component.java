/**
 */
package compilator.domain.shapes;

import compilator.domain.expression.expressionmodel.Element;

import compilator.domain.expression.sentence.Sentence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.shapes.Component#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.shapes.Component#getShapes <em>Shapes</em>}</li>
 *   <li>{@link compilator.domain.shapes.Component#getTheElement <em>The Element</em>}</li>
 *   <li>{@link compilator.domain.shapes.Component#getTheSentence <em>The Sentence</em>}</li>
 * </ul>
 *
 * @see compilator.domain.shapes.ShapesPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see compilator.domain.shapes.ShapesPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link compilator.domain.shapes.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.shapes.Shapes#getListComponents <em>List Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' container reference.
	 * @see #setShapes(Shapes)
	 * @see compilator.domain.shapes.ShapesPackage#getComponent_Shapes()
	 * @see compilator.domain.shapes.Shapes#getListComponents
	 * @model opposite="listComponents"
	 * @generated
	 */
	Shapes getShapes();

	/**
	 * Sets the value of the '{@link compilator.domain.shapes.Component#getShapes <em>Shapes</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' container reference.
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(Shapes value);

	/**
	 * Returns the value of the '<em><b>The Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.Element#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Element</em>' containment reference.
	 * @see #setTheElement(Element)
	 * @see compilator.domain.shapes.ShapesPackage#getComponent_TheElement()
	 * @see compilator.domain.expression.expressionmodel.Element#getComponent
	 * @model opposite="Component" containment="true" required="true"
	 * @generated
	 */
	Element getTheElement();

	/**
	 * Sets the value of the '{@link compilator.domain.shapes.Component#getTheElement <em>The Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Element</em>' containment reference.
	 * @see #getTheElement()
	 * @generated
	 */
	void setTheElement(Element value);

	/**
	 * Returns the value of the '<em><b>The Sentence</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.sentence.Sentence#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Sentence</em>' containment reference.
	 * @see #setTheSentence(Sentence)
	 * @see compilator.domain.shapes.ShapesPackage#getComponent_TheSentence()
	 * @see compilator.domain.expression.sentence.Sentence#getComponent
	 * @model opposite="Component" containment="true" required="true"
	 * @generated
	 */
	Sentence getTheSentence();

	/**
	 * Sets the value of the '{@link compilator.domain.shapes.Component#getTheSentence <em>The Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Sentence</em>' containment reference.
	 * @see #getTheSentence()
	 * @generated
	 */
	void setTheSentence(Sentence value);

} // Component
