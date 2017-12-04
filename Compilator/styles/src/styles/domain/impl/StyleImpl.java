/**
 */
package styles.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import styles.domain.Characteristic;
import styles.domain.DomainPackage;
import styles.domain.Style;
import styles.domain.StyleFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.impl.StyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link styles.domain.impl.StyleImpl#getTheCharacteristic <em>The Characteristic</em>}</li>
 *   <li>{@link styles.domain.impl.StyleImpl#getStyleFactory <em>Style Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style {
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
	 * The cached value of the '{@link #getTheCharacteristic() <em>The Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected Characteristic theCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getTheCharacteristic() {
		if (theCharacteristic != null && theCharacteristic.eIsProxy()) {
			InternalEObject oldTheCharacteristic = (InternalEObject)theCharacteristic;
			theCharacteristic = (Characteristic)eResolveProxy(oldTheCharacteristic);
			if (theCharacteristic != oldTheCharacteristic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.STYLE__THE_CHARACTERISTIC, oldTheCharacteristic, theCharacteristic));
			}
		}
		return theCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic basicGetTheCharacteristic() {
		return theCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCharacteristic(Characteristic newTheCharacteristic, NotificationChain msgs) {
		Characteristic oldTheCharacteristic = theCharacteristic;
		theCharacteristic = newTheCharacteristic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE__THE_CHARACTERISTIC, oldTheCharacteristic, newTheCharacteristic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCharacteristic(Characteristic newTheCharacteristic) {
		if (newTheCharacteristic != theCharacteristic) {
			NotificationChain msgs = null;
			if (theCharacteristic != null)
				msgs = ((InternalEObject)theCharacteristic).eInverseRemove(this, DomainPackage.CHARACTERISTIC__THE_SYTLE, Characteristic.class, msgs);
			if (newTheCharacteristic != null)
				msgs = ((InternalEObject)newTheCharacteristic).eInverseAdd(this, DomainPackage.CHARACTERISTIC__THE_SYTLE, Characteristic.class, msgs);
			msgs = basicSetTheCharacteristic(newTheCharacteristic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE__THE_CHARACTERISTIC, newTheCharacteristic, newTheCharacteristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactory getStyleFactory() {
		if (eContainerFeatureID() != DomainPackage.STYLE__STYLE_FACTORY) return null;
		return (StyleFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleFactory(StyleFactory newStyleFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStyleFactory, DomainPackage.STYLE__STYLE_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleFactory(StyleFactory newStyleFactory) {
		if (newStyleFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.STYLE__STYLE_FACTORY && newStyleFactory != null)) {
			if (EcoreUtil.isAncestor(this, newStyleFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStyleFactory != null)
				msgs = ((InternalEObject)newStyleFactory).eInverseAdd(this, DomainPackage.STYLE_FACTORY__LIST_STYLE, StyleFactory.class, msgs);
			msgs = basicSetStyleFactory(newStyleFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE__STYLE_FACTORY, newStyleFactory, newStyleFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				if (theCharacteristic != null)
					msgs = ((InternalEObject)theCharacteristic).eInverseRemove(this, DomainPackage.CHARACTERISTIC__THE_SYTLE, Characteristic.class, msgs);
				return basicSetTheCharacteristic((Characteristic)otherEnd, msgs);
			case DomainPackage.STYLE__STYLE_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStyleFactory((StyleFactory)otherEnd, msgs);
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
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				return basicSetTheCharacteristic(null, msgs);
			case DomainPackage.STYLE__STYLE_FACTORY:
				return basicSetStyleFactory(null, msgs);
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
			case DomainPackage.STYLE__STYLE_FACTORY:
				return eInternalContainer().eInverseRemove(this, DomainPackage.STYLE_FACTORY__LIST_STYLE, StyleFactory.class, msgs);
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
			case DomainPackage.STYLE__NAME:
				return getName();
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				if (resolve) return getTheCharacteristic();
				return basicGetTheCharacteristic();
			case DomainPackage.STYLE__STYLE_FACTORY:
				return getStyleFactory();
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
			case DomainPackage.STYLE__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				setTheCharacteristic((Characteristic)newValue);
				return;
			case DomainPackage.STYLE__STYLE_FACTORY:
				setStyleFactory((StyleFactory)newValue);
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
			case DomainPackage.STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				setTheCharacteristic((Characteristic)null);
				return;
			case DomainPackage.STYLE__STYLE_FACTORY:
				setStyleFactory((StyleFactory)null);
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
			case DomainPackage.STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.STYLE__THE_CHARACTERISTIC:
				return theCharacteristic != null;
			case DomainPackage.STYLE__STYLE_FACTORY:
				return getStyleFactory() != null;
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

} //StyleImpl
