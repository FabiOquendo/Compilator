/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Table#getListColumn <em>List Column</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends IndividualElement {
	/**
	 * Returns the value of the '<em><b>List Column</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.expressionmodel.individualcomponent.Column}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Column</em>' containment reference list.
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getTable_ListColumn()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable
	 * @model opposite="Table" containment="true" required="true"
	 * @generated
	 */
	EList<Column> getListColumn();

} // Table
