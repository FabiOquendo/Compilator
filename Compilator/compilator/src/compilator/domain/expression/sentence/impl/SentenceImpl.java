/**
 */
package compilator.domain.expression.sentence.impl;

import compilator.domain.expression.Expression;
import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.sentence.Sentence;
import compilator.domain.expression.sentence.SentencePackage;

import compilator.domain.shapes.Component;
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
 * An implementation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getTheExpressionModel <em>The Expression Model</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getCompressedSentence <em>Compressed Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getFullSentence <em>Full Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getTextStyles <em>Text Styles</em>}</li>
 *   <li>{@link compilator.domain.expression.sentence.impl.SentenceImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentenceImpl extends MinimalEObjectImpl.Container implements Sentence {
	/**
	 * The cached value of the '{@link #getTheExpressionModel() <em>The Expression Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExpressionModel()
	 * @generated
	 * @ordered
	 */
	protected ExpressionModel theExpressionModel;

	/**
	 * The default value of the '{@link #getCompressedSentence() <em>Compressed Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSED_SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressedSentence() <em>Compressed Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedSentence()
	 * @generated
	 * @ordered
	 */
	protected String compressedSentence = COMPRESSED_SENTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullSentence() <em>Full Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullSentence() <em>Full Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSentence()
	 * @generated
	 * @ordered
	 */
	protected String fullSentence = FULL_SENTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextStyles() <em>Text Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyles()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyles() <em>Text Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyles()
	 * @generated
	 * @ordered
	 */
	protected String textStyles = TEXT_STYLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SentencePackage.Literals.SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (eContainerFeatureID() != SentencePackage.SENTENCE__EXPRESSION) return null;
		return (Expression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExpression, SentencePackage.SENTENCE__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != eInternalContainer() || (eContainerFeatureID() != SentencePackage.SENTENCE__EXPRESSION && newExpression != null)) {
			if (EcoreUtil.isAncestor(this, newExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, ExpressionPackage.EXPRESSION__THE_SENTENCE, Expression.class, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModel getTheExpressionModel() {
		if (theExpressionModel != null && theExpressionModel.eIsProxy()) {
			InternalEObject oldTheExpressionModel = (InternalEObject)theExpressionModel;
			theExpressionModel = (ExpressionModel)eResolveProxy(oldTheExpressionModel);
			if (theExpressionModel != oldTheExpressionModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, oldTheExpressionModel, theExpressionModel));
			}
		}
		return theExpressionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModel basicGetTheExpressionModel() {
		return theExpressionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExpressionModel(ExpressionModel newTheExpressionModel, NotificationChain msgs) {
		ExpressionModel oldTheExpressionModel = theExpressionModel;
		theExpressionModel = newTheExpressionModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, oldTheExpressionModel, newTheExpressionModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExpressionModel(ExpressionModel newTheExpressionModel) {
		if (newTheExpressionModel != theExpressionModel) {
			NotificationChain msgs = null;
			if (theExpressionModel != null)
				msgs = ((InternalEObject)theExpressionModel).eInverseRemove(this, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, ExpressionModel.class, msgs);
			if (newTheExpressionModel != null)
				msgs = ((InternalEObject)newTheExpressionModel).eInverseAdd(this, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, ExpressionModel.class, msgs);
			msgs = basicSetTheExpressionModel(newTheExpressionModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__THE_EXPRESSION_MODEL, newTheExpressionModel, newTheExpressionModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompressedSentence() {
		return compressedSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressedSentence(String newCompressedSentence) {
		String oldCompressedSentence = compressedSentence;
		compressedSentence = newCompressedSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__COMPRESSED_SENTENCE, oldCompressedSentence, compressedSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullSentence() {
		return fullSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullSentence(String newFullSentence) {
		String oldFullSentence = fullSentence;
		fullSentence = newFullSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__FULL_SENTENCE, oldFullSentence, fullSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyles() {
		return textStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyles(String newTextStyles) {
		String oldTextStyles = textStyles;
		textStyles = newTextStyles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__TEXT_STYLES, oldTextStyles, textStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != SentencePackage.SENTENCE__COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, SentencePackage.SENTENCE__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != SentencePackage.SENTENCE__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ShapesPackage.COMPONENT__THE_SENTENCE, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SentencePackage.SENTENCE__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SentencePackage.SENTENCE__EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExpression((Expression)otherEnd, msgs);
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				if (theExpressionModel != null)
					msgs = ((InternalEObject)theExpressionModel).eInverseRemove(this, ExpressionmodelPackage.EXPRESSION_MODEL__THE_SENTENCE, ExpressionModel.class, msgs);
				return basicSetTheExpressionModel((ExpressionModel)otherEnd, msgs);
			case SentencePackage.SENTENCE__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case SentencePackage.SENTENCE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				return basicSetTheExpressionModel(null, msgs);
			case SentencePackage.SENTENCE__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case SentencePackage.SENTENCE__EXPRESSION:
				return eInternalContainer().eInverseRemove(this, ExpressionPackage.EXPRESSION__THE_SENTENCE, Expression.class, msgs);
			case SentencePackage.SENTENCE__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ShapesPackage.COMPONENT__THE_SENTENCE, Component.class, msgs);
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
			case SentencePackage.SENTENCE__EXPRESSION:
				return getExpression();
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				if (resolve) return getTheExpressionModel();
				return basicGetTheExpressionModel();
			case SentencePackage.SENTENCE__COMPRESSED_SENTENCE:
				return getCompressedSentence();
			case SentencePackage.SENTENCE__FULL_SENTENCE:
				return getFullSentence();
			case SentencePackage.SENTENCE__TEXT_STYLES:
				return getTextStyles();
			case SentencePackage.SENTENCE__COMPONENT:
				return getComponent();
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
			case SentencePackage.SENTENCE__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				setTheExpressionModel((ExpressionModel)newValue);
				return;
			case SentencePackage.SENTENCE__COMPRESSED_SENTENCE:
				setCompressedSentence((String)newValue);
				return;
			case SentencePackage.SENTENCE__FULL_SENTENCE:
				setFullSentence((String)newValue);
				return;
			case SentencePackage.SENTENCE__TEXT_STYLES:
				setTextStyles((String)newValue);
				return;
			case SentencePackage.SENTENCE__COMPONENT:
				setComponent((Component)newValue);
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
			case SentencePackage.SENTENCE__EXPRESSION:
				setExpression((Expression)null);
				return;
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				setTheExpressionModel((ExpressionModel)null);
				return;
			case SentencePackage.SENTENCE__COMPRESSED_SENTENCE:
				setCompressedSentence(COMPRESSED_SENTENCE_EDEFAULT);
				return;
			case SentencePackage.SENTENCE__FULL_SENTENCE:
				setFullSentence(FULL_SENTENCE_EDEFAULT);
				return;
			case SentencePackage.SENTENCE__TEXT_STYLES:
				setTextStyles(TEXT_STYLES_EDEFAULT);
				return;
			case SentencePackage.SENTENCE__COMPONENT:
				setComponent((Component)null);
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
			case SentencePackage.SENTENCE__EXPRESSION:
				return getExpression() != null;
			case SentencePackage.SENTENCE__THE_EXPRESSION_MODEL:
				return theExpressionModel != null;
			case SentencePackage.SENTENCE__COMPRESSED_SENTENCE:
				return COMPRESSED_SENTENCE_EDEFAULT == null ? compressedSentence != null : !COMPRESSED_SENTENCE_EDEFAULT.equals(compressedSentence);
			case SentencePackage.SENTENCE__FULL_SENTENCE:
				return FULL_SENTENCE_EDEFAULT == null ? fullSentence != null : !FULL_SENTENCE_EDEFAULT.equals(fullSentence);
			case SentencePackage.SENTENCE__TEXT_STYLES:
				return TEXT_STYLES_EDEFAULT == null ? textStyles != null : !TEXT_STYLES_EDEFAULT.equals(textStyles);
			case SentencePackage.SENTENCE__COMPONENT:
				return getComponent() != null;
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
		result.append(" (compressedSentence: ");
		result.append(compressedSentence);
		result.append(", fullSentence: ");
		result.append(fullSentence);
		result.append(", textStyles: ");
		result.append(textStyles);
		result.append(')');
		return result.toString();
	}

} //SentenceImpl
