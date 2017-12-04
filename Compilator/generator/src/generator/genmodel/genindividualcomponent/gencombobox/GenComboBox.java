/**
 */
package generator.genmodel.genindividualcomponent.gencombobox;

import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;

import generator.apperance.background.Background;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheComboBox <em>The Combo Box</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage#getGenComboBox()
 * @model
 * @generated
 */
public interface GenComboBox extends GenIndividualElement {
	/**
	 * Returns the value of the '<em><b>The Background</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.background.Background#getGenComboBox <em>Gen Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Background</em>' containment reference.
	 * @see #setTheBackground(Background)
	 * @see generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage#getGenComboBox_TheBackground()
	 * @see generator.apperance.background.Background#getGenComboBox
	 * @model opposite="GenComboBox" containment="true" required="true"
	 * @generated
	 */
	Background getTheBackground();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheBackground <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Background</em>' containment reference.
	 * @see #getTheBackground()
	 * @generated
	 */
	void setTheBackground(Background value);

	/**
	 * Returns the value of the '<em><b>The Combo Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Combo Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Combo Box</em>' reference.
	 * @see #setTheComboBox(ComboBox)
	 * @see generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage#getGenComboBox_TheComboBox()
	 * @model required="true"
	 * @generated
	 */
	ComboBox getTheComboBox();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox#getTheComboBox <em>The Combo Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Combo Box</em>' reference.
	 * @see #getTheComboBox()
	 * @generated
	 */
	void setTheComboBox(ComboBox value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateBackground();\r\nsetDefaultCombo(fontSize);'"
	 * @generated
	 */
	void createPropertiesComboBox(Propertie fontSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\nthis.setTheBackground(b);'"
	 * @generated
	 */
	void createBackground();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tint w = 80;\r\n\tint aux = 14 - (Integer.parseInt(fontSize.getValue())/2);\r\n\tif(12 &gt;  aux) {\r\n\t\tint d = 12 - aux;\r\n\t\tw += d*10;\r\n\t}\r\n\twidth.setValue(w);\r\n\tthis.setTheWidth(width);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\tint h = 20;\r\n\tint value = Integer.parseInt(fontSize.getValue());\r\n\tif(value &gt; 12) {\r\n\t\th += (value-12)*2;\r\n\t}\r\n\theight.setValue(h);\r\n\tthis.setTheHeight(height);\r\n}\r\nif(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {\r\n\tgenerator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\n\tb.setValue(\"#FFFFFF\");\r\n\tthis.setTheBackground(b);\r\n}'"
	 * @generated
	 */
	void setDefaultCombo(Propertie fontSize);

} // GenComboBox
