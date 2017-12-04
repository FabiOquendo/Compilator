/**
 */
package compilator.domain.datatypes.util;

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
 * @see compilator.domain.datatypes.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/datatypes/util.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.datatypes.util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = compilator.domain.datatypes.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '<em>Tree Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.TreeMap
	 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getTreeMap()
	 * @generated
	 */
	int TREE_MAP = 0;

	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 1;

	/**
	 * The meta object id for the '<em>Tree Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.TreeSet
	 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getTreeSet()
	 * @generated
	 */
	int TREE_SET = 2;

	/**
	 * The meta object id for the '<em>Hash Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getHashMap()
	 * @generated
	 */
	int HASH_MAP = 3;


	/**
	 * Returns the meta object for data type '{@link java.util.TreeMap <em>Tree Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tree Map</em>'.
	 * @see java.util.TreeMap
	 * @model instanceClass="java.util.TreeMap"
	 * @generated
	 */
	EDataType getTreeMap();

	/**
	 * Returns the meta object for data type '{@link java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array List</em>'.
	 * @see java.util.ArrayList
	 * @model instanceClass="java.util.ArrayList"
	 * @generated
	 */
	EDataType getArrayList();

	/**
	 * Returns the meta object for data type '{@link java.util.TreeSet <em>Tree Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tree Set</em>'.
	 * @see java.util.TreeSet
	 * @model instanceClass="java.util.TreeSet"
	 * @generated
	 */
	EDataType getTreeSet();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap"
	 * @generated
	 */
	EDataType getHashMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '<em>Tree Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.TreeMap
		 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getTreeMap()
		 * @generated
		 */
		EDataType TREE_MAP = eINSTANCE.getTreeMap();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>Tree Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.TreeSet
		 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getTreeSet()
		 * @generated
		 */
		EDataType TREE_SET = eINSTANCE.getTreeSet();

		/**
		 * The meta object literal for the '<em>Hash Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see compilator.domain.datatypes.util.impl.UtilPackageImpl#getHashMap()
		 * @generated
		 */
		EDataType HASH_MAP = eINSTANCE.getHashMap();

	}

} //UtilPackage
