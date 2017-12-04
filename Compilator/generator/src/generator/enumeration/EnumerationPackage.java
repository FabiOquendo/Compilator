/**
 */
package generator.enumeration;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see generator.enumeration.EnumerationFactory
 * @model kind="package"
 * @generated
 */
public interface EnumerationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumeration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/enumeration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.enumeration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationPackage eINSTANCE = generator.enumeration.impl.EnumerationPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.enumeration.Weight <em>Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.enumeration.Weight
	 * @see generator.enumeration.impl.EnumerationPackageImpl#getWeight()
	 * @generated
	 */
	int WEIGHT = 0;

	/**
	 * The meta object id for the '{@link generator.enumeration.Height <em>Height</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.enumeration.Height
	 * @see generator.enumeration.impl.EnumerationPackageImpl#getHeight()
	 * @generated
	 */
	int HEIGHT = 1;


	/**
	 * Returns the meta object for enum '{@link generator.enumeration.Weight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weight</em>'.
	 * @see generator.enumeration.Weight
	 * @generated
	 */
	EEnum getWeight();

	/**
	 * Returns the meta object for enum '{@link generator.enumeration.Height <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Height</em>'.
	 * @see generator.enumeration.Height
	 * @generated
	 */
	EEnum getHeight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationFactory getEnumerationFactory();

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
		 * The meta object literal for the '{@link generator.enumeration.Weight <em>Weight</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.enumeration.Weight
		 * @see generator.enumeration.impl.EnumerationPackageImpl#getWeight()
		 * @generated
		 */
		EEnum WEIGHT = eINSTANCE.getWeight();

		/**
		 * The meta object literal for the '{@link generator.enumeration.Height <em>Height</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.enumeration.Height
		 * @see generator.enumeration.impl.EnumerationPackageImpl#getHeight()
		 * @generated
		 */
		EEnum HEIGHT = eINSTANCE.getHeight();

	}

} //EnumerationPackage
