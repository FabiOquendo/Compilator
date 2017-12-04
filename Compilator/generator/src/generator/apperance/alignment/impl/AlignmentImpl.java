/**
 */
package generator.apperance.alignment.impl;

import generator.apperance.alignment.Alignment;
import generator.apperance.alignment.AlignmentPackage;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;
import generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencolunm.GencolunmPackage;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.alignment.impl.AlignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.alignment.impl.AlignmentImpl#getGenButton <em>Gen Button</em>}</li>
 *   <li>{@link generator.apperance.alignment.impl.AlignmentImpl#getGenColumn <em>Gen Column</em>}</li>
 *   <li>{@link generator.apperance.alignment.impl.AlignmentImpl#getGenLabel <em>Gen Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlignmentImpl extends MinimalEObjectImpl.Container implements Alignment {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlignmentPackage.Literals.ALIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlignmentPackage.ALIGNMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenButton getGenButton() {
		if (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_BUTTON) return null;
		return (GenButton)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenButton(GenButton newGenButton, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenButton, AlignmentPackage.ALIGNMENT__GEN_BUTTON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenButton(GenButton newGenButton) {
		if (newGenButton != eInternalContainer() || (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_BUTTON && newGenButton != null)) {
			if (EcoreUtil.isAncestor(this, newGenButton))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenButton != null)
				msgs = ((InternalEObject)newGenButton).eInverseAdd(this, GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT, GenButton.class, msgs);
			msgs = basicSetGenButton(newGenButton, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlignmentPackage.ALIGNMENT__GEN_BUTTON, newGenButton, newGenButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColumn getGenColumn() {
		if (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_COLUMN) return null;
		return (GenColumn)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenColumn(GenColumn newGenColumn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenColumn, AlignmentPackage.ALIGNMENT__GEN_COLUMN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenColumn(GenColumn newGenColumn) {
		if (newGenColumn != eInternalContainer() || (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_COLUMN && newGenColumn != null)) {
			if (EcoreUtil.isAncestor(this, newGenColumn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenColumn != null)
				msgs = ((InternalEObject)newGenColumn).eInverseAdd(this, GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT, GenColumn.class, msgs);
			msgs = basicSetGenColumn(newGenColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlignmentPackage.ALIGNMENT__GEN_COLUMN, newGenColumn, newGenColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel getGenLabel() {
		if (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_LABEL) return null;
		return (GenLabel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenLabel(GenLabel newGenLabel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenLabel, AlignmentPackage.ALIGNMENT__GEN_LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLabel(GenLabel newGenLabel) {
		if (newGenLabel != eInternalContainer() || (eContainerFeatureID() != AlignmentPackage.ALIGNMENT__GEN_LABEL && newGenLabel != null)) {
			if (EcoreUtil.isAncestor(this, newGenLabel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenLabel != null)
				msgs = ((InternalEObject)newGenLabel).eInverseAdd(this, GenlabelPackage.GEN_LABEL__THE_ALIGNMENT, GenLabel.class, msgs);
			msgs = basicSetGenLabel(newGenLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlignmentPackage.ALIGNMENT__GEN_LABEL, newGenLabel, newGenLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenButton((GenButton)otherEnd, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenColumn((GenColumn)otherEnd, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenLabel((GenLabel)otherEnd, msgs);
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
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				return basicSetGenButton(null, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				return basicSetGenColumn(null, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				return basicSetGenLabel(null, msgs);
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
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				return eInternalContainer().eInverseRemove(this, GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT, GenButton.class, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				return eInternalContainer().eInverseRemove(this, GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT, GenColumn.class, msgs);
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				return eInternalContainer().eInverseRemove(this, GenlabelPackage.GEN_LABEL__THE_ALIGNMENT, GenLabel.class, msgs);
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
			case AlignmentPackage.ALIGNMENT__VALUE:
				return getValue();
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				return getGenButton();
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				return getGenColumn();
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				return getGenLabel();
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
			case AlignmentPackage.ALIGNMENT__VALUE:
				setValue((String)newValue);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				setGenButton((GenButton)newValue);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				setGenColumn((GenColumn)newValue);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				setGenLabel((GenLabel)newValue);
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
			case AlignmentPackage.ALIGNMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				setGenButton((GenButton)null);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				setGenColumn((GenColumn)null);
				return;
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				setGenLabel((GenLabel)null);
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
			case AlignmentPackage.ALIGNMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AlignmentPackage.ALIGNMENT__GEN_BUTTON:
				return getGenButton() != null;
			case AlignmentPackage.ALIGNMENT__GEN_COLUMN:
				return getGenColumn() != null;
			case AlignmentPackage.ALIGNMENT__GEN_LABEL:
				return getGenLabel() != null;
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

} //AlignmentImpl
