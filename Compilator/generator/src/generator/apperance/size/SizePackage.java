/**
 */
package generator.apperance.size;

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
 * @see generator.apperance.size.SizeFactory
 * @model kind="package"
 * @generated
 */
public interface SizePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "size";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/size.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.size";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SizePackage eINSTANCE = generator.apperance.size.impl.SizePackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.size.impl.WidthImpl <em>Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.size.impl.WidthImpl
	 * @see generator.apperance.size.impl.SizePackageImpl#getWidth()
	 * @generated
	 */
	int WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH__GEN_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link generator.apperance.size.impl.HeightImpl <em>Height</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.size.impl.HeightImpl
	 * @see generator.apperance.size.impl.SizePackageImpl#getHeight()
	 * @generated
	 */
	int HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEIGHT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEIGHT__GEN_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Height</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Height</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEIGHT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.size.Width <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Width</em>'.
	 * @see generator.apperance.size.Width
	 * @generated
	 */
	EClass getWidth();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.size.Width#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.size.Width#getValue()
	 * @see #getWidth()
	 * @generated
	 */
	EAttribute getWidth_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.size.Width#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Element</em>'.
	 * @see generator.apperance.size.Width#getGenElement()
	 * @see #getWidth()
	 * @generated
	 */
	EReference getWidth_GenElement();

	/**
	 * Returns the meta object for class '{@link generator.apperance.size.Height <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Height</em>'.
	 * @see generator.apperance.size.Height
	 * @generated
	 */
	EClass getHeight();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.size.Height#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.size.Height#getValue()
	 * @see #getHeight()
	 * @generated
	 */
	EAttribute getHeight_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.size.Height#getGenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Element</em>'.
	 * @see generator.apperance.size.Height#getGenElement()
	 * @see #getHeight()
	 * @generated
	 */
	EReference getHeight_GenElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SizeFactory getSizeFactory();

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
		 * The meta object literal for the '{@link generator.apperance.size.impl.WidthImpl <em>Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.size.impl.WidthImpl
		 * @see generator.apperance.size.impl.SizePackageImpl#getWidth()
		 * @generated
		 */
		EClass WIDTH = eINSTANCE.getWidth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDTH__VALUE = eINSTANCE.getWidth_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDTH__GEN_ELEMENT = eINSTANCE.getWidth_GenElement();

		/**
		 * The meta object literal for the '{@link generator.apperance.size.impl.HeightImpl <em>Height</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.size.impl.HeightImpl
		 * @see generator.apperance.size.impl.SizePackageImpl#getHeight()
		 * @generated
		 */
		EClass HEIGHT = eINSTANCE.getHeight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEIGHT__VALUE = eINSTANCE.getHeight_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEIGHT__GEN_ELEMENT = eINSTANCE.getHeight_GenElement();

	}

} //SizePackage
