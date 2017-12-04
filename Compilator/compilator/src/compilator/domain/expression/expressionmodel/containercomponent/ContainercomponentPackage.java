/**
 */
package compilator.domain.expression.expressionmodel.containercomponent;

import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

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
 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory
 * @model kind="package"
 * @generated
 */
public interface ContainercomponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "containercomponent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/expression/expressionmodel/containercomponent.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.expression.expressionmodel.containercomponent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContainercomponentPackage eINSTANCE = compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl
	 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__NAME = ExpressionmodelPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__CONTAINER_ELEMENT = ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__EXPRESSION_MODEL = ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__THE_STYLE = ExpressionmodelPackage.ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__COMPONENT = ExpressionmodelPackage.ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__LIST_ELEMENTS = ExpressionmodelPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__ORIENTATION = ExpressionmodelPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__IS_VISIBLE = ExpressionmodelPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = ExpressionmodelPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_OPERATION_COUNT = ExpressionmodelPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerImpl
	 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = CONTAINER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_ELEMENT = CONTAINER_ELEMENT__CONTAINER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__EXPRESSION_MODEL = CONTAINER_ELEMENT__EXPRESSION_MODEL;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__THE_STYLE = CONTAINER_ELEMENT__THE_STYLE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMPONENT = CONTAINER_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LIST_ELEMENTS = CONTAINER_ELEMENT__LIST_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ORIENTATION = CONTAINER_ELEMENT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_VISIBLE = CONTAINER_ELEMENT__IS_VISIBLE;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = CONTAINER_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elements</em>'.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getListElements()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement_ListElements();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getOrientation()
	 * @see #getContainerElement()
	 * @generated
	 */
	EAttribute getContainerElement_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getIsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible</em>'.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.ContainerElement#getIsVisible()
	 * @see #getContainerElement()
	 * @generated
	 */
	EAttribute getContainerElement_IsVisible();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.containercomponent.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see compilator.domain.expression.expressionmodel.containercomponent.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContainercomponentFactory getContainercomponentFactory();

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
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl
		 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>List Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__LIST_ELEMENTS = eINSTANCE.getContainerElement_ListElements();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ELEMENT__ORIENTATION = eINSTANCE.getContainerElement_Orientation();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ELEMENT__IS_VISIBLE = eINSTANCE.getContainerElement_IsVisible();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerImpl
		 * @see compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

	}

} //ContainercomponentPackage
