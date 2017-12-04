/**
 */
package generator.genmodel.genindividualcomponent.genlabel;

import compilator.domain.expression.expressionmodel.individualcomponent.Label;

import generator.apperance.alignment.Alignment;

import generator.apperance.background.Background;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheLabel <em>The Label</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment <em>The Alignment</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage#getGenLabel()
 * @model
 * @generated
 */
public interface GenLabel extends GenIndividualElement {
	/**
	 * Returns the value of the '<em><b>The Background</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.background.Background#getGenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Background</em>' containment reference.
	 * @see #setTheBackground(Background)
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage#getGenLabel_TheBackground()
	 * @see generator.apperance.background.Background#getGenLabel
	 * @model opposite="GenLabel" containment="true" required="true"
	 * @generated
	 */
	Background getTheBackground();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheBackground <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Background</em>' containment reference.
	 * @see #getTheBackground()
	 * @generated
	 */
	void setTheBackground(Background value);

	/**
	 * Returns the value of the '<em><b>The Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Label</em>' reference.
	 * @see #setTheLabel(Label)
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage#getGenLabel_TheLabel()
	 * @model required="true"
	 * @generated
	 */
	Label getTheLabel();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheLabel <em>The Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Label</em>' reference.
	 * @see #getTheLabel()
	 * @generated
	 */
	void setTheLabel(Label value);

	/**
	 * Returns the value of the '<em><b>The Alignment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.alignment.Alignment#getGenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Alignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Alignment</em>' containment reference.
	 * @see #setTheAlignment(Alignment)
	 * @see generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage#getGenLabel_TheAlignment()
	 * @see generator.apperance.alignment.Alignment#getGenLabel
	 * @model opposite="GenLabel" containment="true" required="true"
	 * @generated
	 */
	Alignment getTheAlignment();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.genlabel.GenLabel#getTheAlignment <em>The Alignment</em>}' containment reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateAlignment();\r\ncreateBackground();\r\nsetDefaultLabel(text, fontSize);'"
	 * @generated
	 */
	void createPropertiesLabel(String text, Propertie fontSize);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\nthis.setTheBackground(b);'"
	 * @generated
	 */
	void createBackground();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tint w = 80;\r\n\tint aux = 14 - (Integer.parseInt(fontSize.getValue())/2);\r\n\tif(text.length() &gt;  aux) {\r\n\t\tint d = text.length() - aux;\r\n\t\tw += d*10;\r\n\t}\r\n\twidth.setValue(w);\r\n\tthis.setTheWidth(width);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\tint h = 20;\r\n\tint value = Integer.parseInt(fontSize.getValue());\r\n\tif(value &gt; 12) {\r\n\t\th += (value-12)*2;\r\n\t}\r\n\theight.setValue(h);\r\n\tthis.setTheHeight(height);\r\n}\r\nif(this.getTheAlignment() == null || this.getTheAlignment().getValue() == null) {\r\n\tgenerator.apperance.alignment.Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();\r\n\ta.setValue(\"RIGHT\");\r\n\tthis.setTheAlignment(a);\r\n} \r\nif(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {\r\n\tgenerator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\n\tb.setValue(\"#FFFFFF\");\r\n\tthis.setTheBackground(b);\r\n} '"
	 * @generated
	 */
	void setDefaultLabel(String text, Propertie fontSize);

} // GenLabel
