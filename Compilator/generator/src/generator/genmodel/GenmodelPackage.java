/**
 */
package generator.genmodel;

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
 * @see generator.genmodel.GenmodelFactory
 * @model kind="package"
 * @generated
 */
public interface GenmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///generator/genmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "generator.genmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenmodelPackage eINSTANCE = generator.genmodel.impl.GenmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link generator.genmodel.impl.GenElementImpl <em>Gen Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.impl.GenElementImpl
	 * @see generator.genmodel.impl.GenmodelPackageImpl#getGenElement()
	 * @generated
	 */
	int GEN_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gen Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__GEN_CONTAINER_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>The X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_X = 2;

	/**
	 * The feature id for the '<em><b>The Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_Y = 3;

	/**
	 * The feature id for the '<em><b>The Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_WIDTH = 4;

	/**
	 * The feature id for the '<em><b>The Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>The Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_COLOR = 6;

	/**
	 * The feature id for the '<em><b>The Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>The Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT__THE_SIZE = 8;

	/**
	 * The number of structural features of the '<em>Gen Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Create X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_X = 0;

	/**
	 * The operation id for the '<em>Create Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_Y = 1;

	/**
	 * The operation id for the '<em>Create Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_WIDTH = 2;

	/**
	 * The operation id for the '<em>Create Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_HEIGHT = 3;

	/**
	 * The operation id for the '<em>Create Font Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_FONT_COLOR = 4;

	/**
	 * The operation id for the '<em>Create Font Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_FONT_TYPE = 5;

	/**
	 * The operation id for the '<em>Create Font Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_FONT_SIZE = 6;

	/**
	 * The operation id for the '<em>Create Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___CREATE_PROPERTIES = 7;

	/**
	 * The operation id for the '<em>Set Default Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT___SET_DEFAULT_FONT = 8;

	/**
	 * The number of operations of the '<em>Gen Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_ELEMENT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link generator.genmodel.impl.GenModelImpl <em>Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.genmodel.impl.GenModelImpl
	 * @see generator.genmodel.impl.GenmodelPackageImpl#getGenModel()
	 * @generated
	 */
	int GEN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>List Gen Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL__LIST_GEN_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link generator.genmodel.GenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Element</em>'.
	 * @see generator.genmodel.GenElement
	 * @generated
	 */
	EClass getGenElement();

	/**
	 * Returns the meta object for the container reference '{@link generator.genmodel.GenElement#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Model</em>'.
	 * @see generator.genmodel.GenElement#getGenModel()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_GenModel();

	/**
	 * Returns the meta object for the container reference '{@link generator.genmodel.GenElement#getGenContainerElement <em>Gen Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Container Element</em>'.
	 * @see generator.genmodel.GenElement#getGenContainerElement()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_GenContainerElement();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheX <em>The X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The X</em>'.
	 * @see generator.genmodel.GenElement#getTheX()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheX();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheY <em>The Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Y</em>'.
	 * @see generator.genmodel.GenElement#getTheY()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheY();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheWidth <em>The Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Width</em>'.
	 * @see generator.genmodel.GenElement#getTheWidth()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheWidth();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheHeight <em>The Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Height</em>'.
	 * @see generator.genmodel.GenElement#getTheHeight()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheHeight();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheColor <em>The Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Color</em>'.
	 * @see generator.genmodel.GenElement#getTheColor()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheColor();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheType <em>The Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Type</em>'.
	 * @see generator.genmodel.GenElement#getTheType()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheType();

	/**
	 * Returns the meta object for the containment reference '{@link generator.genmodel.GenElement#getTheSize <em>The Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Size</em>'.
	 * @see generator.genmodel.GenElement#getTheSize()
	 * @see #getGenElement()
	 * @generated
	 */
	EReference getGenElement_TheSize();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createX() <em>Create X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create X</em>' operation.
	 * @see generator.genmodel.GenElement#createX()
	 * @generated
	 */
	EOperation getGenElement__CreateX();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createY() <em>Create Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Y</em>' operation.
	 * @see generator.genmodel.GenElement#createY()
	 * @generated
	 */
	EOperation getGenElement__CreateY();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createWidth() <em>Create Width</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Width</em>' operation.
	 * @see generator.genmodel.GenElement#createWidth()
	 * @generated
	 */
	EOperation getGenElement__CreateWidth();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createHeight() <em>Create Height</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Height</em>' operation.
	 * @see generator.genmodel.GenElement#createHeight()
	 * @generated
	 */
	EOperation getGenElement__CreateHeight();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createFontColor() <em>Create Font Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Font Color</em>' operation.
	 * @see generator.genmodel.GenElement#createFontColor()
	 * @generated
	 */
	EOperation getGenElement__CreateFontColor();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createFontType() <em>Create Font Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Font Type</em>' operation.
	 * @see generator.genmodel.GenElement#createFontType()
	 * @generated
	 */
	EOperation getGenElement__CreateFontType();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createFontSize() <em>Create Font Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Font Size</em>' operation.
	 * @see generator.genmodel.GenElement#createFontSize()
	 * @generated
	 */
	EOperation getGenElement__CreateFontSize();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#createProperties() <em>Create Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Properties</em>' operation.
	 * @see generator.genmodel.GenElement#createProperties()
	 * @generated
	 */
	EOperation getGenElement__CreateProperties();

	/**
	 * Returns the meta object for the '{@link generator.genmodel.GenElement#setDefaultFont() <em>Set Default Font</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Default Font</em>' operation.
	 * @see generator.genmodel.GenElement#setDefaultFont()
	 * @generated
	 */
	EOperation getGenElement__SetDefaultFont();

	/**
	 * Returns the meta object for class '{@link generator.genmodel.GenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Model</em>'.
	 * @see generator.genmodel.GenModel
	 * @generated
	 */
	EClass getGenModel();

	/**
	 * Returns the meta object for the container reference '{@link generator.genmodel.GenModel#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generator</em>'.
	 * @see generator.genmodel.GenModel#getGenerator()
	 * @see #getGenModel()
	 * @generated
	 */
	EReference getGenModel_Generator();

	/**
	 * Returns the meta object for the containment reference list '{@link generator.genmodel.GenModel#getListGenElements <em>List Gen Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Gen Elements</em>'.
	 * @see generator.genmodel.GenModel#getListGenElements()
	 * @see #getGenModel()
	 * @generated
	 */
	EReference getGenModel_ListGenElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenmodelFactory getGenmodelFactory();

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
		 * The meta object literal for the '{@link generator.genmodel.impl.GenElementImpl <em>Gen Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.impl.GenElementImpl
		 * @see generator.genmodel.impl.GenmodelPackageImpl#getGenElement()
		 * @generated
		 */
		EClass GEN_ELEMENT = eINSTANCE.getGenElement();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__GEN_MODEL = eINSTANCE.getGenElement_GenModel();

		/**
		 * The meta object literal for the '<em><b>Gen Container Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__GEN_CONTAINER_ELEMENT = eINSTANCE.getGenElement_GenContainerElement();

		/**
		 * The meta object literal for the '<em><b>The X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_X = eINSTANCE.getGenElement_TheX();

		/**
		 * The meta object literal for the '<em><b>The Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_Y = eINSTANCE.getGenElement_TheY();

		/**
		 * The meta object literal for the '<em><b>The Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_WIDTH = eINSTANCE.getGenElement_TheWidth();

		/**
		 * The meta object literal for the '<em><b>The Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_HEIGHT = eINSTANCE.getGenElement_TheHeight();

		/**
		 * The meta object literal for the '<em><b>The Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_COLOR = eINSTANCE.getGenElement_TheColor();

		/**
		 * The meta object literal for the '<em><b>The Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_TYPE = eINSTANCE.getGenElement_TheType();

		/**
		 * The meta object literal for the '<em><b>The Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_ELEMENT__THE_SIZE = eINSTANCE.getGenElement_TheSize();

		/**
		 * The meta object literal for the '<em><b>Create X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_X = eINSTANCE.getGenElement__CreateX();

		/**
		 * The meta object literal for the '<em><b>Create Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_Y = eINSTANCE.getGenElement__CreateY();

		/**
		 * The meta object literal for the '<em><b>Create Width</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_WIDTH = eINSTANCE.getGenElement__CreateWidth();

		/**
		 * The meta object literal for the '<em><b>Create Height</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_HEIGHT = eINSTANCE.getGenElement__CreateHeight();

		/**
		 * The meta object literal for the '<em><b>Create Font Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_FONT_COLOR = eINSTANCE.getGenElement__CreateFontColor();

		/**
		 * The meta object literal for the '<em><b>Create Font Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_FONT_TYPE = eINSTANCE.getGenElement__CreateFontType();

		/**
		 * The meta object literal for the '<em><b>Create Font Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_FONT_SIZE = eINSTANCE.getGenElement__CreateFontSize();

		/**
		 * The meta object literal for the '<em><b>Create Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___CREATE_PROPERTIES = eINSTANCE.getGenElement__CreateProperties();

		/**
		 * The meta object literal for the '<em><b>Set Default Font</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEN_ELEMENT___SET_DEFAULT_FONT = eINSTANCE.getGenElement__SetDefaultFont();

		/**
		 * The meta object literal for the '{@link generator.genmodel.impl.GenModelImpl <em>Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.genmodel.impl.GenModelImpl
		 * @see generator.genmodel.impl.GenmodelPackageImpl#getGenModel()
		 * @generated
		 */
		EClass GEN_MODEL = eINSTANCE.getGenModel();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL__GENERATOR = eINSTANCE.getGenModel_Generator();

		/**
		 * The meta object literal for the '<em><b>List Gen Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_MODEL__LIST_GEN_ELEMENTS = eINSTANCE.getGenModel_ListGenElements();

	}

} //GenmodelPackage
