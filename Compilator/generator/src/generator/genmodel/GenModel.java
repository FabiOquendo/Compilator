/**
 */
package generator.genmodel;

import generator.Generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.GenModel#getGenerator <em>Generator</em>}</li>
 *   <li>{@link generator.genmodel.GenModel#getListGenElements <em>List Gen Elements</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.GenmodelPackage#getGenModel()
 * @model
 * @generated
 */
public interface GenModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.Generator#getTheGenModel <em>The Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' container reference.
	 * @see #setGenerator(Generator)
	 * @see generator.genmodel.GenmodelPackage#getGenModel_Generator()
	 * @see generator.Generator#getTheGenModel
	 * @model opposite="theGenModel"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link generator.genmodel.GenModel#getGenerator <em>Generator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' container reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

	/**
	 * Returns the value of the '<em><b>List Gen Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.genmodel.GenElement}.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.GenElement#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Gen Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Gen Elements</em>' containment reference list.
	 * @see generator.genmodel.GenmodelPackage#getGenModel_ListGenElements()
	 * @see generator.genmodel.GenElement#getGenModel
	 * @model opposite="GenModel" containment="true"
	 * @generated
	 */
	EList<GenElement> getListGenElements();

} // GenModel
