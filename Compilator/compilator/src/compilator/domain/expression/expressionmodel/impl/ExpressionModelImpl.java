/**
 */
package compilator.domain.expression.expressionmodel.impl;

import compilator.domain.expression.Expression;
import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.sentence.Sentence;
import compilator.domain.expression.sentence.SentencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl#getTheSentence <em>The Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.expressionmodel.impl.ExpressionModelImpl#getListElements <em>List Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionModelImpl extends MinimalEObjectImpl.Container implements ExpressionModel {
	/**
	 * The cached value of the '{@link #getTheSentence() <em>The Sentence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheSentence()
	 * @generated
	 * @ordered
	 */
	protected Sentence theSentence;

	/**
	 * The cached value of the '{@link #getListElements() <em>List Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> listElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionmodelPackage.Literals.EXPRESSION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (eContainerFeatureID() != ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION) return null;
		return (Expression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExpression, ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != eInternalContainer() || (eContainerFeatureID() != ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION && newExpression != null)) {
			if (EcoreUtil.isAncestor(this, newExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL, Expression.class, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getTheSentence() {
		if (theSentence != null && theSentence.eIsProxy()) {
			InternalEObject oldTheSentence = (InternalEObject)theSentence;
			theSentence = (Sentence)eResolveProxy(oldTheSentence);
			if (theSentence != oldTheSentence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, oldTheSentence, theSentence));
			}
		}
		return theSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetTheSentence() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, oldTheSentence, newTheSentence);
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
				msgs = ((InternalEObject)theSentence).eInverseRemove(this, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, Sentence.class, msgs);
			if (newTheSentence != null)
				msgs = ((InternalEObject)newTheSentence).eInverseAdd(this, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, Sentence.class, msgs);
			msgs = basicSetTheSentence(newTheSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, newTheSentence, newTheSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getListElements() {
		if (listElements == null) {
			listElements = new EObjectContainmentWithInverseEList<Element>(Element.class, this, ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS, ExpressionmodelPackage.ELEMENT__EXPRESSION_MODEL);
		}
		return listElements;
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExpression((Expression)otherEnd, msgs);
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				if (theSentence != null)
					msgs = ((InternalEObject)theSentence).eInverseRemove(this, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, Sentence.class, msgs);
				return basicSetTheSentence((Sentence)otherEnd, msgs);
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListElements()).basicAdd(otherEnd, msgs);
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				return basicSetTheSentence(null, msgs);
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				return ((InternalEList<?>)getListElements()).basicRemove(otherEnd, msgs);
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				return eInternalContainer().eInverseRemove(this, ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL, Expression.class, msgs);
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				return getExpression();
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				if (resolve) return getTheSentence();
				return basicGetTheSentence();
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				return getListElements();
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				setTheSentence((Sentence)newValue);
				return;
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				getListElements().clear();
				getListElements().addAll((Collection<? extends Element>)newValue);
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				setTheSentence((Sentence)null);
				return;
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				getListElements().clear();
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
			case ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION:
				return getExpression() != null;
			case ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE:
				return theSentence != null;
			case ExpressionmodelPackage.EXPRESSION_MODEL__LIST_ELEMENTS:
				return listElements != null && !listElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpressionModelImpl
