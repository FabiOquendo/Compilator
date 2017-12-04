/**
 */
package compilator.ui.impl;

import compilator.CompilatorPackage;
import compilator.ModelFactory;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;

import compilator.ui.CharacteristicstContainer;
import compilator.ui.ComponentsContainer;
import compilator.ui.ExpressionContainer;
import compilator.ui.StyleAssigmentContainer;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.ui.impl.UIImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getTheCharacteristicstContainer <em>The Characteristicst Container</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getStylesConainer <em>Styles Conainer</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getComponentsContainer <em>Components Container</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getTheExpressionContainer <em>The Expression Container</em>}</li>
 *   <li>{@link compilator.ui.impl.UIImpl#getTheStyleAssigmentContainer <em>The Style Assigment Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends MinimalEObjectImpl.Container implements UI {
	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * The cached value of the '{@link #getTheCharacteristicstContainer() <em>The Characteristicst Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCharacteristicstContainer()
	 * @generated
	 * @ordered
	 */
	protected CharacteristicstContainer theCharacteristicstContainer;

	/**
	 * The cached value of the '{@link #getStylesConainer() <em>Styles Conainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylesConainer()
	 * @generated
	 * @ordered
	 */
	protected StylesConainer stylesConainer;

	/**
	 * The cached value of the '{@link #getComponentsContainer() <em>Components Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsContainer()
	 * @generated
	 * @ordered
	 */
	protected ComponentsContainer componentsContainer;

	/**
	 * The cached value of the '{@link #getTheExpressionContainer() <em>The Expression Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExpressionContainer()
	 * @generated
	 * @ordered
	 */
	protected ExpressionContainer theExpressionContainer;

	/**
	 * The cached value of the '{@link #getTheStyleAssigmentContainer() <em>The Style Assigment Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheStyleAssigmentContainer()
	 * @generated
	 * @ordered
	 */
	protected StyleAssigmentContainer theStyleAssigmentContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, UiPackage.UI__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, CompilatorPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (theDomain != null && theDomain.eIsProxy()) {
			InternalEObject oldTheDomain = (InternalEObject)theDomain;
			theDomain = (Domain)eResolveProxy(oldTheDomain);
			if (theDomain != oldTheDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI__THE_DOMAIN, oldTheDomain, theDomain));
			}
		}
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicstContainer getTheCharacteristicstContainer() {
		return theCharacteristicstContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCharacteristicstContainer(CharacteristicstContainer newTheCharacteristicstContainer, NotificationChain msgs) {
		CharacteristicstContainer oldTheCharacteristicstContainer = theCharacteristicstContainer;
		theCharacteristicstContainer = newTheCharacteristicstContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CHARACTERISTICST_CONTAINER, oldTheCharacteristicstContainer, newTheCharacteristicstContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCharacteristicstContainer(CharacteristicstContainer newTheCharacteristicstContainer) {
		if (newTheCharacteristicstContainer != theCharacteristicstContainer) {
			NotificationChain msgs = null;
			if (theCharacteristicstContainer != null)
				msgs = ((InternalEObject)theCharacteristicstContainer).eInverseRemove(this, UiPackage.CHARACTERISTICST_CONTAINER__UI, CharacteristicstContainer.class, msgs);
			if (newTheCharacteristicstContainer != null)
				msgs = ((InternalEObject)newTheCharacteristicstContainer).eInverseAdd(this, UiPackage.CHARACTERISTICST_CONTAINER__UI, CharacteristicstContainer.class, msgs);
			msgs = basicSetTheCharacteristicstContainer(newTheCharacteristicstContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CHARACTERISTICST_CONTAINER, newTheCharacteristicstContainer, newTheCharacteristicstContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesConainer getStylesConainer() {
		return stylesConainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStylesConainer(StylesConainer newStylesConainer, NotificationChain msgs) {
		StylesConainer oldStylesConainer = stylesConainer;
		stylesConainer = newStylesConainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__STYLES_CONAINER, oldStylesConainer, newStylesConainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylesConainer(StylesConainer newStylesConainer) {
		if (newStylesConainer != stylesConainer) {
			NotificationChain msgs = null;
			if (stylesConainer != null)
				msgs = ((InternalEObject)stylesConainer).eInverseRemove(this, UiPackage.STYLES_CONAINER__UI, StylesConainer.class, msgs);
			if (newStylesConainer != null)
				msgs = ((InternalEObject)newStylesConainer).eInverseAdd(this, UiPackage.STYLES_CONAINER__UI, StylesConainer.class, msgs);
			msgs = basicSetStylesConainer(newStylesConainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__STYLES_CONAINER, newStylesConainer, newStylesConainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsContainer getComponentsContainer() {
		return componentsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentsContainer(ComponentsContainer newComponentsContainer, NotificationChain msgs) {
		ComponentsContainer oldComponentsContainer = componentsContainer;
		componentsContainer = newComponentsContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__COMPONENTS_CONTAINER, oldComponentsContainer, newComponentsContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsContainer(ComponentsContainer newComponentsContainer) {
		if (newComponentsContainer != componentsContainer) {
			NotificationChain msgs = null;
			if (componentsContainer != null)
				msgs = ((InternalEObject)componentsContainer).eInverseRemove(this, UiPackage.COMPONENTS_CONTAINER__UI, ComponentsContainer.class, msgs);
			if (newComponentsContainer != null)
				msgs = ((InternalEObject)newComponentsContainer).eInverseAdd(this, UiPackage.COMPONENTS_CONTAINER__UI, ComponentsContainer.class, msgs);
			msgs = basicSetComponentsContainer(newComponentsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__COMPONENTS_CONTAINER, newComponentsContainer, newComponentsContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionContainer getTheExpressionContainer() {
		return theExpressionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExpressionContainer(ExpressionContainer newTheExpressionContainer, NotificationChain msgs) {
		ExpressionContainer oldTheExpressionContainer = theExpressionContainer;
		theExpressionContainer = newTheExpressionContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_EXPRESSION_CONTAINER, oldTheExpressionContainer, newTheExpressionContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExpressionContainer(ExpressionContainer newTheExpressionContainer) {
		if (newTheExpressionContainer != theExpressionContainer) {
			NotificationChain msgs = null;
			if (theExpressionContainer != null)
				msgs = ((InternalEObject)theExpressionContainer).eInverseRemove(this, UiPackage.EXPRESSION_CONTAINER__UI, ExpressionContainer.class, msgs);
			if (newTheExpressionContainer != null)
				msgs = ((InternalEObject)newTheExpressionContainer).eInverseAdd(this, UiPackage.EXPRESSION_CONTAINER__UI, ExpressionContainer.class, msgs);
			msgs = basicSetTheExpressionContainer(newTheExpressionContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_EXPRESSION_CONTAINER, newTheExpressionContainer, newTheExpressionContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleAssigmentContainer getTheStyleAssigmentContainer() {
		return theStyleAssigmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheStyleAssigmentContainer(StyleAssigmentContainer newTheStyleAssigmentContainer, NotificationChain msgs) {
		StyleAssigmentContainer oldTheStyleAssigmentContainer = theStyleAssigmentContainer;
		theStyleAssigmentContainer = newTheStyleAssigmentContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER, oldTheStyleAssigmentContainer, newTheStyleAssigmentContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheStyleAssigmentContainer(StyleAssigmentContainer newTheStyleAssigmentContainer) {
		if (newTheStyleAssigmentContainer != theStyleAssigmentContainer) {
			NotificationChain msgs = null;
			if (theStyleAssigmentContainer != null)
				msgs = ((InternalEObject)theStyleAssigmentContainer).eInverseRemove(this, UiPackage.STYLE_ASSIGMENT_CONTAINER__UI, StyleAssigmentContainer.class, msgs);
			if (newTheStyleAssigmentContainer != null)
				msgs = ((InternalEObject)newTheStyleAssigmentContainer).eInverseAdd(this, UiPackage.STYLE_ASSIGMENT_CONTAINER__UI, StyleAssigmentContainer.class, msgs);
			msgs = basicSetTheStyleAssigmentContainer(newTheStyleAssigmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER, newTheStyleAssigmentContainer, newTheStyleAssigmentContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createComponent(final String nameComponent, final String expressionString, final TreeMap tokens, final TreeMap elementStyle) {
		theDomain.createComponent(nameComponent,expressionString,tokens,elementStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressionModel(final String expressionString, final TreeMap tokens, final TreeMap components, final TreeMap elementStyles) {
		return theDomain.createExpressionModel(expressionString, tokens,components,elementStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unPackStyles() {
		return theDomain.unPackStyles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createEModelFromUnpackedExpression(final String formatedString, final TreeMap tokens, final TreeMap components, final TreeMap elementStyles) {
		return theDomain.createEModelFromUnpackedExpression(formatedString, tokens,components,elementStyles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case UiPackage.UI__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				if (theCharacteristicstContainer != null)
					msgs = ((InternalEObject)theCharacteristicstContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CHARACTERISTICST_CONTAINER, null, msgs);
				return basicSetTheCharacteristicstContainer((CharacteristicstContainer)otherEnd, msgs);
			case UiPackage.UI__STYLES_CONAINER:
				if (stylesConainer != null)
					msgs = ((InternalEObject)stylesConainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__STYLES_CONAINER, null, msgs);
				return basicSetStylesConainer((StylesConainer)otherEnd, msgs);
			case UiPackage.UI__COMPONENTS_CONTAINER:
				if (componentsContainer != null)
					msgs = ((InternalEObject)componentsContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__COMPONENTS_CONTAINER, null, msgs);
				return basicSetComponentsContainer((ComponentsContainer)otherEnd, msgs);
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				if (theExpressionContainer != null)
					msgs = ((InternalEObject)theExpressionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_EXPRESSION_CONTAINER, null, msgs);
				return basicSetTheExpressionContainer((ExpressionContainer)otherEnd, msgs);
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				if (theStyleAssigmentContainer != null)
					msgs = ((InternalEObject)theStyleAssigmentContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER, null, msgs);
				return basicSetTheStyleAssigmentContainer((StyleAssigmentContainer)otherEnd, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case UiPackage.UI__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				return basicSetTheCharacteristicstContainer(null, msgs);
			case UiPackage.UI__STYLES_CONAINER:
				return basicSetStylesConainer(null, msgs);
			case UiPackage.UI__COMPONENTS_CONTAINER:
				return basicSetComponentsContainer(null, msgs);
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				return basicSetTheExpressionContainer(null, msgs);
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				return basicSetTheStyleAssigmentContainer(null, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, CompilatorPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case UiPackage.UI__THE_DOMAIN:
				if (resolve) return getTheDomain();
				return basicGetTheDomain();
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				return getTheCharacteristicstContainer();
			case UiPackage.UI__STYLES_CONAINER:
				return getStylesConainer();
			case UiPackage.UI__COMPONENTS_CONTAINER:
				return getComponentsContainer();
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				return getTheExpressionContainer();
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				return getTheStyleAssigmentContainer();
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				setTheCharacteristicstContainer((CharacteristicstContainer)newValue);
				return;
			case UiPackage.UI__STYLES_CONAINER:
				setStylesConainer((StylesConainer)newValue);
				return;
			case UiPackage.UI__COMPONENTS_CONTAINER:
				setComponentsContainer((ComponentsContainer)newValue);
				return;
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				setTheExpressionContainer((ExpressionContainer)newValue);
				return;
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				setTheStyleAssigmentContainer((StyleAssigmentContainer)newValue);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				setTheCharacteristicstContainer((CharacteristicstContainer)null);
				return;
			case UiPackage.UI__STYLES_CONAINER:
				setStylesConainer((StylesConainer)null);
				return;
			case UiPackage.UI__COMPONENTS_CONTAINER:
				setComponentsContainer((ComponentsContainer)null);
				return;
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				setTheExpressionContainer((ExpressionContainer)null);
				return;
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				setTheStyleAssigmentContainer((StyleAssigmentContainer)null);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case UiPackage.UI__THE_DOMAIN:
				return theDomain != null;
			case UiPackage.UI__THE_CHARACTERISTICST_CONTAINER:
				return theCharacteristicstContainer != null;
			case UiPackage.UI__STYLES_CONAINER:
				return stylesConainer != null;
			case UiPackage.UI__COMPONENTS_CONTAINER:
				return componentsContainer != null;
			case UiPackage.UI__THE_EXPRESSION_CONTAINER:
				return theExpressionContainer != null;
			case UiPackage.UI__THE_STYLE_ASSIGMENT_CONTAINER:
				return theStyleAssigmentContainer != null;
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
			case UiPackage.UI___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP:
				createComponent((String)arguments.get(0), (String)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
				return null;
			case UiPackage.UI___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP:
				return createExpressionModel((String)arguments.get(0), (TreeMap)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
			case UiPackage.UI___UN_PACK_STYLES:
				return unPackStyles();
			case UiPackage.UI___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP:
				return createEModelFromUnpackedExpression((String)arguments.get(0), (TreeMap)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UIImpl
