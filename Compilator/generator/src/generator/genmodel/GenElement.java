/**
 */
package generator.genmodel;

import generator.apperance.font.Color;
import generator.apperance.font.Size;
import generator.apperance.font.Type;

import generator.apperance.position.X;
import generator.apperance.position.Y;

import generator.apperance.size.Height;
import generator.apperance.size.Width;

import generator.genmodel.gencontainercomponent.GenContainerElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.GenElement#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getGenContainerElement <em>Gen Container Element</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheX <em>The X</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheY <em>The Y</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheWidth <em>The Width</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheHeight <em>The Height</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheColor <em>The Color</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheType <em>The Type</em>}</li>
 *   <li>{@link generator.genmodel.GenElement#getTheSize <em>The Size</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.GenmodelPackage#getGenElement()
 * @model abstract="true"
 * @generated
 */
public interface GenElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenModel#getListGenElements <em>List Gen Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' container reference.
	 * @see #setGenModel(GenModel)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_GenModel()
	 * @see generator.genmodel.GenModel#getListGenElements
	 * @model opposite="listGenElements"
	 * @generated
	 */
	GenModel getGenModel();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getGenModel <em>Gen Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' container reference.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(GenModel value);

	/**
	 * Returns the value of the '<em><b>Gen Container Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.gencontainercomponent.GenContainerElement#getListGenElements <em>List Gen Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Container Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Container Element</em>' container reference.
	 * @see #setGenContainerElement(GenContainerElement)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_GenContainerElement()
	 * @see generator.genmodel.gencontainercomponent.GenContainerElement#getListGenElements
	 * @model opposite="listGenElements"
	 * @generated
	 */
	GenContainerElement getGenContainerElement();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getGenContainerElement <em>Gen Container Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Container Element</em>' container reference.
	 * @see #getGenContainerElement()
	 * @generated
	 */
	void setGenContainerElement(GenContainerElement value);

	/**
	 * Returns the value of the '<em><b>The X</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.position.X#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The X</em>' containment reference.
	 * @see #setTheX(X)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheX()
	 * @see generator.apperance.position.X#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	X getTheX();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheX <em>The X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The X</em>' containment reference.
	 * @see #getTheX()
	 * @generated
	 */
	void setTheX(X value);

	/**
	 * Returns the value of the '<em><b>The Y</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.position.Y#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Y</em>' containment reference.
	 * @see #setTheY(Y)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheY()
	 * @see generator.apperance.position.Y#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Y getTheY();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheY <em>The Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Y</em>' containment reference.
	 * @see #getTheY()
	 * @generated
	 */
	void setTheY(Y value);

	/**
	 * Returns the value of the '<em><b>The Width</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.size.Width#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Width</em>' containment reference.
	 * @see #setTheWidth(Width)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheWidth()
	 * @see generator.apperance.size.Width#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Width getTheWidth();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheWidth <em>The Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Width</em>' containment reference.
	 * @see #getTheWidth()
	 * @generated
	 */
	void setTheWidth(Width value);

	/**
	 * Returns the value of the '<em><b>The Height</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.size.Height#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Height</em>' containment reference.
	 * @see #setTheHeight(Height)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheHeight()
	 * @see generator.apperance.size.Height#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Height getTheHeight();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheHeight <em>The Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Height</em>' containment reference.
	 * @see #getTheHeight()
	 * @generated
	 */
	void setTheHeight(Height value);

	/**
	 * Returns the value of the '<em><b>The Color</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.font.Color#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Color</em>' containment reference.
	 * @see #setTheColor(Color)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheColor()
	 * @see generator.apperance.font.Color#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Color getTheColor();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheColor <em>The Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Color</em>' containment reference.
	 * @see #getTheColor()
	 * @generated
	 */
	void setTheColor(Color value);

	/**
	 * Returns the value of the '<em><b>The Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.font.Type#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Type</em>' containment reference.
	 * @see #setTheType(Type)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheType()
	 * @see generator.apperance.font.Type#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Type getTheType();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheType <em>The Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Type</em>' containment reference.
	 * @see #getTheType()
	 * @generated
	 */
	void setTheType(Type value);

	/**
	 * Returns the value of the '<em><b>The Size</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.font.Size#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Size</em>' containment reference.
	 * @see #setTheSize(Size)
	 * @see generator.genmodel.GenmodelPackage#getGenElement_TheSize()
	 * @see generator.apperance.font.Size#getGenElement
	 * @model opposite="GenElement" containment="true" required="true"
	 * @generated
	 */
	Size getTheSize();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenElement#getTheSize <em>The Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Size</em>' containment reference.
	 * @see #getTheSize()
	 * @generated
	 */
	void setTheSize(Size value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tX x = generator.apperance.position.PositionFactory.eINSTANCE.createX();\r\n\tthis.setTheX(x);'"
	 * @generated
	 */
	void createX();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tY y = generator.apperance.position.PositionFactory.eINSTANCE.createY();\r\n\tthis.setTheY(y);'"
	 * @generated
	 */
	void createY();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tWidth w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tthis.setTheWidth(w);'"
	 * @generated
	 */
	void createWidth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tHeight h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\tthis.setTheHeight(h);'"
	 * @generated
	 */
	void createHeight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tColor c = generator.apperance.font.FontFactory.eINSTANCE.createColor();\r\n\tthis.setTheColor(c);'"
	 * @generated
	 */
	void createFontColor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tType t = generator.apperance.font.FontFactory.eINSTANCE.createType();\r\n\tthis.setTheType(t);'"
	 * @generated
	 */
	void createFontType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tSize s = generator.apperance.font.FontFactory.eINSTANCE.createSize();\r\n\tthis.setTheSize(s);'"
	 * @generated
	 */
	void createFontSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='createX();\r\ncreateY();\r\ncreateWidth();\r\ncreateHeight();\r\ncreateFontColor();\r\ncreateFontType();\r\ncreateFontSize();\r\nsetDefaultFont();'"
	 * @generated
	 */
	void createProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(this.getTheColor() == null || this.getTheColor().getValue() == null) {\r\n\tgenerator.apperance.font.Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();\r\n\tc.setValue(\"#000000\");\r\n\tthis.setTheColor(c);\r\n}\r\nif(this.getTheType() == null || this.getTheType().getValue() == null) {\r\n\tgenerator.apperance.font.Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();\r\n\tt.setValue(\"Calibri\");\r\n\tthis.setTheType(t);\r\n} \r\nif(this.getTheSize() == null || this.getTheSize().getValue() == null) {\r\n\tgenerator.apperance.font.Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();\r\n\ts.setValue(11);\r\n\tthis.setTheSize(s);\r\n}'"
	 * @generated
	 */
	void setDefaultFont();

} // GenElement
