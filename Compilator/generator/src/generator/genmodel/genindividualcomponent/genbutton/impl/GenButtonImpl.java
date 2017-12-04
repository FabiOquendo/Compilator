/**
 */
package generator.genmodel.genindividualcomponent.genbutton.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.Button;

import generator.apperance.alignment.Alignment;
import generator.apperance.alignment.AlignmentPackage;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;
import generator.genmodel.genindividualcomponent.genbutton.GenbuttonPackage;

import generator.genmodel.genindividualcomponent.impl.GenIndividualElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl#getTheButton <em>The Button</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genbutton.impl.GenButtonImpl#getTheAlignment <em>The Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenButtonImpl extends GenIndividualElementImpl implements GenButton {
	/**
	 * The cached value of the '{@link #getTheButton() <em>The Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheButton()
	 * @generated
	 * @ordered
	 */
	protected Button theButton;

	/**
	 * The cached value of the '{@link #getTheAlignment() <em>The Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment theAlignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenbuttonPackage.Literals.GEN_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button getTheButton() {
		if (theButton != null && theButton.eIsProxy()) {
			InternalEObject oldTheButton = (InternalEObject)theButton;
			theButton = (Button)eResolveProxy(oldTheButton);
			if (theButton != oldTheButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenbuttonPackage.GEN_BUTTON__THE_BUTTON, oldTheButton, theButton));
			}
		}
		return theButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button basicGetTheButton() {
		return theButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheButton(Button newTheButton) {
		Button oldTheButton = theButton;
		theButton = newTheButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenbuttonPackage.GEN_BUTTON__THE_BUTTON, oldTheButton, theButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getTheAlignment() {
		return theAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheAlignment(Alignment newTheAlignment, NotificationChain msgs) {
		Alignment oldTheAlignment = theAlignment;
		theAlignment = newTheAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT, oldTheAlignment, newTheAlignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAlignment(Alignment newTheAlignment) {
		if (newTheAlignment != theAlignment) {
			NotificationChain msgs = null;
			if (theAlignment != null)
				msgs = ((InternalEObject)theAlignment).eInverseRemove(this, AlignmentPackage.ALIGNMENT__GEN_BUTTON, Alignment.class, msgs);
			if (newTheAlignment != null)
				msgs = ((InternalEObject)newTheAlignment).eInverseAdd(this, AlignmentPackage.ALIGNMENT__GEN_BUTTON, Alignment.class, msgs);
			msgs = basicSetTheAlignment(newTheAlignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT, newTheAlignment, newTheAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesButton(final String text, final Propertie fontSize) {
		super.createProperties();
		createAlignment();
		setDefaultButton(text, fontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAlignment() {
		Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();
		this.setTheAlignment(a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultButton(final String text, final Propertie fontSize) {
		if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {
			generator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			int w = 80;
			int aux = 14 - (Integer.parseInt(fontSize.getValue())/2);
			if(text.length() >  aux) {
				int d = text.length() - aux;
				w += d*10;
			}
			width.setValue(w);
			this.setTheWidth(width);
		}
		if(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {
			generator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
			int h = 20;
			int value = Integer.parseInt(fontSize.getValue());
			if(value > 12) {
				h += (value-12)*2;
			}
			height.setValue(h);
			this.setTheHeight(height);
		}
		if(this.getTheAlignment() == null || this.getTheAlignment().getValue() == null) {
			generator.apperance.alignment.Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();
			a.setValue("CENTER");
			this.setTheAlignment(a);
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
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				if (theAlignment != null)
					msgs = ((InternalEObject)theAlignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT, null, msgs);
				return basicSetTheAlignment((Alignment)otherEnd, msgs);
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
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				return basicSetTheAlignment(null, msgs);
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
			case GenbuttonPackage.GEN_BUTTON__THE_BUTTON:
				if (resolve) return getTheButton();
				return basicGetTheButton();
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				return getTheAlignment();
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
			case GenbuttonPackage.GEN_BUTTON__THE_BUTTON:
				setTheButton((Button)newValue);
				return;
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				setTheAlignment((Alignment)newValue);
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
			case GenbuttonPackage.GEN_BUTTON__THE_BUTTON:
				setTheButton((Button)null);
				return;
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				setTheAlignment((Alignment)null);
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
			case GenbuttonPackage.GEN_BUTTON__THE_BUTTON:
				return theButton != null;
			case GenbuttonPackage.GEN_BUTTON__THE_ALIGNMENT:
				return theAlignment != null;
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
			case GenbuttonPackage.GEN_BUTTON___CREATE_PROPERTIES_BUTTON__STRING_PROPERTIE:
				createPropertiesButton((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
			case GenbuttonPackage.GEN_BUTTON___CREATE_ALIGNMENT:
				createAlignment();
				return null;
			case GenbuttonPackage.GEN_BUTTON___SET_DEFAULT_BUTTON__STRING_PROPERTIE:
				setDefaultButton((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenButtonImpl
