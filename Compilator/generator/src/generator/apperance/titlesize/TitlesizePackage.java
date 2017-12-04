/**
 */
package generator.apperance.titlesize;

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
 * @see generator.apperance.titlesize.TitlesizeFactory
 * @model kind="package"
 * @generated
 */
public interface TitlesizePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "titlesize";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/titlesize.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.titlesize";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TitlesizePackage eINSTANCE = generator.apperance.titlesize.impl.TitlesizePackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.titlesize.impl.TitleHeightImpl <em>Title Height</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.titlesize.impl.TitleHeightImpl
	 * @see generator.apperance.titlesize.impl.TitlesizePackageImpl#getTitleHeight()
	 * @generated
	 */
	int TITLE_HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_HEIGHT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_HEIGHT__GEN_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Gen Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_HEIGHT__GEN_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Title Height</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_HEIGHT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Title Height</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_HEIGHT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.titlesize.TitleHeight <em>Title Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Height</em>'.
	 * @see generator.apperance.titlesize.TitleHeight
	 * @generated
	 */
	EClass getTitleHeight();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.titlesize.TitleHeight#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.titlesize.TitleHeight#getValue()
	 * @see #getTitleHeight()
	 * @generated
	 */
	EAttribute getTitleHeight_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.titlesize.TitleHeight#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Table</em>'.
	 * @see generator.apperance.titlesize.TitleHeight#getGenTable()
	 * @see #getTitleHeight()
	 * @generated
	 */
	EReference getTitleHeight_GenTable();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.titlesize.TitleHeight#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Container</em>'.
	 * @see generator.apperance.titlesize.TitleHeight#getGenContainer()
	 * @see #getTitleHeight()
	 * @generated
	 */
	EReference getTitleHeight_GenContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TitlesizeFactory getTitlesizeFactory();

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
		 * The meta object literal for the '{@link generator.apperance.titlesize.impl.TitleHeightImpl <em>Title Height</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.titlesize.impl.TitleHeightImpl
		 * @see generator.apperance.titlesize.impl.TitlesizePackageImpl#getTitleHeight()
		 * @generated
		 */
		EClass TITLE_HEIGHT = eINSTANCE.getTitleHeight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_HEIGHT__VALUE = eINSTANCE.getTitleHeight_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_HEIGHT__GEN_TABLE = eINSTANCE.getTitleHeight_GenTable();

		/**
		 * The meta object literal for the '<em><b>Gen Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_HEIGHT__GEN_CONTAINER = eINSTANCE.getTitleHeight_GenContainer();

	}

} //TitlesizePackage
