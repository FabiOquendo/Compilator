/**
 */
package compilator.ui.impl;

import compilator.ui.StyleAssigmentContainer;
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
 * An implementation of the model object '<em><b>Style Assigment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.impl.StyleAssigmentContainerImpl#getText <em>Text</em>}</li>
 *   <li>{@link compilator.ui.impl.StyleAssigmentContainerImpl#getUI <em>UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleAssigmentContainerImpl extends MinimalEObjectImpl.Container implements StyleAssigmentContainer {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleAssigmentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.STYLE_ASSIGMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.STYLE_ASSIGMENT_CONTAINER__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getUI() {
		if (eContainerFeatureID() != UiPackage.STYLE_ASSIGMENT_CONTAINER__UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUI(UI newUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUI, UiPackage.STYLE_ASSIGMENT_CONTAINER__UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUI(UI newUI) {
		if (newUI != eInternalContainer() || (eContainerFeatureID() != UiPackage.STYLE_ASSIGMENT_CONTAINER__UI && newUI != null)) {
			if (EcoreUtil.isAncestor(this, newUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUI != null)
				msgs = ((InternalEObject)newUI).eInverseAdd(this, UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER, UI.class, msgs);
			msgs = basicSetUI(newUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.STYLE_ASSIGMENT_CONTAINER__UI, newUI, newUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unPackStyles() {
		return getUI().unPackStyles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleBody(final String styleComponent) {
		String body ="";
		int i=0;
		while(i< styleComponent.length() && styleComponent.charAt(i)!='{')i++;i++;
		while(i< styleComponent.length() && styleComponent.charAt(i)!='}'){body+=styleComponent.charAt(i);i++;}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName(final String styleComponent) {
		String name ="";
		int i=0;
		while(i<styleComponent.length() && styleComponent.charAt(i)!='{' && i< styleComponent.length()){ 
			name+=styleComponent.charAt(i);i++;
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap loadElementsStyles(final TreeMap styles) {
		String [] stylesArray  = text.split(";");
		TreeMap elementsMap =  new TreeMap<String, styles.domain.Style >();
		for(int i=0;i<stylesArray.length;i++){
			String stylesComponent = stylesArray[i];
			String sytleName = getStyleName(stylesComponent);
			String styleBody = getStyleBody(stylesComponent);
			String [] elements = styleBody.split(",");
			
			for(int j=0;j<elements.length;j++){
				elementsMap.put(elements[j],styles.get(sytleName) );
			}
		}
		return elementsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatedString(final String t) {
		int i =0;
		String formated="";
		while(i<t.length()){
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER, UI.class, msgs);
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__TEXT:
				return getText();
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__TEXT:
				setText((String)newValue);
				return;
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case UiPackage.STYLE_ASSIGMENT_CONTAINER__UI:
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
			case UiPackage.STYLE_ASSIGMENT_CONTAINER___UN_PACK_STYLES:
				return unPackStyles();
			case UiPackage.STYLE_ASSIGMENT_CONTAINER___GET_STYLE_BODY__STRING:
				return getStyleBody((String)arguments.get(0));
			case UiPackage.STYLE_ASSIGMENT_CONTAINER___GET_STYLE_NAME__STRING:
				return getStyleName((String)arguments.get(0));
			case UiPackage.STYLE_ASSIGMENT_CONTAINER___LOAD_ELEMENTS_STYLES__TREEMAP:
				return loadElementsStyles((TreeMap)arguments.get(0));
			case UiPackage.STYLE_ASSIGMENT_CONTAINER___GET_FORMATED_STRING__STRING:
				return getFormatedString((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //StyleAssigmentContainerImpl
