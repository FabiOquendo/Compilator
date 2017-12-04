/**
 */
package compilator.ui.impl;

import compilator.ui.ComponentsContainer;
import compilator.ui.UI;
import compilator.ui.UiPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.impl.ComponentsContainerImpl#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsContainerImpl extends MinimalEObjectImpl.Container implements ComponentsContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.COMPONENTS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != UiPackage.COMPONENTS_CONTAINER__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, UiPackage.COMPONENTS_CONTAINER__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != UiPackage.COMPONENTS_CONTAINER__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__COMPONENTS_CONTAINER, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.COMPONENTS_CONTAINER__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createComponent(final String nameComponent, final String expressionString, final TreeMap tokens, final TreeMap elementStyle) {
		getUI().createComponent(nameComponent,getFormatedString(expressionString),tokens,elementStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatedString(final String t) {
		int i =0;
		String formated="";
		while(t.charAt(i)!=';'){
			char c = t.charAt(i);
			if(c!='\n' && c!='\r' && c!='\t' && c!=' ')
				formated+=t.charAt(i);
			i++;
		}
		return formated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.COMPONENTS_CONTAINER__UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUI((UI)otherEnd, msgs);
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				return basicSetUI(null, msgs);
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__COMPONENTS_CONTAINER, UI.class, msgs);
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				return getUI();
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				setUI((UI)newValue);
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				setUI((UI)null);
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
			case UiPackage.COMPONENTS_CONTAINER__UI:
				return getUI() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UiPackage.COMPONENTS_CONTAINER___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP:
				createComponent((String)arguments.get(0), (String)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
				return null;
			case UiPackage.COMPONENTS_CONTAINER___GET_FORMATED_STRING__STRING:
				return getFormatedString((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentsContainerImpl
