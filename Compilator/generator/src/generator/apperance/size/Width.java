/**
 */
package generator.apperance.size;

import generator.genmodel.GenElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Width</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.size.Width#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.size.Width#getGenElement <em>Gen Element</em>}</li>
 * </ul>
 *
 * @see generator.apperance.size.SizePackage#getWidth()
 * @model
 * @generated
 */
public interface Width extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see generator.apperance.size.SizePackage#getWidth_Value()
	 * @model
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.size.Width#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Gen Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenElement#getTheWidth <em>The Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Element</em>' container reference.
	 * @see #setGenElement(GenElement)
	 * @see generator.apperance.size.SizePackage#getWidth_GenElement()
	 * @see generator.genmodel.GenElement#getTheWidth
	 * @model opposite="theWidth"
	 * @generated
	 */
	GenElement getGenElement();

	/**
	 * Sets the value of the '{@link generator.apperance.size.Width#getGenElement <em>Gen Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Element</em>' container reference.
	 * @see #getGenElement()
	 * @generated
	 */
	void setGenElement(GenElement value);

} // Width
