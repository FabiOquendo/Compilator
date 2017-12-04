/**
 */
package compilator.domain.expression.expressionmodel.impl;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainerElement;
import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.shapes.Component;
import compilator.domain.shapes.ShapesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ElementImpl#getContainerElement <em>Container Element</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ElementImpl#getExpressionModel <em>Expression Model</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ElementImpl#getTheStyle <em>The Style</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ElementImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheStyle() <em>The Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheStyle()
	 * @generated
	 * @ordered
	 */
	protected Style theStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionmodelPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerElement getContainerElement() {
		if (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT) return null;
		return (ContainerElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerElement(ContainerElement newContainerElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainerElement, ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerElement(ContainerElement newContainerElement) {
		if (newContainerElement != eInternalContainer() || (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT && newContainerElement != null)) {
			if (EcoreUtil.isAncestor(this, newContainerElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainerElement != null)
				msgs = ((InternalEObject)newContainerElement).eInverseAdd(this, ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS, ContainerElement.class, msgs);
			msgs = basicSetContainerElement(newContainerElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT, newContainerElement, newContainerElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModel getExpressionModel() {
		if (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL) return null;
		return (ExpressionModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionModel(ExpressionModel newExpressionModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExpressionModel, ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionModel(ExpressionModel newExpressionModel) {
		if (newExpressionModel != eInternalContainer() || (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL && newExpressionModel != null)) {
			if (EcoreUtil.isAncestor(this, newExpressionModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExpressionModel != null)
				msgs = ((InternalEObject)newExpressionModel).eInverseAdd(this, ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS, ExpressionModel.class, msgs);
			msgs = basicSetExpressionModel(newExpressionModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL, newExpressionModel, newExpressionModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style getTheStyle() {
		if (theStyle != null && theStyle.eIsProxy()) {
			InternalEObject oldTheStyle = (InternalEObject)theStyle;
			theStyle = (Style)eResolveProxy(oldTheStyle);
			if (theStyle != oldTheStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionmodelPackage.ELEMENT__THE_STYLE, oldTheStyle, theStyle));
			}
		}
		return theStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style basicGetTheStyle() {
		return theStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheStyle(Style newTheStyle) {
		Style oldTheStyle = theStyle;
		theStyle = newTheStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.ELEMENT__THE_STYLE, oldTheStyle, theStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ExpressionmodelPackage.ELEMENT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ExpressionmodelPackage.ELEMENT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ShapesPackage.COMPONENT__THE_ELEMENT, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.ELEMENT__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainerElement((ContainerElement)otherEnd, msgs);
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExpressionModel((ExpressionModel)otherEnd, msgs);
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				return basicSetContainerElement(null, msgs);
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				return basicSetExpressionModel(null, msgs);
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				return basicSetComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS, ContainerElement.class, msgs);
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				return eInternalContainer().eInverseRemove(this, ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS, ExpressionModel.class, msgs);
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ShapesPackage.COMPONENT__THE_ELEMENT, Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionmodelPackage.ELEMENT__NAME:
				return getName();
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				return getContainerElement();
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				return getExpressionModel();
			case ExpressionmodelPackage.ELEMENT__THE_STYLE:
				if (resolve) return getTheStyle();
				return basicGetTheStyle();
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				return getComponent();
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
			case ExpressionmodelPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				setContainerElement((ContainerElement)newValue);
				return;
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				setExpressionModel((ExpressionModel)newValue);
				return;
			case ExpressionmodelPackage.ELEMENT__THE_STYLE:
				setTheStyle((Style)newValue);
				return;
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				setComponent((Component)newValue);
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
			case ExpressionmodelPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				setContainerElement((ContainerElement)null);
				return;
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				setExpressionModel((ExpressionModel)null);
				return;
			case ExpressionmodelPackage.ELEMENT__THE_STYLE:
				setTheStyle((Style)null);
				return;
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				setComponent((Component)null);
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
			case ExpressionmodelPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT:
				return getContainerElement() != null;
			case ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL:
				return getExpressionModel() != null;
			case ExpressionmodelPackage.ELEMENT__THE_STYLE:
				return theStyle != null;
			case ExpressionmodelPackage.ELEMENT__COMPONENT:
				return getComponent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
