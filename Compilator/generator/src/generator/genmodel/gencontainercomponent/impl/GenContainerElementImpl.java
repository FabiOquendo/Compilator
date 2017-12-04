/**
 */
package generator.genmodel.gencontainercomponent.impl;

import generator.genmodel.GenElement;
import generator.genmodel.GenmodelPackage;

import generator.genmodel.gencontainercomponent.GenContainerElement;
import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import generator.genmodel.impl.GenElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Container Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl#getListGenElements <em>List Gen Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenContainerElementImpl extends GenElementImpl implements GenContainerElement {
	/**
	 * The cached value of the '{@link #getListGenElements() <em>List Gen Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListGenElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GenElement> listGenElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenContainerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenElement> getListGenElements() {
		if (listGenElements == null) {
			listGenElements = new EObjectContainmentWithInverseEList<GenElement>(GenElement.class, this, GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS, GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT);
		}
		return listGenElements;
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListGenElements()).basicAdd(otherEnd, msgs);
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				return ((InternalEList<?>)getListGenElements()).basicRemove(otherEnd, msgs);
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				return getListGenElements();
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				getListGenElements().clear();
				getListGenElements().addAll((Collection<? extends GenElement>)newValue);
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				getListGenElements().clear();
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
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
				return listGenElements != null && !listGenElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenContainerElementImpl
