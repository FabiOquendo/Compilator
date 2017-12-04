/**
 */
package generator.genmodel.genindividualcomponent.gentextfield;

import compilator.domain.expression.expressionmodel.individualcomponent.TextField;

import generator.apperance.background.Background;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheTextField <em>The Text Field</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage#getGenTextField()
 * @model
 * @generated
 */
public interface GenTextField extends GenIndividualElement {
	/**
	 * Returns the value of the '<em><b>The Background</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.background.Background#getGenTextField <em>Gen Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Background</em>' containment reference.
	 * @see #setTheBackground(Background)
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage#getGenTextField_TheBackground()
	 * @see generator.apperance.background.Background#getGenTextField
	 * @model opposite="GenTextField" containment="true" required="true"
	 * @generated
	 */
	Background getTheBackground();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheBackground <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Background</em>' containment reference.
	 * @see #getTheBackground()
	 * @generated
	 */
	void setTheBackground(Background value);

	/**
	 * Returns the value of the '<em><b>The Text Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Text Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Text Field</em>' reference.
	 * @see #setTheTextField(TextField)
	 * @see generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage#getGenTextField_TheTextField()
	 * @model required="true"
	 * @generated
	 */
	TextField getTheTextField();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentextfield.GenTextField#getTheTextField <em>The Text Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Text Field</em>' reference.
	 * @see #getTheTextField()
	 * @generated
	 */
	void setTheTextField(TextField value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateBackground();\r\nsetDefaultText(fontSize);'"
	 * @generated
	 */
	void createPropertiesTextField(Propertie fontSize);

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tint w = 80;\r\n\tint aux = 14 - (Integer.parseInt(fontSize.getValue())/2);\r\n\tif(12 &gt;  aux) {\r\n\t\tint d = 12 - aux;\r\n\t\tw += d*10;\r\n\t}\r\n\twidth.setValue(w);\r\n\tthis.setTheWidth(width);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\tint h = 20;\r\n\tint value = Integer.parseInt(fontSize.getValue());\r\n\tif(value &gt; 12) {\r\n\t\th += (value-12)*2;\r\n\t}\r\n\theight.setValue(h);\r\n\tthis.setTheHeight(height);\r\n}\r\nif(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {\r\n\tgenerator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\n\tb.setValue(\"#FFFFFF\");\r\n\tthis.setTheBackground(b);\r\n} '"
	 * @generated
	 */
	void setDefaultText(Propertie fontSize);

} // GenTextField
