/**
 */
package compilator.domain.expression.expressionmodel.containercomponent.impl;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainerElement;
import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.expression.expressionmodel.impl.ElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl#getListElements <em>List Elements</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.containercomponent.impl.ContainerElementImpl#getIsVisible <em>Is Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerElementImpl extends ElementImpl implements ContainerElement {
	/**
	 * The cached value of the '{@link #getListElements() <em>List Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> listElements;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVisible()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVisible = IS_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainercomponentPackage.Literals.CONTAINER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getListElements() {
		if (listElements == null) {
			listElements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS, ExpressionmodelPackage.ELEMENT__CONTAINER_ELEMENT);
		}
		return listElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVisible() {
		return isVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisible(Boolean newIsVisible) {
		Boolean oldIsVisible = isVisible;
		isVisible = newIsVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE, oldIsVisible, isVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElements()).basicAdd(otherEnd, msgs);
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
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				return ((InternalEList<?>)getListElements()).basicRemove(otherEnd, msgs);
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
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				return getListElements();
			case ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION:
				return getOrientation();
			case ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE:
				return getIsVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				getListElements().clear();
				getListElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE:
				setIsVisible((Boolean)newValue);
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
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				getListElements().clear();
				return;
			case ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE:
				setIsVisible(IS_VISIBLE_EDEFAULT);
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
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				return listElements != null && !listElements.isEmpty();
			case ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE:
				return IS_VISIBLE_EDEFAULT == null ? isVisible != null : !IS_VISIBLE_EDEFAULT.equals(isVisible);
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(", isVisible: ");
		result.append(isVisible);
		result.append(')');
		return result.toString();
	}

} //ContainerElementImpl
