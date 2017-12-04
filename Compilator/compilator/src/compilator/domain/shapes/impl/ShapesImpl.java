/**
 */
package compilator.domain.shapes.impl;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;

import compilator.domain.shapes.Component;
import compilator.domain.shapes.Shapes;
import compilator.domain.shapes.ShapesPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shapes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.shapes.impl.ShapesImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link compilator.domain.shapes.impl.ShapesImpl#getListComponents <em>List Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapesImpl extends MinimalEObjectImpl.Container implements Shapes {
	/**
	 * The cached value of the '{@link #getListComponents() <em>List Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> listComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.SHAPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != ShapesPackage.SHAPES__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, ShapesPackage.SHAPES__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != ShapesPackage.SHAPES__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__SHAPES, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.SHAPES__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getListComponents() {
		if (listComponents == null) {
			listComponents = new EObjectContainmentWithInverseEList<Component>(Component.class, this, ShapesPackage.SHAPES__LIST_COMPONENTS, ShapesPackage.COMPONENT__SHAPES);
		}
		return listComponents;
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
			case ShapesPackage.SHAPES__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListComponents()).basicAdd(otherEnd, msgs);
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
			case ShapesPackage.SHAPES__DOMAIN:
				return basicSetDomain(null, msgs);
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				return ((InternalEList<?>)getListComponents()).basicRemove(otherEnd, msgs);
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
			case ShapesPackage.SHAPES__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__SHAPES, Domain.class, msgs);
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
			case ShapesPackage.SHAPES__DOMAIN:
				return getDomain();
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				return getListComponents();
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
			case ShapesPackage.SHAPES__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				getListComponents().clear();
				getListComponents().addAll((Collection<? extends Component>)newValue);
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
			case ShapesPackage.SHAPES__DOMAIN:
				setDomain((Domain)null);
				return;
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				getListComponents().clear();
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
			case ShapesPackage.SHAPES__DOMAIN:
				return getDomain() != null;
			case ShapesPackage.SHAPES__LIST_COMPONENTS:
				return listComponents != null && !listComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShapesImpl
