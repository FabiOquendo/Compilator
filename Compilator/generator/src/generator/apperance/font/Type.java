/**
 */
package generator.apperance.font;

import generator.genmodel.GenElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.font.Type#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.font.Type#getGenElement <em>Gen Element</em>}</li>
 * </ul>
 *
 * @see generator.apperance.font.FontPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
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
	 * @see generator.apperance.font.FontPackage#getType_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.font.Type#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Gen Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenElement#getTheType <em>The Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Element</em>' container reference.
	 * @see #setGenElement(GenElement)
	 * @see generator.apperance.font.FontPackage#getType_GenElement()
	 * @see generator.genmodel.GenElement#getTheType
	 * @model opposite="theType"
	 * @generated
	 */
	GenElement getGenElement();

	/**
	 * Sets the value of the '{@link generator.apperance.font.Type#getGenElement <em>Gen Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Element</em>' container reference.
	 * @see #getGenElement()
	 * @generated
	 */
	void setGenElement(GenElement value);

} // Type
