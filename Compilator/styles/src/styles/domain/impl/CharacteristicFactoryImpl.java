/**
 */
package styles.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import styles.domain.Characteristic;
import styles.domain.CharacteristicFactory;
import styles.domain.Domain;
import styles.domain.DomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.impl.CharacteristicFactoryImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link styles.domain.impl.CharacteristicFactoryImpl#getListCharacteristic <em>List Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicFactoryImpl extends MinimalEObjectImpl.Container implements CharacteristicFactory {
	/**
	 * The cached value of the '{@link #getListCharacteristic() <em>List Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<Characteristic> listCharacteristic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CHARACTERISTIC_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Characteristic> getListCharacteristic() {
		if (listCharacteristic == null) {
			listCharacteristic = new EObjectContainmentWithInverseEList<Characteristic>(Characteristic.class, this, DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC, DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY);
		}
		return listCharacteristic;
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListCharacteristic()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				return ((InternalEList<?>)getListCharacteristic()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY, Domain.class, msgs);
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				return getDomain();
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				return getListCharacteristic();
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				getListCharacteristic().clear();
				getListCharacteristic().addAll((Collection<? extends Characteristic>)newValue);
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				getListCharacteristic().clear();
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
			case DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN:
				return getDomain() != null;
			case DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC:
				return listCharacteristic != null && !listCharacteristic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CharacteristicFactoryImpl
