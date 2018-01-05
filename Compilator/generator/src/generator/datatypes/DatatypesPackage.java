/**
 */
package generator.datatypes;

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
 * @see generator.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/datatypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = generator.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '<em>Propertie</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see styles.domain.Propertie
	 * @see generator.datatypes.impl.DatatypesPackageImpl#getPropertie()
	 * @generated
	 */
	int PROPERTIE = 0;

	/**
	 * The meta object id for the '<em>Workbook</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.ss.usermodel.Workbook
	 * @see generator.datatypes.impl.DatatypesPackageImpl#getWorkbook()
	 * @generated
	 */
	int WORKBOOK = 1;

	/**
	 * The meta object id for the '<em>Sheet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.ss.usermodel.Sheet
	 * @see generator.datatypes.impl.DatatypesPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 2;

	/**
	 * The meta object id for the '<em>Cell</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.ss.usermodel.Cell
	 * @see generator.datatypes.impl.DatatypesPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 3;


	/**
	 * Returns the meta object for data type '{@link styles.domain.Propertie <em>Propertie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Propertie</em>'.
	 * @see styles.domain.Propertie
	 * @model instanceClass="styles.domain.Propertie"
	 * @generated
	 */
	EDataType getPropertie();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.ss.usermodel.Workbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Workbook</em>'.
	 * @see org.apache.poi.ss.usermodel.Workbook
	 * @model instanceClass="org.apache.poi.ss.usermodel.Workbook"
	 * @generated
	 */
	EDataType getWorkbook();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.ss.usermodel.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sheet</em>'.
	 * @see org.apache.poi.ss.usermodel.Sheet
	 * @model instanceClass="org.apache.poi.ss.usermodel.Sheet"
	 * @generated
	 */
	EDataType getSheet();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.ss.usermodel.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cell</em>'.
	 * @see org.apache.poi.ss.usermodel.Cell
	 * @model instanceClass="org.apache.poi.ss.usermodel.Cell"
	 * @generated
	 */
	EDataType getCell();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '<em>Propertie</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see styles.domain.Propertie
		 * @see generator.datatypes.impl.DatatypesPackageImpl#getPropertie()
		 * @generated
		 */
		EDataType PROPERTIE = eINSTANCE.getPropertie();

		/**
		 * The meta object literal for the '<em>Workbook</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.ss.usermodel.Workbook
		 * @see generator.datatypes.impl.DatatypesPackageImpl#getWorkbook()
		 * @generated
		 */
		EDataType WORKBOOK = eINSTANCE.getWorkbook();

		/**
		 * The meta object literal for the '<em>Sheet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.ss.usermodel.Sheet
		 * @see generator.datatypes.impl.DatatypesPackageImpl#getSheet()
		 * @generated
		 */
		EDataType SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em>Cell</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.ss.usermodel.Cell
		 * @see generator.datatypes.impl.DatatypesPackageImpl#getCell()
		 * @generated
		 */
		EDataType CELL = eINSTANCE.getCell();

	}

} //DatatypesPackage
