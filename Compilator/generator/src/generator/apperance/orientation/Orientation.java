/**
 */
package generator.apperance.orientation;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.orientation.Orientation#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.orientation.Orientation#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @see generator.apperance.orientation.OrientationPackage#getOrientation()
 * @model
 * @generated
 */
public interface Orientation extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.apperance.orientation.OrientationPackage#getOrientation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.orientation.Orientation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Gen Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheOrientation <em>The Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Container</em>' container reference.
	 * @see #setGenContainer(GenContainer)
	 * @see generator.apperance.orientation.OrientationPackage#getOrientation_GenContainer()
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheOrientation
	 * @model opposite="theOrientation"
	 * @generated
	 */
	GenContainer getGenContainer();

	/**
	 * Sets the value of the '{@link generator.apperance.orientation.Orientation#getGenContainer <em>Gen Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Container</em>' container reference.
	 * @see #getGenContainer()
	 * @generated
	 */
	void setGenContainer(GenContainer value);

} // Orientation
