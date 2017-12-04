/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;
import compilator.domain.expression.expressionmodel.individualcomponent.Item;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ItemImpl#getComboBox <em>Combo Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends IndividualElementImpl implements Item {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndividualcomponentPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox getComboBox() {
		if (eContainerFeatureID() != IndividualcomponentPackage.ITEM__COMBO_BOX) return null;
		return (ComboBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComboBox(ComboBox newComboBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComboBox, IndividualcomponentPackage.ITEM__COMBO_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboBox(ComboBox newComboBox) {
		if (newComboBox != eInternalContainer() || (eContainerFeatureID() != IndividualcomponentPackage.ITEM__COMBO_BOX && newComboBox != null)) {
			if (EcoreUtil.isAncestor(this, newComboBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComboBox != null)
				msgs = ((InternalEObject)newComboBox).eInverseAdd(this, IndividualcomponentPackage.COMBO_BOX__THE_ITEM, ComboBox.class, msgs);
			msgs = basicSetComboBox(newComboBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndividualcomponentPackage.ITEM__COMBO_BOX, newComboBox, newComboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComboBox((ComboBox)otherEnd, msgs);
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				return basicSetComboBox(null, msgs);
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				return eInternalContainer().eInverseRemove(this, IndividualcomponentPackage.COMBO_BOX__THE_ITEM, ComboBox.class, msgs);
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				return getComboBox();
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				setComboBox((ComboBox)newValue);
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				setComboBox((ComboBox)null);
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
			case IndividualcomponentPackage.ITEM__COMBO_BOX:
				return getComboBox() != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
