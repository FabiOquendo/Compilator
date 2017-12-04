/**
 */
package generator.apperance.alignment;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.alignment.Alignment#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.alignment.Alignment#getGenButton <em>Gen Button</em>}</li>
 *   <li>{@link generator.apperance.alignment.Alignment#getGenColumn <em>Gen Column</em>}</li>
 *   <li>{@link generator.apperance.alignment.Alignment#getGenLabel <em>Gen Label</em>}</li>
 * </ul>
 *
 * @see generator.apperance.alignment.AlignmentPackage#getAlignment()
 * @model
 * @generated
 */
public interface Alignment extends EObject {
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
	 * @see generator.apperance.alignment.AlignmentPackage#getAlignment_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.alignment.Alignment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Gen Button</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Button</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Button</em>' container reference.
	 * @see #setGenButton(GenButton)
	 * @see generator.apperance.alignment.AlignmentPackage#getAlignment_GenButton()
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment
	 * @model opposite="theAlignment"
	 * @generated
	 */
	GenButton getGenButton();

	/**
	 * Sets the value of the '{@link generator.apperance.alignment.Alignment#getGenButton <em>Gen Button</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Button</em>' container reference.
	 * @see #getGenButton()
	 * @generated
	 */
	void setGenButton(GenButton value);

	/**
	 * Returns the value of the '<em><b>Gen Column</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Column</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Column</em>' container reference.
	 * @see #setGenColumn(GenColumn)
	 * @see generator.apperance.alignment.AlignmentPackage#getAlignment_GenColumn()
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getTheAlignment
	 * @model opposite="theAlignment"
	 * @generated
	 */
	GenColumn getGenColumn();

	/**
	 * Sets the value of the '{@link generator.apperance.alignment.Alignment#getGenColumn <em>Gen Column</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Column</em>' container reference.
	 * @see #getGenColumn()
	 * @generated
	 */
	void setGenColumn(GenColumn value);

	/**
	 * Returns the value of the '<em><b>Gen Label</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment <em>The Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Label</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Label</em>' container reference.
	 * @see #setGenLabel(GenLabel)
	 * @see generator.apperance.alignment.AlignmentPackage#getAlignment_GenLabel()
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment
	 * @model opposite="theAlignment"
	 * @generated
	 */
	GenLabel getGenLabel();

	/**
	 * Sets the value of the '{@link generator.apperance.alignment.Alignment#getGenLabel <em>Gen Label</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Label</em>' container reference.
	 * @see #getGenLabel()
	 * @generated
	 */
	void setGenLabel(GenLabel value);

} // Alignment
