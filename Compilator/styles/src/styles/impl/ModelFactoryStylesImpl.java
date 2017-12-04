/**
 */
package styles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import styles.ModelFactoryStyles;
import styles.StylesPackage;

import styles.domain.Domain;
import styles.domain.DomainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.impl.ModelFactoryStylesImpl#getTheDomainStyles <em>The Domain Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryStylesImpl extends MinimalEObjectImpl.Container implements ModelFactoryStyles {
	/**
	 * The cached value of the '{@link #getTheDomainStyles() <em>The Domain Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomainStyles()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomainStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylesPackage.Literals.MODEL_FACTORY_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomainStyles() {
		return theDomainStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomainStyles(Domain newTheDomainStyles, NotificationChain msgs) {
		Domain oldTheDomainStyles = theDomainStyles;
		theDomainStyles = newTheDomainStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES, oldTheDomainStyles, newTheDomainStyles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomainStyles(Domain newTheDomainStyles) {
		if (newTheDomainStyles != theDomainStyles) {
			NotificationChain msgs = null;
			if (theDomainStyles != null)
				msgs = ((InternalEObject)theDomainStyles).eInverseRemove(this, DomainPackage.DOMAIN__MODEL_FACTORY_STYLES, Domain.class, msgs);
			if (newTheDomainStyles != null)
				msgs = ((InternalEObject)newTheDomainStyles).eInverseAdd(this, DomainPackage.DOMAIN__MODEL_FACTORY_STYLES, Domain.class, msgs);
			msgs = basicSetTheDomainStyles(newTheDomainStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES, newTheDomainStyles, newTheDomainStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryStyles load() {
		ModelFactoryStyles modelFactory = null;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/styles.styles");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactory = (ModelFactoryStyles) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {
		ModelFactoryStyles modelFactory = this;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/styles.styles");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				if (theDomainStyles != null)
					msgs = ((InternalEObject)theDomainStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES, null, msgs);
				return basicSetTheDomainStyles((Domain)otherEnd, msgs);
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
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				return basicSetTheDomainStyles(null, msgs);
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
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				return getTheDomainStyles();
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
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				setTheDomainStyles((Domain)newValue);
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
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				setTheDomainStyles((Domain)null);
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
			case StylesPackage.MODEL_FACTORY_STYLES__THE_DOMAIN_STYLES:
				return theDomainStyles != null;
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
			case StylesPackage.MODEL_FACTORY_STYLES___LOAD:
				return load();
			case StylesPackage.MODEL_FACTORY_STYLES___SAVE:
				save();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelFactoryStylesImpl
