/**
 */
package generator.apperance.background;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.background.Background#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.background.Background#getGenComboBox <em>Gen Combo Box</em>}</li>
 *   <li>{@link generator.apperance.background.Background#getGenTextField <em>Gen Text Field</em>}</li>
 *   <li>{@link generator.apperance.background.Background#getGenLabel <em>Gen Label</em>}</li>
 *   <li>{@link generator.apperance.background.Background#getGenTable <em>Gen Table</em>}</li>
 *   <li>{@link generator.apperance.background.Background#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @see generator.apperance.background.BackgroundPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends EObject {
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
	 * @see generator.apperance.background.BackgroundPackage#getBackground_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Gen Combo Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Combo Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Combo Box</em>' container reference.
	 * @see #setGenComboBox(GenComboBox)
	 * @see generator.apperance.background.BackgroundPackage#getBackground_GenComboBox()
	 * @see generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheBackground
	 * @model opposite="theBackground"
	 * @generated
	 */
	GenComboBox getGenComboBox();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getGenComboBox <em>Gen Combo Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Combo Box</em>' container reference.
	 * @see #getGenComboBox()
	 * @generated
	 */
	void setGenComboBox(GenComboBox value);

	/**
	 * Returns the value of the '<em><b>Gen Text Field</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Text Field</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Text Field</em>' container reference.
	 * @see #setGenTextField(GenTextField)
	 * @see generator.apperance.background.BackgroundPackage#getBackground_GenTextField()
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground
	 * @model opposite="theBackground"
	 * @generated
	 */
	GenTextField getGenTextField();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getGenTextField <em>Gen Text Field</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Text Field</em>' container reference.
	 * @see #getGenTextField()
	 * @generated
	 */
	void setGenTextField(GenTextField value);

	/**
	 * Returns the value of the '<em><b>Gen Label</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Label</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Label</em>' container reference.
	 * @see #setGenLabel(GenLabel)
	 * @see generator.apperance.background.BackgroundPackage#getBackground_GenLabel()
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground
	 * @model opposite="theBackground"
	 * @generated
	 */
	GenLabel getGenLabel();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getGenLabel <em>Gen Label</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Label</em>' container reference.
	 * @see #getGenLabel()
	 * @generated
	 */
	void setGenLabel(GenLabel value);

	/**
	 * Returns the value of the '<em><b>Gen Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Table</em>' container reference.
	 * @see #setGenTable(GenTable)
	 * @see generator.apperance.background.BackgroundPackage#getBackground_GenTable()
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground
	 * @model opposite="theBackground"
	 * @generated
	 */
	GenTable getGenTable();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getGenTable <em>Gen Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Table</em>' container reference.
	 * @see #getGenTable()
	 * @generated
	 */
	void setGenTable(GenTable value);

	/**
	 * Returns the value of the '<em><b>Gen Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Container</em>' container reference.
	 * @see #setGenContainer(GenContainer)
	 * @see generator.apperance.background.BackgroundPackage#getBackground_GenContainer()
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground
	 * @model opposite="theBackground"
	 * @generated
	 */
	GenContainer getGenContainer();

	/**
	 * Sets the value of the '{@link generator.apperance.background.Background#getGenContainer <em>Gen Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Container</em>' container reference.
	 * @see #getGenContainer()
	 * @generated
	 */
	void setGenContainer(GenContainer value);

} // Background
