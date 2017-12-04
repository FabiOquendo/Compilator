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

import styles.domain.Domain;
import styles.domain.DomainPackage;
import styles.domain.Style;
import styles.domain.StyleFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link styles.domain.impl.StyleFactoryImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link styles.domain.impl.StyleFactoryImpl#getListStyle <em>List Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleFactoryImpl extends MinimalEObjectImpl.Container implements StyleFactory {
	/**
	 * The cached value of the '{@link #getListStyle() <em>List Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> listStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.STYLE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != DomainPackage.STYLE_FACTORY__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, DomainPackage.STYLE_FACTORY__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.STYLE_FACTORY__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_STYLE_FACTORY, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.STYLE_FACTORY__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Style> getListStyle() {
		if (listStyle == null) {
			listStyle = new EObjectContainmentWithInverseEList<Style>(Style.class, this, DomainPackage.STYLE_FACTORY__LIST_STYLE, DomainPackage.STYLE__STYLE_FACTORY);
		}
		return listStyle;
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListStyle()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				return basicSetDomain(null, msgs);
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				return ((InternalEList<?>)getListStyle()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_STYLE_FACTORY, Domain.class, msgs);
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				return getDomain();
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				return getListStyle();
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				getListStyle().clear();
				getListStyle().addAll((Collection<? extends Style>)newValue);
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				setDomain((Domain)null);
				return;
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				getListStyle().clear();
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
			case DomainPackage.STYLE_FACTORY__DOMAIN:
				return getDomain() != null;
			case DomainPackage.STYLE_FACTORY__LIST_STYLE:
				return listStyle != null && !listStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StyleFactoryImpl
