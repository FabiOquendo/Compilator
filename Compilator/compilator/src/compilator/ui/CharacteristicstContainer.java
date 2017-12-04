/**
 */
package compilator.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristicst Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.CharacteristicstContainer#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @see compilator.ui.UiPackage#getCharacteristicstContainer()
 * @model
 * @generated
 */
public interface CharacteristicstContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getTheCharacteristicstContainer <em>The Characteristicst Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UI</em>' container reference.
	 * @see #setUI(UI)
	 * @see compilator.ui.UiPackage#getCharacteristicstContainer_UI()
	 * @see compilator.ui.UI#getTheCharacteristicstContainer
	 * @model opposite="theCharacteristicstContainer"
	 * @generated
	 */
	UI getUI();

	/**
	 * Sets the value of the '{@link compilator.ui.CharacteristicstContainer#getUI <em>UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UI</em>' container reference.
	 * @see #getUI()
	 * @generated
	 */
	void setUI(UI value);

} // CharacteristicstContainer
