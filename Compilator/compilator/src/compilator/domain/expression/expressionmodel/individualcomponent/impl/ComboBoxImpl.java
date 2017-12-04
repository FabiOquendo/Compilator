/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;
import compilator.domain.expression.expressionmodel.individualcomponent.Item;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.ComboBoxImpl#getTheItem <em>The Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComboBoxImpl extends IndividualElementImpl implements ComboBox {
	/**
	 * The cached value of the '{@link #getTheItem() <em>The Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> theItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndividualcomponentPackage.Literals.COMBO_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getTheItem() {
		if (theItem == null) {
			theItem = new EObjectContainmentWithInverseEList<Item>(Item.class, this, IndividualcomponentPackage.COMBO_BOX__THE_ITEM, IndividualcomponentPackage.ITEM__COMBO_BOX);
		}
		return theItem;
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheItem()).basicAdd(otherEnd, msgs);
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				return ((InternalEList<?>)getTheItem()).basicRemove(otherEnd, msgs);
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				return getTheItem();
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				getTheItem().clear();
				getTheItem().addAll((Collection<? extends Item>)newValue);
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				getTheItem().clear();
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
			case IndividualcomponentPackage.COMBO_BOX__THE_ITEM:
				return theItem != null && !theItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComboBoxImpl
