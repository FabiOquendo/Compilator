/**
 */
package generator.genmodel.gencontainercomponent.gencontainer;

import compilator.domain.expression.expressionmodel.containercomponent.Container;

import generator.apperance.background.Background;

import generator.apperance.orientation.Orientation;

import generator.apperance.titlesize.TitleHeight;

import generator.genmodel.gencontainercomponent.GenContainerElement;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight <em>The Title Height</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheOrientation <em>The Orientation</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheContainer <em>The Container</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground <em>The Background</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#getGenContainer()
 * @model
 * @generated
 */
public interface GenContainer extends GenContainerElement {
	/**
	 * Returns the value of the '<em><b>The Title Height</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.titlesize.TitleHeight#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Title Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Title Height</em>' containment reference.
	 * @see #setTheTitleHeight(TitleHeight)
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#getGenContainer_TheTitleHeight()
	 * @see generator.apperance.titlesize.TitleHeight#getGenContainer
	 * @model opposite="GenContainer" containment="true" required="true"
	 * @generated
	 */
	TitleHeight getTheTitleHeight();

	/**
	 * Sets the value of the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight <em>The Title Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Title Height</em>' containment reference.
	 * @see #getTheTitleHeight()
	 * @generated
	 */
	void setTheTitleHeight(TitleHeight value);

	/**
	 * Returns the value of the '<em><b>The Orientation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.orientation.Orientation#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Orientation</em>' containment reference.
	 * @see #setTheOrientation(Orientation)
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#getGenContainer_TheOrientation()
	 * @see generator.apperance.orientation.Orientation#getGenContainer
	 * @model opposite="GenContainer" containment="true" required="true"
	 * @generated
	 */
	Orientation getTheOrientation();

	/**
	 * Sets the value of the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheOrientation <em>The Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Orientation</em>' containment reference.
	 * @see #getTheOrientation()
	 * @generated
	 */
	void setTheOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>The Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Container</em>' reference.
	 * @see #setTheContainer(Container)
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#getGenContainer_TheContainer()
	 * @model required="true"
	 * @generated
	 */
	Container getTheContainer();

	/**
	 * Sets the value of the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheContainer <em>The Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Container</em>' reference.
	 * @see #getTheContainer()
	 * @generated
	 */
	void setTheContainer(Container value);

	/**
	 * Returns the value of the '<em><b>The Background</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.background.Background#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Background</em>' containment reference.
	 * @see #setTheBackground(Background)
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage#getGenContainer_TheBackground()
	 * @see generator.apperance.background.Background#getGenContainer
	 * @model opposite="GenContainer" containment="true" required="true"
	 * @generated
	 */
	Background getTheBackground();

	/**
	 * Sets the value of the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Background</em>' containment reference.
	 * @see #getTheBackground()
	 * @generated
	 */
	void setTheBackground(Background value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateBackground();\r\ncreateTitleHeight();\r\nsetDefaultContainer(fontSize);'"
	 * @generated
	 */
	void createPropertiesContainer(String orientation, Propertie fontSize);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();\r\nthis.setTheTitleHeight(th);'"
	 * @generated
	 */
	void createTitleHeight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tw.setValue(100);\r\n\tthis.setTheWidth(w);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\th.setValue(25);\r\n\tthis.setTheHeight(h);;\r\n}\r\nif(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {\r\n\tgenerator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\n\tb.setValue(\"#FFFFFF\");\r\n\tthis.setTheBackground(b);\r\n} \r\nif(this.getTheTitleHeight() == null || this.getTheTitleHeight().getValue() == null) {\r\n\tgenerator.apperance.titlesize.TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();\r\n\tint h = 20;\r\n\tint value = Integer.parseInt(fontSize.getValue());\r\n\tif(value &gt; 12) {\r\n\t\th += (value-12)*2;\r\n\t}\r\n\tth.setValue(h);\r\n\tthis.setTheTitleHeight(th);\r\n}'"
	 * @generated
	 */
	void setDefaultContainer(String orientation, Propertie fontSize);

} // GenContainer
