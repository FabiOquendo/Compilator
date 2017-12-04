/**
 */
package compilator.domain.expression.impl;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;

import compilator.domain.expression.Expression;
import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.sentence.Sentence;
import compilator.domain.expression.sentence.SentencePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.expression.impl.ExpressionImpl#getTheDomainContainer <em>The Domain Container</em>}</li>
 *   <li>{@link compilator.domain.expression.impl.ExpressionImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.domain.expression.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link compilator.domain.expression.impl.ExpressionImpl#getTheSentence <em>The Sentence</em>}</li>
 *   <li>{@link compilator.domain.expression.impl.ExpressionImpl#getTheExpressionModel <em>The Expression Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
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
	 * The cached value of the '{@link #getTheSentence() <em>The Sentence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheSentence()
	 * @generated
	 * @ordered
	 */
	protected Sentence theSentence;

	/**
	 * The cached value of the '{@link #getTheExpressionModel() <em>The Expression Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExpressionModel()
	 * @generated
	 * @ordered
	 */
	protected ExpressionModel theExpressionModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomainContainer() {
		if (eContainerFeatureID() != ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomainContainer(Domain newTheDomainContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomainContainer, ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomainContainer(Domain newTheDomainContainer) {
		if (newTheDomainContainer != eInternalContainer() || (eContainerFeatureID() != ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER && newTheDomainContainer != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomainContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomainContainer != null)
				msgs = ((InternalEObject)newTheDomainContainer).eInverseAdd(this, DomainPackage.DOMAIN__LIST_EXPRESSION, Domain.class, msgs);
			msgs = basicSetTheDomainContainer(newTheDomainContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER, newTheDomainContainer, newTheDomainContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != ExpressionPackage.EXPRESSION__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, ExpressionPackage.EXPRESSION__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != ExpressionPackage.EXPRESSION__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_EXPRESSION, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_DOMAIN, newTheDomain, newTheDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_SENTENCE, oldTheSentence, newTheSentence);
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
				msgs = ((InternalEObject)theSentence).eInverseRemove(this, SentencePackage.SENTENCE__EXPRESSION, Sentence.class, msgs);
			if (newTheSentence != null)
				msgs = ((InternalEObject)newTheSentence).eInverseAdd(this, SentencePackage.SENTENCE__EXPRESSION, Sentence.class, msgs);
			msgs = basicSetTheSentence(newTheSentence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_SENTENCE, newTheSentence, newTheSentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModel getTheExpressionModel() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL, oldTheExpressionModel, newTheExpressionModel);
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
				msgs = ((InternalEObject)theExpressionModel).eInverseRemove(this, ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION, ExpressionModel.class, msgs);
			if (newTheExpressionModel != null)
				msgs = ((InternalEObject)newTheExpressionModel).eInverseAdd(this, ExpressionmodelPackage.EXPRESSION_MODEL__EXPRESSION, ExpressionModel.class, msgs);
			msgs = basicSetTheExpressionModel(newTheExpressionModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL, newTheExpressionModel, newTheExpressionModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomainContainer((Domain)otherEnd, msgs);
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				if (theSentence != null)
					msgs = ((InternalEObject)theSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EXPRESSION__THE_SENTENCE, null, msgs);
				return basicSetTheSentence((Sentence)otherEnd, msgs);
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				if (theExpressionModel != null)
					msgs = ((InternalEObject)theExpressionModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL, null, msgs);
				return basicSetTheExpressionModel((ExpressionModel)otherEnd, msgs);
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				return basicSetTheDomainContainer(null, msgs);
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				return basicSetTheSentence(null, msgs);
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				return basicSetTheExpressionModel(null, msgs);
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LIST_EXPRESSION, Domain.class, msgs);
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_EXPRESSION, Domain.class, msgs);
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				return getTheDomainContainer();
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				return getTheDomain();
			case ExpressionPackage.EXPRESSION__NAME:
				return getName();
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				return getTheSentence();
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				return getTheExpressionModel();
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				setTheDomainContainer((Domain)newValue);
				return;
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case ExpressionPackage.EXPRESSION__NAME:
				setName((String)newValue);
				return;
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				setTheSentence((Sentence)newValue);
				return;
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				setTheExpressionModel((ExpressionModel)newValue);
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				setTheDomainContainer((Domain)null);
				return;
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case ExpressionPackage.EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				setTheSentence((Sentence)null);
				return;
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				setTheExpressionModel((ExpressionModel)null);
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
			case ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER:
				return getTheDomainContainer() != null;
			case ExpressionPackage.EXPRESSION__THE_DOMAIN:
				return getTheDomain() != null;
			case ExpressionPackage.EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExpressionPackage.EXPRESSION__THE_SENTENCE:
				return theSentence != null;
			case ExpressionPackage.EXPRESSION__THE_EXPRESSION_MODEL:
				return theExpressionModel != null;
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

} //ExpressionImpl
