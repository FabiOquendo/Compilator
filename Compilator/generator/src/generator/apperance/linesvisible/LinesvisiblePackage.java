/**
 */
package generator.apperance.linesvisible;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see generator.apperance.linesvisible.LinesvisibleFactory
 * @model kind="package"
 * @generated
 */
public interface LinesvisiblePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linesvisible";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/linesvisible.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.linesvisible";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinesvisiblePackage eINSTANCE = generator.apperance.linesvisible.impl.LinesvisiblePackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.linesvisible.impl.LinesVisibleImpl <em>Lines Visible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.linesvisible.impl.LinesVisibleImpl
	 * @see generator.apperance.linesvisible.impl.LinesvisiblePackageImpl#getLinesVisible()
	 * @generated
	 */
	int LINES_VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_VISIBLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_VISIBLE__GEN_TABLE = 1;

	/**
	 * The number of structural features of the '<em>Lines Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_VISIBLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lines Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_VISIBLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.linesvisible.LinesVisible <em>Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lines Visible</em>'.
	 * @see generator.apperance.linesvisible.LinesVisible
	 * @generated
	 */
	EClass getLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.linesvisible.LinesVisible#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.linesvisible.LinesVisible#getValue()
	 * @see #getLinesVisible()
	 * @generated
	 */
	EAttribute getLinesVisible_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.linesvisible.LinesVisible#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Table</em>'.
	 * @see generator.apperance.linesvisible.LinesVisible#getGenTable()
	 * @see #getLinesVisible()
	 * @generated
	 */
	EReference getLinesVisible_GenTable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinesvisibleFactory getLinesvisibleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link generator.apperance.linesvisible.impl.LinesVisibleImpl <em>Lines Visible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.linesvisible.impl.LinesVisibleImpl
		 * @see generator.apperance.linesvisible.impl.LinesvisiblePackageImpl#getLinesVisible()
		 * @generated
		 */
		EClass LINES_VISIBLE = eINSTANCE.getLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINES_VISIBLE__VALUE = eINSTANCE.getLinesVisible_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINES_VISIBLE__GEN_TABLE = eINSTANCE.getLinesVisible_GenTable();

	}

} //LinesvisiblePackage
