/**
 */
package compilator.impl;

import compilator.CompilatorPackage;
import compilator.ModelFactory;

import compilator.domain.Domain;
import compilator.domain.DomainPackage;

import compilator.ui.UI;
import compilator.ui.UiPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.impl.ModelFactoryImpl#getTheDomainCompilator <em>The Domain Compilator</em>}</li>
 *   <li>{@link compilator.impl.ModelFactoryImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends MinimalEObjectImpl.Container implements ModelFactory {
	/**
	 * The cached value of the '{@link #getTheDomainCompilator() <em>The Domain Compilator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomainCompilator()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomainCompilator;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompilatorPackage.Literals.MODEL_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomainCompilator() {
		return theDomainCompilator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomainCompilator(Domain newTheDomainCompilator, NotificationChain msgs) {
		Domain oldTheDomainCompilator = theDomainCompilator;
		theDomainCompilator = newTheDomainCompilator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR, oldTheDomainCompilator, newTheDomainCompilator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomainCompilator(Domain newTheDomainCompilator) {
		if (newTheDomainCompilator != theDomainCompilator) {
			NotificationChain msgs = null;
			if (theDomainCompilator != null)
				msgs = ((InternalEObject)theDomainCompilator).eInverseRemove(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			if (newTheDomainCompilator != null)
				msgs = ((InternalEObject)newTheDomainCompilator).eInverseAdd(this, DomainPackage.DOMAIN__THE_MODEL_FACTORY, Domain.class, msgs);
			msgs = basicSetTheDomainCompilator(newTheDomainCompilator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR, newTheDomainCompilator, newTheDomainCompilator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompilatorPackage.MODEL_FACTORY__THE_UI, oldTheUI, newTheUI);
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
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_MODEL_FACTORY, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompilatorPackage.MODEL_FACTORY__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory loadExpression() {
		ModelFactory modelFactory = null;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/expression.compilator");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactory = (ModelFactory) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveExpression() {
		ModelFactory modelFactory = this;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/expression.compilator");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory loadComponents() {
		ModelFactory modelFactory = null;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/components.compilator");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(java.util.Collections.EMPTY_MAP);
			modelFactory = (ModelFactory) resource.getContents().get(0);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
		
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveComponents() {
		ModelFactory modelFactory = this;
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/components.compilator");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactory);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				if (theDomainCompilator != null)
					msgs = ((InternalEObject)theDomainCompilator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR, null, msgs);
				return basicSetTheDomainCompilator((Domain)otherEnd, msgs);
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompilatorPackage.MODEL_FACTORY__THE_UI, null, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
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
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				return basicSetTheDomainCompilator(null, msgs);
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				return basicSetTheUI(null, msgs);
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
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				return getTheDomainCompilator();
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				return getTheUI();
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
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				setTheDomainCompilator((Domain)newValue);
				return;
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)newValue);
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
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				setTheDomainCompilator((Domain)null);
				return;
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				setTheUI((UI)null);
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
			case CompilatorPackage.MODEL_FACTORY__THE_DOMAIN_COMPILATOR:
				return theDomainCompilator != null;
			case CompilatorPackage.MODEL_FACTORY__THE_UI:
				return theUI != null;
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
			case CompilatorPackage.MODEL_FACTORY___LOAD_EXPRESSION:
				return loadExpression();
			case CompilatorPackage.MODEL_FACTORY___SAVE_EXPRESSION:
				saveExpression();
				return null;
			case CompilatorPackage.MODEL_FACTORY___LOAD_COMPONENTS:
				return loadComponents();
			case CompilatorPackage.MODEL_FACTORY___SAVE_COMPONENTS:
				saveComponents();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelFactoryImpl
