/**
 */
package generator.apperance.background;

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
 * @see generator.apperance.background.BackgroundFactory
 * @model kind="package"
 * @generated
 */
public interface BackgroundPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "background";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/background.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.background";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BackgroundPackage eINSTANCE = generator.apperance.background.impl.BackgroundPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.background.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.background.impl.BackgroundImpl
	 * @see generator.apperance.background.impl.BackgroundPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Combo Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GEN_COMBO_BOX = 1;

	/**
	 * The feature id for the '<em><b>Gen Text Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GEN_TEXT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Gen Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GEN_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Gen Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GEN_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Gen Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GEN_CONTAINER = 5;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.background.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see generator.apperance.background.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.background.Background#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.background.Background#getValue()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.background.Background#getGenComboBox <em>Gen Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Combo Box</em>'.
	 * @see generator.apperance.background.Background#getGenComboBox()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GenComboBox();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.background.Background#getGenTextField <em>Gen Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Text Field</em>'.
	 * @see generator.apperance.background.Background#getGenTextField()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GenTextField();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.background.Background#getGenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Label</em>'.
	 * @see generator.apperance.background.Background#getGenLabel()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GenLabel();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.background.Background#getGenTable <em>Gen Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Table</em>'.
	 * @see generator.apperance.background.Background#getGenTable()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GenTable();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.background.Background#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Container</em>'.
	 * @see generator.apperance.background.Background#getGenContainer()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GenContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BackgroundFactory getBackgroundFactory();

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
		 * The meta object literal for the '{@link generator.apperance.background.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.background.impl.BackgroundImpl
		 * @see generator.apperance.background.impl.BackgroundPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__VALUE = eINSTANCE.getBackground_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Combo Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GEN_COMBO_BOX = eINSTANCE.getBackground_GenComboBox();

		/**
		 * The meta object literal for the '<em><b>Gen Text Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GEN_TEXT_FIELD = eINSTANCE.getBackground_GenTextField();

		/**
		 * The meta object literal for the '<em><b>Gen Label</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GEN_LABEL = eINSTANCE.getBackground_GenLabel();

		/**
		 * The meta object literal for the '<em><b>Gen Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GEN_TABLE = eINSTANCE.getBackground_GenTable();

		/**
		 * The meta object literal for the '<em><b>Gen Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GEN_CONTAINER = eINSTANCE.getBackground_GenContainer();

	}

} //BackgroundPackage
