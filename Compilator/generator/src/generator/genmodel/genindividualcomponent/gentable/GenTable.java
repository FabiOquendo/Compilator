/**
 */
package generator.genmodel.genindividualcomponent.gentable;

import compilator.domain.expression.expressionmodel.individualcomponent.Table;

import generator.apperance.background.Background;

import generator.apperance.linesvisible.LinesVisible;

import generator.apperance.titlesize.TitleHeight;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import org.eclipse.emf.common.util.EList;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible <em>The Lines Visible</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight <em>The Title Height</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getListGenColumns <em>List Gen Columns</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTable <em>The Table</em>}</li>
 * </ul>
 *
 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable()
 * @model
 * @generated
 */
public interface GenTable extends GenIndividualElement {
	/**
	 * Returns the value of the '<em><b>The Background</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.background.Background#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Background</em>' containment reference.
	 * @see #setTheBackground(Background)
	 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable_TheBackground()
	 * @see generator.apperance.background.Background#getGenTable
	 * @model opposite="GenTable" containment="true" required="true"
	 * @generated
	 */
	Background getTheBackground();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheBackground <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Background</em>' containment reference.
	 * @see #getTheBackground()
	 * @generated
	 */
	void setTheBackground(Background value);

	/**
	 * Returns the value of the '<em><b>The Lines Visible</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.linesvisible.LinesVisible#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Lines Visible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Lines Visible</em>' containment reference.
	 * @see #setTheLinesVisible(LinesVisible)
	 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable_TheLinesVisible()
	 * @see generator.apperance.linesvisible.LinesVisible#getGenTable
	 * @model opposite="GenTable" containment="true" required="true"
	 * @generated
	 */
	LinesVisible getTheLinesVisible();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheLinesVisible <em>The Lines Visible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Lines Visible</em>' containment reference.
	 * @see #getTheLinesVisible()
	 * @generated
	 */
	void setTheLinesVisible(LinesVisible value);

	/**
	 * Returns the value of the '<em><b>The Title Height</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link generator.apperance.titlesize.TitleHeight#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Title Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Title Height</em>' containment reference.
	 * @see #setTheTitleHeight(TitleHeight)
	 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable_TheTitleHeight()
	 * @see generator.apperance.titlesize.TitleHeight#getGenTable
	 * @model opposite="GenTable" containment="true" required="true"
	 * @generated
	 */
	TitleHeight getTheTitleHeight();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTitleHeight <em>The Title Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Title Height</em>' containment reference.
	 * @see #getTheTitleHeight()
	 * @generated
	 */
	void setTheTitleHeight(TitleHeight value);

	/**
	 * Returns the value of the '<em><b>List Gen Columns</b></em>' containment reference list.
	 * The list contents are of type {@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn}.
	 * It is bidirectional and its opposite is '{@link generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Gen Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Gen Columns</em>' containment reference list.
	 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable_ListGenColumns()
	 * @see generator.genmodel.genindividualcomponent.gencolunm.GenColumn#getGenTable
	 * @model opposite="GenTable" containment="true"
	 * @generated
	 */
	EList<GenColumn> getListGenColumns();

	/**
	 * Returns the value of the '<em><b>The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Table</em>' reference.
	 * @see #setTheTable(Table)
	 * @see generator.genmodel.genindividualcomponent.gentable.GentablePackage#getGenTable_TheTable()
	 * @model required="true"
	 * @generated
	 */
	Table getTheTable();

	/**
	 * Sets the value of the '{@link generator.genmodel.genindividualcomponent.gentable.GenTable#getTheTable <em>The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Table</em>' reference.
	 * @see #getTheTable()
	 * @generated
	 */
	void setTheTable(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontSizeDataType="generator.datatypes.Propertie"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='super.createProperties();\r\ncreateBackground();\r\ncreateLinesVisible();\r\ncreateTitleHeight();\r\nsetDefaultTable(columnHeight, columnsWidth, fontSize);'"
	 * @generated
	 */
	void createPropertiesTable(Integer columnHeight, Integer columnsWidth, Propertie fontSize);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='LinesVisible l = generator.apperance.linesvisible.LinesvisibleFactory.eINSTANCE.createLinesVisible();\r\nthis.setTheLinesVisible(l);'"
	 * @generated
	 */
	void createLinesVisible();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int titleH = 20;\r\nint value = Integer.parseInt(fontSize.getValue());\r\nif(value &gt; 12) {\r\n\ttitleH += (value-12)*2;\r\n}\r\nif(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {\r\n\tgenerator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();\r\n\tw.setValue(columnsWidth);\r\n\tthis.setTheWidth(w);\r\n}\r\nif(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {\r\n\tgenerator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();\r\n\th.setValue(titleH+ (columnHeight*6));\r\n\tthis.setTheHeight(h);;\r\n}\r\nif(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {\r\n\tgenerator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();\r\n\tb.setValue(\"#FFFFFF\");\r\n\tthis.setTheBackground(b);\r\n} \r\nif(this.getTheLinesVisible() == null || this.getTheLinesVisible().getValue() == null) {\r\n\tgenerator.apperance.linesvisible.LinesVisible l = generator.apperance.linesvisible.LinesvisibleFactory.eINSTANCE.createLinesVisible();\r\n\tl.setValue(false);\r\n\tthis.setTheLinesVisible(l);\r\n}\r\nif(this.getTheTitleHeight() == null || this.getTheTitleHeight().getValue() == null) {\r\n\tgenerator.apperance.titlesize.TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();\r\n\tth.setValue(titleH);\r\n\tthis.setTheTitleHeight(th);\r\n}'"
	 * @generated
	 */
	void setDefaultTable(Integer columnHeight, Integer columnsWidth, Propertie fontSize);

} // GenTable
