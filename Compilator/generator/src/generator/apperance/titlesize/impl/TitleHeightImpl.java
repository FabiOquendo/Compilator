/**
 */
package generator.apperance.titlesize.impl;

import generator.apperance.titlesize.TitleHeight;
import generator.apperance.titlesize.TitlesizePackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title Height</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.titlesize.impl.TitleHeightImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.titlesize.impl.TitleHeightImpl#getGenTable <em>Gen Table</em>}</li>
 *   <li>{@link generator.apperance.titlesize.impl.TitleHeightImpl#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleHeightImpl extends MinimalEObjectImpl.Container implements TitleHeight {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleHeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TitlesizePackage.Literals.TITLE_HEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TitlesizePackage.TITLE_HEIGHT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTable getGenTable() {
		if (eContainerFeatureID() != TitlesizePackage.TITLE_HEIGHT__GEN_TABLE) return null;
		return (GenTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTable(GenTable newGenTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenTable, TitlesizePackage.TITLE_HEIGHT__GEN_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTable(GenTable newGenTable) {
		if (newGenTable != eInternalContainer() || (eContainerFeatureID() != TitlesizePackage.TITLE_HEIGHT__GEN_TABLE && newGenTable != null)) {
			if (EcoreUtil.isAncestor(this, newGenTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenTable != null)
				msgs = ((InternalEObject)newGenTable).eInverseAdd(this, GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT, GenTable.class, msgs);
			msgs = basicSetGenTable(newGenTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TitlesizePackage.TITLE_HEIGHT__GEN_TABLE, newGenTable, newGenTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainer getGenContainer() {
		if (eContainerFeatureID() != TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER) return null;
		return (GenContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenContainer(GenContainer newGenContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenContainer, TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenContainer(GenContainer newGenContainer) {
		if (newGenContainer != eInternalContainer() || (eContainerFeatureID() != TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER && newGenContainer != null)) {
			if (EcoreUtil.isAncestor(this, newGenContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenContainer != null)
				msgs = ((InternalEObject)newGenContainer).eInverseAdd(this, GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT, GenContainer.class, msgs);
			msgs = basicSetGenContainer(newGenContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER, newGenContainer, newGenContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenTable((GenTable)otherEnd, msgs);
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenContainer((GenContainer)otherEnd, msgs);
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
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				return basicSetGenTable(null, msgs);
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				return basicSetGenContainer(null, msgs);
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
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				return eInternalContainer().eInverseRemove(this, GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT, GenTable.class, msgs);
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				return eInternalContainer().eInverseRemove(this, GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT, GenContainer.class, msgs);
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
			case TitlesizePackage.TITLE_HEIGHT__VALUE:
				return getValue();
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				return getGenTable();
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				return getGenContainer();
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
			case TitlesizePackage.TITLE_HEIGHT__VALUE:
				setValue((Integer)newValue);
				return;
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				setGenTable((GenTable)newValue);
				return;
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				setGenContainer((GenContainer)newValue);
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
			case TitlesizePackage.TITLE_HEIGHT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				setGenTable((GenTable)null);
				return;
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				setGenContainer((GenContainer)null);
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
			case TitlesizePackage.TITLE_HEIGHT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TitlesizePackage.TITLE_HEIGHT__GEN_TABLE:
				return getGenTable() != null;
			case TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER:
				return getGenContainer() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TitleHeightImpl
