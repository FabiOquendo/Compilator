/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends IndividualElement {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.expressionmodel.individualcomponent.Table#getListColumn <em>List Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage#getColumn_Table()
	 * @see compilator.domain.expression.expressionmodel.individualcomponent.Table#getListColumn
	 * @model opposite="listColumn"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link compilator.domain.expression.expressionmodel.individualcomponent.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Column
