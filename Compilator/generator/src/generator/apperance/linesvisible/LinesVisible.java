/**
 */
package generator.apperance.linesvisible;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lines Visible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.linesvisible.LinesVisible#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.linesvisible.LinesVisible#getGenTable <em>Gen Table</em>}</li>
 * </ul>
 *
 * @see generator.apperance.linesvisible.LinesvisiblePackage#getLinesVisible()
 * @model
 * @generated
 */
public interface LinesVisible extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see generator.apperance.linesvisible.LinesvisiblePackage#getLinesVisible_Value()
	 * @model
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.linesvisible.LinesVisible#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible <em>The Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Table</em>' container reference.
	 * @see #setGenTable(GenTable)
	 * @see generator.apperance.linesvisible.LinesvisiblePackage#getLinesVisible_GenTable()
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible
	 * @model opposite="theLinesVisible"
	 * @generated
	 */
	GenTable getGenTable();

	/**
	 * Sets the value of the '{@link generator.apperance.linesvisible.LinesVisible#getGenTable <em>Gen Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Table</em>' container reference.
	 * @see #getGenTable()
	 * @generated
	 */
	void setGenTable(GenTable value);

} // LinesVisible
