/**
 */
package generator.apperance.alignment;

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
 * @see generator.apperance.alignment.AlignmentFactory
 * @model kind="package"
 * @generated
 */
public interface AlignmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alignment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/apperance/alignment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.apperance.alignment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlignmentPackage eINSTANCE = generator.apperance.alignment.impl.AlignmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.apperance.alignment.impl.AlignmentImpl <em>Alignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.apperance.alignment.impl.AlignmentImpl
	 * @see generator.apperance.alignment.impl.AlignmentPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Gen Button</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT__GEN_BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Gen Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT__GEN_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Gen Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT__GEN_LABEL = 3;

	/**
	 * The number of structural features of the '<em>Alignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Alignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.apperance.alignment.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alignment</em>'.
	 * @see generator.apperance.alignment.Alignment
	 * @generated
	 */
	EClass getAlignment();

	/**
	 * Returns the meta object for the attribute '{@link generator.apperance.alignment.Alignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see generator.apperance.alignment.Alignment#getValue()
	 * @see #getAlignment()
	 * @generated
	 */
	EAttribute getAlignment_Value();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.alignment.Alignment#getGenButton <em>Gen Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Button</em>'.
	 * @see generator.apperance.alignment.Alignment#getGenButton()
	 * @see #getAlignment()
	 * @generated
	 */
	EReference getAlignment_GenButton();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.alignment.Alignment#getGenColumn <em>Gen Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Column</em>'.
	 * @see generator.apperance.alignment.Alignment#getGenColumn()
	 * @see #getAlignment()
	 * @generated
	 */
	EReference getAlignment_GenColumn();

	/**
	 * Returns the meta object for the container reference '{@link generator.apperance.alignment.Alignment#getGenLabel <em>Gen Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Label</em>'.
	 * @see generator.apperance.alignment.Alignment#getGenLabel()
	 * @see #getAlignment()
	 * @generated
	 */
	EReference getAlignment_GenLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlignmentFactory getAlignmentFactory();

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
		 * The meta object literal for the '{@link generator.apperance.alignment.impl.AlignmentImpl <em>Alignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.apperance.alignment.impl.AlignmentImpl
		 * @see generator.apperance.alignment.impl.AlignmentPackageImpl#getAlignment()
		 * @generated
		 */
		EClass ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNMENT__VALUE = eINSTANCE.getAlignment_Value();

		/**
		 * The meta object literal for the '<em><b>Gen Button</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNMENT__GEN_BUTTON = eINSTANCE.getAlignment_GenButton();

		/**
		 * The meta object literal for the '<em><b>Gen Column</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNMENT__GEN_COLUMN = eINSTANCE.getAlignment_GenColumn();

		/**
		 * The meta object literal for the '<em><b>Gen Label</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNMENT__GEN_LABEL = eINSTANCE.getAlignment_GenLabel();

	}

} //AlignmentPackage
