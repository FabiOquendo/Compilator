/**
 */
package generator.genmodel.gencontainercomponent;

import generator.genmodel.GenmodelPackage;

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
 * @see generator.genmodel.gencontainercomponent.GencontainercomponentFactory
 * @model kind="package"
 * @generated
 */
public interface GencontainercomponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gencontainercomponent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/gencontainercomponent.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.gencontainercomponent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencontainercomponentPackage eINSTANCE = generator.genmodel.gencontainercomponent.impl.GencontainercomponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl <em>Gen Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl
	 * @see generator.genmodel.gencontainercomponent.impl.GencontainercomponentPackageImpl#getGenContainerElement()
	 * @generated
	 */
	int GEN_CONTAINER_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__GEN_MODEL = GenmodelPackage.GEN_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__GEN_CONTAINER_ELEMENT = GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_X = GenmodelPackage.GEN_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_Y = GenmodelPackage.GEN_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_WIDTH = GenmodelPackage.GEN_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_HEIGHT = GenmodelPackage.GEN_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_COLOR = GenmodelPackage.GEN_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_TYPE = GenmodelPackage.GEN_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__THE_SIZE = GenmodelPackage.GEN_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__NAME = GenmodelPackage.GEN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>List Gen Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS = GenmodelPackage.GEN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT_FEATURE_COUNT = GenmodelPackage.GEN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_X = GenmodelPackage.GEN_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_Y = GenmodelPackage.GEN_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_WIDTH = GenmodelPackage.GEN_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_HEIGHT = GenmodelPackage.GEN_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_FONT_COLOR = GenmodelPackage.GEN_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_FONT_TYPE = GenmodelPackage.GEN_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_FONT_SIZE = GenmodelPackage.GEN_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___CREATE_PROPERTIES = GenmodelPackage.GEN_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT___SET_DEFAULT_FONT = GenmodelPackage.GEN_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The number of operations of the '<em>Gen Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_ELEMENT_OPERATION_COUNT = GenmodelPackage.GEN_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.gencontainercomponent.GenContainerElement <em>Gen Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Container Element</em>'.
	 * @see generator.genmodel.gencontainercomponent.GenContainerElement
	 * @generated
	 */
	EClass getGenContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.genmodel.gencontainercomponent.GenContainerElement#getListGenElements <em>List Gen Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Gen Elements</em>'.
	 * @see generator.genmodel.gencontainercomponent.GenContainerElement#getListGenElements()
	 * @see #getGenContainerElement()
	 * @generated
	 */
	EReference getGenContainerElement_ListGenElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GencontainercomponentFactory getGencontainercomponentFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl <em>Gen Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl
		 * @see generator.genmodel.gencontainercomponent.impl.GencontainercomponentPackageImpl#getGenContainerElement()
		 * @generated
		 */
		EClass GEN_CONTAINER_ELEMENT = eINSTANCE.getGenContainerElement();

		/**
		 * The meta object literal for the '<em><b>List Gen Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS = eINSTANCE.getGenContainerElement_ListGenElements();

	}

} //GencontainercomponentPackage
