/**
 */
package generator.apperance.orientation.impl;

import generator.apperance.orientation.Orientation;
import generator.apperance.orientation.OrientationPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.orientation.impl.OrientationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.orientation.impl.OrientationImpl#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrientationImpl extends MinimalEObjectImpl.Container implements Orientation {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrientationPackage.Literals.ORIENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrientationPackage.ORIENTATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainer getGenContainer() {
		if (eContainerFeatureID() != OrientationPackage.ORIENTATION__GEN_CONTAINER) return null;
		return (GenContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenContainer(GenContainer newGenContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenContainer, OrientationPackage.ORIENTATION__GEN_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenContainer(GenContainer newGenContainer) {
		if (newGenContainer != eInternalContainer() || (eContainerFeatureID() != OrientationPackage.ORIENTATION__GEN_CONTAINER && newGenContainer != null)) {
			if (EcoreUtil.isAncestor(this, newGenContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenContainer != null)
				msgs = ((InternalEObject)newGenContainer).eInverseAdd(this, GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION, GenContainer.class, msgs);
			msgs = basicSetGenContainer(newGenContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrientationPackage.ORIENTATION__GEN_CONTAINER, newGenContainer, newGenContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenContainer((GenContainer)otherEnd, msgs);
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
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				return basicSetGenContainer(null, msgs);
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
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				return eInternalContainer().eInverseRemove(this, GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION, GenContainer.class, msgs);
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
			case OrientationPackage.ORIENTATION__VALUE:
				return getValue();
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				return getGenContainer();
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
			case OrientationPackage.ORIENTATION__VALUE:
				setValue((String)newValue);
				return;
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				setGenContainer((GenContainer)newValue);
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
			case OrientationPackage.ORIENTATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				setGenContainer((GenContainer)null);
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
			case OrientationPackage.ORIENTATION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OrientationPackage.ORIENTATION__GEN_CONTAINER:
				return getGenContainer() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //OrientationImpl
