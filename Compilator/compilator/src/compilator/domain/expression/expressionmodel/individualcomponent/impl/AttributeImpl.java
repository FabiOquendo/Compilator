/**
 */
package compilator.domain.expression.expressionmodel.individualcomponent.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.Attribute;
import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;
import compilator.domain.expression.expressionmodel.individualcomponent.InputElement;
import compilator.domain.expression.expressionmodel.individualcomponent.Label;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl#getTheLabel <em>The Label</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.individualcomponent.impl.AttributeImpl#getTheInputElement <em>The Input Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends IndividualElementImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getTheLabel() <em>The Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheLabel()
	 * @generated
	 * @ordered
	 */
	protected Label theLabel;

	/**
	 * The cached value of the '{@link #getTheInputElement() <em>The Input Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheInputElement()
	 * @generated
	 * @ordered
	 */
	protected InputElement theInputElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IndividualcomponentPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTheLabel() {
		return theLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheLabel(Label newTheLabel, NotificationChain msgs) {
		Label oldTheLabel = theLabel;
		theLabel = newTheLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndividualcomponentPackage.ATTRIBUTE__THE_LABEL, oldTheLabel, newTheLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheLabel(Label newTheLabel) {
		if (newTheLabel != theLabel) {
			NotificationChain msgs = null;
			if (theLabel != null)
				msgs = ((InternalEObject)theLabel).eInverseRemove(this, IndividualcomponentPackage.LABEL__ATTRIBUTE, Label.class, msgs);
			if (newTheLabel != null)
				msgs = ((InternalEObject)newTheLabel).eInverseAdd(this, IndividualcomponentPackage.LABEL__ATTRIBUTE, Label.class, msgs);
			msgs = basicSetTheLabel(newTheLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndividualcomponentPackage.ATTRIBUTE__THE_LABEL, newTheLabel, newTheLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputElement getTheInputElement() {
		return theInputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheInputElement(InputElement newTheInputElement, NotificationChain msgs) {
		InputElement oldTheInputElement = theInputElement;
		theInputElement = newTheInputElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT, oldTheInputElement, newTheInputElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheInputElement(InputElement newTheInputElement) {
		if (newTheInputElement != theInputElement) {
			NotificationChain msgs = null;
			if (theInputElement != null)
				msgs = ((InternalEObject)theInputElement).eInverseRemove(this, IndividualcomponentPackage.INPUT_ELEMENT__ATTRIBUTE, InputElement.class, msgs);
			if (newTheInputElement != null)
				msgs = ((InternalEObject)newTheInputElement).eInverseAdd(this, IndividualcomponentPackage.INPUT_ELEMENT__ATTRIBUTE, InputElement.class, msgs);
			msgs = basicSetTheInputElement(newTheInputElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT, newTheInputElement, newTheInputElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				if (theLabel != null)
					msgs = ((InternalEObject)theLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndividualcomponentPackage.ATTRIBUTE__THE_LABEL, null, msgs);
				return basicSetTheLabel((Label)otherEnd, msgs);
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				if (theInputElement != null)
					msgs = ((InternalEObject)theInputElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT, null, msgs);
				return basicSetTheInputElement((InputElement)otherEnd, msgs);
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
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				return basicSetTheLabel(null, msgs);
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				return basicSetTheInputElement(null, msgs);
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
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				return getTheLabel();
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				return getTheInputElement();
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
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				setTheLabel((Label)newValue);
				return;
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				setTheInputElement((InputElement)newValue);
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
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				setTheLabel((Label)null);
				return;
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				setTheInputElement((InputElement)null);
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
			case IndividualcomponentPackage.ATTRIBUTE__THE_LABEL:
				return theLabel != null;
			case IndividualcomponentPackage.ATTRIBUTE__THE_INPUT_ELEMENT:
				return theInputElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
