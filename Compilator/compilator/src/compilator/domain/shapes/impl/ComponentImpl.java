/**
 */
package compilator.domain.shapes.impl;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.sentence.Sentence;
import compilator.domain.expression.sentence.SentencePackage;

import compilator.domain.shapes.Component;
import compilator.domain.shapes.Shapes;
import compilator.domain.shapes.ShapesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.shapes.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.shapes.impl.ComponentImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link compilator.domain.shapes.impl.ComponentImpl#getTheElement <em>The Element</em>}</li>
 *   <li>{@link compilator.domain.shapes.impl.ComponentImpl#getTheSentence <em>The Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheElement() <em>The Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheElement()
	 * @generated
	 * @ordered
	 */
	protected Element theElement;

	/**
	 * The cached value of the '{@link #getTheSentence() <em>The Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheSentence()
	 * @generated
	 * @ordered
	 */
	protected Sentence theSentence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shapes getShapes() {
		if (eContainerFeatureID() != ShapesPackage.COMPONENT__SHAPES) return null;
		return (Shapes)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes(Shapes newShapes, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newShapes, ShapesPackage.COMPONENT__SHAPES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(Shapes newShapes) {
		if (newShapes != eInternalContainer() || (eContainerFeatureID() != ShapesPackage.COMPONENT__SHAPES && newShapes != null)) {
			if (EcoreUtil.isAncestor(this, newShapes))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newShapes != null)
				msgs = ((InternalEObject)newShapes).eInverseAdd(this, ShapesPackage.SHAPES__LIST_COMPONENTS, Shapes.class, msgs);
			msgs = basicSetShapes(newShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__SHAPES, newShapes, newShapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTheElement() {
		return theElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheElement(Element newTheElement, NotificationChain msgs) {
		Element oldTheElement = theElement;
		theElement = newTheElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__THE_ELEMENT, oldTheElement, newTheElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheElement(Element newTheElement) {
		if (newTheElement != theElement) {
			NotificationChain msgs = null;
			if (theElement != null)
				msgs = ((InternalEObject)theElement).eInverseRemove(this, ExpressionmodelPackage.ELEMENT__COMPONENT, Element.class, msgs);
			if (newTheElement != null)
				msgs = ((InternalEObject)newTheElement).eInverseAdd(this, ExpressionmodelPackage.ELEMENT__COMPONENT, Element.class, msgs);
			msgs = basicSetTheElement(newTheElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__THE_ELEMENT, newTheElement, newTheElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getTheSentence() {
		return theSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheSentence(Sentence newTheSentence, NotificationChain msgs) {
		Sentence oldTheSentence = theSentence;
		theSentence = newTheSentence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__THE_SENTENCE, oldTheSentence, newTheSentence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheSentence(Sentence newTheSentence) {
		if (newTheSentence != theSentence) {
			NotificationChain msgs = null;
			if (theSentence != null)
				msgs = ((InternalEObject)theSentence).eInverseRemove(this, SentencePackage.SENTENCE__COMPONENT, Sentence.class, msgs);
			if (newTheSentence != null)
				msgs = ((InternalEObject)newTheSentence).eInverseAdd(this, SentencePackage.SENTENCE__COMPONENT, Sentence.class, msgs);
			msgs = basicSetTheSentence(newTheSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.COMPONENT__THE_SENTENCE, newTheSentence, newTheSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapesPackage.COMPONENT__SHAPES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetShapes((Shapes)otherEnd, msgs);
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				if (theElement != null)
					msgs = ((InternalEObject)theElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPONENT__THE_ELEMENT, null, msgs);
				return basicSetTheElement((Element)otherEnd, msgs);
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				if (theSentence != null)
					msgs = ((InternalEObject)theSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.COMPONENT__THE_SENTENCE, null, msgs);
				return basicSetTheSentence((Sentence)otherEnd, msgs);
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
			case ShapesPackage.COMPONENT__SHAPES:
				return basicSetShapes(null, msgs);
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				return basicSetTheElement(null, msgs);
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				return basicSetTheSentence(null, msgs);
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
			case ShapesPackage.COMPONENT__SHAPES:
				return eInternalContainer().eInverseRemove(this, ShapesPackage.SHAPES__LIST_COMPONENTS, Shapes.class, msgs);
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
			case ShapesPackage.COMPONENT__NAME:
				return getName();
			case ShapesPackage.COMPONENT__SHAPES:
				return getShapes();
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				return getTheElement();
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				return getTheSentence();
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
			case ShapesPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ShapesPackage.COMPONENT__SHAPES:
				setShapes((Shapes)newValue);
				return;
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				setTheElement((Element)newValue);
				return;
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				setTheSentence((Sentence)newValue);
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
			case ShapesPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShapesPackage.COMPONENT__SHAPES:
				setShapes((Shapes)null);
				return;
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				setTheElement((Element)null);
				return;
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				setTheSentence((Sentence)null);
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
			case ShapesPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShapesPackage.COMPONENT__SHAPES:
				return getShapes() != null;
			case ShapesPackage.COMPONENT__THE_ELEMENT:
				return theElement != null;
			case ShapesPackage.COMPONENT__THE_SENTENCE:
				return theSentence != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
