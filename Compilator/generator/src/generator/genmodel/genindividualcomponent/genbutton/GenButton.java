/**
 */
package generator.genmodel.genindividualcomponent.genbutton;

import compilator.domain.expression.expressionmodel.individualcomponent.Button;

import generator.apperance.alignment.Alignment;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheButton <em>The Button</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment <em>The Alignment</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage#getGenButton()
 * @model
 * @generated
 */
public interface GenButton extends GenIndividualElement {
	/**
	 * Returns the value of the '<em><b>The Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Button</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Button</em>' reference.
	 * @see #setTheButton(Button)
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage#getGenButton_TheButton()
	 * @model required="true"
	 * @generated
	 */
	Button getTheButton();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheButton <em>The Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Button</em>' reference.
	 * @see #getTheButton()
	 * @generated
	 */
	void setTheButton(Button value);

	/**
	 * Returns the value of the '<em><b>The Alignment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.alignment.Alignment#getGenButton <em>Gen Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Alignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Alignment</em>' containment reference.
	 * @see #setTheAlignment(Alignment)
	 * @see generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage#getGenButton_TheAlignment()
	 * @see generator.apperance.alignment.Alignment#getGenButton
	 * @model opposite="GenButton" containment="true" required="true"
	 * @generated
	 */
	Alignment getTheAlignment();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.genbutton.GenButton#getTheAlignment <em>The Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Alignment</em>' containment reference.
	 * @see #getTheAlignment()
	 * @generated
	 */
	void setTheAlignment(Alignment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateAlignment();\r\nsetDefaultButton(text, fontSize);'"
	 * @generated
	 */
	void createPropertiesButton(String text, Propertie fontSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();\r\nthis.setTheAlignment(a);'"
	 * @generated
	 */
	void createAlignment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tint w = 80;\r\n\tint aux = 14 - (Integer.parseInt(fontSize.getValue())/2);\r\n\tif(text.length() &gt;  aux) {\r\n\t\tint d = text.length() - aux;\r\n\t\tw += d*10;\r\n\t}\r\n\twidth.setValue(w);\r\n\tthis.setTheWidth(width);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\tint h = 20;\r\n\tint value = Integer.parseInt(fontSize.getValue());\r\n\tif(value &gt; 12) {\r\n\t\th += (value-12)*2;\r\n\t}\r\n\theight.setValue(h);\r\n\tthis.setTheHeight(height);\r\n}\r\nif(this.getTheAlignment() == null || this.getTheAlignment().getValue() == null) {\r\n\tgenerator.apperance.alignment.Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();\r\n\ta.setValue(\"CENTER\");\r\n\tthis.setTheAlignment(a);\r\n}'"
	 * @generated
	 */
	void setDefaultButton(String text, Propertie fontSize);

} // GenButton
