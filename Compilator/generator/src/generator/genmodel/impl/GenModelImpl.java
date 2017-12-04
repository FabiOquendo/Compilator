/**
 */
package generator.genmodel.impl;

import generator.Generator;
import generator.GeneratorPackage;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;
import generator.genmodel.GenmodelPackage;

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
 * An implementation of the model object '<em><b>Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.impl.GenModelImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenModelImpl#getListGenElements <em>List Gen Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenModelImpl extends MinimalEObjectImpl.Container implements GenModel {
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
	protected GenModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenmodelPackage.Literals.GEN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator getGenerator() {
		if (eContainerFeatureID() != GenmodelPackage.GEN_MODEL__GENERATOR) return null;
		return (Generator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerator(Generator newGenerator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenerator, GenmodelPackage.GEN_MODEL__GENERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(Generator newGenerator) {
		if (newGenerator != eInternalContainer() || (eContainerFeatureID() != GenmodelPackage.GEN_MODEL__GENERATOR && newGenerator != null)) {
			if (EcoreUtil.isAncestor(this, newGenerator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenerator != null)
				msgs = ((InternalEObject)newGenerator).eInverseAdd(this, GeneratorPackage.GENERATOR__THE_GEN_MODEL, Generator.class, msgs);
			msgs = basicSetGenerator(newGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_MODEL__GENERATOR, newGenerator, newGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenElement> getListGenElements() {
		if (listGenElements == null) {
			listGenElements = new EObjectContainmentWithInverseEList<GenElement>(GenElement.class, this, GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS, GenmodelPackage.GEN_ELEMENT__GEN_MODEL);
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenerator((Generator)otherEnd, msgs);
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				return basicSetGenerator(null, msgs);
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				return eInternalContainer().eInverseRemove(this, GeneratorPackage.GENERATOR__THE_GEN_MODEL, Generator.class, msgs);
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				return getGenerator();
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				setGenerator((Generator)newValue);
				return;
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				setGenerator((Generator)null);
				return;
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
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
			case GenmodelPackage.GEN_MODEL__GENERATOR:
				return getGenerator() != null;
			case GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS:
				return listGenElements != null && !listGenElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenModelImpl
