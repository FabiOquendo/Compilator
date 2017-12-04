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

import styles.ModelFactoryStyles;
import styles.StylesPackage;

import styles.domain.CharacteristicFactory;
import styles.domain.Domain;
import styles.domain.DomainPackage;
import styles.domain.StyleFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.impl.DomainImpl#getModelFactoryStyles <em>Model Factory Styles</em>}</li>
 *   <li>{@link styles.domain.impl.DomainImpl#getTheStyleFactory <em>The Style Factory</em>}</li>
 *   <li>{@link styles.domain.impl.DomainImpl#getTheCharacteristicFactory <em>The Characteristic Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTheStyleFactory() <em>The Style Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheStyleFactory()
	 * @generated
	 * @ordered
	 */
	protected StyleFactory theStyleFactory;

	/**
	 * The cached value of the '{@link #getTheCharacteristicFactory() <em>The Characteristic Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCharacteristicFactory()
	 * @generated
	 * @ordered
	 */
	protected CharacteristicFactory theCharacteristicFactory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryStyles getModelFactoryStyles() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__MODEL_FACTORY_STYLES) return null;
		return (ModelFactoryStyles)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelFactoryStyles(ModelFactoryStyles newModelFactoryStyles, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelFactoryStyles, DomainPackage.DOMAIN__MODEL_FACTORY_STYLES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactoryStyles(ModelFactoryStyles newModelFactoryStyles) {
		if (newModelFactoryStyles != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__MODEL_FACTORY_STYLES && newModelFactoryStyles != null)) {
			if (EcoreUtil.isAncestor(this, newModelFactoryStyles))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelFactoryStyles != null)
				msgs = ((InternalEObject)newModelFactoryStyles).eInverseAdd(this, StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES, ModelFactoryStyles.class, msgs);
			msgs = basicSetModelFactoryStyles(newModelFactoryStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__MODEL_FACTORY_STYLES, newModelFactoryStyles, newModelFactoryStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactory getTheStyleFactory() {
		return theStyleFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheStyleFactory(StyleFactory newTheStyleFactory, NotificationChain msgs) {
		StyleFactory oldTheStyleFactory = theStyleFactory;
		theStyleFactory = newTheStyleFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_STYLE_FACTORY, oldTheStyleFactory, newTheStyleFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheStyleFactory(StyleFactory newTheStyleFactory) {
		if (newTheStyleFactory != theStyleFactory) {
			NotificationChain msgs = null;
			if (theStyleFactory != null)
				msgs = ((InternalEObject)theStyleFactory).eInverseRemove(this, DomainPackage.STYLE_FACTORY__DOMAIN, StyleFactory.class, msgs);
			if (newTheStyleFactory != null)
				msgs = ((InternalEObject)newTheStyleFactory).eInverseAdd(this, DomainPackage.STYLE_FACTORY__DOMAIN, StyleFactory.class, msgs);
			msgs = basicSetTheStyleFactory(newTheStyleFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_STYLE_FACTORY, newTheStyleFactory, newTheStyleFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicFactory getTheCharacteristicFactory() {
		return theCharacteristicFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCharacteristicFactory(CharacteristicFactory newTheCharacteristicFactory, NotificationChain msgs) {
		CharacteristicFactory oldTheCharacteristicFactory = theCharacteristicFactory;
		theCharacteristicFactory = newTheCharacteristicFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY, oldTheCharacteristicFactory, newTheCharacteristicFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCharacteristicFactory(CharacteristicFactory newTheCharacteristicFactory) {
		if (newTheCharacteristicFactory != theCharacteristicFactory) {
			NotificationChain msgs = null;
			if (theCharacteristicFactory != null)
				msgs = ((InternalEObject)theCharacteristicFactory).eInverseRemove(this, DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN, CharacteristicFactory.class, msgs);
			if (newTheCharacteristicFactory != null)
				msgs = ((InternalEObject)newTheCharacteristicFactory).eInverseAdd(this, DomainPackage.CHARACTERISTIC_FACTORY__DOMAIN, CharacteristicFactory.class, msgs);
			msgs = basicSetTheCharacteristicFactory(newTheCharacteristicFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY, newTheCharacteristicFactory, newTheCharacteristicFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelFactoryStyles((ModelFactoryStyles)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				if (theStyleFactory != null)
					msgs = ((InternalEObject)theStyleFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_STYLE_FACTORY, null, msgs);
				return basicSetTheStyleFactory((StyleFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				if (theCharacteristicFactory != null)
					msgs = ((InternalEObject)theCharacteristicFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY, null, msgs);
				return basicSetTheCharacteristicFactory((CharacteristicFactory)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				return basicSetModelFactoryStyles(null, msgs);
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				return basicSetTheStyleFactory(null, msgs);
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				return basicSetTheCharacteristicFactory(null, msgs);
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				return eInternalContainer().eInverseRemove(this, StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES, ModelFactoryStyles.class, msgs);
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				return getModelFactoryStyles();
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				return getTheStyleFactory();
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				return getTheCharacteristicFactory();
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				setModelFactoryStyles((ModelFactoryStyles)newValue);
				return;
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				setTheStyleFactory((StyleFactory)newValue);
				return;
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				setTheCharacteristicFactory((CharacteristicFactory)newValue);
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				setModelFactoryStyles((ModelFactoryStyles)null);
				return;
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				setTheStyleFactory((StyleFactory)null);
				return;
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				setTheCharacteristicFactory((CharacteristicFactory)null);
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
			case DomainPackage.DOMAIN__MODEL_FACTORY_STYLES:
				return getModelFactoryStyles() != null;
			case DomainPackage.DOMAIN__THE_STYLE_FACTORY:
				return theStyleFactory != null;
			case DomainPackage.DOMAIN__THE_CHARACTERISTIC_FACTORY:
				return theCharacteristicFactory != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
