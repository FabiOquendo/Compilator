/**
 */
package compilator.domain.expression.expressionmodel;

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
 * @see compilator.domain.expression.expressionmodel.ExpressionmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressionmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///compilator/domain/expression/expressionmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compilator.domain.expression.expressionmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionmodelPackage eINSTANCE = compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.impl.ElementImpl
	 * @see compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINER_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Expression Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXPRESSION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__THE_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPONENT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl <em>Expression Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl
	 * @see compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl#getExpressionModel()
	 * @generated
	 */
	int EXPRESSION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>The Sentence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL__THE_SENTENCE = 1;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL__LIST_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Expression Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expression Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link compilator.domain.expression.expressionmodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.Element#getContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Element</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element#getContainerElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ContainerElement();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.Element#getExpressionModel <em>Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Expression Model</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element#getExpressionModel()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ExpressionModel();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.expression.expressionmodel.Element#getTheStyle <em>The Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Style</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element#getTheStyle()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_TheStyle();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.Element#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see compilator.domain.expression.expressionmodel.Element#getComponent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Component();

	/**
	 * Returns the meta object for class '{@link compilator.domain.expression.expressionmodel.ExpressionModel <em>Expression Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Model</em>'.
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel
	 * @generated
	 */
	EClass getExpressionModel();

	/**
	 * Returns the meta object for the container reference '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Expression</em>'.
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getExpression()
	 * @see #getExpressionModel()
	 * @generated
	 */
	EReference getExpressionModel_Expression();

	/**
	 * Returns the meta object for the reference '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence <em>The Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Sentence</em>'.
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getTheSentence()
	 * @see #getExpressionModel()
	 * @generated
	 */
	EReference getExpressionModel_TheSentence();

	/**
	 * Returns the meta object for the containment reference list '{@link compilator.domain.expression.expressionmodel.ExpressionModel#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Elements</em>'.
	 * @see compilator.domain.expression.expressionmodel.ExpressionModel#getListElements()
	 * @see #getExpressionModel()
	 * @generated
	 */
	EReference getExpressionModel_ListElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionmodelFactory getExpressionmodelFactory();

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
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.impl.ElementImpl
		 * @see compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Container Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONTAINER_ELEMENT = eINSTANCE.getElement_ContainerElement();

		/**
		 * The meta object literal for the '<em><b>Expression Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXPRESSION_MODEL = eINSTANCE.getElement_ExpressionModel();

		/**
		 * The meta object literal for the '<em><b>The Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__THE_STYLE = eINSTANCE.getElement_TheStyle();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__COMPONENT = eINSTANCE.getElement_Component();

		/**
		 * The meta object literal for the '{@link compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl <em>Expression Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl
		 * @see compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl#getExpressionModel()
		 * @generated
		 */
		EClass EXPRESSION_MODEL = eINSTANCE.getExpressionModel();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL__EXPRESSION = eINSTANCE.getExpressionModel_Expression();

		/**
		 * The meta object literal for the '<em><b>The Sentence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL__THE_SENTENCE = eINSTANCE.getExpressionModel_TheSentence();

		/**
		 * The meta object literal for the '<em><b>List Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODEL__LIST_ELEMENTS = eINSTANCE.getExpressionModel_ListElements();

	}

} //ExpressionmodelPackage
