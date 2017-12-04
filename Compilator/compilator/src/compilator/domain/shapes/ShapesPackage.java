/**
 */
package compilator.domain.shapes;

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
 * @see compilator.domain.shapes.ShapesFactory
 * @model kind="package"
 * @generated
 */
public interface ShapesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shapes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/shapes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.shapes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShapesPackage eINSTANCE = compilator.domain.shapes.impl.ShapesPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.shapes.impl.ShapesImpl <em>Shapes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.shapes.impl.ShapesImpl
	 * @see compilator.domain.shapes.impl.ShapesPackageImpl#getShapes()
	 * @generated
	 */
	int SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>List Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES__LIST_COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Shapes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Shapes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link compilator.domain.shapes.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.shapes.impl.ComponentImpl
	 * @see compilator.domain.shapes.impl.ShapesPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SHAPES = 1;

	/**
	 * The feature id for the '<em><b>The Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>The Sentence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THE_SENTENCE = 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.shapes.Shapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes</em>'.
	 * @see compilator.domain.shapes.Shapes
	 * @generated
	 */
	EClass getShapes();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.shapes.Shapes#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see compilator.domain.shapes.Shapes#getDomain()
	 * @see #getShapes()
	 * @generated
	 */
	EReference getShapes_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.shapes.Shapes#getListComponents <em>List Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Components</em>'.
	 * @see compilator.domain.shapes.Shapes#getListComponents()
	 * @see #getShapes()
	 * @generated
	 */
	EReference getShapes_ListComponents();

	/**
	 * Returns the meta object for class '{@link compilator.domain.shapes.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see compilator.domain.shapes.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.shapes.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see compilator.domain.shapes.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.shapes.Component#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Shapes</em>'.
	 * @see compilator.domain.shapes.Component#getShapes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Shapes();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.shapes.Component#getTheElement <em>The Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Element</em>'.
	 * @see compilator.domain.shapes.Component#getTheElement()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TheElement();

	/**
	 * Returns the meta object for the containment reference '{@link compilator.domain.shapes.Component#getTheSentence <em>The Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Sentence</em>'.
	 * @see compilator.domain.shapes.Component#getTheSentence()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TheSentence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapesFactory getShapesFactory();

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
		 * The meta object literal for the '{@link compilator.domain.shapes.impl.ShapesImpl <em>Shapes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.shapes.impl.ShapesImpl
		 * @see compilator.domain.shapes.impl.ShapesPackageImpl#getShapes()
		 * @generated
		 */
		EClass SHAPES = eINSTANCE.getShapes();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES__DOMAIN = eINSTANCE.getShapes_Domain();

		/**
		 * The meta object literal for the '<em><b>List Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES__LIST_COMPONENTS = eINSTANCE.getShapes_ListComponents();

		/**
		 * The meta object literal for the '{@link compilator.domain.shapes.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.shapes.impl.ComponentImpl
		 * @see compilator.domain.shapes.impl.ShapesPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SHAPES = eINSTANCE.getComponent_Shapes();

		/**
		 * The meta object literal for the '<em><b>The Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THE_ELEMENT = eINSTANCE.getComponent_TheElement();

		/**
		 * The meta object literal for the '<em><b>The Sentence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THE_SENTENCE = eINSTANCE.getComponent_TheSentence();

	}

} //ShapesPackage
