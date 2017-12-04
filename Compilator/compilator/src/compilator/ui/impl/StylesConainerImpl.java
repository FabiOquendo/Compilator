/**
 */
package compilator.ui.impl;

import compilator.ui.StylesConainer;
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

import styles.ModelFactoryStyles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styles Conainer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.impl.StylesConainerImpl#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StylesConainerImpl extends MinimalEObjectImpl.Container implements StylesConainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StylesConainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.STYLES_CONAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != UiPackage.STYLES_CONAINER__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, UiPackage.STYLES_CONAINER__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != UiPackage.STYLES_CONAINER__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__STYLES_CONAINER, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.STYLES_CONAINER__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap loadStyles(final ModelFactoryStyles mfStyles) {
		styles.domain.StyleFactory styleFactory = mfStyles.getTheDomainStyles().getTheStyleFactory();
		org.eclipse.emf.common.util.EList<styles.domain.Style> list = styleFactory.getListStyle();
		java.util.TreeMap styles =  new java.util.TreeMap<String, styles.domain.Style>();
		for(styles.domain.Style s : list) styles.put(s.getName(), s);
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__STYLES_CONAINER, UI.class, msgs);
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
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER__UI:
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
			case UiPackage.STYLES_CONAINER___LOAD_STYLES__MODELFACTORYSTYLES:
				return loadStyles((ModelFactoryStyles)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StylesConainerImpl
