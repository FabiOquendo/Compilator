/**
 */
package generator.genmodel.gencontainercomponent;

import generator.genmodel.GenElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.gencontainercomponent.GenContainerElement#getListGenElements <em>List Gen Elements</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.gencontainercomponent.GencontainercomponentPackage#getGenContainerElement()
 * @model abstract="true"
 * @generated
 */
public interface GenContainerElement extends GenElement {
	/**
	 * Returns the value of the '<em><b>List Gen Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.genmodel.GenElement}.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenElement#getGenContainerElement <em>Gen Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Gen Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Gen Elements</em>' containment reference list.
	 * @see generator.genmodel.gencontainercomponent.GencontainercomponentPackage#getGenContainerElement_ListGenElements()
	 * @see generator.genmodel.GenElement#getGenContainerElement
	 * @model opposite="GenContainerElement" containment="true"
	 * @generated
	 */
	EList<GenElement> getListGenElements();

} // GenContainerElement
