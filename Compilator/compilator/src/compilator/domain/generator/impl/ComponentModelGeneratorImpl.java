/**
 */
package compilator.domain.generator.impl;

import compilator.domain.generator.ComponentModelGenerator;
import compilator.domain.generator.ExpressionModelManager;
import compilator.domain.generator.GeneratorPackage;

import compilator.domain.shapes.Component;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.impl.ComponentModelGeneratorImpl#getExpressionManager <em>Expression Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentModelGeneratorImpl extends MinimalEObjectImpl.Container implements ComponentModelGenerator {
	/**
	 * The cached value of the '{@link #getExpressionManager() <em>Expression Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionManager()
	 * @generated
	 * @ordered
	 */
	protected ExpressionModelManager expressionManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.COMPONENT_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelManager getExpressionManager() {
		if (expressionManager != null && expressionManager.eIsProxy()) {
			InternalEObject oldExpressionManager = (InternalEObject)expressionManager;
			expressionManager = (ExpressionModelManager)eResolveProxy(oldExpressionManager);
			if (expressionManager != oldExpressionManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, oldExpressionManager, expressionManager));
			}
		}
		return expressionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelManager basicGetExpressionManager() {
		return expressionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionManager(ExpressionModelManager newExpressionManager, NotificationChain msgs) {
		ExpressionModelManager oldExpressionManager = expressionManager;
		expressionManager = newExpressionManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, oldExpressionManager, newExpressionManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionManager(ExpressionModelManager newExpressionManager) {
		if (newExpressionManager != expressionManager) {
			NotificationChain msgs = null;
			if (expressionManager != null)
				msgs = ((InternalEObject)expressionManager).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, ExpressionModelManager.class, msgs);
			if (newExpressionManager != null)
				msgs = ((InternalEObject)newExpressionManager).eInverseAdd(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, ExpressionModelManager.class, msgs);
			msgs = basicSetExpressionManager(newExpressionManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, newExpressionManager, newExpressionManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exploreSentence(final String s, final compilator.domain.expression.expressionmodel.containercomponent.Container parent) {
		java.lang.Object [] elements = expressionManager.split(s).toArray();
				
				for(int i=0;i<elements.length;i++){
					String textElement =  (String)elements[i];
						
					if(expressionManager.isContainer(textElement)){
						
						compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
						String body = expressionManager.createContainer(textElement,container);
						exploreSentence(body,container);
						parent.getListElements().add(container);
					
					}else{
						parent.getListElements().add(expressionManager.createIndividualElement(textElement));
					}
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent(final String nameComponent, final String formatedSentence, final String unformatedSentence) {
				compilator.domain.shapes.Component component = compilator.domain.shapes.ShapesFactory.eINSTANCE.createComponent();
				component.setName(nameComponent);
				
				compilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();
				sentence.setFullSentence(unformatedSentence);
				component.setTheSentence(sentence);
				java.lang.Object [] elements = expressionManager.split(formatedSentence).toArray();
				
				for(int i=0;i<elements.length;i++){
					
					String textElement = (String) elements[i];
					
					if(expressionManager.isContainer(textElement)){
						
						compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
					
						String body = expressionManager.createContainer(textElement,container);
						
						exploreSentence(body,container);
						component.setTheElement(container);
					}else{
						component.setTheElement(expressionManager.createIndividualElement(textElement));
					}
				}
				return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				if (expressionManager != null)
					msgs = ((InternalEObject)expressionManager).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, ExpressionModelManager.class, msgs);
				return basicSetExpressionManager((ExpressionModelManager)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				return basicSetExpressionManager(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				if (resolve) return getExpressionManager();
				return basicGetExpressionManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				setExpressionManager((ExpressionModelManager)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				setExpressionManager((ExpressionModelManager)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER:
				return expressionManager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER:
				exploreSentence((String)arguments.get(0), (compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(1));
				return null;
			case GeneratorPackage.COMPONENT_MODEL_GENERATOR___CREATE_COMPONENT__STRING_STRING_STRING:
				return createComponent((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentModelGeneratorImpl
