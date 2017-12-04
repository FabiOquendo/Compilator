/**
 */
package generator.apperance.background.impl;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;
import generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage;

import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;
import generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getValue <em>Value</em>}</li>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getGenComboBox <em>Gen Combo Box</em>}</li>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getGenTextField <em>Gen Text Field</em>}</li>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getGenLabel <em>Gen Label</em>}</li>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getGenTable <em>Gen Table</em>}</li>
 *   <li>{@link generator.apperance.background.impl.BackgroundImpl#getGenContainer <em>Gen Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundImpl extends MinimalEObjectImpl.Container implements Background {
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
	protected BackgroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BackgroundPackage.Literals.BACKGROUND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenComboBox getGenComboBox() {
		if (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_COMBO_BOX) return null;
		return (GenComboBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenComboBox(GenComboBox newGenComboBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenComboBox, BackgroundPackage.BACKGROUND__GEN_COMBO_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenComboBox(GenComboBox newGenComboBox) {
		if (newGenComboBox != eInternalContainer() || (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_COMBO_BOX && newGenComboBox != null)) {
			if (EcoreUtil.isAncestor(this, newGenComboBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenComboBox != null)
				msgs = ((InternalEObject)newGenComboBox).eInverseAdd(this, GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND, GenComboBox.class, msgs);
			msgs = basicSetGenComboBox(newGenComboBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__GEN_COMBO_BOX, newGenComboBox, newGenComboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTextField getGenTextField() {
		if (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD) return null;
		return (GenTextField)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTextField(GenTextField newGenTextField, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenTextField, BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTextField(GenTextField newGenTextField) {
		if (newGenTextField != eInternalContainer() || (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD && newGenTextField != null)) {
			if (EcoreUtil.isAncestor(this, newGenTextField))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenTextField != null)
				msgs = ((InternalEObject)newGenTextField).eInverseAdd(this, GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND, GenTextField.class, msgs);
			msgs = basicSetGenTextField(newGenTextField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD, newGenTextField, newGenTextField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel getGenLabel() {
		if (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_LABEL) return null;
		return (GenLabel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenLabel(GenLabel newGenLabel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenLabel, BackgroundPackage.BACKGROUND__GEN_LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenLabel(GenLabel newGenLabel) {
		if (newGenLabel != eInternalContainer() || (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_LABEL && newGenLabel != null)) {
			if (EcoreUtil.isAncestor(this, newGenLabel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenLabel != null)
				msgs = ((InternalEObject)newGenLabel).eInverseAdd(this, GenlabelPackage.GEN_LABEL__THE_BACKGROUND, GenLabel.class, msgs);
			msgs = basicSetGenLabel(newGenLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__GEN_LABEL, newGenLabel, newGenLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTable getGenTable() {
		if (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_TABLE) return null;
		return (GenTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTable(GenTable newGenTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenTable, BackgroundPackage.BACKGROUND__GEN_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTable(GenTable newGenTable) {
		if (newGenTable != eInternalContainer() || (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_TABLE && newGenTable != null)) {
			if (EcoreUtil.isAncestor(this, newGenTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenTable != null)
				msgs = ((InternalEObject)newGenTable).eInverseAdd(this, GentablePackage.GEN_TABLE__THE_BACKGROUND, GenTable.class, msgs);
			msgs = basicSetGenTable(newGenTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__GEN_TABLE, newGenTable, newGenTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainer getGenContainer() {
		if (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_CONTAINER) return null;
		return (GenContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenContainer(GenContainer newGenContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenContainer, BackgroundPackage.BACKGROUND__GEN_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenContainer(GenContainer newGenContainer) {
		if (newGenContainer != eInternalContainer() || (eContainerFeatureID() != BackgroundPackage.BACKGROUND__GEN_CONTAINER && newGenContainer != null)) {
			if (EcoreUtil.isAncestor(this, newGenContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenContainer != null)
				msgs = ((InternalEObject)newGenContainer).eInverseAdd(this, GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND, GenContainer.class, msgs);
			msgs = basicSetGenContainer(newGenContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BackgroundPackage.BACKGROUND__GEN_CONTAINER, newGenContainer, newGenContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenComboBox((GenComboBox)otherEnd, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenTextField((GenTextField)otherEnd, msgs);
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenLabel((GenLabel)otherEnd, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenTable((GenTable)otherEnd, msgs);
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				return basicSetGenComboBox(null, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				return basicSetGenTextField(null, msgs);
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				return basicSetGenLabel(null, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				return basicSetGenTable(null, msgs);
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				return eInternalContainer().eInverseRemove(this, GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND, GenComboBox.class, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				return eInternalContainer().eInverseRemove(this, GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND, GenTextField.class, msgs);
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				return eInternalContainer().eInverseRemove(this, GenlabelPackage.GEN_LABEL__THE_BACKGROUND, GenLabel.class, msgs);
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				return eInternalContainer().eInverseRemove(this, GentablePackage.GEN_TABLE__THE_BACKGROUND, GenTable.class, msgs);
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
				return eInternalContainer().eInverseRemove(this, GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND, GenContainer.class, msgs);
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
			case BackgroundPackage.BACKGROUND__VALUE:
				return getValue();
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				return getGenComboBox();
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				return getGenTextField();
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				return getGenLabel();
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				return getGenTable();
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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
			case BackgroundPackage.BACKGROUND__VALUE:
				setValue((String)newValue);
				return;
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				setGenComboBox((GenComboBox)newValue);
				return;
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				setGenTextField((GenTextField)newValue);
				return;
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				setGenLabel((GenLabel)newValue);
				return;
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				setGenTable((GenTable)newValue);
				return;
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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
			case BackgroundPackage.BACKGROUND__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				setGenComboBox((GenComboBox)null);
				return;
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				setGenTextField((GenTextField)null);
				return;
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				setGenLabel((GenLabel)null);
				return;
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				setGenTable((GenTable)null);
				return;
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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
			case BackgroundPackage.BACKGROUND__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BackgroundPackage.BACKGROUND__GEN_COMBO_BOX:
				return getGenComboBox() != null;
			case BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD:
				return getGenTextField() != null;
			case BackgroundPackage.BACKGROUND__GEN_LABEL:
				return getGenLabel() != null;
			case BackgroundPackage.BACKGROUND__GEN_TABLE:
				return getGenTable() != null;
			case BackgroundPackage.BACKGROUND__GEN_CONTAINER:
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

} //BackgroundImpl
