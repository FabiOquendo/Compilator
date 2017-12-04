/**
 */
package generator.genmodel.gencontainercomponent.gencontainer;

import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see generator.genmodel.gencontainercomponent.gencontainer.GencontainerFactory
 * @model kind="package"
 * @generated
 */
public interface GencontainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gencontainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel/gencontainercomponent/gencontainer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel.gencontainercomponent.gencontainer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GencontainerPackage eINSTANCE = generator.genmodel.gencontainercomponent.gencontainer.impl.GencontainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl <em>Gen Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl
	 * @see generator.genmodel.gencontainercomponent.gencontainer.impl.GencontainerPackageImpl#getGenContainer()
	 * @generated
	 */
	int GEN_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__GEN_MODEL = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__GEN_MODEL;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__GEN_CONTAINER_ELEMENT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__GEN_CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_X = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_X;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_Y = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_Y;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_WIDTH = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_WIDTH;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_HEIGHT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_HEIGHT;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_COLOR = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_COLOR;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_TYPE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_TYPE;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_SIZE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__THE_SIZE;

	/**
	 * The feature id for the '<em><b>List Gen Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__LIST_GEN_ELEMENTS = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>The Title Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_TITLE_HEIGHT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_CONTAINER = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER__THE_BACKGROUND = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_FEATURE_COUNT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_X = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_X;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_Y = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_Y;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_WIDTH = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_WIDTH;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_HEIGHT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_HEIGHT;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_FONT_COLOR = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_FONT_COLOR;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_FONT_TYPE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_FONT_TYPE;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_FONT_SIZE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_FONT_SIZE;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_PROPERTIES = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___CREATE_PROPERTIES;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___SET_DEFAULT_FONT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT___SET_DEFAULT_FONT;

	/**
	 * The operation id for the '<em>Create Properties Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_PROPERTIES_CONTAINER__PROPERTIE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_BACKGROUND = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Title Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___CREATE_TITLE_HEIGHT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Default Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER___SET_DEFAULT_CONTAINER__PROPERTIE = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gen Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_CONTAINER_OPERATION_COUNT = GencontainercomponentPackage.GEN_CONTAINER_ELEMENT_OPERATION_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer <em>Gen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Container</em>'.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer
	 * @generated
	 */
	EClass getGenContainer();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight <em>The Title Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Title Height</em>'.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheTitleHeight()
	 * @see #getGenContainer()
	 * @generated
	 */
	EReference getGenContainer_TheTitleHeight();

	/**
	 * Returns the meta object for the reference '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheContainer <em>The Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Container</em>'.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheContainer()
	 * @see #getGenContainer()
	 * @generated
	 */
	EReference getGenContainer_TheContainer();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground <em>The Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Background</em>'.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#getTheBackground()
	 * @see #getGenContainer()
	 * @generated
	 */
	EReference getGenContainer_TheBackground();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createPropertiesContainer(styles.domain.Propertie) <em>Create Properties Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties Container</em>' operation.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createPropertiesContainer(styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenContainer__CreatePropertiesContainer__Propertie();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createBackground() <em>Create Background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Background</em>' operation.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createBackground()
	 * @generated
	 */
	EOperation getGenContainer__CreateBackground();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createTitleHeight() <em>Create Title Height</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Title Height</em>' operation.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#createTitleHeight()
	 * @generated
	 */
	EOperation getGenContainer__CreateTitleHeight();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.gencontainercomponent.gencontainer.GenContainer#setDefaultContainer(styles.domain.Propertie) <em>Set Default Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Container</em>' operation.
	 * @see generator.genmodel.gencontainercomponent.gencontainer.GenContainer#setDefaultContainer(styles.domain.Propertie)
	 * @generated
	 */
	EOperation getGenContainer__SetDefaultContainer__Propertie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GencontainerFactory getGencontainerFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl <em>Gen Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl
		 * @see generator.genmodel.gencontainercomponent.gencontainer.impl.GencontainerPackageImpl#getGenContainer()
		 * @generated
		 */
		EClass GEN_CONTAINER = eINSTANCE.getGenContainer();

		/**
		 * The meta object literal for the '<em><b>The Title Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTAINER__THE_TITLE_HEIGHT = eINSTANCE.getGenContainer_TheTitleHeight();

		/**
		 * The meta object literal for the '<em><b>The Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTAINER__THE_CONTAINER = eINSTANCE.getGenContainer_TheContainer();

		/**
		 * The meta object literal for the '<em><b>The Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_CONTAINER__THE_BACKGROUND = eINSTANCE.getGenContainer_TheBackground();

		/**
		 * The meta object literal for the '<em><b>Create Properties Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_CONTAINER___CREATE_PROPERTIES_CONTAINER__PROPERTIE = eINSTANCE.getGenContainer__CreatePropertiesContainer__Propertie();

		/**
		 * The meta object literal for the '<em><b>Create Background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_CONTAINER___CREATE_BACKGROUND = eINSTANCE.getGenContainer__CreateBackground();

		/**
		 * The meta object literal for the '<em><b>Create Title Height</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_CONTAINER___CREATE_TITLE_HEIGHT = eINSTANCE.getGenContainer__CreateTitleHeight();

		/**
		 * The meta object literal for the '<em><b>Set Default Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_CONTAINER___SET_DEFAULT_CONTAINER__PROPERTIE = eINSTANCE.getGenContainer__SetDefaultContainer__Propertie();

	}

} //GencontainerPackage
