/**
 */
package compilator.domain.impl;

import compilator.CompilatorPackage;
import compilator.ModelFactory;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;

import compilator.domain.expression.Expression;
import compilator.domain.expression.ExpressionPackage;

import compilator.domain.shapes.Shapes;
import compilator.domain.shapes.ShapesPackage;

import compilator.ui.UI;
import compilator.ui.UiPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.TreeMap;

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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link compilator.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 *   <li>{@link compilator.domain.impl.DomainImpl#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link compilator.domain.impl.DomainImpl#getTheExpression <em>The Expression</em>}</li>
 *   <li>{@link compilator.domain.impl.DomainImpl#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * The cached value of the '{@link #getListExpression() <em>List Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> listExpression;

	/**
	 * The cached value of the '{@link #getTheExpression() <em>The Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression theExpression;

	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected Shapes shapes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (theUI != null && theUI.eIsProxy()) {
			InternalEObject oldTheUI = (InternalEObject)theUI;
			theUI = (UI)eResolveProxy(oldTheUI);
			if (theUI != oldTheUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI, oldTheUI, theUI));
			}
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getListExpression() {
		if (listExpression == null) {
			listExpression = new EObjectContainmentWithInverseEList<Expression>(Expression.class, this, DomainPackage.DOMAIN__LIST_EXPRESSION, ExpressionPackage.EXPRESSION__THE_DOMAIN_CONTAINER);
		}
		return listExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTheExpression() {
		return theExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExpression(Expression newTheExpression, NotificationChain msgs) {
		Expression oldTheExpression = theExpression;
		theExpression = newTheExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXPRESSION, oldTheExpression, newTheExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExpression(Expression newTheExpression) {
		if (newTheExpression != theExpression) {
			NotificationChain msgs = null;
			if (theExpression != null)
				msgs = ((InternalEObject)theExpression).eInverseRemove(this, ExpressionPackage.EXPRESSION__THE_DOMAIN, Expression.class, msgs);
			if (newTheExpression != null)
				msgs = ((InternalEObject)newTheExpression).eInverseAdd(this, ExpressionPackage.EXPRESSION__THE_DOMAIN, Expression.class, msgs);
			msgs = basicSetTheExpression(newTheExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXPRESSION, newTheExpression, newTheExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shapes getShapes() {
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes(Shapes newShapes, NotificationChain msgs) {
		Shapes oldShapes = shapes;
		shapes = newShapes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__SHAPES, oldShapes, newShapes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(Shapes newShapes) {
		if (newShapes != shapes) {
			NotificationChain msgs = null;
			if (shapes != null)
				msgs = ((InternalEObject)shapes).eInverseRemove(this, ShapesPackage.SHAPES__DOMAIN, Shapes.class, msgs);
			if (newShapes != null)
				msgs = ((InternalEObject)newShapes).eInverseAdd(this, ShapesPackage.SHAPES__DOMAIN, Shapes.class, msgs);
			msgs = basicSetShapes(newShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__SHAPES, newShapes, newShapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createComponent(final String nameComponent, final String expressionString, final TreeMap tokens, final TreeMap elementStyle) {
		compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();
		emg.setTokens(tokens);
		emg.setElementStyle(elementStyle);
		
		compilator.domain.generator.ComponentModelGenerator componentGenerator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createComponentModelGenerator();
		
		componentGenerator.setExpressionManager(emg);
		
		compilator.domain.shapes.Component c = componentGenerator.createComponent(nameComponent, expressionString, expressionString);
		getShapes().getListComponents().add(c);
		getTheModelFactory().saveComponents();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpressionModel(final String expressionString, final TreeMap tokens, final TreeMap components, final TreeMap elementStyles) {
		compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();
		emg.setTokens(tokens);
		emg.setElementStyle(elementStyles);				
		
		compilator.domain.generator.ExpressionModelGenerator generator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelGenerator();
		generator.setComponents(components);
		generator.setExpressionManager(emg);
		
		compilator.domain.expression.Expression  ex = generator.createExpressionModel(expressionString, expressionString);
		
		
		String unpackedString = generator.unpackStringExpression(ex.getTheExpressionModel());
		String textStyles = generator.getTextComponentsStyles(elementStyles);
		
		ex.getTheSentence().setFullSentence(unpackedString);
		ex.getTheSentence().setTextStyles(textStyles);
		
		setTheExpression(ex);
		getTheModelFactory().saveExpression();
		return unpackedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unPackStyles() {
		return getTheExpression().getTheSentence().getTextStyles();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createEModelFromUnpackedExpression(final String formatedString, final TreeMap tokens, final TreeMap components, final TreeMap elementStyles) {
		compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();
		emg.setTokens(tokens);
		emg.setElementStyle(elementStyles);				
		
		compilator.domain.generator.ExpressionModelGenerator generator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelGenerator();
		generator.setComponents(components);
		generator.setExpressionManager(emg);
		
		compilator.domain.expression.Expression  ex = generator.createEModelFromUnpackedExpression(formatedString);	
		if(ex==null) return false;
		
		ex.getTheSentence().setFullSentence(formatedString);
		
		setTheExpression(ex);
		getTheModelFactory().saveExpression();
		
		return true;
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListExpression()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				if (theExpression != null)
					msgs = ((InternalEObject)theExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_EXPRESSION, null, msgs);
				return basicSetTheExpression((Expression)otherEnd, msgs);
			case DomainPackage.DOMAIN__SHAPES:
				if (shapes != null)
					msgs = ((InternalEObject)shapes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__SHAPES, null, msgs);
				return basicSetShapes((Shapes)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				return basicSetTheUI(null, msgs);
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				return ((InternalEList<?>)getListExpression()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				return basicSetTheExpression(null, msgs);
			case DomainPackage.DOMAIN__SHAPES:
				return basicSetShapes(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__THE_UI:
				if (resolve) return getTheUI();
				return basicGetTheUI();
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				return getListExpression();
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				return getTheExpression();
			case DomainPackage.DOMAIN__SHAPES:
				return getShapes();
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)newValue);
				return;
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				getListExpression().clear();
				getListExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				setTheExpression((Expression)newValue);
				return;
			case DomainPackage.DOMAIN__SHAPES:
				setShapes((Shapes)newValue);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)null);
				return;
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				getListExpression().clear();
				return;
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				setTheExpression((Expression)null);
				return;
			case DomainPackage.DOMAIN__SHAPES:
				setShapes((Shapes)null);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null;
			case DomainPackage.DOMAIN__LIST_EXPRESSION:
				return listExpression != null && !listExpression.isEmpty();
			case DomainPackage.DOMAIN__THE_EXPRESSION:
				return theExpression != null;
			case DomainPackage.DOMAIN__SHAPES:
				return shapes != null;
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
			case DomainPackage.DOMAIN___CREATE_COMPONENT__STRING_STRING_TREEMAP_TREEMAP:
				createComponent((String)arguments.get(0), (String)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
				return null;
			case DomainPackage.DOMAIN___CREATE_EXPRESSION_MODEL__STRING_TREEMAP_TREEMAP_TREEMAP:
				return createExpressionModel((String)arguments.get(0), (TreeMap)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
			case DomainPackage.DOMAIN___UN_PACK_STYLES:
				return unPackStyles();
			case DomainPackage.DOMAIN___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING_TREEMAP_TREEMAP_TREEMAP:
				return createEModelFromUnpackedExpression((String)arguments.get(0), (TreeMap)arguments.get(1), (TreeMap)arguments.get(2), (TreeMap)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DomainImpl
