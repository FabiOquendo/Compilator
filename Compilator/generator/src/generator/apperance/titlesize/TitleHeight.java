/**
 */
package generator.apperance.titlesize;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title Height</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.titlesize.TitleHeight#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.titlesize.TitleHeight#getGenTable <em>Gen Table</em>}</li>
 *   <li>{@link generator.apperance.titlesize.TitleHeight#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @see generator.apperance.titlesize.TitlesizePackage#getTitleHeight()
 * @model
 * @generated
 */
public interface TitleHeight extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see generator.apperance.titlesize.TitlesizePackage#getTitleHeight_Value()
	 * @model
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link generator.apperance.titlesize.TitleHeight#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Gen Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight <em>The Title Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Table</em>' container reference.
	 * @see #setGenTable(GenTable)
	 * @see generator.apperance.titlesize.TitlesizePackage#getTitleHeight_GenTable()
	 * @see generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight
	 * @model opposite="theTitleHeight"
	 * @generated
	 */
	GenTable getGenTable();

	/**
	 * Sets the value of the '{@link generator.apperance.titlesize.TitleHeight#getGenTable <em>Gen Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Table</em>' container reference.
	 * @see #getGenTable()
	 * @generated
	 */
	void setGenTable(GenTable value);

	/**
	 * Returns the value of the '<em><b>Gen Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight <em>The Title Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Container</em>' container reference.
	 * @see #setGenContainer(GenContainer)
	 * @see generator.apperance.titlesize.TitlesizePackage#getTitleHeight_GenContainer()
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight
	 * @model opposite="theTitleHeight"
	 * @generated
	 */
	GenContainer getGenContainer();

	/**
	 * Sets the value of the '{@link generator.apperance.titlesize.TitleHeight#getGenContainer <em>Gen Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Container</em>' container reference.
	 * @see #getGenContainer()
	 * @generated
	 */
	void setGenContainer(GenContainer value);

} // TitleHeight
