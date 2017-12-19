/**
 */
package compilator.domain.impl;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;
import compilator.domain.Log;

import compilator.domain.expression.Expression;
import compilator.domain.expression.ExpressionPackage;

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
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.impl.LogImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.domain.impl.LogImpl#getListExpressions <em>List Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogImpl extends MinimalEObjectImpl.Container implements Log {
	/**
	 * The cached value of the '{@link #getListExpressions() <em>List Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> listExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != DomainPackage.LOG__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, DomainPackage.LOG__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.LOG__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_LOG, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.LOG__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getListExpressions() {
		if (listExpressions == null) {
			listExpressions = new EObjectContainmentWithInverseEList<Expression>(Expression.class, this, DomainPackage.LOG__LIST_EXPRESSIONS, ExpressionPackage.EXPRESSION__LOG);
		}
		return listExpressions;
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
			case DomainPackage.LOG__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListExpressions()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.LOG__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				return ((InternalEList<?>)getListExpressions()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.LOG__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_LOG, Domain.class, msgs);
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
			case DomainPackage.LOG__THE_DOMAIN:
				return getTheDomain();
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				return getListExpressions();
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
			case DomainPackage.LOG__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				getListExpressions().clear();
				getListExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case DomainPackage.LOG__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				getListExpressions().clear();
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
			case DomainPackage.LOG__THE_DOMAIN:
				return getTheDomain() != null;
			case DomainPackage.LOG__LIST_EXPRESSIONS:
				return listExpressions != null && !listExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogImpl
