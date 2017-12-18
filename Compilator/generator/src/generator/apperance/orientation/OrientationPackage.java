/**
 */
package generator.apperance.orientation;

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
 * @see generator.apperance.orientation.OrientationFactory
 * @model kind="package"
 * @generated
 */
public interface OrientationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orientation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/orientation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.orientation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrientationPackage eINSTANCE = generator.apperance.orientation.impl.OrientationPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.orientation.impl.OrientationImpl <em>Orientation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.orientation.impl.OrientationImpl
	 * @see generator.apperance.orientation.impl.OrientationPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION__GEN_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Orientation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orientation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.orientation.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation</em>'.
	 * @see generator.apperance.orientation.Orientation
	 * @generated
	 */
	EClass getOrientation();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.orientation.Orientation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.orientation.Orientation#getValue()
	 * @see #getOrientation()
	 * @generated
	 */
	EAttribute getOrientation_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.orientation.Orientation#getGenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Container</em>'.
	 * @see generator.apperance.orientation.Orientation#getGenContainer()
	 * @see #getOrientation()
	 * @generated
	 */
	EReference getOrientation_GenContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrientationFactory getOrientationFactory();

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
		 * The meta object literal for the '{@link generator.apperance.orientation.impl.OrientationImpl <em>Orientation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.orientation.impl.OrientationImpl
		 * @see generator.apperance.orientation.impl.OrientationPackageImpl#getOrientation()
		 * @generated
		 */
		EClass ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION__VALUE = eINSTANCE.getOrientation_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORIENTATION__GEN_CONTAINER = eINSTANCE.getOrientation_GenContainer();

	}

} //OrientationPackage
