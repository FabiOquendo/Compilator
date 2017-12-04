/**
 */
package compilator.domain.shapes;

import compilator.domain.Domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shapes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.shapes.Shapes#getDomain <em>Domain</em>}</li>
 *   <li>{@link compilator.domain.shapes.Shapes#getListComponents <em>List Components</em>}</li>
 * </ul>
 *
 * @see compilator.domain.shapes.ShapesPackage#getShapes()
 * @model
 * @generated
 */
public interface Shapes extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Domain#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see compilator.domain.shapes.ShapesPackage#getShapes_Domain()
	 * @see compilator.domain.Domain#getShapes
	 * @model opposite="Shapes"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link compilator.domain.shapes.Shapes#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>List Components</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.shapes.Component}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.shapes.Component#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Components</em>' containment reference list.
	 * @see compilator.domain.shapes.ShapesPackage#getShapes_ListComponents()
	 * @see compilator.domain.shapes.Component#getShapes
	 * @model opposite="Shapes" containment="true"
	 * @generated
	 */
	EList<Component> getListComponents();

} // Shapes
