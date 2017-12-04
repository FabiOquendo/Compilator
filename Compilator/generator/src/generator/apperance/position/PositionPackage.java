/**
 */
package generator.apperance.position;

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
 * @see generator.apperance.position.PositionFactory
 * @model kind="package"
 * @generated
 */
public interface PositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "position";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/position.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.position";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PositionPackage eINSTANCE = generator.apperance.position.impl.PositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.position.impl.XImpl <em>X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.position.impl.XImpl
	 * @see generator.apperance.position.impl.PositionPackageImpl#getX()
	 * @generated
	 */
	int X = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X__GEN_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.apperance.position.impl.YImpl <em>Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.position.impl.YImpl
	 * @see generator.apperance.position.impl.PositionPackageImpl#getY()
	 * @generated
	 */
	int Y = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y__GEN_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int Y_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.position.X <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X</em>'.
	 * @see generator.apperance.position.X
	 * @generated
	 */
	EClass getX();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.position.X#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.position.X#getValue()
	 * @see #getX()
	 * @generated
	 */
	EAttribute getX_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.position.X#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Element</em>'.
	 * @see generator.apperance.position.X#getGenElement()
	 * @see #getX()
	 * @generated
	 */
	EReference getX_GenElement();

	/**
	 * Returns the meta object for class '{@link generator.apperance.position.Y <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Y</em>'.
	 * @see generator.apperance.position.Y
	 * @generated
	 */
	EClass getY();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.position.Y#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.position.Y#getValue()
	 * @see #getY()
	 * @generated
	 */
	EAttribute getY_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.position.Y#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Element</em>'.
	 * @see generator.apperance.position.Y#getGenElement()
	 * @see #getY()
	 * @generated
	 */
	EReference getY_GenElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PositionFactory getPositionFactory();

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
		 * The meta object literal for the '{@link generator.apperance.position.impl.XImpl <em>X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.position.impl.XImpl
		 * @see generator.apperance.position.impl.PositionPackageImpl#getX()
		 * @generated
		 */
		EClass X = eINSTANCE.getX();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X__VALUE = eINSTANCE.getX_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X__GEN_ELEMENT = eINSTANCE.getX_GenElement();

		/**
		 * The meta object literal for the '{@link generator.apperance.position.impl.YImpl <em>Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.position.impl.YImpl
		 * @see generator.apperance.position.impl.PositionPackageImpl#getY()
		 * @generated
		 */
		EClass Y = eINSTANCE.getY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute Y__VALUE = eINSTANCE.getY_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference Y__GEN_ELEMENT = eINSTANCE.getY_GenElement();

	}

} //PositionPackage
