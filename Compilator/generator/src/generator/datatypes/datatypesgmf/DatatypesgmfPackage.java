/**
 */
package generator.datatypes.datatypesgmf;

import org.eclipse.emf.ecore.EDataType;
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
 * @see generator.datatypes.datatypesgmf.DatatypesgmfFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesgmfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypesgmf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/datatypes/datatypesgmf.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.datatypes.datatypesgmf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesgmfPackage eINSTANCE = generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl.init();

	/**
	 * The meta object id for the '<em>Bounds</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Bounds
	 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 0;

	/**
	 * The meta object id for the '<em>Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The meta object id for the '<em>Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.runtime.notation.Node
	 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;


	/**
	 * Returns the meta object for data type '{@link org.eclipse.gmf.runtime.notation.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bounds</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Bounds
	 * @model instanceClass="org.eclipse.gmf.runtime.notation.Bounds"
	 * @generated
	 */
	EDataType getBounds();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.gmf.runtime.notation.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Diagram</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Diagram
	 * @model instanceClass="org.eclipse.gmf.runtime.notation.Diagram"
	 * @generated
	 */
	EDataType getDiagram();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.gmf.runtime.notation.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node</em>'.
	 * @see org.eclipse.gmf.runtime.notation.Node
	 * @model instanceClass="org.eclipse.gmf.runtime.notation.Node"
	 * @generated
	 */
	EDataType getNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesgmfFactory getDatatypesgmfFactory();

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
		 * The meta object literal for the '<em>Bounds</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.runtime.notation.Bounds
		 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getBounds()
		 * @generated
		 */
		EDataType BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em>Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.runtime.notation.Diagram
		 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getDiagram()
		 * @generated
		 */
		EDataType DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em>Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmf.runtime.notation.Node
		 * @see generator.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl#getNode()
		 * @generated
		 */
		EDataType NODE = eINSTANCE.getNode();

	}

} //DatatypesgmfPackage
