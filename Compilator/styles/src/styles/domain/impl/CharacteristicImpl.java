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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import styles.domain.Characteristic;
import styles.domain.CharacteristicFactory;
import styles.domain.DomainPackage;
import styles.domain.Propertie;
import styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.impl.CharacteristicImpl#getName <em>Name</em>}</li>
 *   <li>{@link styles.domain.impl.CharacteristicImpl#getListProperties <em>List Properties</em>}</li>
 *   <li>{@link styles.domain.impl.CharacteristicImpl#getTheSytle <em>The Sytle</em>}</li>
 *   <li>{@link styles.domain.impl.CharacteristicImpl#getCharacteristicFactory <em>Characteristic Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicImpl extends MinimalEObjectImpl.Container implements Characteristic {
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
	 * The cached value of the '{@link #getListProperties() <em>List Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Propertie> listProperties;

	/**
	 * The cached value of the '{@link #getTheSytle() <em>The Sytle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheSytle()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> theSytle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CHARACTERISTIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CHARACTERISTIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propertie> getListProperties() {
		if (listProperties == null) {
			listProperties = new EObjectContainmentWithInverseEList<Propertie>(Propertie.class, this, DomainPackage.CHARACTERISTIC__LIST_PROPERTIES, DomainPackage.PROPERTIE__CHARACTERISTIC);
		}
		return listProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Style> getTheSytle() {
		if (theSytle == null) {
			theSytle = new EObjectWithInverseResolvingEList<Style>(Style.class, this, DomainPackage.CHARACTERISTIC__THE_SYTLE, DomainPackage.STYLE__THE_CHARACTERISTIC);
		}
		return theSytle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicFactory getCharacteristicFactory() {
		if (eContainerFeatureID() != DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY) return null;
		return (CharacteristicFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristicFactory(CharacteristicFactory newCharacteristicFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCharacteristicFactory, DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicFactory(CharacteristicFactory newCharacteristicFactory) {
		if (newCharacteristicFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY && newCharacteristicFactory != null)) {
			if (EcoreUtil.isAncestor(this, newCharacteristicFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCharacteristicFactory != null)
				msgs = ((InternalEObject)newCharacteristicFactory).eInverseAdd(this, DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC, CharacteristicFactory.class, msgs);
			msgs = basicSetCharacteristicFactory(newCharacteristicFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY, newCharacteristicFactory, newCharacteristicFactory));
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
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListProperties()).basicAdd(otherEnd, msgs);
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheSytle()).basicAdd(otherEnd, msgs);
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCharacteristicFactory((CharacteristicFactory)otherEnd, msgs);
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
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				return ((InternalEList<?>)getListProperties()).basicRemove(otherEnd, msgs);
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				return ((InternalEList<?>)getTheSytle()).basicRemove(otherEnd, msgs);
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				return basicSetCharacteristicFactory(null, msgs);
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
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				return eInternalContainer().eInverseRemove(this, DomainPackage.CHARACTERISTIC_FACTORY__LIST_CHARACTERISTIC, CharacteristicFactory.class, msgs);
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
			case DomainPackage.CHARACTERISTIC__NAME:
				return getName();
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				return getListProperties();
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				return getTheSytle();
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				return getCharacteristicFactory();
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
			case DomainPackage.CHARACTERISTIC__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				getListProperties().clear();
				getListProperties().addAll((Collection<? extends Propertie>)newValue);
				return;
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				getTheSytle().clear();
				getTheSytle().addAll((Collection<? extends Style>)newValue);
				return;
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				setCharacteristicFactory((CharacteristicFactory)newValue);
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
			case DomainPackage.CHARACTERISTIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				getListProperties().clear();
				return;
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				getTheSytle().clear();
				return;
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				setCharacteristicFactory((CharacteristicFactory)null);
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
			case DomainPackage.CHARACTERISTIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.CHARACTERISTIC__LIST_PROPERTIES:
				return listProperties != null && !listProperties.isEmpty();
			case DomainPackage.CHARACTERISTIC__THE_SYTLE:
				return theSytle != null && !theSytle.isEmpty();
			case DomainPackage.CHARACTERISTIC__CHARACTERISTIC_FACTORY:
				return getCharacteristicFactory() != null;
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

} //CharacteristicImpl
