/**
 */
package generator.apperance.linesvisible.impl;

import generator.apperance.linesvisible.LinesVisible;
import generator.apperance.linesvisible.LinesvisiblePackage;

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
 * An implementation of the model object '<em><b>Lines Visible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.linesvisible.impl.LinesVisibleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.linesvisible.impl.LinesVisibleImpl#getGenTable <em>Gen Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinesVisibleImpl extends MinimalEObjectImpl.Container implements LinesVisible {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinesVisibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinesvisiblePackage.Literals.LINES_VISIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Boolean newValue) {
		Boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinesvisiblePackage.LINES_VISIBLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTable getGenTable() {
		if (eContainerFeatureID() != LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE) return null;
		return (GenTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTable(GenTable newGenTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenTable, LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTable(GenTable newGenTable) {
		if (newGenTable != eInternalContainer() || (eContainerFeatureID() != LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE && newGenTable != null)) {
			if (EcoreUtil.isAncestor(this, newGenTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenTable != null)
				msgs = ((InternalEObject)newGenTable).eInverseAdd(this, GentablePackage.GEN_TABLE__THE_LINES_VISIBLE, GenTable.class, msgs);
			msgs = basicSetGenTable(newGenTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE, newGenTable, newGenTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenTable((GenTable)otherEnd, msgs);
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
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				return basicSetGenTable(null, msgs);
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
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				return eInternalContainer().eInverseRemove(this, GentablePackage.GEN_TABLE__THE_LINES_VISIBLE, GenTable.class, msgs);
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
			case LinesvisiblePackage.LINES_VISIBLE__VALUE:
				return getValue();
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				return getGenTable();
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
			case LinesvisiblePackage.LINES_VISIBLE__VALUE:
				setValue((Boolean)newValue);
				return;
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				setGenTable((GenTable)newValue);
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
			case LinesvisiblePackage.LINES_VISIBLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				setGenTable((GenTable)null);
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
			case LinesvisiblePackage.LINES_VISIBLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE:
				return getGenTable() != null;
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

} //LinesVisibleImpl
